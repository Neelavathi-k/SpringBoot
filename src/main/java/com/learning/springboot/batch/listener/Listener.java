package com.learning.springboot.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class Listener implements JobExecutionListener{

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("Job Ended");
	}
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Job Started " + jobExecution.getStatus().toString());
	}
}
