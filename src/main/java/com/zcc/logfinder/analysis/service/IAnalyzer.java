package com.zcc.logfinder.analysis.service;

import com.zcc.logfinder.analysis.model.IAnalysisResult;
import com.zcc.logfinder.analysis.model.IPreProcData;
import com.zcc.logfinder.constant.AnalysisTypeEnum;
import com.zcc.logfinder.sdk.ISupportable;

public interface IAnalyzer extends ISupportable {
    IAnalysisResult analysis(IPreProcData preProcData);

    AnalysisTypeEnum supportType();
}
