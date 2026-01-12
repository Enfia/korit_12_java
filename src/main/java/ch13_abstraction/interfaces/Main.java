package ch13_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {

        // 객체를 매개변수로 받았기 때문에 생성자 만들때 객체로 실행함
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton(),
                new VolumeDownButton(),
                new VolumeUpButton()
        );

        // 솔모뒤
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDown();
        tvRemoteController.onDownChannelDown();
        tvRemoteController.onPressedChannelUp();
        System.out.println(tvRemoteController.onUpChannelUp());
        System.out.println("--------------------------------------------------------");
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        System.out.println(tvRemoteController.onUpVolumeUpButton());;
        tvRemoteController.onPressedPowerButton();

        System.out.println("--------------------------------------------------------");
        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(),
                new ModeChangeButton(),
                new TemperatureDownButton(),
                new TemperatureUpButton()
        );
        airConditionerController.powerButton();
        airConditionerController.temperatureDownButtonPressed();
        airConditionerController.temperatureDownButton();
        airConditionerController.temperatureUpButtonPressed();
        System.out.println(airConditionerController.temperatureUpButton());
        airConditionerController.modeChangeButton();
        airConditionerController.modeChangeButton();
        airConditionerController.powerButton();
    }
}
