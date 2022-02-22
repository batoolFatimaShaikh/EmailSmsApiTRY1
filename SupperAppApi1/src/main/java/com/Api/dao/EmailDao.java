package com.Api.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Api.entity.EmailSms;

@Repository
public class EmailDao {
	@Autowired
	private EntityManager eManager;
	
	@SuppressWarnings("unchecked")
	public List<EmailSms> getList(String input){
		return eManager.createNamedStoredProcedureQuery("Template").setParameter("CommunicationType",input ).getResultList();
	}

}
