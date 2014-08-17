package itwise.coreasset.api.showcase.funshop;

import hadrian.canonical.ApiMessage;
import org.modelmapper.ModelMapper;

/**
 * Created by chanwook on 2014. 8. 11..
 */
public class MainService {

    private static final String NAVIGATION_ID = "1234";
    private NavigationApi navigationApi;

    public MainTabContent getMainTabContent() {

        MainTabContent mainTab = new MainTabContent();

        //....

        ApiMessage message = navigationApi.getNavigation(NAVIGATION_ID);
        ModelMapper modelMapper = new ModelMapper();
        Navigation navigation = modelMapper.map(message, Navigation.class);
        mainTab.setNavigation(navigation);
        return mainTab;
    }
}

