package ch17_static.singleton.product;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        System.out.println(ProductView.count);
        System.out.println(ProductView.getInstance().toString());
    }
}
