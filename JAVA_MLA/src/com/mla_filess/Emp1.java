package com.mla_filess;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Emp1 {

	public static void main(String[] args) {

		
// File Write Operation
		File file = new File("src/bytestreamm.txt");
		FileOutputStream fout = null;
		
		try {
			
			fout = new FileOutputStream(file);
			String m = "This is only for byte stream read and write example";
			fout.write(m.getBytes());
			System.out.println("file writted ");
			
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		finally {
			try {
				if(fout == null) {
					fout.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
// File Read Opertaion
		
		FileInputStream fin = null;
		BufferedInputStream buff = null;
		try {
			fin = new FileInputStream(file);
			
			byte[] br = new byte[1024];
			buff = new BufferedInputStream(fin);
			int x =0;
			while( (x = buff.read(br)) != -1) {
				System.out.println(new String(br, 0,x));
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			try {
				
				fin.close();
				buff.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
