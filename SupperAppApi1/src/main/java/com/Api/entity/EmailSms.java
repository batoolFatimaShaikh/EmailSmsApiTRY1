package com.Api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;


@Entity
@Table

@NamedStoredProcedureQuery(name = "Template", procedureName = "GetEmailSmsTemplate" , parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN , name = "CommunicationType" , type = String.class)}) 
public class EmailSms {
   
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="ID")
   private int Id;
	 
	 @Column(name="SenderEmailID")
   private String senderEmailId;
	 
	 @Column(name="SenderName")
   private String senderName;
	 
	 @Column(name="Subject")
   private String subject;
	 
	 @Column(name="MessageBody")
   private String messageBody;
	 
	 @Column(name="MessageType")
   private String messageType;
	 
	 @Column(name="CC")
   private String cc;
	 
	 @Column(name="BCC")
   private String bcc;
	 
	 @Column(name="Remark")
   private String remarks;
	 
	 @Column(name="CreatedOnDate")
   private Date createdOnDate;
	 
	 @Column(name="IsActive")
   private String isActive;
	 
	 
	public EmailSms() {
	
	}
	public EmailSms(int id, String senderEmailId, String senderName, String subject, String messageBody,
			String messageType, String cc, String bcc, String remarks, Date createdOnDate, String isActive) {
		super();
		Id = id;
		this.senderEmailId = senderEmailId;
		this.senderName = senderName;
		this.subject = subject;
		this.messageBody = messageBody;
		this.messageType = messageType;
		this.cc = cc;
		this.bcc = bcc;
		this.remarks = remarks;
		this.createdOnDate = createdOnDate;
		this.isActive = isActive;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSenderEmailId() {
		return senderEmailId;
	}
	public void setSenderEmailId(String senderEmailId) {
		this.senderEmailId = senderEmailId;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getBcc() {
		return bcc;
	}
	public void setBcc(String bcc) {
		this.bcc = bcc;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getCreatedOnDate() {
		return createdOnDate;
	}
	public void setCreatedOnDate(Date createdOnDate) {
		this.createdOnDate = createdOnDate;
	}
	public String isActive() {
		return isActive;
	}
	public void setActive(String isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Email [Id=" + Id + ", senderEmailId=" + senderEmailId + ", senderName=" + senderName + ", subject="
				+ subject + ", messageBody=" + messageBody + ", messageType=" + messageType + ", cc=" + cc + ", bcc="
				+ bcc + ", remarks=" + remarks + ", createdOnDate=" + createdOnDate + ", isActive=" + isActive + "]";
	}
	
	
   
   
}
