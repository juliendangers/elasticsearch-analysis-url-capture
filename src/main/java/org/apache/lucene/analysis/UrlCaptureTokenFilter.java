package org.apache.lucene.analysis;

import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;
import org.apache.lucene.analysis.util.CharArraySet;
import org.apache.lucene.util.Version;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A token filter that only keeps url tokens.
 * the problem with PatternCaptureGroupTokenFilter is that
 * if none of the patterns match, or if preserveOriginal is true, the original token will be preserved.
 * But we only wants to keep urls
 */
public class UrlCaptureTokenFilter extends TokenFilter {

    private final CharTermAttribute termAttribute = addAttribute(CharTermAttribute.class);

    private final Pattern urlPattern = Pattern.compile("^(https?|ftp)://[^\\s/$.?#].[^\\s]*$",Pattern.CASE_INSENSITIVE);

    public UrlCaptureTokenFilter(TokenStream in) {
        super(in);
    }

    @Override
    public final boolean incrementToken() throws IOException {
        while (input.incrementToken()) {
            final String term = termAttribute.toString();

            Matcher matcher = urlPattern.matcher(term);

            if (matcher.find())
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public final void reset() throws IOException {
        super.reset();
    }
}