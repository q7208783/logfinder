package com.zcc.logfinder.process.service.impl;

import com.zcc.logfinder.constant.ProcessTypeEnum;
import com.zcc.logfinder.process.model.IData;
import com.zcc.logfinder.process.model.IResult;
import com.zcc.logfinder.process.service.AbtractProcess;
import org.springframework.stereotype.Component;

@Component
public class TextProcess extends AbtractProcess {
    @Override
    public IResult process(IData data) {
        return null;
    }

    @Override
    public ProcessTypeEnum supportType() {
        return ProcessTypeEnum.Text;
    }
}
