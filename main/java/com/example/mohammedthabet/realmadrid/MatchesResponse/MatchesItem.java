package com.example.mohammedthabet.realmadrid.MatchesResponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//import javax.annotation.Generated;

//@Generated("com.robohorse.robopojogenerator")
public class MatchesItem{

	@SerializedName("matchday")
	private int matchday;

	@SerializedName("awayTeam")
	private AwayTeam awayTeam;

	@SerializedName("competition")
	private Competition competition;

	@SerializedName("utcDate")
	private String utcDate;

	@SerializedName("minute")
	private Object minute;

	@SerializedName("lastUpdated")
	private String lastUpdated;

	@SerializedName("score")
	private Score score;

	@SerializedName("stage")
	private String stage;

	@SerializedName("substitutions")
	private List<SubstitutionsItem> substitutions;

	@SerializedName("season")
	private Season season;

	@SerializedName("homeTeam")
	private HomeTeam homeTeam;

	@SerializedName("id")
	private int id;

	@SerializedName("bookings")
	private List<BookingsItem> bookings;

	@SerializedName("referees")
	private List<RefereesItem> referees;

	@SerializedName("attendance")
	private int attendance;

	@SerializedName("status")
	private String status;

	@SerializedName("group")
	private String group;

	@SerializedName("goals")
	private List<GoalsItem> goals;

	public void setMatchday(int matchday){
		this.matchday = matchday;
	}

	public int getMatchday(){
		return matchday;
	}

	public void setAwayTeam(AwayTeam awayTeam){
		this.awayTeam = awayTeam;
	}

	public AwayTeam getAwayTeam(){
		return awayTeam;
	}

	public void setCompetition(Competition competition){
		this.competition = competition;
	}

	public Competition getCompetition(){
		return competition;
	}

	public void setUtcDate(String utcDate){
		this.utcDate = utcDate;
	}

	public String getUtcDate(){
		return utcDate;
	}

	public void setMinute(Object minute){
		this.minute = minute;
	}

	public Object getMinute(){
		return minute;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setScore(Score score){
		this.score = score;
	}

	public Score getScore(){
		return score;
	}

	public void setStage(String stage){
		this.stage = stage;
	}

	public String getStage(){
		return stage;
	}

	public void setSubstitutions(List<SubstitutionsItem> substitutions){
		this.substitutions = substitutions;
	}

	public List<SubstitutionsItem> getSubstitutions(){
		return substitutions;
	}

	public void setSeason(Season season){
		this.season = season;
	}

	public Season getSeason(){
		return season;
	}

	public void setHomeTeam(HomeTeam homeTeam){
		this.homeTeam = homeTeam;
	}

	public HomeTeam getHomeTeam(){
		return homeTeam;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setBookings(List<BookingsItem> bookings){
		this.bookings = bookings;
	}

	public List<BookingsItem> getBookings(){
		return bookings;
	}

	public void setReferees(List<RefereesItem> referees){
		this.referees = referees;
	}

	public List<RefereesItem> getReferees(){
		return referees;
	}

	public void setAttendance(int attendance){
		this.attendance = attendance;
	}

	public int getAttendance(){
		return attendance;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setGroup(String group){
		this.group = group;
	}

	public String getGroup(){
		return group;
	}

	public void setGoals(List<GoalsItem> goals){
		this.goals = goals;
	}

	public List<GoalsItem> getGoals(){
		return goals;
	}

	@Override
 	public String toString(){
		return 
			"MatchesItem{" + 
			"matchday = '" + matchday + '\'' + 
			",awayTeam = '" + awayTeam + '\'' + 
			",competition = '" + competition + '\'' + 
			",utcDate = '" + utcDate + '\'' + 
			",minute = '" + minute + '\'' + 
			",lastUpdated = '" + lastUpdated + '\'' + 
			",score = '" + score + '\'' + 
			",stage = '" + stage + '\'' + 
			",substitutions = '" + substitutions + '\'' + 
			",season = '" + season + '\'' + 
			",homeTeam = '" + homeTeam + '\'' + 
			",id = '" + id + '\'' + 
			",bookings = '" + bookings + '\'' + 
			",referees = '" + referees + '\'' + 
			",attendance = '" + attendance + '\'' + 
			",status = '" + status + '\'' + 
			",group = '" + group + '\'' + 
			",goals = '" + goals + '\'' + 
			"}";
		}
}