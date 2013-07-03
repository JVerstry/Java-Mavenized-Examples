package MyCompress;

import com.google.javascript.jscomp.CompilationLevel;
import com.google.javascript.jscomp.CompilerOptions;
import com.googlecode.htmlcompressor.compressor.ClosureJavaScriptCompressor;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.FileUtils;

public class MainJavascriptCompress {

    public static void main(String args[]) throws IOException {
        
        ClosureJavaScriptCompressor jc = new ClosureJavaScriptCompressor();
        jc.setCompilationLevel(CompilationLevel.SIMPLE_OPTIMIZATIONS);
        
        CompilerOptions retr = jc.getCompilerOptions();
        retr.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
        retr.setLineLengthThreshold(32 * 1024);
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(IOUtils.toString(
            MainJavascriptCompress.class.getResourceAsStream(
                "/data/jquery-2.0.0.js")));

        sb.append('\n');
        
        sb.append(IOUtils.toString(
            MainJavascriptCompress.class.getResourceAsStream(
                "/data/MyJavascript.js")));

        String toCompress = sb.toString();
        String compressed = jc.compress(toCompress);
        
        FileUtils.writeStringToFile(
            new File("C:\\Temp\\MyMinimifiedJS.js"), compressed);
        
        System.out.println("BEFORE (length=" + toCompress.length() + ")");
        System.out.println("AFTER (length=" + compressed.length() + ")");
        
    }
    
}
