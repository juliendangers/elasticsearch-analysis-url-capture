package org.elasticsearch.index.analysis;

/**
 */
public class UrlCaptureAnalysisBinderProcessor extends AnalysisModule.AnalysisBinderProcessor {

    @Override
    public void processTokenFilters(TokenFiltersBindings tokenFiltersBindings) {
        tokenFiltersBindings.processTokenFilter("url_capture", UrlTokenFilterFactory.class);
    }
}