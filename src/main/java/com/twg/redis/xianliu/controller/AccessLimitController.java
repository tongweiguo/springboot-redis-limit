package com.twg.redis.xianliu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twg.redis.xianliu.annotation.AccessLimit;

/**
 * 限流接口测试
 * @author twg
 *
 */
@RestController
@RequestMapping("/access")
public class AccessLimitController {

	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 限流接口
	 * @return
	 */
	@GetMapping("/limit")
	@AccessLimit(maxCount = 5, second = 10)
	public String limit() {
		
		logger.info("限流接口测试···");
		return "测试接口";
	}
}
