package com.learning.springboot.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.springboot.batch.listener.Listener;
import com.learning.springboot.batch.processor.Processor;
import com.learning.springboot.batch.reader.Reader;
import com.learning.springboot.batch.writer.Writer;

@Configuration
public class BatchConfig {

	@Autowired
	StepBuilderFactory sbf;

	@Autowired
	JobBuilderFactory jbf;
	
	@Bean
	public Job job() {
		return jbf.get("job1").incrementer(new RunIdIncrementer()).listener(listener()).start(step()).build();  
	}
	
	@Bean
	public Step step() {
		return sbf.get("step1").<String, String>chunk(1).reader(reader()).writer(writer()).processor(processor())
				.build();
	}

	@Bean
	public Reader reader() {
		return new Reader();
	}

	@Bean
	public Writer writer() {
		return new Writer();
	}

	@Bean
	public Processor processor() {
		return new Processor();
	}

	@Bean
	public Listener listener() {
		return new Listener();
	}
}
