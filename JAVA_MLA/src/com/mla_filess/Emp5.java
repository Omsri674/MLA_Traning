package com.mla_filess;

import java.io.FileWriter;
import java.nio.file.*;
import java.util.*;



public class Emp5 {
public static void main(String[] args) {
	
// reading data from file using neo (java 8 advance feature)
	Path path = Paths.get("src/bytestreamm.txt");
	
	try {
		byte[] bs = Files.readAllBytes(path);
		List<String> linesData = Files.readAllLines(path);
		System.out.println("Reaeding bytre data: "+ new String(bs));
		System.out.println("Reading list of lines: "+linesData);
		System.out.println(linesData.size());
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	
	// to copy content from one file to another file
	
	Path p1 = Paths.get("src/bytestreamm.txt");
	Path p2 = Paths.get("src/charstreamm.txt");
	
	try {
		
		Path pathcpy = Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Target file location: "+ pathcpy);
		System.out.println("Content Copied" + new String(Files.readAllBytes(pathcpy)));
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
