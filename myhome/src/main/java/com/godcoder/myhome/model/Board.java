package com.godcoder.myhome.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity //JPA설정을 위해서 Database연동을 위한 MODEL클래스임을 알림
@Data
public class Board {

	@Id //PK임을 알림
	@GeneratedValue(strategy = GenerationType.IDENTITY) //컬럼의 자동증가 설정
	private Long id;
	private String title;
	private String content;
}
