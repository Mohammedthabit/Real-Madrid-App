package com.example.mohammedthabet.realmadrid.MatchesResponse;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class FullTime{

	@SerializedName("awayTeam")
	private int awayTeam;

	@SerializedName("homeTeam")
	private int homeTeam;

	public void setAwayTeam(int awayTeam){
		this.awayTeam = awayTeam;
	}

	public int getAwayTeam(){
		return awayTeam;
	}

	public void setHomeTeam(int homeTeam){
		this.homeTeam = homeTeam;
	}

	public int getHomeTeam(){
		return homeTeam;
	}

	@Override
 	public String toString(){
		return 
			"FullTime{" + 
			"awayTeam = '" + awayTeam + '\'' + 
			",homeTeam = '" + homeTeam + '\'' + 
			"}";
		}
}