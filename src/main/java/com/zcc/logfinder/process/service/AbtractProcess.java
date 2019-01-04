package com.zcc.logfinder.process.service;

import com.zcc.logfinder.process.proxy.ProcessProxy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbtractProcess implements IProcess, InitializingBean {
    @Autowired
    private ProcessProxy processProxy;
    @Override
    public void afterPropertiesSet() throws Exception {
        processProxy.onBind(this);
    }
}
