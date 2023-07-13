package com.logging.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DemoRestController {
	Logger logger = LoggerFactory.getLogger(DemoRestController.class);
	@GetMapping("/welcome")
	public String getMSG() {
		logger.debug("get welcome msg got started");
		try {
			int i=10/0;
		}catch (Exception e) {
			logger.error("Exception occur "+ e.getMessage());
			// TODO: handle exception
		}
		String msg= "Welcome to my first program..";
		logger.debug("get welcome msg got end");
		return msg;
	}

}
