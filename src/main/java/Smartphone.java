


public class Smartphone extends Product {
    private String producer;

    public Smartphone(int id, String name, int price, String producer) {
        super(id, name, price);
        this.producer = producer;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        if (producer.contains(search)) {
            return true;
        }

        return false;
        // или в одну строку:
        // return product.getName().contains(search);
    }

}
