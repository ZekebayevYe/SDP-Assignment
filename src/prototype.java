class product implements Cloneable {
    private String name;
    private double price;

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public product clone() {
        try {
            return (product) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "product: " + name + ", price: " + price;
    }
}

public class prototype {
    public static void main(String[] args) {
        product original = new product("laptop", 1000);
        product clone = original.clone();
        clone.setPrice(1200);

        System.out.println(original);
        System.out.println(clone);
    }
}
