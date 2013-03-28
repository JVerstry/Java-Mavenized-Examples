package com.service.API.Impl;

import com.service.API.MyService;

public final class MyServiceImpl implements MyService {
    
    public MyServiceImpl() { };

    @Override
    public long getTime() {
        return System.currentTimeMillis();
    }
    
}
