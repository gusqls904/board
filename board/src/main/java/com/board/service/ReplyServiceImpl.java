package com.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.board.dao.ReplyDAO;
import com.board.domain.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	private ReplyDAO dao;

	//댓글 조회
	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		
		return dao.list(bno);
	}

}
