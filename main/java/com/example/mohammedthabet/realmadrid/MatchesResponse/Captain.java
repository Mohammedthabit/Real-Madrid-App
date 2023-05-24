package com.example.mohammedthabet.realmadrid.MatchesResponse;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Captain{

	@SerializedName("shirtNumber")
	private int shirtNumber;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public void setShirtNumber(int shirtNumber){
		this.shirtNumber = shirtNumber;
	}

	public int getShirtNumber(){
		return shirtNumber;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Captain{" + 
			"shirtNumber = '" + shirtNumber + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}