package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "reply"; 

	//댓글 조회
	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		
		return sql.selectList(namespace + ".replyList",bno);
			}

}
