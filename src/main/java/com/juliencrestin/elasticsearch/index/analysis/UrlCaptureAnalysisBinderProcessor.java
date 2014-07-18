package com.juliencrestin.elasticsearch.index.analysis;

import org.elasticsearch.index.analysis.AnalysisModule;

/**
 */
public class UrlCaptureAnalysisBinderProcessor extends AnalysisModule.AnalysisBinderProcessor {

    @Override
    public void processTokenFilters(TokenFiltersBindings tokenFiltersBindings) {
        tokenFiltersBindings.processTokenFilter("url_capture", UrlTokenFilterFactory.class);
    }
}