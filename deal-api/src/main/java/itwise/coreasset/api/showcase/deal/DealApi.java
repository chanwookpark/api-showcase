package itwise.coreasset.api.showcase.deal;

import hadrian.canonical.ApiMessage;
import hadrian.meta.API;
import hadrian.meta.http.GET;

import java.util.List;

/**
 * Created by chanwook on 2014. 8. 10..
 */
@API(key = "Deal")
public interface DealApi {

    @GET(url = "/deals")
    List<ApiMessage> getDeals(Criteria criteria);
}
