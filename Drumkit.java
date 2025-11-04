public class Drumkit {

    boolean topHat = true;
    boolean snare = true;
    
    void playSnare() {
    System.out.println("bang bang ba-bang");
    }
    void playtophat() {
    System.out.println("ding da ding ding dong");
    }
}



class DrumKitTestDrive {
    public static void main(String [] args) {

        Drumkit d = new Drumkit();
        if (d.snare == true) {
d.playSnare();
}


    }
}


