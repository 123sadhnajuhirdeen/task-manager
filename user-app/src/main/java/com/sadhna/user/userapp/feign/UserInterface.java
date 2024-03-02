package com.sadhna.user.userapp.feign;

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("TASK-SERVICE")
public interface UserInterface {
	
	

}
