package ch17_static.singleton.Factory;


public class Factory {
    private String factoryName;

    // 생성자
    public Factory(String factoryName) {
        this.factoryName = factoryName;
        System.out.println(factoryName + "이 완공되었습니다.");
    }


    public SmartPhone produceSmartPhone(){
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");
        String model = "갤럭시S27";
        String serial;
        Samsung samsung = Samsung.getInstance();
        serial = samsung.createSerialNumber(model); //갤럭시S27을 대입함

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);

        return smartPhone;
    }
}
