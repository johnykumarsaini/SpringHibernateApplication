package in.jk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDao dao = (UserDao) applicationContext.getBean("hibernateTemplate");

		User user = new User();
		user.setUserId(100);
		user.setName("JK");
		user.setEmail("jk@gmail.com");
		
		dao.save(user);
		System.out.println("User Added ....");
		System.out.println();
        User userobj = dao.get(100);
		System.out.println("User From Daatabase ...."+userobj);

	}

}
