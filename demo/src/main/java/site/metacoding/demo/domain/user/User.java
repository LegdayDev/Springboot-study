package site.metacoding.demo.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//디폴드생성자,풀생성자,getter,setter를 한꺼번에 해준다(runtime시에 실행)
//라이브러리와 플러그인 다 써야함
//플러그인은 툴에게 알아서 인식하라고 알려주는 역할
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
	private Integer id;
	private String username;
	private String password;
	private String email;
	
}
