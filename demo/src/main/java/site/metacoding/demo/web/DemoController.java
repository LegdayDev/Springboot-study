package site.metacoding.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@ 는 어노테이션 : JVM의 주석 JVM 이 runtime 시에 특정메서드를 실행
@RestController //Rest API 
public class DemoController {
	
	@GetMapping("/home")
	public void home() {
		System.out.println("나는 home입니다");
	}
	
	@GetMapping("/index")
	public String index() {
		
		return "Hello Spring";
	}
	
	@GetMapping("/h1")
	public String h1() {
		StringBuilder sb = new StringBuilder();
		sb.append("<h1>안녕</h1>\n");
		sb.append("<div><strong>나는 나야</strong></div>");
		sb.append("<img src = \"../site.metacoding.demo/web/img/img1.jpg\">");

		String str = sb.toString();
		return str;
	}
	
	@GetMapping("/alert")
	public String alert() {
		
		return "<script> alert('Hello World'); </script>";
	}
	// 저장만 하면 reload된다 (devtools 라이브러리기능)
}
