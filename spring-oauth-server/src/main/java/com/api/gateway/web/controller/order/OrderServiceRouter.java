package com.api.gateway.web.controller.order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/v1")
public class OrderServiceRouter {
	private static Logger log = LoggerFactory.getLogger(OrderServiceRouter.class);
	@Autowired
	public RestTemplate restTemplate;
	
	@RequestMapping(value="/orders", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> createOrder(@RequestBody String  orderModel){
		log.info("create order start...");
		System.out.println("create order start...");
       return  restTemplate.postForEntity("http://10.10.0.126:8081/api-core/v1/orders", orderModel,String.class);
	}
	

}
