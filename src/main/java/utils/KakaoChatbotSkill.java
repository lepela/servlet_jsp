package utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;


@WebServlet("/chatbot/skill")
public class KakaoChatbotSkill extends HttpServlet{

	Gson gson = new Gson();
	@SuppressWarnings("unchecked")
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HashMap<String, Object> map = gson.fromJson(req.getReader(), HashMap.class);
		
		String msg = ((Map<String, String>) map.get("userRequest")).get("utterance");
		System.out.println(msg);
		
		RespText respText = new RespText(msg);
		
		resp.setContentType("application/json; charset=utf-8");
		resp.getWriter().print(gson.toJson(respText));

	}
	
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		String json = gson.toJson(new RespText("텍스트1", "텍스트2"));
		System.out.println(json);
	}
}
@Data
class RespText {
	String version = "2.0";
	Template template = new Template();
	// helper
	private static SimpleText createSimpleText(String str) {
		return new SimpleText(new Text(str));
	}
	
	public RespText(String... text) {
		List<String> list = new ArrayList<>(Arrays.asList(text));
		template.outputs = list.stream().map(RespText::createSimpleText).collect(Collectors.toList());
	}
}
@Data
class Template {
	List<SimpleText> outputs;
}
@Data
@AllArgsConstructor
class SimpleText {
	Text simpleText; 
}
@Data
@AllArgsConstructor
class Text {
	String text;
}
