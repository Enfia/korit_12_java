package ch13_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        powerButton.onPressed();
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton(),
                new VolumeDownButton(),
                new VolumeUpButton()
        );
        /*
            리모컨 객체의 argument로 PowerButton 생성자를 집어넣었습니다.
            생성자의 정의는 객체를 생성할 때 호출되는 특별한 메서드 이므로,
            new PowerButton(), 을 틍해서 객체가 생성됨
            -> 하지만 객체명이 없는 상태라고 볼 수 있음

            근데 이상까지 이해했다는 전제하에 TvRemoteController 클래스를 확인해보시면 this.powerButton = powerButton이라고 되어있습니다
            그 말은 argument로 들어온 new PowerButton()이 매개변수인 PowerButton powerButton으로 치환되고, 극것이 TvRemoteController의 field인 powerButton에
            대입되다는 것을 확인할 수 있습니다.
         */
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDown();
        tvRemoteController.onDownChannelDown();
        tvRemoteController.onPressedChannelUp();
        System.out.println(tvRemoteController.onUpChannelUp());
        System.out.println("--------------------------------------------------------");
        /*
        --------------------------------------------------------
            VolumeDownButton 클래스를 정의하시오.
            VolumeUpBotton 클래스를 정의하시오.
            그리고 Main에서
            tvRemoteController.onPressedVolumeDown(); 을 호출하면
            볼륨을 한 칸 내립니다. 가 출력될 수 있도록 작성하시오.

            실행 예)
                Tv 리모컨 객체가 생성되었습니다.
                전원을 켭니다.
                채널을 한 칸 내립니다.
                채널을 계속 내립니다.
                채널을 한 칸 올립니다.
                채널을 계속 올립니다.
                --------------------------------------------------------
                볼륨을 한 칸 내립니다.
                볼륨을 계속 내립니다.
                볼륨을 한 칸 올립니다.
                볼륨을 계속 올립니다.
                전원을 끕니다.
         */
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        System.out.println(tvRemoteController.onUpVolumeUpButton());;
        tvRemoteController.onPressedPowerButton();

    }
}
