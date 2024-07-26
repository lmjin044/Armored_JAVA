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
		//문의글 등록 되면 관리자 이메일로 전송하기
		
		final String adminEmail="b_pen@naver.com";
		final String password="8PB1MS1VRD8R";
		//관리자 이메일 계정 설정. 이때 비밀번호는 애플리케이션 비밀번호로
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com"); //smtp 서버 설정
		prop.put("mail.smpt.port", "587");	//smtp 포트 설정
		prop.put("mail.smtp.starttls.enable", "true");//tlp 사용유무
		prop.put("mail.smtp.auth", "true");//smtp 서버 인증
		
		/*
		목표 : 문의글 등록이 되면 관리자 이메일로 전송이 되도록 하기
		      보내는 사람과 받는 사람이 필요
		      보내는 사람은 클라이언트지만, 클라이언트의 메일로 직접 보내는 것이 아닌
		      자바에서 발송하는 것이므로 관리자가 스스로 받고 보내는 절차가 필요함.
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
			msg.setFrom(new InternetAddress(adminEmail));	//보내는 사람 설정
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(adminEmail));
				//받는 사람 설정
			msg.setHeader("Content-Type", "text/html;charset=utf-8");
			msg.setSubject("문의 글 등록 ["+title+"] - "+fromEmail);//이메일 제목 형식
			msg.setContent(
					"<h3>문의내용</h3> <b>"+content+"</b> <div> <a href='http://localhost:8080/jsp_study1/study/?part=inquiry'>"+
					"문의글 확인 </a> </div>", "text/html;charset=utf-8");//이메일 내용.
			
			Transport.send(msg);//메일 전송
			
			
		}catch(MessagingException e) {
			e.printStackTrace();
			System.out.println("이메일 전송 실패");
		}
	}
}
