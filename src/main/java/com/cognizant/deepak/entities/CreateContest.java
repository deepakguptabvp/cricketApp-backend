package com.cognizant.deepak.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CreateContest")

public class CreateContest {
	
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int prizeMoney;
	private int entryFee;
	private int maxSize;
	private int minSize;
	private int rank1;
	private int rank2;
	private int rank3;
	
	public CreateContest() {
		super();
	}

	public int getId() {  
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(int prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	public int getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(int entryFee) {
		this.entryFee = entryFee;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int getMinSize() {
		return minSize;
	}

	public void setMinSize(int minSize) {
		this.minSize = minSize;
	}

	public int getRank1() {
		return rank1;
	}

	public void setRank1(int rank1) {
		this.rank1 = rank1;
	}

	public int getRank2() {
		return rank2;
	}

	public void setRank2(int rank2) {
		this.rank2 = rank2;
	}

	public int getRank3() {
		return rank3;
	}

	public void setRank3(int rank3) {
		this.rank3 = rank3;
	}

	@Override
	public String toString() {
		return "CreateContest [id=" + id + ", name=" + name + ", prizeMoney=" + prizeMoney + ", entryFee=" + entryFee
				+ ", maxSize=" + maxSize + ", minSize=" + minSize + ", rank1=" + rank1 + ", rank2=" + rank2 + ", rank3="
				+ rank3 + "]";
	}
	
}   
