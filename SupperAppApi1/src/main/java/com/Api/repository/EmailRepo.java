package com.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.entity.EmailSms;
@Repository
public interface EmailRepo extends JpaRepository<EmailSms , Integer> {

}
