package co.kgggy.prj.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.kgggy.prj.DAO;
import co.kgggy.prj.service.MemberService;
import co.kgggy.prj.vo.MemberVO;

public class MemberServiceImpl extends DAO implements MemberService {
	// 답안지
	private PreparedStatement psmt; // PreparedStatement => 데이터베이스에 sql던지고 sql을실행시켜줌.
	private ResultSet rs; // 엑셀테이블 형태로 받아줌.(select)

	@Override
	public List<MemberVO> memberSelectList() {
		List<MemberVO> members = new ArrayList<MemberVO>(); //List<MemberVO>를 배열형태로.
		MemberVO vo;
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql); //초기화(sql 실어보냄 === select형태)
			rs = psmt.executeQuery(); //executeQuery => select형태이므로.
			while(rs.next()) { //한 행씩 읽을게 있는지 반복 확인.
				vo = new MemberVO();
				vo.setId(rs.getString("id")); //"칼럼명"
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
				vo.setAge(rs.getInt("age"));
				members.add(vo);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return members;
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		String sql = "select * from member where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setId(rs.getString("id")); 
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
				vo.setAge(rs.getInt("age"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
