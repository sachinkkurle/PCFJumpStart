package learn.avinash.springframework.services;

import learn.avinash.springframework.command.ProductForm;
import learn.avinash.springframework.domain.Product;

/**
 * Created by jt on 11/6/15.
 */
public interface ProductService extends CRUDService<Product> {
    Product saveOrUpdateProductForm(ProductForm productForm);

}
