package com.example.mohammedthabet.realmadrid.MatchesResponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//import javax.annotation.Generated;

//@Generated("com.robohorse.robopojogenerator")
public class AwayTeam{

	@SerializedName("bench")
	private List<BenchItem> bench;

	@SerializedName("name")
	private String name;

	@SerializedName("lineup")
	private List<LineupItem> lineup;

	@SerializedName("id")
	private int id;

	@SerializedName("captain")
	private Captain captain;

	@SerializedName("coach")
	private Coach coach;

	public void setBench(List<BenchItem> bench){
		this.bench = bench;
	}

	public List<BenchItem> getBench(){
		return bench;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLineup(List<LineupItem> lineup){
		this.lineup = lineup;
	}

	public List<LineupItem> getLineup(){
		return lineup;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCaptain(Captain captain){
		this.captain = captain;
	}

	public Captain getCaptain(){
		return captain;
	}

	public void setCoach(Coach coach){
		this.coach = coach;
	}

	public Coach getCoach(){
		return coach;
	}

	@Override
 	public String toString(){
		return 
			"AwayTeam{" + 
			"bench = '" + bench + '\'' + 
			",name = '" + name + '\'' + 
			",lineup = '" + lineup + '\'' + 
			",id = '" + id + '\'' + 
			",captain = '" + captain + '\'' + 
			",coach = '" + coach + '\'' + 
			"}";
		}
}