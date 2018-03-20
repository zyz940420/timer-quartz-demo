package com.yuzhou.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service("myBean")
public class MyBean {
	
	private void printMessage() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("MyBean Executes!" + sdf.format(date));
	}

}
