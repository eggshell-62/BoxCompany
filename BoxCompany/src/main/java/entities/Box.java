package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "boxes")
@Component
public class Box {
	@Id
	@GeneratedValue
	@Column(name = "box_id")
	private int boxId;
	
	@Column(name = "box_name")
	String name;

	List<BoxAttribute> boxAttributes; //will be another table linked by attribute id
	
	//default constructor
	Box(){
		name = "";
		boxAttributes = null;
	}
	
	Box(String name){
		this.name = name;
		boxAttributes = null;
	}
	
	Box(String name, List<BoxAttribute> attributes){
		this.name = name;
		boxAttributes = attributes;
	}
}
