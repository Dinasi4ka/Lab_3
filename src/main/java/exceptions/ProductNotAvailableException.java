package exceptions;
import task.Product;
public class ProductNotAvailableException extends Exception {
    public ProductNotAvailableException(final Product product) {
        super("task.Product " + product.getName() + " not available");
    }
}
