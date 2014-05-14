package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = " box_attributes")
@Component
public class BoxAttribute implements Serializable{
	@Id
	@GeneratedValue
	@Column(name = "attribute_id")
	private int attrId;
	
	@Column
	String attrDesc;
	
	//default constructor
	BoxAttribute(){
		attrDesc = "";
	}
	
	BoxAttribute(String desc){
		this.attrDesc = desc;
	}
	
	//getters and setters
	String getName(){
		return this.attrDesc;
	}
	
	public void setDescription(String desc){
		this.attrDesc = desc;
	}
	
	public int getAttrId(){
		return this.attrId;
	}
	
	
}
