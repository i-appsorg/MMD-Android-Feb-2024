package com.i2donate.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.i2donate.Adapter.LoadMoreUnitesStateLocationDetailsAdapterList;
import com.i2donate.CommonActivity.CommonBackActivity;
import com.i2donate.CommonActivity.CommonMenuActivity;
import com.i2donate.Model.Charitylist;
import com.i2donate.R;
import com.i2donate.RetrofitAPI.ApiClient;
import com.i2donate.RetrofitAPI.ApiInterface;
import com.i2donate.Session.IDonateSharedPreference;
import com.i2donate.Session.SessionManager;
import com.i2donate.utility.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchNewActivity extends CommonBackActivity {
    private static String TAG = "SearchNewActivity";
    private static IDonateSharedPreference iDonateSharedPreference;
    private TextView titleTextView;
    private RecyclerView RvSerachItem;
    private LinearLayoutManager layoutManager;
    private LoadMoreUnitesStateLocationDetailsAdapterList unitesStateLocationDetailsAdapterList;
    static ArrayList<Charitylist> charitylist1 = new ArrayList<>();
    static HashMap<String, String> userDetails;
    static SessionManager session;
    static String latlanvalue = "";
    static int flag = 0, backflag = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView(R.layout.activity_search_new,TAG);
        initIds();
    }

    private void initIds() {
        titleTextView=(android.widget.TextView) findViewById(R.id.titleTextView);
        RvSerachItem=(RecyclerView) findViewById(R.id.RvSerachItem);
        titleTextView.setText(getIntent().getStringExtra("SearchItem"));

        session = new SessionManager(getApplicationContext());
        layoutManager = new LinearLayoutManager(this);
        RvSerachItem.setLayoutManager(layoutManager);
        RvSerachItem.setHasFixedSize(true);
        RvSerachItem.setNestedScrollingEnabled(true);

        unitesStateLocationDetailsAdapterList = new LoadMoreUnitesStateLocationDetailsAdapterList((SearchNewActivity) this, charitylist1);
        RvSerachItem.setAdapter(unitesStateLocationDetailsAdapterList);
    }

