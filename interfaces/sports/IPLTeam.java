package com.xworkz.interfaces.sports;

public class IPLTeam extends CricketTeam implements Team {

	@Override
	public void formTeam() {

		System.out.println("Forming team");
	}

	@Override
	public void practice() {

		System.out.println("Team practicing");
	}

}
