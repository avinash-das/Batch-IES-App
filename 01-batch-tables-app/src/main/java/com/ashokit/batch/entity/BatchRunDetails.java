package com.ashokit.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "BATCH_RUN_DTLS")

public class BatchRunDetails {
	@Id
	@Column(name = "BATCH_RUN_DTLS")
	private Integer batchRunSeq;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;
	@Column(name = "START_DATE")
	private Date startDate;
	@Column(name="INSTANCE_NUM")
	private Integer instanceNum;
	@Column(name = "END_DATE")
	private Date endDate;
}
