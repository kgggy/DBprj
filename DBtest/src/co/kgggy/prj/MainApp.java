package co.kgggy.prj;

import java.util.ArrayList;
import java.util.List;

import co.kgggy.prj.app.Menu;
import co.kgggy.prj.service.MemberService;
import co.kgggy.prj.serviceImpl.MemberServiceImpl;
import co.kgggy.prj.vo.MemberVO;

public class MainApp {

	public static void main(String[] args) {
		// DAO dao = new DAO(); //db와 연결되는지 확인하기 위한 구문.
//		MemberService dao = new MemberServiceImpl(); // dao 역할.
//		List<MemberVO> list = new ArrayList<MemberVO>();
//
//		// 전체 리스트 확인.
//		list = dao.memberSelectList();
//		for(MemberVO vo : list) {
//			System.out.print(vo.getId());
//			System.out.print(vo.getPassword());
//			System.out.print(vo.getName());
//			System.out.print(vo.getAddress());
//			System.out.print(vo.getTel());
//			System.out.println(vo.getAge());
//		}

//		for (MemberVO vo : list) {
//			System.out.println(vo.toString());
//		}

		//한 건 조회.
//		MemberVO vo = new MemberVO();
//		vo.setId("kgggy2");
//		vo = dao.memberSelect(vo);
//		System.out.println(vo.toString());
		
		// 한 건 입력.
//		MemberVO vo = new MemberVO();
//		vo.setId("kgggy2");
//		vo.setPassword("4321");
//		vo.setName("ㄱㄱㅇ");
//		vo.setAddress("대구광역시");
//		vo.setTel("010-5272-3699");
//		vo.setAge(25);
//		
//		int n = dao.memberInsert(vo);
//		if(n != 0) {
//			System.out.println("정상적으로 입력되었습니다.");
//		} else {
//			System.out.println("입력 실패.");
//		}

		// 한 건 삭제.
//		MemberVO vo = new MemberVO();
//		vo.setId("park2");
//		int n = dao.memberDelete(vo);
//		if (n != 0) {
//			System.out.println("정상적으로 삭제되었습니다.");
//		} else {
//			System.out.println("삭제 실패.");
//		}

		// 한 건 수정.
//		MemberVO vo = new MemberVO();
//		vo.setId("park");
//		vo.setName("박사장");
//		vo.setAddress("어디어디");
//		vo.setTel("010-1212-3535");
//		
//		int n = dao.memberUpdate(vo);
//		if (n != 0) {
//			System.out.println("정상적으로 수정되었습니다.");
//		} else {
//			System.out.println("수정 실패.");
//		}
		
		Menu menu = new Menu();
		menu.run();
	}
}
