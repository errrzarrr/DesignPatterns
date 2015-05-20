package com.errrzarrr;


import com.errrzarrr.aeros.Aero;
import com.errrzarrr.aquatics.Aquatic;
import com.errrzarrr.terrains.Terrain;

public class app {

	public static void main(String[] args) {
		AbstractFactory aeroBuilder = FactoryProducer.setFactory("Aero");
		AbstractFactory aquaCast = FactoryProducer.setFactory("AQUATIC");
		AbstractFactory terraComfort = FactoryProducer.setFactory("terrain");
			
		Aero helicopter = aeroBuilder.getAero("Helicopter");
		helicopter.fabricate();
		
		Aero airplane = aeroBuilder.getAero("Airplane");
		airplane.fabricate();
		
		Aquatic hover = aquaCast.getAquatic("hovercraft");
		hover.fabricate();
		
		Terrain SUV = terraComfort.getTerrain("SUV");
		SUV.fabricate();
		
		terraComfort
			.getTerrain("motorcycle")
			.fabricate();
	}
}
