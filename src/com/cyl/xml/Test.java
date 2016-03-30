package com.cyl.xml;

public class Test {
	public static void main(String[] args) {
		// XmlHandler handle = new StringXmlHandler();
		// handle.handle("/Users/cong/myxml/assets");
		find();
	}

	public static void find() {
		FileReader fileReader = new FileReader();
		fileReader.readSrcFile("file.txt");
		FileReader fileReader1 = new FileReader();
		fileReader1.readSrcFile("regex.txt");
		StringFinder sf = new StringFinder(fileReader.getFileContent());
		sf.find(Utils.strSplit(fileReader1.getFileContent().toString(), "、"));
		sf.printMatchStrList();
//		System.out.println(sf);
	}
	
}
