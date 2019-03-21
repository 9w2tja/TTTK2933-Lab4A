public class SmartPhone extends MobileDevice {
	private AudioPlayer aPlayer;
	private VideoPlayer vPlayer;

    public SmartPhone(String ma, String mo, int bs, AudioPlayer ap, VideoPlayer vp) {
        super(ma, mo, bs);
        aPlayer = ap;
        vPlayer = vp;
    }

    public void currentAudioPlaying() {
    	System.out.println(aPlayer);
    }

    public void currentVideoPlaying() {
    	System.out.println(vPlayer);
    }
    
//    public void setCurrentAudio(String ac) {
////    	Method to set the current audio clip to the value
////    	specified by the user
//    }
//    
//    public void setCurrentVideo(String vc) {
////    	Method to set the current video clip to the value
////    	specified by the user
//    }

    public void printDetails() {
        System.out.println("Smart phone details");
        super.printDetails();
        System.out.println("Audio playing: "+aPlayer.getAudioClip());
        System.out.println("Video playing: "+vPlayer.getVideoClip());
    }
}