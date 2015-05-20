package com.errrzarrr;

import com.errrzarrr.aeros.*;
import com.errrzarrr.aquatics.Aquatic;
import com.errrzarrr.terrains.Terrain;

public class AeroFactory implements AbstractFactory {

	public Aero getAero(String chosen) {
		switch(chosen.toUpperCase()) {
			case "AIRPLANE": return new Airplane();
			case "HELICOPTER": return new Helicopter();
			case "ZEPPELIN": return new Zeppelin();
			default: return null;
		}
	}

	public Terrain getTerrain(String chosen) {return null;}
	public Aquatic getAquatic(String chosen) {return null;}
}
