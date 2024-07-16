package DAO;

import java.sql.SQLException;
import java.util.HashMap;
import DTO.Coffee;

public class CoffeeDAO extends ParentDAO{
	
	public HashMap<Integer, Coffee> findAll(){
			HashMap<Integer, Coffee> data = new HashMap<>();
		
		String sql="select * from coffee ";
			//DBeaver로 만든 테이블을 '선택' 해서 가져와야 함.
			//이때 정렬해서 가져오려면? 
			//테이블명 order by 컬럼명 : desc(=내림차순) 혹은 asc(=오름차순)
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery();
				//select = executeQuery, insert, update, delete = executeUpdate 잊지마
			while(rs.next()) {
				//rs.get데이터타입("컬럼명")을 해야 데이터가 나옴.
				data.put(rs.getInt("coffee_id"), 
						new Coffee(rs.getInt("price"), rs.getString("item_name"),
								rs.getBoolean("decaffein")));
			}
							    
			
			
		}catch(SQLException e) {
			System.out.println("coffee 테이블 조회 실패!");
		}
		return data;
	}
}
