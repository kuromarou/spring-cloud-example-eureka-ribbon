package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceIdRestController {

	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@RequestMapping("/instanceId")
	public String instanceId() {
		return this.instanceId;
	}
}
