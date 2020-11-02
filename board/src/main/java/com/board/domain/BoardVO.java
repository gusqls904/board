package com.board.domain;

import java.util.Date;

public class BoardVO {

//	create table tbl_board(
//			  bno int not null auto_increment,			#게시물 고유 번호
//			  title varchar(50) not null,				#게시물 제목
//			  content text not null,					#게시물 내용
//			  writer varchar(30) not null,				#작성자
//			  regDate timestamp not null default now(),	#작성일
//			  viewCnt int default 0,					#조회수
//			  primary key(bno)
//			);

	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCnt;

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

}
