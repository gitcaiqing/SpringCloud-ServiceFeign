package com.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloud.feign.hystrix.UserinfoFeignHystrix;

@FeignClient(value = "SpringCloud-ServiceProvider/could/userinfo", fallback = UserinfoFeignHystrix.class)
public interface UserinfoFeign {
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Object list();

}
