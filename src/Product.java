public class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(Electronics electronics) {
        this.name = electronics.getName();
        this.price = electronics.calculatePrice();
        this.stock = electronics.getStock();
    }

    public Product(Clothing clothing) {
        this.name = clothing.getName();
        this.price = clothing.calculatePrice();
        this.stock = clothing.getStock();
    }

    public Product(Food food) {
        this.name = food.getName();
        this.price = food.calculatePrice();
        this.stock = food.getStock();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calculatePrice() {
        return price;
    }

    ;


}
