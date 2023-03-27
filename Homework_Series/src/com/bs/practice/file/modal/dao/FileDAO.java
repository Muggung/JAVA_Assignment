package com.bs.practice.file.modal.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileDAO {
	
	public boolean checkName(String file) {
		File address = new File("./");
		String[] files = address.list();
		
		for(String fileName : files) {
			if(fileName.equals(file+".txt")) {
				return true;
			}
		} return false;
	}
	
	public void fileSave(String file, String s) {
		try(FileWriter fw = new FileWriter("./" + file + ".txt")) {
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder fileRead = new StringBuilder();
		
		try(FileReader fr = new FileReader("./" + file + ".txt")) {
			int data = 0;
			
			while((data = fr.read()) != -1) {
				fileRead.append((char)data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} return fileRead;
	}
	
	public void fileEdit(String file, String s) {
		try(FileWriter fw = new FileWriter("./" + file + ".txt")){
			fw.write(s);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
