package com.ashokit.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "CO_TRIGGERS")
public class CoTriggers {
	@Id
	@Column(name = "TRIGGER_ID")
	private Integer triggerId;
	@Column(name = "CASE_NUM")
	private Integer caseNum;
	@Column(name = "CREATE_DATE")
	private Date createDate;
	@Column(name = "TRG_STATUS")
	private String trgStatus;
	@Column(name = "UPDATE_DATE")
	private Date updateDate;
}
