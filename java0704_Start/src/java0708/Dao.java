package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	//Data Base object�� �ظ� : 
	//�����ͺ��̽��� ����Ǿ��ִ� ���� �ٸ� Ŭ������ �ְŴϹްŴ��ϴ� ����

	private Connection conn;	
		//�����ͺ��̽��� ���� ������ü�� ������ ����
	private Statement st;
		//������ conn���� ������ �����͸� DB�� ��ȣ�ۿ��ϱ� ���� ����(�����̽��� ���� X)
		//���̷�Ʈ�� ���� ����
	private ResultSet rs;
		//��� DB�� ��ȸ ����� �ޱ� ���� ����
	private PreparedStatement pt;
		//������ Statement�� ����. ������ ����� �ٸ� ���̴�.(������ ����)
		//���������� ������ ���� ����
	
	Dao(){
		DriverInit();
		Connect();
	}
	
	//MySQL�� JAVA ���α׷��� ������ driver�� �ε�
	private void DriverInit() {
		//���� class������ �޸𸮿� �ε��Ű�� ���
		try {
		 	//�Ʒ� ������ ���� ������ �� �� �� �����Ƿ� try���� ���� ����.
		Class.forName("com.mysql.cj.jdbc.Driver");
			//Reference Libraries�� �ִ� �ּ� �״�� ������. 
			//Class �̸��� Class��;;
			//Class.forName�� �Է��� ���ᱸ���� �Ϸ���.
			//���� ���� ���� ��ٸ�? ��ο� �ش� ������ �������� �ʾƼ�.
		}catch(Exception e) {
			System.out.println("����̹� �ε� ����");
		}
	}
	
//MySQL ������ �����ϱ� ���� ������ �����̴�.
//������ �����̶� Ŭ���̾�Ʈ������ ���� �Ұ���.
	private void Connect() {
		String user = "burnout";
		String password = "1234";
		String url ="jdbc:mysql://localhost:3306/burnout";
		
		try {
			conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� ���� ����");
		}	
		//conn�� �����ϰ� ������ �� �ְԲ� �ϴ� ��.
	}
	
	//������ ������ ���� �ܰ�
	public void insert(Member m) {
		String sql="insert into test_member(name, kor, eng, mat, total, std_avg) values(?,?,?,?,?,?)";
			//�Ʒ��� �޸� values���� ?�� ó���ع���. ���߿� ä��ű� ��������.
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, m.getName());
			pt.setInt(2, m.getKor());
			pt.setInt(3, m.getEng());
			pt.setInt(4, m.getMat());
			pt.setInt(5, m.getTotal());
			pt.setInt(6, m.getStd_avg());
				//�� ���߿��� ���. 
			pt.executeUpdate();
				//�̰� �� ���� ������ �� �Է��߾ �����ͺ��̽��� ���޵��� ����!
		}catch(Exception e) {
			System.out.println("������ ���� ����");
		}
		
	}
		//member class ��ü�� member ���������� �����ߴ� ���� �ּҸ� �ѱ�� ��
		//�׸��� �� �ּҸ� Member m���� �����ߴ��Ű�.
		
		/*
		String sql = "insert into test_member(name,kor,eng,mat,total,std_avg)"
				    +" values('"+m.getName()+"',"+m.getKor()+","+m.getEng()+","
							   +m.getMat()+"," +m.getTotal()+","+m.getStd_avg()+")";
		//getName()�� ��쿡�� �۾��̱� ������ ''�� ������ ����� ��.
		//�̷��� ����� ���� �ڹٿ��� ������ ������ DB�� �������� ��.
		//������ : �̷��� ��� ��Ÿ�� ���� �ְ� ��.... �װ� �� å���̴ϱ� ¿ �� ����.
		//		 ��ġ�� statement ����� ���� �������� ���� �� ��.
		//	     ���Ȼ� ���� ����ϰŵ�. = �����Ϳ� ���� ���ڸ� ������ �������� �� ������ ���� ����.
		//		 �־��� ��� �� ���̺� �� �����͸� �˴� ���� �� �ִ�.
		
		try {
			st = conn.createStatement();	
				//���� ���⼭ �ۼ��� �����͸� DB�� ������ �����ε� ������ ���ɼ��� ������ �����ؾ� ��.
				//sql���� ������ ���� statement��ü ����
			st.executeUpdate(sql);
				//sql���� DB�� ����.
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("������ ���� ����");
			
		}
	*/
	
	public Member[] select() {
		Member[] list = null;
		String sql = "select count(*) as cnt from test_member";
		
		try {
			int size = 0;
			st = conn.createStatement();
			rs = st.executeQuery(sql);
				//�޼��忡 ���� ����ؾ� �� ������ �޶��� : �Ʊ�� ������Ʈ���� ������ ����.
			if(rs.next()) {
				size = rs.getInt("cnt"); // = db�� ������(���ڵ�) ���� ���� ����.
				//count�� ���� ����� cnt�÷��� ����(���� Ÿ������ ����� �����⿡ getInt ���)
				//rs = st~ �� ������ if(rs.next())�̰� ���� �ؾ� ��.
				//�ּҸ� ���������� �̵��ϸ鼭 �������� ������ Ȯ���ϴ� ������ rs�� ������.
				//count�� ���� �ܹ������θ� �� �� �־ count�� �� ��Ȳ���� ��������.
			}
			
			if(size!=0) {//=���� �迭�� �����Ͱ� �ִٸ� 
				list = new Member[size];	//���⼱ ��ü�� ����� �ƴ�. ���������� ������ �����.
				int i=0;
				sql = "select * from test_member";		//��ü ������ ��ȸ ����
				rs=st.executeQuery(sql);	//��ȸ����� �ޱ�
				while(rs.next()) {	//��ȸ ����� 1���� ��ȸ, ���� �������� �� �� �����Ƿ� while�� ����ؾ� ��
					list[i] = new Member(rs.getInt("member_id"), rs.getString("name"), 
							 rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), 
							 rs.getInt("total"), rs.getInt("std_avg"));
					//������ �޼��带 ����� ����. 
					i++;	//�迭�� ���� �ε��� ǥ���� ���� 1�� ����
				}
			}
			
		}catch(Exception e) {
			System.out.println("������ ��ȸ ����");
		}
		
		return list;
	}
	
}

//�ٵ� �����ӿ�ũ ��� �뿡�� �˾Ƽ� �� ���شٴ� �� ���� ��Ű�!