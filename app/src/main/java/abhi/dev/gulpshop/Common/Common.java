package abhi.dev.gulpshop.Common;

import abhi.dev.gulpshop.Retrofit.IGulpShopAPI;
import abhi.dev.gulpshop.Retrofit.RetrofitClient;

/**
 * Created by abhi on 6/22/2018.
 */

public class Common {
    private static final String BASE_URL = "http://10.0.0.2:80/gulpshop/";

    public static IGulpShopAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IGulpShopAPI.class);
    }
}
