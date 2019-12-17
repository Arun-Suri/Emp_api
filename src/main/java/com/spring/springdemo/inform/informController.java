package com.spring.springdemo.inform;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class informController {
	
	@Autowired
	private informService informService;
	@RequestMapping("api/informs")
	public List<inform> getAllinforms() {
		return informService.getAllinforms();
	}
	@RequestMapping("/informs/{id}")
	public Optional<inform> getinform(@PathVariable String id) {
		return informService.getinform(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/informs")
	public void addinform(@RequestBody inform inform) {
		informService.addinform(inform);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/informs/{id}")
	public void updateinform(@RequestBody inform inform,@PathVariable String id) {
		informService.updateinform(id,inform);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/informs/{id}")
	public void deleteTopic(@PathVariable String id) {
		 informService.deleteinform(id);
	}
}
	
