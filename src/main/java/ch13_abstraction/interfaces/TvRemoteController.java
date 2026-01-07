package ch13_abstraction.interfaces;

public class TvRemoteController{
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
    }

    public void onPressedPowerButton(){
        powerButton.onPressed();
    }
    public void onPressedChannelDown(){
        channelDownButton.onPressed();
    }
    public void onDownChannelDown(){
        channelDownButton.onDown();
    }

    public void onPressedChannelUp(){
        channelUpButton.onPressed();
    }
    public String onUpChannelUp(){
        return channelUpButton.onUp();
    }
    // -----------------------------------------
    public void onPressedVolumeDownButton(){
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }
    public String onUpVolumeUpButton(){
        return volumeUpButton.onUp();
    }
}
