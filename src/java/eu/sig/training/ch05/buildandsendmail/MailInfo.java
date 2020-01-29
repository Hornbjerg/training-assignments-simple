package eu.sig.training.ch05.buildandsendmail;

import eu.sig.training.ch05.buildandsendmail.BuildAndSendMail.*;

public class MailInfo {
	private String subject;
	private MailFont font;
	private String message1, message2, message3;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public MailFont getFont() {
		return font;
	}
	public void setFont(MailFont font) {
		this.font = font;
	}
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public String getMessage3() {
		return message3;
	}
	public void setMessage3(String message3) {
		this.message3 = message3;
	}
	public String getConcatedMessages() {
		return message1 + message2 + message3;
	}

}
