package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import vo.Member;

@WebListener
public class AutoLoginListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		se.getSession().setAttribute("member", Member.builder().id("abcd").name("개똥이").build());
	}

	
	
}
