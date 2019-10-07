package radio;

public class RadioTest {
    public static void main(String[] args) {
        Radio radio = new Radio(10, 103.2, "FM");
        System.out.println("Volume: " + radio.volume + " Frequency: " + radio.frequency + " Modulation: " + radio.modulation) ;

        radio.increaseVolume(15);
        radio.decreaseFrequency(7);
        radio.setAm();
        System.out.println("Volume: " + radio.volume + " Frequency: " + radio.frequency + " Modulation: " + radio.modulation) ;
        radio.decreaseVolume(30);
        System.out.println("Volume: " + radio.volume + " Frequency: " + radio.frequency + " Modulation: " + radio.modulation) ;
    }
}
