package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class TestController {

	// 直接注入定义的接口
	@Autowired
	IUserApi userApi;

	@GetMapping("/")
	public void test() {
		// 直接调用 实现调用 REST接口的效果
		Flux<User> users = userApi.getAllUser();
		users.subscribe(System.out::println);
	}

}
