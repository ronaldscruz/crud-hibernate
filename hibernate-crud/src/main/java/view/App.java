package view;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.Produto;
import model.Cliente;

public class App {

	public static void main(String[] args) {
		/*Produto p = new Produto();
		//p.setIdProduto(1);
		p.setNmProduto("Invictus Bear Grylls Hatchet");
		p.setQtdProduto(3);
		p.setVlProduto(200.00);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();*/
		
		Cliente c = new Cliente();
		//c.setIdCliente(1);
		c.setNmCliente("Delnaldo");
		c.setEmailCliente("del.naldo@email.com");
		c.setDsEndereco("Rua do Delnaldo");
		c.setCpfCliente("392.293.329-23");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		
	}

}
