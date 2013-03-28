package com.app;

import com.service.API.MyService;
import java.util.ServiceLoader;

public class MyApp {
    
    public static <T> T loadService(Class<T> api) {
        
        T result = null;
        
        ServiceLoader<T> impl = ServiceLoader.load(api);
        
        for (T loadedImpl : impl) {
            result = loadedImpl;
            if ( result != null ) break;
        }
        
        if ( result == null ) throw new RuntimeException(
            "Cannot find implementation for: " + api);
        
        return result;
        
    }
    
    public static final MyService myService = loadService(MyService.class);
    
    public static void main(String[] args) {
        
        System.out.println("Time is: " + myService.getTime());
        
    }
    
}
