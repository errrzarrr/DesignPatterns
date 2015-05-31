package com.errrzarrr;

public class FactoryProducer {
	
	public static AbstractFactory setFactory(String chosen) {
		switch(chosen.toUpperCase()) {
			case "AERO": return new AeroFactory();
			case "AQUATIC": return new AquaticFactory();
			case "TERRAIN": return new TerrainFactory();
			default: return null;
		}
	}
}
