package ch13_abstraction.interfaces;

// 쉬움
public class TvRemoteController{

    // 필드 변수에 인터페이스 타입 변수 = 구현 객체의 주소를 담는 변수임
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    // 인터페이스 타입 참조 변수를 생성자로 주입받음
    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
    }

    // main에서 실행됨
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
