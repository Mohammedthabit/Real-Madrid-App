package com.example.mohammedthabet.realmadrid.MatchesResponse;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class SubstitutionsItem{

	@SerializedName("playerIn")
	private PlayerIn playerIn;

	@SerializedName("playerOut")
	private PlayerOut playerOut;

	@SerializedName("team")
	private Team team;

	@SerializedName("minute")
	private int minute;

	public void setPlayerIn(PlayerIn playerIn){
		this.playerIn = playerIn;
	}

	public PlayerIn getPlayerIn(){
		return playerIn;
	}

	public void setPlayerOut(PlayerOut playerOut){
		this.playerOut = playerOut;
	}

	public PlayerOut getPlayerOut(){
		return playerOut;
	}

	public void setTeam(Team team){
		this.team = team;
	}

	public Team getTeam(){
		return team;
	}

	public void setMinute(int minute){
		this.minute = minute;
	}

	public int getMinute(){
		return minute;
	}

	@Override
 	public String toString(){
		return 
			"SubstitutionsItem{" + 
			"playerIn = '" + playerIn + '\'' + 
			",playerOut = '" + playerOut + '\'' + 
			",team = '" + team + '\'' + 
			",minute = '" + minute + '\'' + 
			"}";
		}
}