package site.metacoding.demo.domain.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	
	public Integer insert(String username, String password, String email) {
		System.out.println("----------insert complete----------");
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		System.out.println("email : "+email);
		return -1;
	}
	public Integer update(Integer id, String password) {
		System.out.println("----------update complete----------");
		System.out.println("id : "+id);
		System.out.println("password : "+password);
		return 1;
	}
	public Integer deleteById(Integer id) {
		System.out.println("----------delete complete----------");
		return 1;
		
	}
	public Member findById(Integer id) {
		Member m1 = new Member(1,"ssar","1234","ssar@nate.com");
		Member m2 = new Member(2,"eli","5678","eli@nate.com");
		
		if(id==1) {
			return m1;
		}
		else if(id==2) {
			return m2;
		}
		else {
			System.out.println("no data");
		}
		return null;
	}
	public List<Member> findAll(){
		List<Member> memberList = new ArrayList<>();
		Member m1 = new Member(1,"ssar","1234","ssar@nate.com");
		Member m2 = new Member(2,"eli","5678","eli@nate.com");
		
		memberList.add(m1);
		memberList.add(m2);
		return memberList;
	}
}
