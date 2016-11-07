/** 
 * Copyright(C) 2016, WUHAN KOTEI INFORMATICS CO., LTD.	
 *
 * Modification  History:
 * Date          	Author        Version        Description
 * -----------------------------------------------------------------------------------
 * 2016年11月3日       kunw453       1.0             1.0
 *
 *
 */
package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import com.ftp.util.FTPUtil;


/**
 *
 * @ClassName  Test.java
 * @author 	   kunw453  
 * @version	   V1.0 
 * @date       2016年11月3日
 */
public class Test {

	@org.junit.Test
	public void test(){
//		String srcImageFile = "C:\\Users\\Public\\Pictures\\Sample Pictures\\hd-wallpapers_1080p.jpg";
		String srcImageFile = "D:\\1.jpg";
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(srcImageFile);
			boolean flag = FTPUtil.storeFile("123.207.119.22", 21, "image", "king1234", "/data/wwwroot/default/image", "1.jpg", fileInputStream);
			System.out.println(flag);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
