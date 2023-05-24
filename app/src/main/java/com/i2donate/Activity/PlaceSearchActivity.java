package com.i2donate.Activity;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.i2donate.Adapter.GooglePlacesAutocompleteAdapter;
import com.i2donate.Adapter.InternationalGooglePlacesAutocompleteAdapter;
import com.i2donate.Adapter.LoadMoreUnitesStateLocationAdapterList;
import com.i2donate.Adapter.LoadmoreInternationlocationAdapterList;
import com.i2donate.Model.ChangeActivity;
import com.i2donate.Model.Charitylist;
import com.i2donate.Model.CurrencyBean;
import com.i2donate.R;
import com.i2donate.RetrofitAPI.ApiClient;
import com.i2donate.RetrofitAPI.ApiInterface;
import com.i2donate.Session.IDonateSharedPreference;
import com.i2donate.Session.SessionManager;
import com.i2donate.utility.Constants;
import com.i2donate.utility.PlacesAPI;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PlaceSearchActivity extends AppCompatActivity {
    EditText autoCompleteEditView;
    RecyclerView placesRecyclerView;
    PlacesAPI mPlaceAPI;
    ImageView back;
    String data;
    IDonateSharedPreference iDonateSharedPreference;
    static String latlanvalue = "";
    private GooglePlacesAutocompleteAdapter mAutoCompleteAdapter;
    InternationalGooglePlacesAutocompleteAdapter internationalGooglePlacesAutocompleteAdapter;
    ArrayList<String> placeDataList = null;
    static Context context;
    String inputText;
    String charityName;
    static HashMap<String, String> userDetails;
    static SessionManager session;
    static ArrayList<String> listOfdate = new ArrayList<>();
    static ArrayList<String> listofsubCategory = new ArrayList<>();
    static ArrayList<String> listofchilCategory = new ArrayList<>();

    ArrayList<Charitylist> charitylist1 = new ArrayList<>();
    static LoadMoreUnitesStateLocationAdapterList unitesStateLocationDetailsAdapterList;
    LoadmoreInternationlocationAdapterList internationlocationAdapterList;
    static ApiInterface apiService;
    static int arrayListsize = 0;
    static JSONArray jsonArray1;
    static JSONArray jsonArray2;
    static JSONArray jsonArray;
    static String page = "1";
    static List<HashMap<String, String>> charitylist = new ArrayList<HashMap<String, String>>();
    ArrayList<CurrencyBean> userDataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_search);

        charityName = getIntent().getStringExtra("charityname");


        Log.e("TAG", "onCreate:dhruvi "+charityName );

        userDataArrayList = new ArrayList<>();
        try {
            JSONArray m_jArry = new JSONArray(loadJSONFromAsset());
            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jsonObject = m_jArry.getJSONObject(i);
                CurrencyBean userData = new CurrencyBean();
                userData.setCurrency_code(jsonObject.getString("sortname"));
                userData.setCurrency_name(jsonObject.getString("name"));
                userDataArrayList.add(userData);
            }


            Log.e("TAG", "FollowersFragment: " + userDataArrayList.size());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        context = PlaceSearchActivity.this;
        iDonateSharedPreference = new IDonateSharedPreference();
        session = new SessionManager(getApplicationContext());
        listOfdate = iDonateSharedPreference.getselectedtypedata(getApplicationContext());
        listofsubCategory = iDonateSharedPreference.getselectedsubcategorydata(getApplicationContext());
        listofchilCategory = iDonateSharedPreference.getselectedchildcategorydata(getApplicationContext());


        autoCompleteEditView = (EditText) findViewById(R.id.autocomplete_places);
        placesRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

//        mAutoCompleteAdapter = new GooglePlacesAutocompleteAdapter(this, R.layout.view_search_list);
//        internationalGooglePlacesAutocompleteAdapter = new InternationalGooglePlacesAutocompleteAdapter(this, R.layout.view_search_list);
        back = (ImageView) findViewById(R.id.back_icon_autoplace_img);

        data = getIntent().getStringExtra("data");
        Log.e("TAG", "onCreate: ----" + data);

