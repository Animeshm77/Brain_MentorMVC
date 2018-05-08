package demo.niit.brainmentor_mvc.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import demo.niit.brainmentor_mvc.dao.LoginDao;
import demo.niit.brainmentor_mvc.entity.Admin;
import demo.niit.brainmentor_mvc.entity.Student;
import demo.niit.brainmentor_mvc.entity.User;
import demo.niit.brainmentor_mvc.utility.AppUtility;

public class LoginDaoImpl implements LoginDao {
	@Autowired
	SessionFactory sessionFactory;

	public Student getStudent(User user) {
		Session session = sessionFactory.openSession();
		Criteria criteria = null;
		Student student = null;
		try {
			criteria = session.createCriteria(Student.class);
			Criterion criterion1 = Restrictions.eq("userName", user.getUserName());
			Criterion criterion2 = Restrictions.eq("password", user.getPassword());
			Criterion criterion3 = Restrictions.eq("roleId", AppUtility.STUDENT_ROLEID);
			criteria.add(criterion1);
			criteria.add(criterion2);
			criteria.add(criterion3);
			criteria.setMaxResults(1);
			student = (Student) criteria.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return student;
	}

	public Admin getAdmin(User user) {
		Session session = sessionFactory.openSession();
		Criteria criteria = null;
		Admin admin = null;
		try {
			criteria = session.createCriteria(Student.class);
			Criterion criterion1 = Restrictions.eq("userName", user.getUserName());
			Criterion criterion2 = Restrictions.eq("password", user.getPassword());
			Criterion criterion3 = Restrictions.eq("roleId", AppUtility.ADMIN_ROLEID);
			criteria.add(criterion1);
			criteria.add(criterion2);
			criteria.add(criterion3);
			criteria.setMaxResults(1);
			admin = (Admin) criteria.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return admin;
	}
}