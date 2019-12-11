package factory.truckfactory;

import factory.truck.Truck;

public interface TruckFactory {
	public Truck createHeavyDutyTruck();
	public Truck createProjectHaulTruck();
	public Truck createLightDutyTruck();
}
