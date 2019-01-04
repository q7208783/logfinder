package com.zcc.logfinder.analysis.model;

import com.zcc.logfinder.constant.AnalysisTypeEnum;
import com.zcc.logfinder.process.model.IData;

public interface IPreProcData extends IData {

    AnalysisTypeEnum getAnalysisType();

}
