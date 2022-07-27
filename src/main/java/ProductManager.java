public class ProductManager {
    private Product[] products = new Product[0];

    public void add(Product product) {
        int length = products.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(products, 0, tmp, 0, products.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = product;
        products = tmp;


    }

    public Product[] findAll() {
        return products;
    }


    public void removeById(int id) {
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
            }

        }
        products = tmp;

    }

    public Product[] searchBy(String search) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product : products) {
            if (product.matches(search)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;


            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search


}