//    private void CharityAPI(final int page, String type) {
//        userDetails = session.getUserDetails();
//        iDonateSharedPreference = new IDonateSharedPreference();
//        Log.e("userDetails", "" + userDetails);
//        Log.e("KEY_UID", "" + userDetails.get(SessionManager.KEY_UID));
//        String user_id = "";
////todo login
//        if (session.isLoggedIn()) {
//            user_id = userDetails.get(SessionManager.KEY_UID);
//        }
//
//        String lat = "";
//        String lng = "";
//        String location = iDonateSharedPreference.getLocation(SearchNewActivity.this.getApplicationContext());
//        latlanvalue = location;
//        if (location.equalsIgnoreCase(null) || location.equalsIgnoreCase("")) {
//            location = "";
//        }
//        if (location.length() > 0 && flag == 1) {
//            LatLng loc = Constants.getFromLocation(this, location);
//            lat = String.valueOf(loc.latitude);
//            lng = String.valueOf(loc.longitude);
//        }
//
//        String searchName = "";
//        String from_income = "";
//        String to_income = "";
//        String searchDeductible = "";
//        String searchCity = "";
//
//        JsonArray category_Array = new JsonArray();
//        JsonArray subCategory_Array = new JsonArray();
//        JsonArray childCategory_Array = new JsonArray();
//
//        if (search_name_et1.getText().toString().trim().length() > 0) {
//            searchName = search_name_et1.getText().toString();
//        } else {
//            searchName = iDonateSharedPreference.getSearchName(context);
//        }
//
//        if (search_us_et.getText().toString().trim().length() > 2) {
//            searchCity = search_us_et.getText().toString();
//        }
//
//        if (data.equalsIgnoreCase("1")) {
//
//            String searchRevenue = iDonateSharedPreference.getRevenue(context);
//            searchDeductible = iDonateSharedPreference.getDeductible(context);
//
//            if (searchRevenue.equalsIgnoreCase("90")) {
//                from_income = "0";
//                to_income = "90000";
//            } else if (searchRevenue.equalsIgnoreCase("200")) {
//                from_income = "90001";
//                to_income = "200000";
//            } else if (searchRevenue.equalsIgnoreCase("500")) {
//                from_income = "200001";
//                to_income = "500000";
//            } else if (searchRevenue.equalsIgnoreCase("1000")) {
//                from_income = "500001";
//                to_income = "1000000";
//            } else if (searchRevenue.equalsIgnoreCase("2000")) {
//                from_income = "1000001";
//                to_income = "";
//            }
//
//            for (int i = 0; i < listOfdate.size(); i++) {
//                category_Array.add(listOfdate.get(i));
//            }
//
//            for (int j = 0; j < listofsubCategory.size(); j++) {
//                subCategory_Array.add(listofsubCategory.get(j));
//            }
//
//            for (int k = 0; k < listofchilCategory.size(); k++) {
//                childCategory_Array.add(listofchilCategory.get(k));
//            }
//        }
//
//        String device_id = getDeviceUniqueID(context);
//        JsonObject jsonObject1 = new JsonObject();
//        if (name_loc == 1) {
//            jsonObject1.addProperty("name", searchName);
//            jsonObject1.addProperty("city", "");
//        } else {
//            jsonObject1.addProperty("name", "");
//            jsonObject1.addProperty("city", searchCity);
//        }
//        jsonObject1.addProperty("latitude", lat);
//        jsonObject1.addProperty("longitude", lng);
////        jsonObject1.addProperty("page", page + "");
//        jsonObject1.addProperty("device_id", device_id);
//        jsonObject1.addProperty("address", location);
//        jsonObject1.add("category_code", category_Array);
//        jsonObject1.addProperty("deductible", searchDeductible);
//        jsonObject1.addProperty("income_from", from_income);
//        jsonObject1.addProperty("income_to", to_income);
//        jsonObject1.addProperty("country_code", "US");
//        jsonObject1.add("sub_category_code", subCategory_Array);
//        jsonObject1.add("child_category_code", childCategory_Array);
//        jsonObject1.addProperty("user_id", user_id);
//
//        Log.e("jsonObject1", "" + jsonObject1);
//        apiService = ApiClient.getClient().create(ApiInterface.class);
//
//        Call<JsonObject> call = apiService.Charitylist(jsonObject1);
//        call.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                shimmer_view_container.stopShimmer();
//                shimmer_view_container.setVisibility(View.GONE);
//                no_data_linear.setVisibility(View.GONE);
//                if (String.valueOf(page).equalsIgnoreCase("1")) {
//                    charitylist1.clear();
//                    arrayListsize = 0;
//                    jsonArray1 = new JSONArray();
//                    jsonArray2 = new JSONArray();
//                }
//                if (response.isSuccessful()) {
//                    try {
//                        JSONObject jsonObject = new JSONObject(response.body().toString());
//                        String message = jsonObject.getString("message");
//                        if (jsonObject.getString("status").equalsIgnoreCase("1")) {
//                            String data = jsonObject.getString("data");
//                            jsonArray = new JSONArray(data);
//                            Log.e("jsonArray.lengthus", "" + jsonArray);
//
//                            int maxvalue = 10;
//                            if (jsonArray.length() >= 10) {
//                                maxvalue = 10;
//                            } else {
//                                maxvalue = jsonArray.length();
//                            }
//                            arrayListsize = arrayListsize + jsonArray.length();
//                            if (String.valueOf(page).equalsIgnoreCase("1")) {
//                                jsonArray1 = new JSONArray();
//                            }
//
//                            jsonArray2 = concatArray(jsonArray2, jsonArray);
//                            Log.e("jsonArray2length", "" + jsonArray2.length());
//                            for (int i = 0; i < maxvalue; i++) {
//
//                                HashMap<String, String> map = new HashMap<>();
//                                Charitylist charitylistm = new Charitylist();
//                                JSONObject object = jsonArray.getJSONObject(i);
//
//                                map.put("id", object.getString("id"));
//                                charitylistm.setId(object.getString("id"));
//                                charitylistm.setName(object.getString("name"));
//                                charitylistm.setStreet(object.getString("street"));
//                                charitylistm.setCity(object.getString("city"));
//                                charitylistm.setState(object.getString("state"));
//                                charitylistm.setZip_code(object.getString("zip_code"));
//                                charitylistm.setLogo(object.getString("logo"));
//                                charitylistm.setLiked(object.getString("liked"));
//                                charitylistm.setFollowed(object.getString("followed"));
//                                charitylistm.setLike_count(object.getString("like_count"));
//
//                                charitylistm.setCountry(object.getString("country"));
//                                map.put("id", object.getString("id"));
//                                map.put("name", object.getString("name"));
//                                map.put("street", object.getString("street"));
//                                map.put("city", object.getString("city"));
//                                map.put("state", object.getString("state"));
//                                map.put("zip_code", object.getString("zip_code"));
//                                map.put("logo", object.getString("logo"));
//                                map.put("liked", object.getString("liked"));
//                                map.put("followed", object.getString("followed"));
//                                map.put("like_count", object.getString("like_count"));
//                                map.put("country", object.getString("country"));
//                                charitylist1.add(charitylistm);
//                                Log.e("charity12", "charity");
//                            }
//
//                            if (charitylist1.size() != 0) {
//                                united_state_recyclerview.setVisibility(View.VISIBLE);
//                                layoutManager = new LinearLayoutManager(context);
//                                united_state_recyclerview.setLayoutManager(layoutManager);
//                                united_state_recyclerview.setHasFixedSize(true);
//                                united_state_recyclerview.setNestedScrollingEnabled(true);
//                                unitesStateLocationDetailsAdapterList.notifyDataSetChanged();
//
//                                unitesStateLocationDetailsAdapterList = new LoadMoreUnitesStateLocationDetailsAdapterList((UnitedStateActivity) context, charitylist1);
//                                united_state_recyclerview.setAdapter(unitesStateLocationDetailsAdapterList);
//                            } else {
//                                no_data_linear.setVisibility(View.VISIBLE);
//                                no_data_tv.setText(message);
//                                united_state_recyclerview.setVisibility(View.GONE);
//                            }
//                        } else {
//
//                            if (String.valueOf(page).equalsIgnoreCase("1")) {
//                                no_data_linear.setVisibility(View.VISIBLE);
//                                no_data_tv.setText(message);
//                                united_state_recyclerview.setVisibility(View.GONE);
//                            }
//                        }
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                } else {
//                    no_data_linear.setVisibility(View.VISIBLE);
//                    united_state_recyclerview.setVisibility(View.GONE);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                shimmer_view_container.stopShimmer();
//                shimmer_view_container.setVisibility(View.GONE);
//                no_data_linear.setVisibility(View.VISIBLE);
//                united_state_recyclerview.setVisibility(View.GONE);
//                Log.e(TAG, t.toString());
//            }
//        });
//    }
}