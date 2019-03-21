public class BasicPhone extends MobileDevice {
	private RadioTuner radio;

    public BasicPhone(String ma, String mo, int bs, RadioTuner ra) {
    	super(ma, mo, bs);
        radio = ra;
    }

    public RadioTuner getRadio() {
        return radio;
    }
    
//    public void setRadioSetting(String st, double fr) {
////    	Method to change/tune the radio to the specified
////    	station and frequency
//    }

    public void printDetails() {
        System.out.println("Basic phone details");
        super.printDetails();
        System.out.println("Station: "+radio.getStation());
        System.out.println("Frequency: "+radio.getFrequency());
    }
}