package dto;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Criteria {
	private int page = 1;
	private int amount = 10;
	private int category = 2;
	private String type;
	private String keyword;
	
	public int getOffset() {
		return (page - 1) * 10; 
	}
	
	// request 분석 후 필드 초기화
	public Criteria (HttpServletRequest req) {
		if(req == null) return;
		
		Field[] fields = getClass().getDeclaredFields();
		for(Field field :fields) {
			String tmp = req.getParameter(field.getName());
			if(tmp != null && !tmp.equals("")) {
				try {
					Object obj = tmp;
					if(field.getType() == int.class) {
						obj = Integer.parseInt(tmp);
					}
					field.set(this, obj);
				} catch (IllegalArgumentException | IllegalAccessException e) {e.printStackTrace();}
			}
		}
	}
	
	// queryString 문자열 생성 (el에서 사용될 예정)
	
	// page포함
	public String getQs2() {
		return "page="+page+"&"+getQs();
	}
	
	// page비포함
	public String getQs() {
		Field[] fields = getClass().getDeclaredFields();
		String[] strs = new String[4];
		Stream.of(fields).filter(f->!f.getName().equals("page")).map(f-> {
			String r = null;
			try {
				r = f.getName() + "=" + (f.get(this) == null ? "" : f.get(this));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			return r;
		}).collect(Collectors.toList()).toArray(strs);
		return String.join("&", strs);
	}
}
