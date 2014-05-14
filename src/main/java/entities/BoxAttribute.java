package entities;


public class BoxAttribute {
	String attributeName;
	
	//default constructor
	BoxAttribute(){
		attributeName = "";
	}
	
	BoxAttribute(String name){
		this.attributeName = name;
	}
	
	//getters and setters
	String getName(){
		return this.attributeName;
	}
	
	void setName(String newName){
		this.attributeName = newName;
	}
}
