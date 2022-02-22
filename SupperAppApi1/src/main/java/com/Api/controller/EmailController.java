package com.Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Api.dao.EmailDao;
import com.Api.entity.EmailSms;
import com.Api.repository.EmailRepo;

;

@RestController
@RequestMapping("/api/v1")
public class EmailController {
	
	 @Autowired
	    private EmailDao emailDao;
	 @Autowired
	    private EmailRepo emailRepo;
	 
	 
	 
	 @GetMapping("/find/{input}")
	    public List<EmailSms> getList(@PathVariable String input) {
			return emailDao.getList(input);
		}
	 
	
	 
	}


