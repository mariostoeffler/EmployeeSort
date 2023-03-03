import java.util.ArrayList;
import java.util.Collections;

public class CartSortDemo {

    public static void main(String[] args) {
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("peter", 342, 3212, 3245));
        carts.add(new Cart("peter1", 3421, 32121, 3246));
        carts.add(new Cart("peter2", 3422, 321223, 3245));
        carts.add(new Cart("peter3", 3425, 123, 345));
        carts.add(new Cart("peter4", 3423, 3212, 3245));

        Collections.sort(carts);
        System.out.println(carts);

        Collections.sort(carts, new CartUsernameComparator());
        System.out.println(carts);

        Collections.sort(carts, new CartTotalItemsComparator());
        System.out.println(carts);
    }
}
