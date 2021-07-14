package co.kgggy.prj.member.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.kgggy.prj.DAO;
import co.kgggy.prj.member.service.MemberService;
import co.kgggy.prj.member.vo.MemberVO;

public class MemberServiceImpl extends DAO implements MemberService { //미리 인터페이스 만들어두면 DAO가 가지고있는 conn객체 쓸 수 있음.
	//MemberService => 질문목록, DAO=> 연결객체, MemberServiceImpl => 불러주는대로 질문에 대한 답을 씀
	private PreparedStatement psmt; //sql명령을 보내고 실행하기 위한 객체.
	private ResultSet rs; //select 결과를 받을 수 있는 객체.
	
	@Override
	public List<MemberVO> memberSelectList() {  //<리턴값>  //질문1
		// TODO 전체리스트 가져오기
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new MemberVO(); 
				vo.setId(rs.getString("id")); //문자열타입으로 읽기.
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
				vo.setAge(rs.getInt("age"));
				list.add(vo); //리스트에 추가하는 것.
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {  //질문2
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
