package DAO;

import java.sql.SQLException;
import java.util.HashMap;
import DTO.Coffee;

public class CoffeeDAO extends ParentDAO{
	
	public HashMap<Integer, Coffee> findAll(){
			HashMap<Integer, Coffee> data = new HashMap<>();
		
		String sql="select * from coffee ";
			//DBeaver�� ���� ���̺��� '����' �ؼ� �����;� ��.
			//�̶� �����ؼ� ����������? 
			//���̺�� order by �÷��� : desc(=��������) Ȥ�� asc(=��������)
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery();
				//select = executeQuery, insert, update, delete = executeUpdate ������
			while(rs.next()) {
				//rs.get������Ÿ��("�÷���")�� �ؾ� �����Ͱ� ����.
				data.put(rs.getInt("coffee_id"), 
						new Coffee(rs.getInt("price"), rs.getString("item_name"),
								rs.getBoolean("decaffein")));
			}
							    
			
			
		}catch(SQLException e) {
			System.out.println("coffee ���̺� ��ȸ ����!");
		}
		return data;
	}
}
