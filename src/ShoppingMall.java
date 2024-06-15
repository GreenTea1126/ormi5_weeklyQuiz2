public abstract class ShoppingMall {
    private Product[] products;
    private int count;

    public ShoppingMall(int size) {
        products = new Product[size];
        count = 0;
    }

    public void addProduct(Product product) {
        if (count == products.length) {
            expandArray();
        }
        products[count++] = product;
    }

    public void addProduct(String name, int price, int stock) {
        if (count == products.length) {
            expandArray();
        }
        products[count++] = new Product(name, price, stock);
    }

    public void expandArray() {
        Product[] newProduct = new Product[products.length * 2];
        for (int i = 0; i < products.length; i++) {
            newProduct[i] = products[i];
        }
        products = newProduct;
    }

    public void removeProduct(Product product) {
        int index = findProduct(product);
        if (index != -1) {
            removeProduct(index);
        }
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count; i++) {
                products[i] = products[i + 1];
            }
            products[--count] = null;
        }
    }

    private int findProduct(Product product) {
        for (int i = 0; i < count; i++) {
            if (products[i].equals(product)) {
                return i;
            }
        }
        return -1;
    }

    public void displayProducts() {
        for (int i = 0; i < count; i++) {
            System.out.println("상품명: " + products[i].getName());
            System.out.println("가격: " + products[i].calculatePrice());
            System.out.println("재고: " + products[i].getStock());
            System.out.println();
        }
    }

    public abstract boolean checkOrderAvailability(Product product);
}