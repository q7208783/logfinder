package com.zcc.logfinder.process.proxy;

import com.zcc.logfinder.constant.ProcessTypeEnum;
import com.zcc.logfinder.process.model.IData;
import com.zcc.logfinder.process.model.IResult;
import com.zcc.logfinder.process.service.IProcess;
import com.zcc.logfinder.sdk.AbstractProxy;
import org.springframework.stereotype.Component;

@Component
public final class ProcessProxy extends AbstractProxy {

    public IResult process(IData data) {
        ProcessTypeEnum type = data.getProcessType();
        return ((IProcess)getSupportableMap().get(type)).process(data);
    }

}
