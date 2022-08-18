package com.barclays.patterns.adapt;

import com.barclays.patterns.adapt.venkat.PilotPen;

public class School {
	public static void main(String[] args) {
		
		///PilotPen pp = new PilotPen();
		
		Pen p = new PenAdapter();
		
		AssignmentWork aw = new AssignmentWork();
		
		aw.setP(p);
		
		aw.writeAssignment("I am bit tired to write AW");
		
	}
}
