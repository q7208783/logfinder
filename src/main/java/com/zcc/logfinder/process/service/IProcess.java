package com.zcc.logfinder.process.service;

import com.zcc.logfinder.constant.ProcessTypeEnum;
import com.zcc.logfinder.process.model.IData;
import com.zcc.logfinder.process.model.IResult;
import com.zcc.logfinder.sdk.ISupportable;

public interface IProcess extends ISupportable {
    IResult process(IData data);

    ProcessTypeEnum supportType();
}
