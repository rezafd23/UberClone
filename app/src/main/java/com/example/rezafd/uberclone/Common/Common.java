package com.example.rezafd.uberclone.Common;

import android.location.Location;

import com.example.rezafd.uberclone.Remote.FCMClient;
import com.example.rezafd.uberclone.Remote.IFCMService;
import com.example.rezafd.uberclone.Remote.IGoogleAPI;
import com.example.rezafd.uberclone.Remote.RetrofitClient;

/**
 * Created by REZAFD on 28/12/2017.
 */

public class Common {

    public static Location mLastLocation=null;

    public static String  currentToken="";
    public static  final String driver_tbl="Drivers";
    public static  final String user_driver_tbl="DriversInformation";
    public static  final String user_rider_tbl="RidersInformation";
    public static  final String pickup_request_tbl="PickupRequest";
    public static final String token_tbl="Tokens";

    public static final String baseURL ="https://maps.googleapis.com";
    public static final String fcmURL ="https://fcm.googleapis.com";

    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
    public static IFCMService getFCMService(){
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }


}
