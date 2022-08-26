package site.metacoding.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RequestController {
	
	//File찾는 방법
	@GetMapping("/user/userList")
	public String userList() {
		return "user/userList";
	}
	
	//Query String 받기
	//URI : http://localhost:8000/user/userinfo?id=40 
	// ?다음의 변수명=값 을 입력하면 된다.
	//다수의 데이터는 &&로 연결
	//URI : http://localhost:8000/user/userinfo?id=40&&userName=최재영
	@GetMapping("/user/userinfo")
	public String userinfo(Integer id,String userName) {
		System.out.println("id : "+id);
		System.out.println("username : "+userName);
		return "user/userinfo";
	}
	
	//Path Variable(패스 값 받기 방법)
	//URI : http://localhost:8000/user/userinfo2/30
	//트렌디하고 가장 깔끔한 방법
	@GetMapping("/user/userinfo2/{id}")
	public String userinfo2(@PathVariable Integer id) {
		
		System.out.println("id : "+id);
		return "user/userinfo";
	}
	
	
	// 사용자가 데이터를 입력할 폼을 가지는 JSP
	@GetMapping("/user/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	//POST방식으로 받기때문에 PostMapping어노테이션 설정후 데이터를 받고
	//redirect로 다른 페이지로 넘겨준다!
	@PostMapping("/user/join") 
	public String join(String username, String password, String email) {
		//요청을 재분배(redirect)
		System.out.println("username : " +username);
		System.out.println("password : " +password);
		System.out.println("email : "+email);
		return "redirect:/user/main"; //주소를 리턴
	}
	
	@GetMapping("/user/main")
	public String main() {
		
		return "/user/main";
	}
	
}
