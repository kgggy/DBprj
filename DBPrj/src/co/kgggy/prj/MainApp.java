package co.kgggy.prj;

import java.util.ArrayList;
import java.util.List;

import co.kgggy.prj.member.service.MemberService;
import co.kgggy.prj.member.serviceImpl.MemberServiceImpl;
import co.kgggy.prj.member.vo.MemberVO;

public class MainApp {
	public static void main(String[] args) {
		//DAO dao = new DAO();
		
		//db연결.
		MemberService dao = new MemberServiceImpl(); //db 연결을 위한 객체를 초기화.(인터페이스의 구현체는 MemberServiceImpl이 가지고 있음)
		List<MemberVO> list = new ArrayList<MemberVO>();  //dao객체로부터 넘어온 리스트 담기.
		
		list = dao.memberSelectList();
		
		for(MemberVO member : list) {
			member.toString();
		}
	}
}
