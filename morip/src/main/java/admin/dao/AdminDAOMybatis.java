package admin.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import admin.bean.TodayDTO;

@Repository
@Transactional
public class AdminDAOMybatis implements AdminDAO {
	@Autowired
	private SqlSession sqlSession;
	// 일일방문자수 업데이트
	@Override
	public void countEnter() {
		sqlSession.update("adminSQL.countEnter");
	}
	// todaytable 가져오기
	@Override
	public TodayDTO dashboard() {
		return sqlSession.selectOne("adminSQL.dashboard");
	}
	// 전체 회원수 가져오기
	@Override
	public int totalmember() {
		return sqlSession.selectOne("adminSQL.totalmember");
	}
	// 전체 블로그수 가져오기
	@Override
	public int totalblog() {
		return sqlSession.selectOne("adminSQL.totalblog");
	}
	// 전체 게시판수 가져오기
	@Override
	public int totalboard() {
		return sqlSession.selectOne("adminSQL.totalboard");
	}
	// 전체 맛집수 가져오기
	@Override
	public int totalmatzip() {
		return sqlSession.selectOne("adminSQL.totalmatzip");
	}
	// 남자회원수 가져오기
	@Override
	public int totalMan() {
		return sqlSession.selectOne("adminSQL.totalMan");
	}
	// 여자회원수 가져오기
	@Override
	public int totalWoman() {
		return sqlSession.selectOne("adminSQL.totalWoman");
	}
	
	// 맛집 등록하기
	@Override
	public void writematzip(Map<String, String> map) {
		
		sqlSession.insert("adminSQL.writematzip",map);
	}
	@Override
	public void communityWrite(Map<String, String> map) {
		sqlSession.insert("adminSQL.communityWrite", map);
		
	}
	
	
}
