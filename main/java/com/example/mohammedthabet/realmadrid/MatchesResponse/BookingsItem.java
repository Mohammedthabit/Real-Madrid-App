package com.example.mohammedthabet.realmadrid.MatchesResponse;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class BookingsItem{

	@SerializedName("team")
	private Team team;

	@SerializedName("card")
	private String card;

	@SerializedName("minute")
	private int minute;

	@SerializedName("player")
	private Player player;

	public void setTeam(Team team){
		this.team = team;
	}

	public Team getTeam(){
		return team;
	}

	public void setCard(String card){
		this.card = card;
	}

	public String getCard(){
		return card;
	}

	public void setMinute(int minute){
		this.minute = minute;
	}

	public int getMinute(){
		return minute;
	}

	public void setPlayer(Player player){
		this.player = player;
	}

	public Player getPlayer(){
		return player;
	}

	@Override
 	public String toString(){
		return 
			"BookingsItem{" + 
			"team = '" + team + '\'' + 
			",card = '" + card + '\'' + 
			",minute = '" + minute + '\'' + 
			",player = '" + player + '\'' + 
			"}";
		}
}