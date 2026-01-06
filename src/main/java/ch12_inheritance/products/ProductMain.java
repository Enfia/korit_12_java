package ch12_inheritance.products;


public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반", "일반");
        System.out.println("이 상품은 "+item1.getName()+" 상품입니다.");
        System.out.println("이 상품은 "+item1.getCategory()+" 카테고리입니다.");

        Product product1 = new Product("전자제품", "가전 제품", 100000, 10);
        product1.setName("백색 가전 제품");
        System.out.println("이 상품은 "+product1.getName()+" 상품입니다.");
    }
}
