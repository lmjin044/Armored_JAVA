package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffee;
import DTO.Tea;

public class TeaDAO extends ParentDAO{

	public HashMap<Integer, Tea> findAll(){
		HashMap<Integer, Tea> data = new HashMap<>();
		
		String sql="select * from tea ";
		//DBeaver�� ���� ���̺��� '����' �ؼ� �����;� ��.
		//�̶� �����ؼ� ����������? 
		//���̺�� order by �÷��� : desc(=��������) Ȥ�� asc(=��������)
	try {
		pt=conn.prepareStatement(sql);
		rs=pt.executeQuery();
			//select = executeQuery, insert, update, delete = executeUpdate ������
	while(rs.next()) {
			//rs.get������Ÿ��("�÷���")�� �ؾ� �����Ͱ� ����.
			data.put(rs.getInt("tea_id"), new Tea(rs.getInt(2), rs.getString(3)));
		}
						    
		
		
	}catch(SQLException e) {
		System.out.println("tea ���̺� ��ȸ ����!");
	}
	
	return data;
		
	}
	
}
