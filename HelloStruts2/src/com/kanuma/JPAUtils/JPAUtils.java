package com.kanuma.JPAUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	private static EntityManagerFactory entityManagerFactory ;
	
	 static {
	 
		 entityManagerFactory = Persistence.createEntityManagerFactory("myJPAUnit");
	 }

	 
	 /**
	  * get the entityManager
	  * @return
	  */
	 public static EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	 
		public static void main(String[] args) throws Exception {

			createEntityManager();

			
		}
	 
}
