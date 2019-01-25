package com.cloud.feign.hystrix;

import org.springframework.stereotype.Component;

import com.cloud.feign.UserinfoFeign;

@Component
public class UserinfoFeignHystrix implements UserinfoFeign{

	@Override
	public Object list() {
		// TODO Auto-generated method stub
		return null;
	}

}
