package ch11_arrays;

// 쉬움
public class Array04 {
    public void printElement(String[] names){
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " / ");
        }
    }

    public static void main(String[] args) {
        String[] titles = {"김일", "김이", "김삼"};
        Array04 array04 = new Array04();
        array04.printElement(titles);
    }

}
