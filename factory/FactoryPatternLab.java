package factory;

import factory.truck.Truck;
import factory.truckfactory.ConcreteTruckFactory;
import factory.truckfactory.TruckFactory;

public class FactoryPatternLab {
	
	private static Truck heavyDuty;
	private static Truck projectHaul;
	private static Truck lightTruck;
	
	public static void main(String[] args) {
		TruckFactory factory = new ConcreteTruckFactory();
		heavyDuty = factory.createHeavyDutyTruck();
		projectHaul = factory.createProjectHaulTruck();
		lightTruck = factory.createLightDutyTruck();
		
		System.out.println(heavyDuty.toString());
		System.out.println(projectHaul.toString());
		System.out.println(lightTruck.toString());
	}

}
