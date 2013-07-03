package MyCompress;

import com.googlecode.htmlcompressor.compressor.HtmlCompressor;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.FileUtils;

public class MainHtmlCompress {

    public static void main(String args[]) throws IOException {
        
        HtmlCompressor hc = new HtmlCompressor();
        hc.setRemoveIntertagSpaces(true);
        
        String myHtml = IOUtils.toString(
            MainHtmlCompress.class.getResourceAsStream(
                "/data/MyHtml.html"));
        
        String myCompressed = hc.compress(myHtml);
        
        System.out.println("BEFORE (length=" + myHtml.length() + "):");
        System.out.println(myHtml);
        
        FileUtils.writeStringToFile(
            new File("C:\\Temp\\MyCompressedHtml.html"), myCompressed);
        
        System.out.println("AFTER (length=" + myCompressed.length() + "):");
        System.out.println(myCompressed);
        
    }
    
}
