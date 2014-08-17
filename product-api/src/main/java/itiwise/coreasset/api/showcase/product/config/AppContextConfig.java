package itiwise.coreasset.api.showcase.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@ComponentScan(useDefaultFilters = true,
        basePackages = {"itwise.coreasset.api.showcase"},
        excludeFilters = {@ComponentScan.Filter(value = {Controller.class, Configuration.class, RestController.class})})
@EnableTransactionManagement
public class AppContextConfig {

}
