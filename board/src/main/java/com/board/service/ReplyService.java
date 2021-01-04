package com.board.service;

import java.util.List;


import com.board.domain.ReplyVO;

public interface ReplyService {
	
	//댓글 조회
	public List<ReplyVO> list(int bno) throws Exception;
	

}
