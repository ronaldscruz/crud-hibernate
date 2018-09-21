package controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Produto;
import model.Cliente;

public class HibernateUtil {
	private static final SessionFactory factory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		
		Configuration configuration = new Configuration();
		
		// pacote onde ficam as classes que representam as entidades.
		configuration.addAnnotatedClass(Produto.class);
		configuration.addAnnotatedClass(Cliente.class);
		
		configuration.configure();
		
		return configuration.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory(){
		return factory;
	}
}
