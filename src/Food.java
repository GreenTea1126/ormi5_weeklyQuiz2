public class Food extends Product {
    private int expirationDate;

    //생성자
    public Food(String name, int price, int stock, int expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }
    public int getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public int calculatePrice() {
        int price = super.calculatePrice();
        if (expirationDate<=7) {
            price = (int) (price * 0.8); //20퍼 할인
        }
        return price;
    }
}
