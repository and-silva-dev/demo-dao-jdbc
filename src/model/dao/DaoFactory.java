package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;
/**
 * Classe que tem operações estáticas para instanciar os Daos
 */
public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}
