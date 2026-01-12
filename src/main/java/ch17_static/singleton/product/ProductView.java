package ch17_static.singleton.product;

public class ProductView {
    //싱클톤 패턴 만들 때 변수 이름이 instance임.
    private static ProductView instance;
    public static int count = 1;

    // 생성자인데 private으로 선언함
    private ProductView(){
        int cnt = 1;
        System.out.println(cnt + " 번 째 객체가 생성되었습니다.");
        cnt++;
        System.out.println("정적 변수를 참조하는 " + count+"번 째 객체가 생성되었습니다.");
        count++;
    }
    public static ProductView getInstance(){
        if(instance == null){
            instance = new ProductView();
        }
        return instance;
    }
}
