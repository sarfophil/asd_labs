package factory.truckfactory;

import factory.truck.HeavyDutyTruck;
import factory.truck.LightDutyTruck;
import factory.truck.ProjectHaulTruck;
import factory.truck.Truck;

public class ConcreteTruckFactory implements TruckFactory{

	@Override
	public Truck createHeavyDutyTruck() {
		return new HeavyDutyTruck();
	}

	@Override
	public Truck createProjectHaulTruck() {
		return new ProjectHaulTruck();
	}

	@Override
	public Truck createLightDutyTruck() {
		return new LightDutyTruck();
	}

}
