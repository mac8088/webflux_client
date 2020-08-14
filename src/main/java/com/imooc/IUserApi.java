package com.imooc;

import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Flux;

@ApiServer("http://localhost:8080/user")
public interface IUserApi {

	@GetMapping("/")
	Flux<User> getAllUser();


}
