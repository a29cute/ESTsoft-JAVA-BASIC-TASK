package weekquiz02;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;

        // 제품의 무게와 가격의 총합 계산
        for (Product product : products) {
            totalWeight += product.weight;
            totalPrice += (product.price - product.getDiscountAmount());
        }

        // 무게에 따른 기본 배송비 결정
        int baseFee;
        if (totalWeight >= 10) {
            baseFee = 10000;
        } else if (totalWeight >= 3) {
            baseFee = 5000;
        } else {
            baseFee = 1000;
        }

        // 가격에 따른 배송비 조정
        int finalFee;
        if (totalPrice >= 100000) {
            finalFee = 0; // 100,000원 이상일 경우 무료
        } else if (totalPrice >= 30000) {
            finalFee = baseFee - 1000; // 30,000원 이상 100,000원 미만일 경우 1,000원 할인
        } else {
            finalFee = baseFee; // 30,000원 미만일 경우 기본 배송비
        }

        return finalFee;
    }
}