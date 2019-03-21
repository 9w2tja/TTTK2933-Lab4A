public class MobileDevice {
	private String manufacturer;
	private String model;
	private int batteryStatus;

    public MobileDevice(String ma, String mo, int bs) {
        manufacturer = ma;
        model = mo;
        batteryStatus = bs;
    }

    public void setManufacturer(String ma) {
        manufacturer = ma;
    }

    public void setModel(String mo) {
        model = mo;
    }

    public void setBatteryStatus(int bs) {
        batteryStatus = bs;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }

    public void printDetails() {
        System.out.println("Manufacturer: " + this.getManufacturer());
        System.out.println("Model: " + this.getModel());
        System.out.println("Battery Status: " + this.getBatteryStatus());
    }
    
//    public boolean needCharging() {
////    	Method to check the status of the device battery using
////    	method getBatteryStatus() returns true if the value is
////    	<=10 (use constant LOW_BATTERY, false if otherwise
////    	(Postcondition: true is returned if, false is returned if
////    	otherwise)
//    }
//    public void recharge() {
////    	Method to recharge the battery (and set the battery
////    	status to value 100 (use constant FULL_BATTERY)
////    	by using method setBatteryStatus()
//    }
}