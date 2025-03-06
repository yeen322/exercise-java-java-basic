package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    private int CalSum() {
        int totalSum =0; // 변수 설정 및 초기화

        for (int i=0; i< itemCount; i++) {
            Item item = items[i];
            totalSum += items[i].getPrice();
        }
        return totalSum;
    }

    public void addItem(Item item) {
        if(itemCount >= items.length ) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;

    }
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i=0; i < itemCount ; i++) {
            Item item = items[i];
            System.out.println("상품명: " + items[i].getName() + " 합계: " + items[i].getPrice());
        }
        System.out.println("전체 가격 합: " + CalSum());


    }

}
