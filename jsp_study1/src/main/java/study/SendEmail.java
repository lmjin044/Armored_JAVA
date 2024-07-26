package study;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void sendEmail(String fromEmail, String title, String content) {
		//���Ǳ� ��� �Ǹ� ������ �̸��Ϸ� �����ϱ�
		
		final String adminEmail="b_pen@naver.com";
		final String password="8PB1MS1VRD8R";
		//������ �̸��� ���� ����. �̶� ��й�ȣ�� ���ø����̼� ��й�ȣ��
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com"); //smtp ���� ����
		prop.put("mail.smpt.port", "587");	//smtp ��Ʈ ����
		prop.put("mail.smtp.starttls.enable", "true");//tlp �������
		prop.put("mail.smtp.auth", "true");//smtp ���� ����
		
		/*
		��ǥ : ���Ǳ� ����� �Ǹ� ������ �̸��Ϸ� ������ �ǵ��� �ϱ�
		      ������ ����� �޴� ����� �ʿ�
		      ������ ����� Ŭ���̾�Ʈ����, Ŭ���̾�Ʈ�� ���Ϸ� ���� ������ ���� �ƴ�
		      �ڹٿ��� �߼��ϴ� ���̹Ƿ� �����ڰ� ������ �ް� ������ ������ �ʿ���.
		*/
		
		Session adminAuth = Session.getInstance(prop, 
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(adminEmail, password);
					}
				}
		
				);
		
		try {
			MimeMessage msg = new MimeMessage(adminAuth);
			msg.setFrom(new InternetAddress(adminEmail));	//������ ��� ����
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(adminEmail));
				//�޴� ��� ����
			msg.setHeader("Content-Type", "text/html;charset=utf-8");
			msg.setSubject("���� �� ��� ["+title+"] - "+fromEmail);//�̸��� ���� ����
			msg.setContent(
					"<h3>���ǳ���</h3> <b>"+content+"</b> <div> <a href='http://localhost:8080/jsp_study1/study/?part=inquiry'>"+
					"���Ǳ� Ȯ�� </a> </div>", "text/html;charset=utf-8");//�̸��� ����.
			
			Transport.send(msg);//���� ����
			
			
		}catch(MessagingException e) {
			e.printStackTrace();
			System.out.println("�̸��� ���� ����");
		}
	}
}
