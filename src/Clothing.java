public class Clothing extends Product {
    private String size;

    // 생성자
    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int calculatePrice() {
        int price = super.calculatePrice();
        if (size.equals("L") || size.equals("XL") || size.equals("XXL")) {
            price = (int) (price * 1.1); //10퍼 증가
        }
        return price;
    }

}
