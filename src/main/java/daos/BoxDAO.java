package daos;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.Box;

@Repository
public class BoxDAO implements DAO{
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@PersistenceContext(unitName = "boxcompany")
	private EntityManager em;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional 
	public void persist(Box b){
		try{
			em.persist(b);
		}catch(Exception e){
			
		}
	}

	@Transactional
	public void update(Box b){
		em.merge(b);
	}
	
	@Transactional
	public void delete(Box b){
		em.remove(b);
	}
	
	@Transactional
	public Box getBox(int boxId){
		Box b = new Box();
		
		Query q = em.createNamedQuery("fetchOneBox");
		q.setParameter("box_id", boxId);
		
		try{
			b = (Box) q.getSingleResult();
		}catch(Exception e){
			
		}
		
		return b;
	}
	
	@Transactional
	public List<Box> getAllBoxes(){
		
		return null;
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
	
	public void setEM(EntityManager em){
		this.em = em;
	}
	
	@Transactional
	public void clear(){
		em.clear();
	}

}
