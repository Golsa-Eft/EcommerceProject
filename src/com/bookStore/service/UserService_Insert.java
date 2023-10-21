package com.bookStore.service;

import com.bookStore.entity.Users;
import common.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UserService_Insert {

	private static UserService_Insert userService_insert = new UserService_Insert();

	private UserService_Insert() {

	}

	public static UserService_Insert getInstance() {
		return userService_insert;
	}

	public void simpleInsert_01(String strPass, String strFullName) {
		EntityManager entityManager = JPA.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(
				new Users(strPass,strFullName));
		entityTransaction.commit();
		entityManager.close();
	}
	// Hibernate: create sequence SEQ start with 1 increment by 1
	// Hibernate:create table Person (ID NUMBER not null,Family VARCHAR2(20),Name VARCHAR2(20),primary key (ID))
	// Hibernate:select SEQ.nextval from dual
	// Hibernate:insert into Person (Family, Name, ID) values (?, ?, ?)

	/*public void insertByWhile_02(String strName, String strFamily) {
		EntityManager entityManager = JPA.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		for (int i = 1; i <= 10; i++) {
			entityManager.persist(new Person().setName(strName + ": " + i).setFamily(strFamily + ": " + i));
		}
		entityTransaction.commit();
		entityManager.close();
	}

	public void updateTestByPersistWrong_03(long lngID, String strName, String strFamily) {
		EntityManager entityManager = JPA.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(new Person().setID(lngID).setName(strName).setFamily(strFamily));
		entityTransaction.commit();
		entityManager.close();
	}*/
//	Exception in thread "main" javax.persistence.PersistenceException:
//	org.hibernate.PersistentObjectException:
//	detached entity passed to persist: model.entity.Person

}
