public class main {
    public static void main(String[] args) {
        System.out.println("오르미 쇼핑몰에 오신것을 환영합니다.");
        System.out.println("=== 제품별 가격표 ===");
        Electronics iPadAir = new Electronics("iPadAir", 10000, 7, "Apple");
        Electronics gram = new Electronics("LG 그램", 10000, 12, "LG");
        Clothing gucci = new Clothing("gucci", 10000, 7, "S");
        Clothing vans = new Clothing("반스", 12000, 12, "L");
        Food pasta = new Food("tomatopasta", 10000, 7, 10);
        Food kimchi = new Food("김치", 20000, 12, 5);
        Food pizza = new Food("피자", 20000, 12, 5);

        System.out.println("iPadAir 가격 :" + iPadAir.calculatePrice());
        System.out.println("lG 그램 가격 :" + gram.calculatePrice());
        System.out.println("구찌 가격 :" + gucci.calculatePrice());
        System.out.println("반스 가격 :" + vans.calculatePrice());
        System.out.println("토마토 파스타 가격 :" + pasta.calculatePrice());
        System.out.println("김치 가격 :" + kimchi.calculatePrice());
        System.out.println("피자 가격 :" + pizza.calculatePrice());

        // 상품 목록 추가
        MyShoppingMall mall = new MyShoppingMall(10);
        mall.addProduct(iPadAir);
        mall.addProduct(gram);
        mall.addProduct(gucci);
        mall.addProduct(vans);
        mall.addProduct(pasta);
        mall.addProduct(kimchi);
        mall.addProduct(pizza);

        //상품목록 제외
        mall.removeProduct(pizza);

        // 상품 목록 출력
        System.out.println("");
        System.out.println("=== 상품 목록 ===");
        mall.displayProducts();

        // 주문 가능 여부 확인
        Product product1 = new Product("iPadAir", iPadAir.calculatePrice(), iPadAir.getStock());
        Product product2 = new Product("LG 그램", gram.calculatePrice(), gram.getStock());
        Product product3 = new Product("gucci", gucci.calculatePrice(), gucci.getStock());
        Product product4 = new Product("반스", vans.calculatePrice(), vans.getStock());
        Product product5 = new Product("토마토 파스타", pasta.calculatePrice(), pasta.getStock());
        Product product6 = new Product("김치", kimchi.calculatePrice(), kimchi.getStock());


        System.out.println("=== 주문 가능 여부 ===");
        System.out.println("iPadAir 주문 가능 여부: " + mall.checkOrderAvailability(product1));
        System.out.println("LG 그램주문 가능 여부: " + mall.checkOrderAvailability(product2));
        System.out.println("gucci 주문 가능 여부: " + mall.checkOrderAvailability(product3));
        System.out.println("반스 주문 가능 여부: " + mall.checkOrderAvailability(product4));
        System.out.println("토마토 파스타 주문 가능 여부: " + mall.checkOrderAvailability(product5));
        System.out.println("김치 주문 가능 여부: " + mall.checkOrderAvailability(product6));

    }
}