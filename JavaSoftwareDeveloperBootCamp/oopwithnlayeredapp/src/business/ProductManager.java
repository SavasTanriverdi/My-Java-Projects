package oopwithnlayeredapp.src.business;

import java.util.logging.Logger;
import oopwithnlayeredapp.src.dataaccess.ProductDao;
import oopwithnlayeredapp.src.entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private oopwithnlayeredapp.core.logging.Logger[] loggers;

    public ProductManager(ProductDao productDao, oopwithnlayeredapp.core.logging.Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception { // *Response request

        // *İş Kuralları - Hata Yönetimi
        if (product.getUnitPrice() < 10) {
            throw new Exception("Product price cannot be less than 10");
        }

        productDao.add(product);

        for (oopwithnlayeredapp.core.logging.Logger logger : loggers) { // *[db, mail]
            logger.log(product.getName());
        }

    }
}
