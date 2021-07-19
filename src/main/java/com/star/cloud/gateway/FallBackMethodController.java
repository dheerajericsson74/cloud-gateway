package com.star.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		System.out.println(" <<< --------  InsideFallBackMethodController  userServiceFallBack ----->>>>>>>>> ");
		return "User service Leamon choose lee  down !!!!";
	}
	
	
	@GetMapping("/deptServiceFallBack")
	public String deptServiceFallBackMethod() {
		System.out.println(" <<< --------  InsideFallBackMethodController  deptServiceFallBack ----->>>>>>>>> ");
		return "Dept service Leamon choose lee  down !!!!";
	}
}
