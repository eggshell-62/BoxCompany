package daos;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoxDAO {
	@Autowired
	private EntityManager em;
	
	@Autowired
	private SessionFactory sessionFactory;

}
