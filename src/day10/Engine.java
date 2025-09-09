package day10;

public class Engine {
double engineCapacity;
int torque;
String engineMfgName;
String engineType;

public Engine() {}
public Engine(double engineCapacity, int torque, String engineMfgName, String engineType) {
	this.engineCapacity = engineCapacity;
	this.torque = torque;
	this.engineMfgName = engineMfgName;
	this.engineType = engineType;
}
public double getEngineCapacity() {
	return engineCapacity;
}
public void setEngineCapacity(double engineCapacity) {
	this.engineCapacity = engineCapacity;
}
public int getTorque() {
	return torque;
}
public void setTorque(int torque) {
	this.torque = torque;
}
public String getEngineMfgName() {
	return engineMfgName;
}
public void setEngineMfgName(String engineMfgName) {
	this.engineMfgName = engineMfgName;
}
public String getEngineType() {
	return engineType;
}
public void setEngineType(String engineType) {
	this.engineType = engineType;
}

@Override
public String toString() {
	return "Engine [engineCapacity=" + engineCapacity + ", torque=" + torque + ", engineMfgName=" + engineMfgName
			+ ", engineType=" + engineType + "]";
}


}
