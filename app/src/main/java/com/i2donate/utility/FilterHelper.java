package com.i2donate.utility;

public class FilterHelper {
    public static FilterHelper instance;

    public String nameSearchKey = "";
    public String locationSearchKey = "";

    public static FilterHelper getInstance() {
        if(instance == null){
            instance = new FilterHelper();
        }
        return instance;
    }
}
