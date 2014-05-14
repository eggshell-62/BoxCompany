package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import entities.Box;

@Component
public class BoxDAO {
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void persist(Box b){
		
	}
	
	@Transactional
	public void update(Box b){
		
	}
	
	@Transactional
	public void delete(Box b){
		
	}
	
	@Transactional
	public Box getBox(){
		
		return null;
	}
	
	@Transactional
	public List<Box> getAllBoxes(){
		
		return null;
	}
}
