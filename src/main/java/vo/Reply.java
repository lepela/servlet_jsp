package vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reply {
	private Long rno;
	private String content;
	private Date regdate;
	private Date updatedate;
	private Boolean hidden;
	private Integer likes;
	private String writer;
	private Long pno;
	
	
	
}
