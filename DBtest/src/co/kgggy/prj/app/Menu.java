package co.kgggy.prj.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.kgggy.prj.service.MemberService;
import co.kgggy.prj.serviceImpl.MemberServiceImpl;
import co.kgggy.prj.vo.MemberVO;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao = new MemberServiceImpl();

	private void menuTitle() {
		System.out.println("======================");
		System.out.println("<< 회원 정보 관리 시스템 >>");
		System.out.println("--- 1. 전체 목록 조회 ---");
		System.out.println("--- 2. 회원 정보 조회 ---");
		System.out.println("--- 3. 회원 정보 등록 ---");
		System.out.println("--- 4. 회원 정보 수정 ---");
		System.out.println("--- 5. 회원 정보 삭제 ---");
		System.out.println("--- 6.  시스템 종료  ---");
		System.out.println("======================");
		System.out.println("원하는 작업번호를 선택하세요>");
	}

	private void mainMenu() {
		int jobNo;
		boolean b = false;

		do {
			menuTitle();
			switch (jobNo = sc.nextInt()) {
			case 1:
				memberSelectList();
				break;
			case 2:
				memberSelect();
				break;
			case 3:
				memberInsert();
				break;
			case 4:
				memberUpdate();
				break;
			case 5:
				memberDelete();
				break;
			case 6:
				b = true;
				System.out.println("===== Good Bye!! =====");
				break;
			}
		} while (!b);
	}

	private void memberDelete() {
		// TODO 회원 정보 한 건 삭제.
		MemberVO vo = new MemberVO();
		System.out.println("삭제하실 ID를 입력하세요>");
		vo.setId(sc.next());
		sc.nextLine();
		int n = dao.memberDelete(vo);
		if (n != 0) {
			System.out.println("정상 삭제되었습니다.");
		} else {
			System.out.println("삭제 실패하였습니다.");
		}
	}

	private void memberUpdate() {
		// TODO 회원 정보 수정.
		MemberVO vo = new MemberVO();
		System.out.println("수정하실 ID를 입력하세요>");
		vo.setId(sc.next());
		sc.nextLine();

		System.out.println("주소 >>");
		vo.setAddress(sc.nextLine());
		System.out.println("전화번호 >>");
		vo.setTel(sc.next());
		sc.nextLine();
		System.out.println("이름 >>");
		vo.setName(sc.next());
		
		int n = dao.memberUpdate(vo);
		if (n != 0) {
			System.out.println("정상 수정되었습니다.");
		} else {
			System.out.println("수정 실패하였습니다.");
		}
	}

	private void memberInsert() {
		// TODO 데이터 추가.
		MemberVO vo = new MemberVO();
		System.out.println("아이디 >>");
		vo.setId(sc.next());
		sc.nextLine();
		System.out.println("패스워드 >>");
		vo.setPassword(sc.next());
		sc.nextLine();
		System.out.println("이름 >>");
		vo.setName(sc.next());
		sc.nextLine();
		System.out.println("주소 >>");
		vo.setAddress(sc.nextLine());
		System.out.println("전화번호 >>");
		vo.setTel(sc.next());
		sc.nextLine();
		System.out.println("나이 >>");
		vo.setAge(sc.nextInt());

		int n = dao.memberInsert(vo);
		if (n != 0) {
			System.out.println("정상 입력되었습니다.");
		} else {
			System.out.println("입력 실패하였습니다.");
		}
	}

	private void memberSelect() {
		// TODO 한명분의 데이터 조회.
		MemberVO vo = new MemberVO();
		System.out.println("검색할 ID를 입력하세요>");
		vo.setId(sc.next());
		sc.nextLine();

		vo = dao.memberSelect(vo);
		System.out.println(vo.toString());
	}

	private void memberSelectList() {
		// TODO 회원 전체 목록 조회.
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = dao.memberSelectList();
		for (MemberVO member : members) {
			System.out.println(member.toString());
		}

	}

	public void run() { // private이므로.
		mainMenu();
		sc.close();
	}
}
