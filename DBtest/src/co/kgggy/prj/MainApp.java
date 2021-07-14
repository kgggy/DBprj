package co.kgggy.prj;

import co.kgggy.prj.service.MemberService;
import co.kgggy.prj.serviceImpl.MemberServiceImpl;
import co.kgggy.prj.vo.MemberVO;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	DAO dao = new DAO(); //db와 연결되는지 확인하기 위한 구문.
		MemberService dao = new MemberServiceImpl();  //dao 역할.
//		List<MemberVO> list = new ArrayList<MemberVO>();
//		
//		list = dao.memberSelectList();
//		for(MemberVO vo : list) {
//			System.out.print(vo.getId());
//			System.out.print(vo.getPassword());
//			System.out.print(vo.getName());
//			System.out.print(vo.getAddress());
//			System.out.print(vo.getTel());
//			System.out.println(vo.getAge());
//		}
		
//		for(MemberVO vo : list) {
//			System.out.println(vo.toString());
//		}
		
		MemberVO vo = new MemberVO();
		vo.setId("hong");
		
		vo = dao.memberSelect(vo);
		System.out.println(vo.toString());
		
	}

}
