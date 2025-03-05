package com.mla_filess;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Emp6 {
public static void main(String[] args) {
	try(FileWriter fw = new FileWriter("src/resource.txt")){
		
		fw.write("this is for learning resources example fgbfdg \n fdgfdg fdsgfdg"
				+ "fgifdsugnfdig fdugdfugndfg dfiugdfgudfg fdgufdogd fdughdfoghfdg\n fuoghdfogu fdughfdo\ngu dfoughdfghfdo udofgh");
	
		//System.out.println();
		fw.flush();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	List<String> data = null;
	
	try(Stream<String> strm = Files.lines(Paths.get("src/resource.txt")) ){
		
		// strm.forEach(System.out::println);
		
		data = strm.filter(str->str.startsWith(" ")).map(String :: toUpperCase).toList();
		System.out.println(data);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

