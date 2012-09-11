
package com.jverstry.ReadWriteUTF8StringsToGzipFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ReadWriteUTF8StringsToGzipFile {

	public static void main(String[] args)
			throws FileNotFoundException, IOException {
		
		// File location
		String fl = "C:\\Temp\\text.gzip";
		
		// Deleting any existing file
		File file = new File(fl);
		file.delete();		

		FileOutputStream fos = new FileOutputStream(fl);
		GZIPOutputStream gos = new GZIPOutputStream(fos);
		OutputStreamWriter osw = new OutputStreamWriter(gos, "UTF-8");
		BufferedWriter out = new BufferedWriter(osw);
		
		// Writing content
		out.write("First Line !!!");
		out.newLine();

		out.write("Second Line !!!");
		out.newLine();
		
		out.close();
		
		// Reading file content again
		FileInputStream fis = new FileInputStream(fl);
		GZIPInputStream gis = new GZIPInputStream(fis);
		InputStreamReader isw = new InputStreamReader(gis, "UTF-8");
		BufferedReader in = new BufferedReader(isw);
		
		String retr = in.readLine();
		
		while ( retr != null ) {
			System.out.println(retr);
			retr = in.readLine();
		}
		
		in.close();
		
	}
		
}
