package ch08_classes;

// 쉬움
public class ConstructorMain {
    public static void main(String[] args) {
        Constructor const4 = new Constructor("김사");
        System.out.println(const4.name);
        Constructor const5 = new Constructor(5, "김오");
        System.out.println(const5.num + " " +const5.name);
        const5.displayInfo();
        const4.displayInfo();
    }
}
