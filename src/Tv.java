import java.util.LinkedList;
public class Tv {

    private String model;
    private String color;
    private int channel = 0;
    private boolean isPower;
    private LinkedList<String> volume = new LinkedList<>();

    public int getChannel() {
        return channel;
    }

    public boolean isPower() {
        return isPower;
    }

    public LinkedList<String> getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public void setVolume(LinkedList<String> volume) {
        this.volume = volume;
    }

    public Tv(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
