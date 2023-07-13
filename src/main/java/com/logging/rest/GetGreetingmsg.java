package com.logging.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetGreetingmsg {
	Logger logger=LoggerFactory.getLogger(GetGreetingmsg.class);
	@GetMapping("/msg")
	public String getGreetingmsg() {
		logger.info("greeting methos started");
		String msg="good evening";
		logger.info("greeting methos ended");
		return msg;
	}

}
