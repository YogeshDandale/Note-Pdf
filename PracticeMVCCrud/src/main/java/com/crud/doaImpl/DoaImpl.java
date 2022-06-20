package com.crud.doaImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.doa.Dao;
import com.crud.model.Employee;
@Repository
public class DoaImpl implements Dao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public List<Employee> getalldata() {
		Session session=sf.openSession();
	Transaction tx = session.beginTransaction();
	Query query = session.createQuery("from Employee");
	List<Employee> result = (List<Employee>) query.list();
	tx.commit();
	session.close();
	return result;
		
	}

	@Override
	public int postdata(Employee e) {
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
		return 1;
	}

	@Override
	public Employee editdata(Employee e) {
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee es = session.get(Employee.class,e.getId());
		tx.commit();
		session.close();
		return es;
	}

	@Override
	public int update(Employee e) {
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("update Employee set name='"+e.getName()+"',addr='"+e.getAddr()+"',uname='"+e.getUname()+"',pass='"+e.getPass()+"',mobno='"+e.getMobno()+"' where id='"+e.getId()+"'");
		int i = query.executeUpdate();
		return 1;
	}

	@Override
	public int delete(int i) {
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("delete from Employee where id='" + i + "'");
		int id = query.executeUpdate();
		tx.commit();
		session.close();
		return id;
	}

}
