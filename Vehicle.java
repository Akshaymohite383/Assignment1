package com.yash.springiocAssignment6;

public class Vehicle {
	private String vehicleName;
	 private String vehicleType;
	 private String vehicleEngine; 
	 private float vehicleMileage;
	 private double vehiclePrice;
	 private Engine engine;
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleEngine() {
		return vehicleEngine;
	}
	public void setVehicleEngine(String vehicleEngine) {
		this.vehicleEngine = vehicleEngine;
	}
	public float getVehicleMileage() {
		return vehicleMileage;
	}
	public void setVehicleMileage(float vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}
	public double getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Vehicle(String vehicleName, String vehicleType, String vehicleEngine, float vehicleMileage,
			double vehiclePrice, Engine engine) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehicleEngine = vehicleEngine;
		this.vehicleMileage = vehicleMileage;
		this.vehiclePrice = vehiclePrice;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", vehicleType=" + vehicleType + ", vehicleEngine="
				+ vehicleEngine + ", vehicleMileage=" + vehicleMileage + ", vehiclePrice=" + vehiclePrice + ", engine="
				+ engine + "]";
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public void show() {
		 System.out.println("vehicle name: "+vehicleName);
			System.out.println("Vehicle type: "+vehicleType);
			System.out.println("vehicle Engine: "+vehicleEngine);
			System.out.println("Vehicle mileage: "+vehicleMileage);
			System.out.println("Vehicle price: "+vehiclePrice);
			System.out.println("Engine Type: "+engine.getEngineType());
			System.out.println("Engine Power: "+engine.getEnginePower());
			System.out.println("Engine Name: "+engine.getEngineName());
	 }
}