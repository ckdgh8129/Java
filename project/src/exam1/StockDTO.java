package exam1;

public class StockDTO {

    private String productName;
    private int stock;
    private int limit = 10;   // 기준 수량

    public StockDTO(String productName, int stock) {
        this.productName = productName;
        this.stock = stock;
    }

    // 출고 + 알림을 한 번에 처리
    public void out(int outQty) {

        if (stock < outQty) {
            System.out.println("재고 부족으로 출고 불가");
            return;
        }

        stock -= outQty;
        System.out.println("출고 완료");
        System.out.println("현재 재고 : " + stock);

        if (stock <= limit) {
            System.out.println("※ 재고 부족 알림");
        }
    }

    public String getProductName() {
        return productName;
    }
}