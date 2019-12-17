package com.spring.springdemo.inform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class informService {
	@Autowired
	private informRepository informRepository;
	
	
	
	public List<inform>getAllinforms(){
		//return topics;
		List<inform> informs=new ArrayList<>();
		informRepository.findAll()
		.forEach(informs::add);
		return informs;
	}
	public Optional<inform> getinform(String id) {
		
	  return informRepository.findById(id);
	}
  public void addinform(inform inform) {
	 informRepository.save(inform);
  }
public void updateinform(String id, inform inform) {
	informRepository.save(inform);
		}
	
	public void deleteinform(String id) {
	informRepository.deleteById(id);
  }
}


