package com.ls.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogApp {

	private static Logger logger = LoggerFactory.getLogger(LogApp.class);
	public static void main(String[] args) {
		logger.info("Info");
	}
}
