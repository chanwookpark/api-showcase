package itiwise.coreasset.api.showcase.product.model;

import java.io.Serializable;

/**
 * Created by chanwook on 2014. 8. 5..
 */
public class Product implements Serializable {

    private String productCode;

    private boolean enrolled;

    public Product(String productCode, boolean enrolled) {
        this.productCode = productCode;
        this.enrolled = enrolled;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }
}
