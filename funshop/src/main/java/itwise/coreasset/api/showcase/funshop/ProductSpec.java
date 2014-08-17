package itwise.coreasset.api.showcase.funshop;

import hadrian.canonical.ApiMessage;
import hadrian.meta.API;
import hadrian.meta.http.GET;
import hadrian.meta.http.Path;

/**
 * Created by chanwook on 2014. 8. 7..
 */
@API(key = "product")
public interface ProductSpec {

    @GET(url = "/product/{prdcd}")
    ApiMessage getProduct(@Path("prdcd") String productCode);

}
