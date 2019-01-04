package com.zcc.logfinder.analysis.service;

import com.zcc.logfinder.analysis.proxy.AnalyzerProxy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractAnalyzer implements InitializingBean, IAnalyzer {

    @Autowired
    private AnalyzerProxy proxy;

    @Override
    public void afterPropertiesSet() throws Exception {
        proxy.onBind(this);
    }
}
