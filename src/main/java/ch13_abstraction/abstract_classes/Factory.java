package ch13_abstraction.abstract_classes;

public abstract class Factory {
    private String name;

    public abstract void produce(String model);
    public abstract void manage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름 : " + name);
    }
}
