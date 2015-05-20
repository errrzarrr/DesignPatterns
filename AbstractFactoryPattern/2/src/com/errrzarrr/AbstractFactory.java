package com.errrzarrr;

import com.errrzarrr.aeros.Aero;
import com.errrzarrr.aquatics.Aquatic;
import com.errrzarrr.terrains.Terrain;


public interface AbstractFactory {
	public Terrain getTerrain(String chosen);
	public Aquatic getAquatic(String chosen);
	public Aero getAero(String chosen);
}
