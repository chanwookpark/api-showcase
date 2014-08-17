package itiwise.coreasset.api.showcase.product;

import itiwise.coreasset.api.showcase.product.model.Product;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chanwook on 2014. 8. 5..
 */
@RestController
public class ProductApi {

//    @Version("1.0.0 to 1.5.2")
    @RequestMapping(value = "/product/{productCode}", method = RequestMethod.GET,
            headers = "Accept=application/vnd.funshop.v1+json")
    public Product getProduct(@PathVariable("productCode") String productCode) {
        return new Product(productCode, true);
    }

//    @Version("1.0.0 to 1.5.4")
    @RequestMapping(value = "/product/", method = RequestMethod.POST,
            headers = "Accept=application/vnd.funshop.v1+json")
    public Product saveProduct(@RequestBody Product product) {
        product.setEnrolled(true);
        return product;
    }
}
