package com.mla_filess;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class Enp2 {
	
	
	public static void main(String[] args) {
	

		
//file write stream 
		FileWriter fw = null; 
		BufferedWriter bw = null;
		try {
			
			fw = new FileWriter("src/charstreamm.txt");
			bw = new BufferedWriter(fw);
			String m = "This is the example for character stream";
			bw.write(m);
			System.out.println("Done.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				
			}catch(Exception e) {

				e.printStackTrace();
			}
		}
		
		
//file read stream
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("src/charstreamm.txt");
			br = new BufferedReader(fr);
			System.out.println(br.readLine());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
