package com.ashokit.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ELIGIBLITY_DETAILS")
public class EligiblityDetails {
	@Id
	@Column(name = "ED_TRACE_ID")
	private Integer edTraceId;
	@Column(name = "BENEFIT_AMT")
	private String benefitAmt;
	@Column(name = "CREATE_DATE")
	private Date createDate;
	@Column(name = "DENIAL_REASON")
	private String denialReason;
	@Column(name = "PLAN_END_DATE")
	private Date planEndDate;
	@Column(name = "PLAN_NAME")
	private String planName;
	@Column(name = "PLAN_START_DATE")
	private Date planStartDate;
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	@Column(name = "UPDATE_DATE")
	private Date updateDate;
	

}
