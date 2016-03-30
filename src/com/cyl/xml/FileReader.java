package com.cyl.xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {
	private StringBuilder fileContent;

	public void readSrcFile(String fileName) {
		InputStream in = getClass().getResourceAsStream("/" + fileName);
		if (in == null)
			throw new NullPointerException(fileName + "'s content is empty");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
		if (fileContent == null)
			fileContent = new StringBuilder();
		try {
			String line = "";
			while (line != null) {
				line = bufferedReader.readLine();
				if (line != null){
					System.out.println(line);
					fileContent.append(line);
				}
			}
			System.out.println("===========================================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public StringBuilder getFileContent() {
		return fileContent;
	}
}
