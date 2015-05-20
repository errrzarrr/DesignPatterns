package com.errrzarrr;

import com.errrzarrr.aeros.Aero;
import com.errrzarrr.aquatics.Aquatic;
import com.errrzarrr.terrains.*;

public class TerrainFactory implements AbstractFactory {
	
	public Terrain getTerrain(String chosen) {
		switch(chosen.toUpperCase()) {
			case "CAR": return new Car();
			case "MOTORCYCLE": return new Motorcycle();
			case "SUV": return new SUV();
			case "TRUCK": return new Truck();
			default: return null;
		}
	}
	
	public Aquatic getAquatic(String chosen) {return null;}
	public Aero getAero(String chosen) {return null;}
}
