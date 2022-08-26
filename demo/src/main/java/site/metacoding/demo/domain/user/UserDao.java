package site.metacoding.demo.domain.user;

public class UserDao {

	
	public User findById(Integer id) {
		return new User(1,"ssar","1234","ssar@nate.com"); //아직연동안하고 페이크
	}
}
