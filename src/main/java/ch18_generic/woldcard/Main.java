package ch18_generic.woldcard;

public class Main {
    // 함수 정의 영역
    /*
        현재 AnimalData에서는 필드 변수로 들어온 객체가 Animal 클래스의 서브 클래스인지 아닌지를 구분할 수 없기 때문에
        이를 판단하는 함수를 main에서 정의함
     */
    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag == 1){
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }

    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
        /*
            이상의 상황에서는 AnimalData에 Car 객체가 animal 필드 변수에 들어가있지만 문제가 되지 않음
            그러면 animal 필드 변수에 Tiger Human Car 객체가 들어가있다는 점은 여기 main에서 확인이 안됨
            코드 다른 곳 봐야함
         */
//        animalData1.showData();
//        animalData2.showData();
//        animalData3.showData(); // 오류 발생
        /*
            AnimalData3.showData();에서 오류 발생함을 확인할 수 있음
            AnimalData 클래스를 확인해야 하는데, 저희가 (Aniaml)이라고 형변환을 시키는 부분 때문임
            Car를 Animal로 형변환시킬 수 있는 근거가 없는 상태
        */

        // .getAnimal() 함수 메서드 호출
        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(100);
        animalData4.showData();
        animalData5.showData();
        System.out.println(animalData6);
        System.out.println("필드 변수에 null값 대입");
        AnimalData animalData100 = new AnimalData(null);
        if (animalData100 == null){
            System.out.println("내부에 값이 없습니다.");
        } else{
            System.out.println("객체는 생성됐는데 필드에 값이 없습니다.");
        }

        System.out.println(animalData100.getAnimal());
        animalData100.setAnimal(new Car());
        System.out.println(animalData100.getAnimal());
    }
}
