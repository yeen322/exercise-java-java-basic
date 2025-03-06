package class3;


public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder pro1 = new ProductOrder();
        pro1.productName = "두부";
        pro1.price = 2000;
        pro1.quantity =2;

        ProductOrder pro2 = new ProductOrder();
        pro2.productName = "김치";
        pro2.price = 5000;
        pro2.quantity =1;

        ProductOrder pro3 = new ProductOrder();
        pro3.productName = "콜라";
        pro3.price = 1500;
        pro3.quantity =2;


        int totalPrice=0;

        ProductOrder[] pros = new ProductOrder[]{pro1,pro2,pro3};
        for(ProductOrder p: pros) {
            System.out.println("상품명: " + p.productName+" 가격: " +p.price+ " 수량: "+p.quantity);
            totalPrice += p.price * p.quantity;
        }
        System.out.println("총 결제금액: " +totalPrice);

//        for(int i=0;i<pros.length;i++) {
//            ProductOrder p = pros[i];
//            System.out.println("상품명: " + p.productName+" 가격: " +p.price+ " 수량: "+p.quantity);
//        }
    }
}
