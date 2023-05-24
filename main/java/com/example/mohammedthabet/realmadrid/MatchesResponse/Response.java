package com.example.mohammedthabet.realmadrid.MatchesResponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//import javax.annotation.Generated;

//@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("count")
	private int count;

	@SerializedName("filters")
	private Filters filters;

	@SerializedName("matches")
	private List<MatchesItem> matches;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setFilters(Filters filters){
		this.filters = filters;
	}

	public Filters getFilters(){
		return filters;
	}

	public void setMatches(List<MatchesItem> matches){
		this.matches = matches;
	}

	public List<MatchesItem> getMatches(){
		return matches;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"count = '" + count + '\'' + 
			",filters = '" + filters + '\'' + 
			",matches = '" + matches + '\'' + 
			"}";
		}
}