//        charitylist1 = (ArrayList) getIntent().getSerializableExtra("mylist");
//        charityName = getIntent().getStringExtra("charityname");
        Log.e("TAG", "onCreate: " + charitylist1);

//        if (charityName.equals("International")) {
//            internationlocationAdapterList = new LoadmoreInternationlocationAdapterList((PlaceSearchActivity) context, charitylist1);
//
//        } else {
//            unitesStateLocationDetailsAdapterList = new LoadMoreUnitesStateLocationDetailsAdapterList((PlaceSearchActivity) context, charitylist1);
//        }

//        placesRecyclerView.setLayoutManager(new LinearLayoutManager(PlaceSearchActivity.this, LinearLayoutManager.VERTICAL, false));
//        placesRecyclerView.setAdapter(unitesStateLocationDetailsAdapterList);

        if (data.equalsIgnoreCase("2")) {

            autoCompleteEditView.setHint(R.string.united_state_internationlocation);
//            LinearLayoutManager placelinearLayoutManager = new LinearLayoutManager(PlaceSearchActivity.this, LinearLayoutManager.VERTICAL, false);
//            placesRecyclerView.setLayoutManager(placelinearLayoutManager);
//            placesRecyclerView.setAdapter(internationalGooglePlacesAutocompleteAdapter);
        } else if (data.equalsIgnoreCase("3")) {
            autoCompleteEditView.setHint(R.string.united_state_internationlocation);
//            LinearLayoutManager placelinearLayoutManager = new LinearLayoutManager(PlaceSearchActivity.this, LinearLayoutManager.VERTICAL, false);
//            placesRecyclerView.setLayoutManager(placelinearLayoutManager);
//            placesRecyclerView.setAdapter(internationalGooglePlacesAutocompleteAdapter);
        } else {
            autoCompleteEditView.setHint(R.string.united_state_location);
//            LinearLayoutManager placelinearLayoutManager = new LinearLayoutManager(PlaceSearchActivity.this, LinearLayoutManager.VERTICAL, false);
//            placesRecyclerView.setLayoutManager(placelinearLayoutManager);
//            placesRecyclerView.setAdapter(mAutoCompleteAdapter);
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

//        CharityAPI(page);

//        autoCompleteEditView.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                Log.e("TAG", "beforeTextChanged:----- " );
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (!s.toString().equals("")){
//                    if (data.equalsIgnoreCase("2")){
//                        if(s.length()>=3){
//                            internationalGooglePlacesAutocompleteAdapter.getFilter().filter(s.toString());
//                        }else if (s.length()==0){
//                            internationalGooglePlacesAutocompleteAdapter.getFilter().filter(s.toString());
//                        }
//
//                    }else if (data.equalsIgnoreCase("3")){
//                        if(s.length()>=3){
//                            internationalGooglePlacesAutocompleteAdapter.getFilter().filter(s.toString());
//                        }else if (s.length()==0){
//                            internationalGooglePlacesAutocompleteAdapter.getFilter().filter(s.toString());
//                        }
//
//                    }else {
//                        if(s.length()>=3){
//                            mAutoCompleteAdapter.getFilter().filter(s.toString());
//                        }else  if(s.length()==0){
//                            mAutoCompleteAdapter.getFilter().filter(s.toString());
//                        }
//
//                    }
//                }else {
//                    if (data.equalsIgnoreCase("2")) {
//
//                            internationalGooglePlacesAutocompleteAdapter.getFilter().filter(s.toString());
//
//                    } else if (data.equalsIgnoreCase("3")) {
//
//                        internationalGooglePlacesAutocompleteAdapter.getFilter().filter(s.toString());
//
//                    } else{
//                            mAutoCompleteAdapter.getFilter().filter(s.toString());
//
//                    }
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//                /*inputText = autoCompleteEditView.getText().toString().trim();
//                LinearLayoutManager placelinearLayoutManager = new LinearLayoutManager(PlaceSearchActivity.this,LinearLayoutManager.VERTICAL,false);
//                placesRecyclerView.setLayoutManager(placelinearLayoutManager);
//                placesRecyclerView.setAdapter(mAutoCompleteAdapter);*/
//
//                /*DownloadNewTask downloadTask = new DownloadNewTask();
//                //Start  downloading json data from Google Directions API
//                downloadTask.execute(inputText);*/
//            }
//        });
//
//        placesRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                try {
//                    final String item;
//                    if (data.equalsIgnoreCase("2")) {
//                      item = internationalGooglePlacesAutocompleteAdapter.getItem(position).trim();
//                    }else if (data.equalsIgnoreCase("3")) {
//                        item = internationalGooglePlacesAutocompleteAdapter.getItem(position).trim();
//                    }else {
//                        item = mAutoCompleteAdapter.getItem(position).trim();
//                    }
//
//                    iDonateSharedPreference.setLocation(getApplicationContext(), item);
//                    Log.e("PlaceSearchActivity : ", item);
//                    if(data.equalsIgnoreCase("1")){
//                        ChangeActivity.changeActivityData(PlaceSearchActivity.this, UnitedStateActivity.class,"1");
//                        finish();
//                    } if(data.equalsIgnoreCase("2")){
//                        ChangeActivity.changeActivityData(PlaceSearchActivity.this, InternationalCharitiesActivity.class,"1");
//                        finish();
//                    } else if(data.equalsIgnoreCase("3")){
//                        ChangeActivity.changeActivityData(PlaceSearchActivity.this, InternationalCharitiesActivity.class,"3");
//                        finish();
//                    } else {
//                        finish();
//                    }
//                }catch (Exception e){
//                    e.getMessage();
//                }
//            }
//        }));


        autoCompleteEditView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                CharityAPI(page);
            }

            @Override

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = autoCompleteEditView.getText().toString();
                Log.e("TAG", "onTextChanged: " + text);
//                filter(s.toString());
                page = "1";
                CharityAPI(page);
            }

            @Override
            public void afterTextChanged(Editable s) {

                filter(s.toString());
                if (s.toString().length() == 0) {
                    page = "1";
                    CharityAPI(page);
                }

            }
        });
    }

    public String loadJSONFromAsset() {
        String json;
        try {
            InputStream is = getAssets().open("country_list.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    class DownloadNewTask extends AsyncTask<String, String, ArrayList<String>> {
        @Override
        protected ArrayList<String> doInBackground(String... url) {

            // For storing data from web service
            ArrayList<String> data = null;

            try {
                // Fetching the data from web service
                mPlaceAPI = new PlacesAPI();
                data = mPlaceAPI.autocomplete(inputText);
            } catch (Exception e) {
                Log.d("Background Task", e.toString());
            }
            Log.e("GooglePlaceAPI", String.valueOf(data));
            return data;
        }

        // Executes in UI thread, after the execution of
        // doInBackground()
        @Override
        protected void onPostExecute(ArrayList<String> result) {
            super.onPostExecute(result);
            Log.e("Result", result.toString());

           /* mAdapter = new PlacesAutoCompleteAdapter1(PlaceSearchActivity.this, result);
            placesRecyclerView.setAdapter(mAdapter);*/

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (data.equalsIgnoreCase("1")) {
            ChangeActivity.changeActivityData(PlaceSearchActivity.this, UnitedStateActivity.class, "1");
            finish();
        }
        if (data.equalsIgnoreCase("2")) {
            ChangeActivity.changeActivityData(PlaceSearchActivity.this, InternationalCharitiesActivity.class, "1");
            finish();
        } else {
            finish();
        }
    }


    void filter(String text) {
        ArrayList<Charitylist> temp = new ArrayList();
        for (Charitylist d : charitylist1) {
            if (d.getCountry().toLowerCase(Locale.ROOT).contains(text)) {
                temp.add(d);
            }else if(d.getCity().toLowerCase(Locale.ROOT).contains(text)){
                temp.add(d);
            }

        }

        //update recyclerview
        internationlocationAdapterList = new LoadmoreInternationlocationAdapterList((PlaceSearchActivity) context, temp);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(PlaceSearchActivity.this, LinearLayoutManager.VERTICAL, false));
        placesRecyclerView.setAdapter(internationlocationAdapterList);

    }

    public static String getDeviceUniqueID(Context activity) {
        String device_unique_id = Settings.Secure.getString(activity.getContentResolver(),
                Settings.Secure.ANDROID_ID);
        return device_unique_id;
    }


    private void CharityAPI(final String page) {
        userDetails = session.getUserDetails();
        Log.e("userDetails", "" + userDetails);
        Log.e("KEY_UID", "" + userDetails.get(SessionManager.KEY_UID));
        String user_id = "";

        if (session.isLoggedIn()) {
            user_id = userDetails.get(SessionManager.KEY_UID);
        }
      /*  if (userDetails.get(SessionManager.KEY_UID).equalsIgnoreCase("null")){
            Log.e("KEY_UID", "user_idnull");
            user_id="";
        }*/
        String lat = "", lng = "";
        String location = iDonateSharedPreference.getLocation(context);
        Log.e("location321", "" + location);
        latlanvalue = location;
        if (location.equalsIgnoreCase(null) || location.equalsIgnoreCase("")) {
            location = "";
        }
        if (location.length() > 0) {
            LatLng loc = Constants.getFromLocation(context, location);
            lat = String.valueOf(loc.latitude);
            lng = String.valueOf(loc.longitude);
        }

        String searchName = "";
        String from_income = "";
        String to_income = "";
        String searchDeductible = "";

        JsonArray category_Array = new JsonArray();
        JsonArray subCategory_Array = new JsonArray();
        JsonArray childCategory_Array = new JsonArray();
        String countrycode = "";
        if (data.equalsIgnoreCase("3")) {
            countrycode = "";
            if (autoCompleteEditView.getText().length() > 0) {
                searchName = autoCompleteEditView.getText().toString().trim();
            } else {
                searchName = iDonateSharedPreference.getSearchName(context);
            }

            String searchRevenue = iDonateSharedPreference.getRevenue(context);
            searchDeductible = iDonateSharedPreference.getDeductible(context);
            if (searchRevenue.equalsIgnoreCase("")) {
//                Do Nothing
            } else if (searchRevenue.equalsIgnoreCase("90")) {
                from_income = "0";
                to_income = "90000";

            } else if (searchRevenue.equalsIgnoreCase("200")) {
                from_income = "90001";
                to_income = "200000";
            } else if (searchRevenue.equalsIgnoreCase("500")) {
                from_income = "200001";
                to_income = "500000";
            } else if (searchRevenue.equalsIgnoreCase("1000")) {
                from_income = "500001";
                to_income = "1000000";
            } else if (searchRevenue.equalsIgnoreCase("2000")) {
                from_income = "1000001";
                to_income = "";
            }

            for (int i = 0; i < listOfdate.size(); i++) {
                category_Array.add(listOfdate.get(i));

            }

            for (int j = 0; j < listofsubCategory.size(); j++) {
                subCategory_Array.add(listofsubCategory.get(j));
            }

            for (int k = 0; k < listofchilCategory.size(); k++) {
                childCategory_Array.add(listofchilCategory.get(k));
            }
        } else {
            countrycode = "INT";
            if (autoCompleteEditView.getText().length() > 0) {
                searchName = autoCompleteEditView.getText().toString().trim();
            } else {
                searchName = iDonateSharedPreference.getSearchName(context);
            }
            String searchRevenue = iDonateSharedPreference.getRevenue(context);
            searchDeductible = iDonateSharedPreference.getDeductible(context);
            if (searchRevenue.equalsIgnoreCase("")) {
//                Do Nothing
            } else if (searchRevenue.equalsIgnoreCase("90")) {
                from_income = "0";
                to_income = "90000";

            } else if (searchRevenue.equalsIgnoreCase("200")) {
                from_income = "90001";
                to_income = "200000";
            } else if (searchRevenue.equalsIgnoreCase("500")) {
                from_income = "200001";
                to_income = "500000";
            } else if (searchRevenue.equalsIgnoreCase("1000")) {
                from_income = "500001";
                to_income = "1000000";
            } else if (searchRevenue.equalsIgnoreCase("2000")) {
                from_income = "1000001";
                to_income = "";
            }

            for (int i = 0; i < listOfdate.size(); i++) {
                category_Array.add(listOfdate.get(i));

            }

            for (int j = 0; j < listofsubCategory.size(); j++) {
                subCategory_Array.add(listofsubCategory.get(j));
            }

            for (int k = 0; k < listofchilCategory.size(); k++) {
                childCategory_Array.add(listofchilCategory.get(k));
            }
        }
        String device_id = getDeviceUniqueID(context);
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("name", searchName);
        jsonObject1.addProperty("latitude", lat);
        jsonObject1.addProperty("page", page);
        jsonObject1.addProperty("longitude", lng);
        jsonObject1.addProperty("address", location);
        jsonObject1.addProperty("device_id", device_id);
        jsonObject1.add("category_code", category_Array);
        jsonObject1.addProperty("deductible", searchDeductible);
        jsonObject1.addProperty("income_from", from_income);
        jsonObject1.addProperty("income_to", to_income);
        jsonObject1.addProperty("country_code", countrycode);
        jsonObject1.add("sub_category_code", subCategory_Array);
        jsonObject1.add("child_category_code", childCategory_Array);
        jsonObject1.addProperty("user_id", user_id);
        Log.e("jsonObject1", "" + jsonObject1);
        apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<JsonObject> call = apiService.Charitylist(jsonObject1);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                shimmer_view_container.stopShimmerAnimation();
//                shimmer_view_container.setVisibility(View.GONE);
//                no_data_linear.setVisibility(View.GONE);
                if (page.equalsIgnoreCase("1")) {
                    charitylist.clear();
                    charitylist1.clear();
                    arrayListsize = 0;
                    jsonArray1 = new JSONArray();
                    jsonArray2 = new JSONArray();
                }

                if (response.isSuccessful()) {
                    try {
                        JSONObject jsonObject = new JSONObject(response.body().toString());
                        String message = jsonObject.getString("message");
                        if (jsonObject.getString("status").equalsIgnoreCase("1")) {
                            String data = jsonObject.getString("data");
                            jsonArray = new JSONArray(data);
                            Log.e("TAG", "status: " + jsonArray);
                            int maxvalue = 10;
                            if (jsonArray.length() > 10) {
                                maxvalue = 10;
                            } else {
                                maxvalue = jsonArray.length();
                            }
                            Log.e("jsonArraylength", "" + jsonArray.length());
                            arrayListsize = arrayListsize + jsonArray.length();
                            if (page.equalsIgnoreCase("1")) {
                                jsonArray1 = new JSONArray();
                            } else {
                                //jsonArray2=jsonArray;
                            }

                            jsonArray2 = concatArray(jsonArray2, jsonArray);
                            Log.e("jsonArray2length", "" + jsonArray2.length());
                            for (int i = 0; i < maxvalue; i++) {
                                HashMap<String, String> map = new HashMap<>();
                                Charitylist charitylistm = new Charitylist();
                                JSONObject object = jsonArray.getJSONObject(i);

                                map.put("id", object.getString("id"));
                                charitylistm.setId(object.getString("id"));
                                charitylistm.setName(object.getString("name"));
                                charitylistm.setStreet(object.getString("street"));
                                charitylistm.setCity(object.getString("city"));
                                charitylistm.setState(object.getString("state"));
                                charitylistm.setZip_code(object.getString("zip_code"));
                                charitylistm.setLogo(object.getString("logo"));
                                //charitylistm.setBanner(object.getString("banner"));
                                // charitylistm.setLatitude(object.getString("latitude"));
                                // charitylistm.setLongitude(object.getString("longitude"));
                                // charitylistm.setDistance(object.getString("distance"));
                                charitylistm.setLiked(object.getString("liked"));
                                charitylistm.setFollowed(object.getString("followed"));
                                charitylistm.setLike_count(object.getString("like_count"));
                                //charitylistm.setDescription(object.getString("description"));

                                for (int j = 0; j < userDataArrayList.size(); j++) {
                                    if (userDataArrayList.get(j).getCurrency_code().equals(object.getString("country"))) {
                                        charitylistm.setCountry(userDataArrayList.get(j).getCurrency_name());
                                    }
                                }

                                map.put("id", object.getString("id"));
                                map.put("name", object.getString("name"));
                                map.put("street", object.getString("street"));
                                map.put("city", object.getString("city"));
                                map.put("state", object.getString("state"));
                                map.put("zip_code", object.getString("zip_code"));
                                map.put("logo", object.getString("logo"));
                                //map.put("banner", object.getString("banner"));
                                //map.put("latitude", object.getString("latitude"));
                                ///map.put("longitude", object.getString("longitude"));
                                // map.put("distance", object.getString("distance"));
                                map.put("liked", object.getString("liked"));
                                map.put("followed", object.getString("followed"));
                                map.put("like_count", object.getString("like_count"));
                                //  map.put("description", object.getString("description"));
                                map.put("country", object.getString("country"));
                                charitylist.add(map);
                                charitylist1.add(charitylistm);

                            }
                      /*      if (page.equalsIgnoreCase("1")) {
                                if (latlanvalue.equalsIgnoreCase(null) || latlanvalue.equalsIgnoreCase("")) {
                                    Collections.sort(charitylist1, new Comparator<Charitylist>() {
                                        @Override
                                        public int compare(Charitylist s1, Charitylist s2) {
                                            return s1.getName().compareTo(s2.getName());
                                        }
                                    });

                                }
                            }*/

                            if (charitylist.size() != 0) {
                                placesRecyclerView.setVisibility(View.VISIBLE);
                                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
                                placesRecyclerView.setLayoutManager(layoutManager);
                                placesRecyclerView.setHasFixedSize(true);
                                placesRecyclerView.setNestedScrollingEnabled(true);
                                internationlocationAdapterList = new LoadmoreInternationlocationAdapterList((PlaceSearchActivity) context, charitylist1);
                                placesRecyclerView.setLayoutManager(new LinearLayoutManager(PlaceSearchActivity.this, LinearLayoutManager.VERTICAL, false));
                                internationlocationAdapterList.notifyDataSetChanged();
                                placesRecyclerView.setNestedScrollingEnabled(true);
                                placesRecyclerView.setItemAnimator(null);
                                internationlocationAdapterList = new LoadmoreInternationlocationAdapterList((PlaceSearchActivity) context, charitylist1);
                                placesRecyclerView.setAdapter(internationlocationAdapterList);

//                            placesRecyclerView.setItemAnimator(new DefaultItemAnimator());


                            } else {
                                placesRecyclerView.setVisibility(View.GONE);
//                                no_data_linear.setVisibility(View.VISIBLE);

                            }
                        } else {
                            if (page.equalsIgnoreCase("1")) {
                                placesRecyclerView.setVisibility(View.GONE);
//                                no_data_linear.setVisibility(View.VISIBLE);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else {
                    placesRecyclerView.setVisibility(View.GONE);
//                    no_data_linear.setVisibility(View.VISIBLE);
//                    united_state_recyclerview.setVisibility(View.GONE);
                }


            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                placesRecyclerView.setVisibility(View.GONE);
                // Log error here since request failed
//                shimmer_view_container.stopShimmerAnimation();
//                shimmer_view_container.setVisibility(View.GONE);
//                no_data_linear.setVisibility(View.VISIBLE);
//                united_state_recyclerview.setVisibility(View.GONE);
//                Log.e(TAG, t.toString());
//                // shimmer_view_container.stopShimmerAnimation(); internationlocationAdapterList.notifyDataSetChanged();
//                united_state_recyclerview.setNestedScrollingEnabled(true);
                // shimmer_view_container.setVisibility(View.GONE);
            }
        });
    }

    private static JSONArray concatArray(JSONArray arr1, JSONArray arr2)
            throws JSONException {
        JSONArray result = new JSONArray();
        for (int i = 0; i < arr1.length(); i++) {
            result.put(arr1.get(i));
        }
        for (int i = 0; i < arr2.length(); i++) {
            result.put(arr2.get(i));
        }
        return result;
    }
}
