
package com.jverstry.QueryStrings;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeDecodeQueryStringsExample {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
     
        String paramValue = "with spaces and special &!=; characters";
        
        String encoded = URLEncoder.encode(paramValue, "UTF-8");
        String decoded = URLDecoder.decode(paramValue, "UTF-8");
        
        System.out.println(paramValue);
        System.out.println(encoded);
        System.out.println(decoded);
        
    }
    
}
