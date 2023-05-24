package com.example.mohammedthabet.realmadrid.MatchesResponse;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class BenchItem{

	@SerializedName("shirtNumber")
	private int shirtNumber;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("position")
	private String position;

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

	public void setPosition(String position){
		this.position = position;
	}

	public String getPosition(){
		return position;
	}

	@Override
 	public String toString(){
		return 
			"BenchItem{" + 
			"shirtNumber = '" + shirtNumber + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",position = '" + position + '\'' + 
			"}";
		}
}