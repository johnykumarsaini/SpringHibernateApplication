package in.jk;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserDao {

	HibernateTemplate hibernateTemplate;

	public void save(User user) {

		hibernateTemplate.save(user);
	}

	public User get(int id) {

		return hibernateTemplate.get(User.class, id);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
