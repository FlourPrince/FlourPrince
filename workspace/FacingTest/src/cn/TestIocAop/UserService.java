package cn.TestIocAop;
public class UserService {
	private UserDao userDao;
	
 /**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

public void add() {
	
	userDao.add();
	 System.out.println("UserService+++++++++++++++");
 }
}
