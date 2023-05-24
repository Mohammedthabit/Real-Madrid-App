package com.example.mohammedthabet.realmadrid.MatchesResponse;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Coach{

	@SerializedName("nationality")
	private String nationality;

	@SerializedName("countryOfBirth")
	private String countryOfBirth;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public void setNationality(String nationality){
		this.nationality = nationality;
	}

	public String getNationality(){
		return nationality;
	}

	public void setCountryOfBirth(String countryOfBirth){
		this.countryOfBirth = countryOfBirth;
	}

	public String getCountryOfBirth(){
		return countryOfBirth;
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
			"Coach{" + 
			"nationality = '" + nationality + '\'' + 
			",countryOfBirth = '" + countryOfBirth + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}