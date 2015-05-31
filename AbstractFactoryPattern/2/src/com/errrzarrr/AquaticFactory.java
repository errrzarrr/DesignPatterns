package com.errrzarrr;

import com.errrzarrr.aeros.Aero;
import com.errrzarrr.aquatics.*;
import com.errrzarrr.terrains.Terrain;


public class AquaticFactory implements AbstractFactory{
	public Aquatic getAquatic(String chosen) {
		switch(chosen.toUpperCase()) {
			case "BOAT": return new Boat();
			case "HOVERCRAFT": return new Hovercraft();
			case "YACHT": return new Yacht();
			default: return null;
		}
	}

	public Terrain getTerrain(String chosen) {return null;}
	public Aero getAero(String chosen) {return null;}

}

