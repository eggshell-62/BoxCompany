package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "boxes")
@Component
public class Box {
	String name;
	List<BoxAttribute> boxAttributes;
	
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
