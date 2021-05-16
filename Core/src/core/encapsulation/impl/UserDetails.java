package core.encapsulation.impl;

public class UserDetails {

	public static void main(String[] args) {
		User user = new User();
		user.setStatus(true);
		user.setUserId(102);
		user.setUserName("rakesh");
		
		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
		System.out.println(user.isStatus());
		User user1 = new User();
		user1.setStatus(false);
		user1.setUserId(100);
		user1.setUserName("ranjith");
		
		System.out.println(user1.getUserId());
		System.out.println(user1.getUserName());
		System.out.println(user1.isStatus());
	}

}
