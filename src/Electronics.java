public class Electronics extends Product{
    private String brand;
    //생성자
    public Electronics(String name, int price, int stock,String brand) {
        super(name, price, stock);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int calculatePrice() {
        int price = super.calculatePrice();
        if (brand.equals("Apple")) {
            price = (int) (price * 1.2); //20퍼 증가
        }
        return price;
    }
}
