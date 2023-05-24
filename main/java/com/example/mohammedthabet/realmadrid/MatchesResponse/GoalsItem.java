package com.example.mohammedthabet.realmadrid.MatchesResponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//import javax.annotation.Generated;

//@Generated("com.robohorse.robopojogenerator")
public class GoalsItem{

	@SerializedName("scorer")
	private Scorer scorer;

	@SerializedName("assist")
	private List<AssistItem> assist;

	@SerializedName("minute")
	private int minute;

	public void setScorer(Scorer scorer){
		this.scorer = scorer;
	}

	public Scorer getScorer(){
		return scorer;
	}

	public void setAssist(List<AssistItem> assist){
		this.assist = assist;
	}

	public List<AssistItem> getAssist(){
		return assist;
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
			"GoalsItem{" + 
			"scorer = '" + scorer + '\'' + 
			",assist = '" + assist + '\'' + 
			",minute = '" + minute + '\'' + 
			"}";
		}
}