package radio;

public class Radio {
    int volume;
    double frequency;
    String modulation;

    public Radio(int volume, double frequency, String modulation) {
        this.volume = volume;
        this.frequency = frequency;
        this.modulation = modulation;
    }

    public void increaseVolume(int number) {
        volume += number;
        if (volume < 0) {
            volume = 0;
        }
    }

    public void decreaseVolume(int number) {
        increaseVolume(Math.negateExact(number));
    }

    public void increaseFrequency(int number) {
        frequency += number;
        if (frequency < 0) {
            frequency = 0;
        }
    }

    public void decreaseFrequency(int number) {
        increaseFrequency(Math.negateExact(number));
    }

    public void setAm() {
        modulation = "AM";
    }

    public void setFm() {
        modulation = "FM";
    }
}

