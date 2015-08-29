package edu.penn.pennshape.simulation;

public class UniformContagionSim extends NetworkSim {

	public static void main(String[] args) {

		UniformContagionSim ns = new UniformContagionSim();

		
		int threshold = 2;
		int numofcommunityseeds = 1;
		int numofmessageseeds = 1;
		int offset = 1;
		ns.simUniformContigions(threshold, numofcommunityseeds,
				numofmessageseeds, offset);
	}

}