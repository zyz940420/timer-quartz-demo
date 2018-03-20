package com.yuzhou.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class FirstScheduledJob extends QuartzJobBean {
	@Autowired
	private AnotherBean anotherBean;

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("FirstScheduledJob Executes!" + sdf.format(date));
		anotherBean.printAnotherMessage();
	}

}
