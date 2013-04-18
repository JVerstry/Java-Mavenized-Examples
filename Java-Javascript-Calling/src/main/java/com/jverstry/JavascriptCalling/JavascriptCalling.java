package com.jverstry.JavascriptCalling;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavascriptCalling {
    
    public static final String MY_JS
        = "print(\"Hello world!\\n\");"
        + "var myFunction = function(x) { return x+3; };";
    
    public static void main(String[] args)
            throws ScriptException, NoSuchMethodException {
        
        // Retrieving the Javascript engine
        ScriptEngine se = new ScriptEngineManager()
            .getEngineByName("javascript");
        
        if ( Compilable.class.isAssignableFrom(se.getClass()) ) {
            
            // We can compile our JS code
            Compilable c = (Compilable) se;
            CompiledScript cs = c.compile(MY_JS);
            
            System.out.println("From compiled JS:");
            cs.eval();
            
        } else {
            
            // We can't compile our JS code
            System.out.println("From interpreted JS:");
            se.eval(MY_JS);
            
        }
        
        // Can we invoke myFunction()?
        if ( Invocable.class.isAssignableFrom(se.getClass()) ) {
            
            Invocable i = (Invocable) se;
            
            System.out.println("myFunction(2) returns: "
                + i.invokeFunction("myFunction", 2));
             
        } else {
            
            System.out.println(
                "Method invocation not supported!");
            
        }
        
    }
    
}
