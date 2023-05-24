package com.example.mohammedthabet.realmadrid.MatchesResponse;


import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class AssistItem{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

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
			"AssistItem{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}