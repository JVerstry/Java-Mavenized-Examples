package MyCompress;

import com.googlecode.htmlcompressor.compressor.YuiCssCompressor;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.FileUtils;

public class MainCssCompress {

    public static void main(String args[]) throws IOException {
        
        YuiCssCompressor cc = new YuiCssCompressor();
        
        cc.setLineBreak(80);
        
        String myHtml = IOUtils.toString(
            MainCssCompress.class.getResourceAsStream(
                "/data/MyCss.css"));
        
        String myCompressed = cc.compress(myHtml);
        
        System.out.println("BEFORE (length=" + myHtml.length() + "):");
        System.out.println(myHtml);
        
        FileUtils.writeStringToFile(
            new File("C:\\Temp\\MyCompressedCss.css"), myCompressed);
        
        System.out.println("AFTER (length=" + myCompressed.length() + "):");
        System.out.println(myCompressed);
        
    }
    
}
