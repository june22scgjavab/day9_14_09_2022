package com.infosys.instanceofdemo;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle=null;
		vehicle=new Car();
		vehicle.drive();
		vehicle=new Bus();
		vehicle.drive();
		// In line 9 we made vehicle to store the reference of Bus
		// In line 14 instead of typecasting to Bus we are typecasting to 
		// Car which is incorrect
		//Car car=(Car)vehicle;  // java.lang.ClassCastException: class com.infosys.instanceofdemo.Bus cannot be cast to class com.infosys.instanceofdemo.Car (com.infosys.instanceofdemo.Bus and com.infosys.instanceofdemo.Car are in unnamed module of loader 'app')
        if(vehicle instanceof Car) {
        	Car car=(Car)vehicle;
        	car.privateVehicle();
        }
        else if(vehicle instanceof Bus)
        {
        	Bus bus=(Bus)vehicle;
        	bus.publicTransport();
        	
        }
		
		

	}

}
