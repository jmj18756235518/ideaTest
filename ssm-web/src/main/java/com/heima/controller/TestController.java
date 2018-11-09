package com.heima.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/hello")
	@ResponseBody
	public Map<String,Object> test(){
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		hashMap.put("test", "helloWorld");
		return hashMap;
	}
}
