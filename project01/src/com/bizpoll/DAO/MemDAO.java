package com.bizpoll.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bizpoll.DTO.MemDTO;
import com.bizpoll.common.DBManager;

public class MemDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	MemDTO list = null;
	int result = 0;
	
	
	//직원 입력
	public int insertMem(MemDTO mDto){
		try {
			conn = DBManager.getConnection();
			String sql = "insert into member2(id,pw,name,nick,addr,email,bitrh,status) "
					+ "VALUES(?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mDto.getId());
			pstmt.setString(2, mDto.getPw());
			pstmt.setString(3, mDto.getName());
			pstmt.setString(4, mDto.getNick());
			pstmt.setString(5, mDto.getAddr());
			pstmt.setString(6, mDto.getEmail());
			pstmt.setString(7, mDto.getBitrh());
			pstmt.setString(8, mDto.getStatus());
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	

	// 직원 조회
	public MemDTO selectMem(MemDTO mDto){
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM member2 "
					+ "WHERE id = member1 AND pw = 1234";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String nick = rs.getString("nick");
				String addr = rs.getString("addr");
				String email = rs.getString("email");
				String bitrh = rs.getString("bitrh");
				String status = rs.getString("status");
				MemDTO eDto = new MemDTO(id, pw, name, nick, addr, email, bitrh, status);
				MemDTO list = eDto;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	
	
}