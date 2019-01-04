package com.zcc.logfinder.sdk;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public abstract class AbstractProxy implements IProxy {

    private Map<ISupportType, ISupportable> supportableMap = new HashMap<>();

    protected Map<ISupportType, ISupportable> getSupportableMap() {
        return supportableMap;
    }

    @Override
    public void onBind(ISupportable supportable) {
        supportableMap.put(supportable.supportType(), supportable);
    }
}
