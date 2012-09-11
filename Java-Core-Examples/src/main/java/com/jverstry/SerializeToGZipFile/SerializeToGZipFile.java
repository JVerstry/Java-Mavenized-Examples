
package com.jverstry.SerializeToGZipFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.TreeSet;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class SerializeToGZipFile {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// File location
		String fl = "C:\\Temp\\Serialized.gzip";
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("prte");
		ts.add("aaaa");
		ts.add("zart");
		ts.add("oopo");
		
		// Deleting any existing file
		File file = new File(fl);
		file.delete();		

		FileOutputStream fos = new FileOutputStream(fl);
		GZIPOutputStream gos = new GZIPOutputStream(fos);
		ObjectOutput out = new ObjectOutputStream(gos);
    
		// Serializing to gzip file
		out.writeObject(ts);
		out.close();		
		
		// Reading file content again
		FileInputStream fis = new FileInputStream(fl);
		GZIPInputStream gis = new GZIPInputStream(fis);
		ObjectInput in = new ObjectInputStream(gis);
		
		TreeSet<String> retr = (TreeSet<String>) in.readObject();
		
		for ( String s : retr ) {
			System.out.println(s);
		}
		
	}
		
}
