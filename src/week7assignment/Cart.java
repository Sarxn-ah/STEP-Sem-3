package week7assignment;

public class Cart {
    private final double[] prices;
    private final int capacity;
    private int itemCount;
    private final String cartId;

    public Cart(String cartId, int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        this.cartId = cartId;
        this.capacity = capacity;
        this.prices = new double[capacity];
        this.itemCount = 0;
    }

    public String getCartId() {
        return cartId;
    }

    public void addItem(double price) {
        if (price < 0) {
            System.out.println("Rejected: price cannot be negative.");
            return;
        }
        if (itemCount >= capacity) {
            System.out.println("Rejected: cart is full.");
            return;
        }
        prices[itemCount] = price;
        itemCount++;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total = total + prices[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.println(cart.getTotal());
        System.out.println(cart.getItemCount());
    }
}
