package admin.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.bean.TodayDTO;
import admin.dao.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDAO adminDAO;
	
	@Autowired
	private HttpSession session;
	
	// 일일방문자수 업데이트
	@Override
	public void countEnter() {
		adminDAO.countEnter();
	}
	// todaytable 가져오기
	@Override
	public TodayDTO dashboard() {
		return adminDAO.dashboard();
	}
	// 전체 회원수 가져오기
	@Override
	public int totalmember() {
		return adminDAO.totalmember();
	}
	// 전체 블로그수 가져오기
	@Override
	public int totalblog() {
		return adminDAO.totalblog();
	}
	// 전체 게시판수 가져오기
	@Override
	public int totalboard() {
		return adminDAO.totalboard();
	}
	// 전체 맛집수 가져오기
	@Override
	public int totalmatzip() {
		return adminDAO.totalmatzip();
	}
	// 남자회원수 가져오기
	@Override
	public int totalMan() {
		return adminDAO.totalMan();
	}
	// 여자회원수 가져오기
	@Override
	public int totalWoman() {
		return adminDAO.totalWoman();
	}
	
	// 맛집 등록하기
	@Override
	public void writematzip(Map<String, String> map) {
	
		adminDAO.writematzip(map);
		
	}
	
	// 공지사항 등록하기
	@Override
	public void communityWrite(Map<String, String> map) {
		adminDAO.communityWrite(map);
	}


}
