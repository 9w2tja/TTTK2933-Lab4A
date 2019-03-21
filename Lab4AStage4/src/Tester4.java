import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MobileDevice> phoneList = new ArrayList<MobileDevice>();
		String[] newStation = {"Hot.fm",  "Mix.fm", "Ikim.fm", "Ikim.fm", "Mix.fm"};
		Double[] newFrequency = {97.6, 94.5, 91.5, 91.5, 94.5};
		String[] newAudioClip = {"Setia", "Menang", "Kumohon", "Lullabies"};
		String[] newVideoClip = {"Boboiboy", "Allegiant", "Divergent", "Starwars"};
		try {
			Scanner filein = new Scanner(new File("mobilephone2.dat"));
			String line;
			String manufacturer = null;
			String model = null;
			int batteryStatus = 0;
			String station = null;
			double frequency = 0.0;
			String audioClip = null;
			String videoClip = null;
			int lineNo = 0;													
			if (filein != null) { // not null if file exist
				while (filein.hasNextLine()) { //has more line to read
					lineNo++;
					line = filein.nextLine();
					Scanner st = new Scanner(line);
				    while (st.hasNext()) {
				    	manufacturer = st.next();
						model = st.next();
						batteryStatus = st.nextInt();
						if (lineNo > 5){
							audioClip = st.next();
							videoClip = st.next();
							SmartPhone sp = new SmartPhone(manufacturer, model, batteryStatus, new AudioPlayer(audioClip), new VideoPlayer(videoClip));
							phoneList.add(sp);
						 } else {
							station = st.next();
							frequency = st.nextDouble();
							BasicPhone bp = new BasicPhone(manufacturer, model, batteryStatus, new RadioTuner(station, frequency));
						    phoneList.add(bp);
						 }
					}
				    st.close();
			    }
			}
			
			int basic=0, smart=0;			
			for (MobileDevice p: phoneList){
				p.printDetails();
				if (p instanceof BasicPhone){
					basic++;
					System.out.println("New station : " + newStation[basic-1]);
					System.out.println("New frequency : " + newFrequency[basic-1]);
					((BasicPhone) p).setRadioSetting(newStation[basic-1], newFrequency[basic-1]);
				} else if (p instanceof SmartPhone){
					smart++;
					System.out.println("New audioclip : " + newAudioClip[smart-1]);
					System.out.println("New videoclip : " + newVideoClip[smart-1]);
					((SmartPhone) p).setCurrentAudio(newAudioClip[smart-1]);
					((SmartPhone) p).setCurrentVideo(newVideoClip[smart-1]);
				}
				p.printDetails();
				System.out.println();	
			}
			filein.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
