package com.zcc.logfinder.analysis.service.impl;

import com.zcc.logfinder.analysis.model.IAnalysisResult;
import com.zcc.logfinder.analysis.model.IPreProcData;
import com.zcc.logfinder.analysis.service.AbstractAnalyzer;
import com.zcc.logfinder.constant.AnalysisTypeEnum;
import org.springframework.stereotype.Component;

@Component
public class KeywordAnalyzer extends AbstractAnalyzer {
    @Override
    public IAnalysisResult analysis(IPreProcData preProcData) {
        return null;
    }

    @Override
    public AnalysisTypeEnum supportType() {
        return AnalysisTypeEnum.Keyword;
    }
}
