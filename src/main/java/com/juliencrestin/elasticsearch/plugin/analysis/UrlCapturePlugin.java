package com.juliencrestin.elasticsearch.plugin.analysis;

import org.elasticsearch.index.analysis.AnalysisModule;
import com.juliencrestin.elasticsearch.index.analysis.UrlCaptureAnalysisBinderProcessor;
import org.elasticsearch.plugins.AbstractPlugin;

/**
 */
public class UrlCapturePlugin extends AbstractPlugin {

    @Override
    public String name() {
        return "analysis_url_capture";
    }

    @Override
    public String description() {
        return "Only keeps urls tokens";
    }

    public void onModule(AnalysisModule module) {
        module.addProcessor(new UrlCaptureAnalysisBinderProcessor());
    }
}