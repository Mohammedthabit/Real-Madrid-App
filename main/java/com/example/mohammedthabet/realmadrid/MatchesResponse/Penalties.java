package com.example.mohammedthabet.realmadrid.MatchesResponse;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Penalties{

	@SerializedName("awayTeam")
	private Object awayTeam;

	@SerializedName("homeTeam")
	private Object homeTeam;

	public void setAwayTeam(Object awayTeam){
		this.awayTeam = awayTeam;
	}

	public Object getAwayTeam(){
		return awayTeam;
	}

	public void setHomeTeam(Object homeTeam){
		this.homeTeam = homeTeam;
	}

	public Object getHomeTeam(){
		return homeTeam;
	}

	@Override
 	public String toString(){
		return 
			"Penalties{" + 
			"awayTeam = '" + awayTeam + '\'' + 
			",homeTeam = '" + homeTeam + '\'' + 
			"}";
		}
}