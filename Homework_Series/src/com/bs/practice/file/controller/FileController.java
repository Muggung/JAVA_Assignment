package com.bs.practice.file.controller;

import com.bs.practice.file.modal.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
		String content = sb.toString();
		fd.fileSave(file, content);
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String content = sb.toString();
		fd.fileEdit(file, content);
	}
}
