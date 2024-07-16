package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffee;
import DTO.Tea;

public class TeaDAO extends ParentDAO{

	public HashMap<Integer, Tea> findAll(){
		HashMap<Integer, Tea> data = new HashMap<>();
		
		String sql="select * from tea ";
		//DBeaver로 만든 테이블을 '선택' 해서 가져와야 함.
		//이때 정렬해서 가져오려면? 
		//테이블명 order by 컬럼명 : desc(=내림차순) 혹은 asc(=오름차순)
	try {
		pt=conn.prepareStatement(sql);
		rs=pt.executeQuery();
			//select = executeQuery, insert, update, delete = executeUpdate 잊지마
	while(rs.next()) {
			//rs.get데이터타입("컬럼명")을 해야 데이터가 나옴.
			data.put(rs.getInt("tea_id"), new Tea(rs.getInt(2), rs.getString(3)));
		}
						    
		
		
	}catch(SQLException e) {
		System.out.println("tea 테이블 조회 실패!");
	}
	
	return data;
		
	}
	
}
