package oopwithnlayeredapp.src;

import oopwithnlayeredapp.core.logging.DatabaseLogger;
import oopwithnlayeredapp.core.logging.FileLogger;
import oopwithnlayeredapp.core.logging.Logger;
import oopwithnlayeredapp.core.logging.MailLogger;
import oopwithnlayeredapp.src.business.ProductManager;
import oopwithnlayeredapp.src.dataaccess.HibernateProductDao;
import oopwithnlayeredapp.src.dataaccess.JDBCroductDao;
import oopwithnlayeredapp.src.dataaccess.ProductDao;
import oopwithnlayeredapp.src.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product productOne = new Product(1, "IPhone XR", 15000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JDBCroductDao(), loggers);
        productManager.add(productOne);
    }
}
