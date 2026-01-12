package ch13_abstraction.interfaces;

// 쉬움
public class AirConditionerController {

    // 객체를 받음?
    private PowerButton powerButton;
    private ModeChangeButton modeChangeButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;

    // 객체들을 필수로 생성자로 받음
    public AirConditionerController(PowerButton powerButton, ModeChangeButton modeChangeButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.modeChangeButton = modeChangeButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    // 다 사용가능 Main에서 보면 됨
    public void powerButton(){
        powerButton.onPressed();
    }
    public void modeChangeButton(){
        modeChangeButton.onPressed();
    }
    public void temperatureDownButtonPressed(){
        temperatureDownButton.onPressed();
    }
    public void temperatureDownButton(){
        temperatureDownButton.onDown();
    }
    public void temperatureUpButtonPressed(){
        temperatureUpButton.onPressed();
    }
    public String temperatureUpButton(){
        return temperatureUpButton.onUp();
    }


}
