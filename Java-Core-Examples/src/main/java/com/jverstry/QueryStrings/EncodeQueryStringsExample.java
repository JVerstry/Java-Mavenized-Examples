
package com.jverstry.QueryStrings;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class EncodeQueryStringsExample {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
     
        String paramValue = "with spaces and special &!=; characters";
        String encoded = URLEncoder.encode(paramValue, "UTF-8");
        
        System.out.println(paramValue);
        System.out.println(encoded);
        
    }
    
}
