package com.zcc.logfinder.analysis.proxy;

import com.zcc.logfinder.analysis.model.IAnalysisResult;
import com.zcc.logfinder.analysis.model.IPreProcData;
import com.zcc.logfinder.analysis.service.IAnalyzer;
import com.zcc.logfinder.sdk.AbstractProxy;
import org.springframework.stereotype.Component;

@Component
public final class AnalyzerProxy extends AbstractProxy {
    public IAnalysisResult analysis(IPreProcData preProcData) {
        return ((IAnalyzer) getSupportableMap().get(preProcData.getAnalysisType())).analysis(preProcData);
    }
}
