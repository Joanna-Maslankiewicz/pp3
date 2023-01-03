public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean isOn;
    private int channel;
    private int volume = 1;

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public TV() {
        isOn = false;
        channel = 1;
    }

    public void on() {
        setIsOn(true);
    }

    public void off() {
        setIsOn(false);
    }

    public void displayStatus() {
        if (isOn) {
            System.out.printf("TV is on, channel: %d, volume: %d\n", channel, volume);
        } else {
            System.out.println("TV is off");
        }
    }

    @Override
    public void channelUp() {
        if (isOn) {
            channel++;
            if (channel > 99) {
                System.out.println("there is no such channel!");
                channel = 99;
            }
        }
    }

    @Override
    public void channelDown() {
        if (isOn) {
            channel--;
            if (channel < 1) {
                System.out.println("there is no such channel!");
                channel = 1;
            }
        }
    }

    @Override
    public void setChannel(int channelNo) {
        if (isOn && channelNo >= 1 && channelNo <= 99) {
            channel = channelNo;
        } else {
            System.out.printf("there is no such channel as %d!\n", channelNo);
        }
    }

    @Override
    public void volumeDown() {
        if (volume > 1 && volume <= 10 && isOn) {
            volume--;
        }
    }

    @Override
    public void volumeUp() {
        if (volume >= 1 && volume < 10 && isOn) {
            volume++;
        }
    }

    public void setVolume(int volume) {
        if (volume >= 1 && volume <= 10) {
            this.volume = volume;
        }
    }
}
