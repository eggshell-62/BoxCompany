package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.stereotype.Component;


@NamedQueries({@NamedQuery(name = "fetchOneBox", 
				query = "SELECT b FROM boxes WHERE b.box_id = :box_id")})


@Entity
@Table(name = "boxes")
@Component
public class Box implements Serializable{
	@Id
	@GeneratedValue
	@Column(name = "box_id")
	private int boxId;
	
	@Column(name = "box_name")
	private String name;
	
	@Column(name = "box_price")
	private double price;
	
	private List<BoxAttribute> boxAttributes;
	
	//default constructor
	public Box(){
		name = "";
		price = 0;
		boxAttributes = null;
	}
	
	public Box(String name){
		this.name = name;
		price = 0;
		boxAttributes = null;
	}
	
	public Box(String name, double price){
		this.name = name;
		this.price = price;
		boxAttributes = null;
	}
	
	public Box(String name, List<BoxAttribute> attributes){
		this.name = name;
		boxAttributes = attributes;
	}
	
	public Box(String name, double price, List<BoxAttribute> attrs){
		this.name = name;
		this.price = price;
		this.boxAttributes = attrs;
	}
	
	public int getBoxId(){
		return this.boxId;
	}
	
	public String getBoxName(){
		return this.name;
	}
	
	public void setBoxName(String n){
		this.name = n;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public void setPrice(double d){
		this.price = d;
	}
	
	public List<BoxAttribute> getBoxAttributes(){
		return this.boxAttributes;
	}
	
	public void addAttribute(BoxAttribute bs){
		if(this.boxAttributes != null){
			this.boxAttributes.add(bs);
		}else{
			this.boxAttributes = new ArrayList<>();
			this.boxAttributes.add(bs);
		}
	}
	
	public void replaceAttributeList(List<BoxAttribute> newList){
		this.boxAttributes = newList;
	}
	
}


