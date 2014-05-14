package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boxes")
public class Box implements Serializable{
	@Id
	@GeneratedValue
	private int boxId;
	
	private String name;
	private double price;
	
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


