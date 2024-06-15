public class MyShoppingMall extends ShoppingMall {
    public MyShoppingMall(int size) {
        super(size);
    }

    @Override
    public boolean checkOrderAvailability(Product product) {
        // 주문 가능 여부를 확인하는 로직 구현
        return product.getStock() >= 10;
    }
}