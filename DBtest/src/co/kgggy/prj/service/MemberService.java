package co.kgggy.prj.service;

import java.util.List;

import co.kgggy.prj.vo.MemberVO;

public interface MemberService {
	//질문리스트.
	List<MemberVO> memberSelectList(); //멤버 전체 리스트를 가져옴.
	MemberVO memberSelect(MemberVO vo); //키값(vo)을 던져줌.
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
}
