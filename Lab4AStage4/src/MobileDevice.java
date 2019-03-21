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
    
    public boolean needCharging() {
		final int LOW_BATTERY = 10;
		if(this.getBatteryStatus() <= LOW_BATTERY) {
			return true;
		} else {
			return false;
		}
    }
    public void recharge() {
		final int FULL_BATTERY = 100;
        this.setBatteryStatus(FULL_BATTERY);
    }
}