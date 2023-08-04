package oopwithnlayeredapp.src.dataaccess;

import oopwithnlayeredapp.src.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        // *Sadece ve Sadece DB Erişim Kodları Buraya Yazılır... SQL
        System.out.println("Added to database with Hibernate");
    }
}
