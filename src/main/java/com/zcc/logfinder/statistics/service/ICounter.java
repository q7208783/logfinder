package com.zcc.logfinder.statistics.service;

import com.zcc.logfinder.analysis.model.IAnalysisResult;
import com.zcc.logfinder.statistics.model.ICountResult;

public interface ICounter {
    ICountResult statistics(IAnalysisResult analysisResult);
}
