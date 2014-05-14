package daos;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.BoxAttribute;

@Repository
public class BoxAttributeDAO implements DAO{
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private EntityManager em;	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional 
	public void persist(BoxAttribute ba){
		
	}
	
	/**
	 * returns jdbc template
	 */
	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * sets jdbc template
	 */
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
