package com.i2donate.Activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.gson.JsonObject;
import com.i2donate.Adapter.CategorylistAdapter;
import com.i2donate.CommonActivity.CommonMenuActivity;
import com.i2donate.Commonmethod.SearchableSpinner;
import com.i2donate.Model.ChangeActivity;
import com.i2donate.Model.CurrencyBean;
import com.i2donate.Model.Selected;
import com.i2donate.R;
import com.i2donate.RetrofitAPI.ApiClient;
import com.i2donate.RetrofitAPI.ApiInterface;
import com.i2donate.Session.IDonateSharedPreference;
import com.i2donate.Session.SessionManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BrowseActivity extends CommonMenuActivity {
    private String TAG = "BrowseActivity";
    Toolbar toolbar;
    TextView /*better_tv,*/ advance_search_tv;
    SessionManager session;
//    RelativeLayout name_relative_layout, united_state_location_relative, type_relative_layout, international_layout;
    ImageView name_relative_layout, united_state_location_relative, type_relative_layout, international_layout;
    IDonateSharedPreference iDonateSharedPreference;
    static ArrayList<String> listOfdate = new ArrayList<>();
    static ArrayList<String> arraychecked_item = new ArrayList<>();



    SearchableSpinner country_spinner;

    JSONArray jsonArray;
    ArrayList<String> country = new ArrayList<>();
    ArrayList<String> country_name_id = new ArrayList<String>();
    List<CurrencyBean> country_name_list = new ArrayList<CurrencyBean>();
    private final static String API_KEY = "";
    ApiInterface apiService;
    ArrayList<CurrencyBean> country1 = new ArrayList<CurrencyBean>();
    String country_symbol = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView(R.layout.activity_bowse, TAG);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setTitle("Browse");
        toolbar = findViewById(R.id.commonMenuActivityToolbar);

        setSelected(Selected.Browse);
        CountryAPI();

        init();
        listener();

    }

    private void CountryAPI() {
        country.clear();
        country_name_id.clear();
        country_name_list.clear();
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("email", API_KEY);
        apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<JsonObject> call = apiService.countryAPI(jsonObject1);
        Log.e(TAG, "CountryAPI: " + apiService);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                Log.e(TAG, "123" + response);
                try {
                    JSONObject jsonObject = new JSONObject(String.valueOf(response.body()));
                    Log.e(TAG, "" + jsonObject.toString());
                    String message = jsonObject.getString("message");
                    Log.e(TAG, "" + message.toString());
                    if (jsonObject.getString("status").equals("1")) {
                        String data = jsonObject.getString("data");
                        jsonArray = new JSONArray(data);
                        Log.e(TAG, "" + jsonArray.toString());
                        HashMap<String, String> map = new HashMap<>();

                        for (int i = 0; i < jsonArray.length(); i++) {

                            JSONObject countryobject = jsonArray.getJSONObject(i);
                            Log.e(TAG, "" + countryobject.toString());
                            CurrencyBean ctb = new CurrencyBean();
                            country.add(countryobject.getString("name"));
                            ctb.setCurrency_id(countryobject.getString("sortname"));
                            ctb.setCurrency_name(countryobject.getString("name"));
                            country_name_id.add(countryobject.getString("sortname"));
                            country_name_list.add(ctb);
                            country1.add(ctb);
                            if (countryobject.getString("name").equalsIgnoreCase("United States")) {

                                country_spinner.setDefaultText(countryobject.getString("name"));
                                country_symbol = countryobject.getString("sortname");
                            }
                        }
                        country_spinner.setData(country);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }


//    private void notification() {
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            NotificationManager mNotificationManager =
//                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//            int importance = NotificationManager.IMPORTANCE_HIGH;
//            NotificationChannel mChannel = new NotificationChannel(Constants.CHANNEL_ID, Constants.CHANNEL_NAME, importance);
//            mChannel.setDescription(Constants.CHANNEL_DESCRIPTION);
//            mChannel.enableLights(true);
//            mChannel.setLightColor(Color.RED);
//            mChannel.enableVibration(true);
//            mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
//            mNotificationManager.createNotificationChannel(mChannel);
//        }
//        MyNotificationManager.getInstance(this).displayNotification("Greetings", "Hello how are you?");
//    }

    @SuppressLint("MissingPermission")
    private void init() {

        iDonateSharedPreference = new IDonateSharedPreference();
        iDonateSharedPreference.setdailogueamt(getApplicationContext(), "");
        session = new SessionManager(getApplicationContext());
//        better_tv = (TextView) findViewById(R.id.better_tv);
        name_relative_layout = /*(RelativeLayout)*/ findViewById(R.id.name_relative_layout);
        advance_search_tv = (TextView) findViewById(R.id.advance_search_tv);
        international_layout = /*(RelativeLayout)*/ findViewById(R.id.international_layout);
        united_state_location_relative = /*(RelativeLayout)*/ findViewById(R.id.united_state_location_relative);
        type_relative_layout = /*(RelativeLayout)*/ findViewById(R.id.type_relative_layout);
//        better_tv.setTypeface(Typeface.createFromAsset(getAssets(), "commercial-script-bt.ttf"));
        listOfdate.clear();
        iDonateSharedPreference.settype(getApplicationContext(), "0");
        iDonateSharedPreference.setadvance(getApplicationContext(), "0");
        iDonateSharedPreference.setselectedtypedata(getApplicationContext(), listOfdate);
        iDonateSharedPreference.setselected_iem_list(getApplicationContext(), arraychecked_item);
        country_spinner = (SearchableSpinner) findViewById(R.id.spin_country);

    }

    public String getDeviceUniqueID(Activity activity) {
        String device_unique_id = Settings.Secure.getString(activity.getContentResolver(),
                Settings.Secure.ANDROID_ID);
        return device_unique_id;
    }

    private void listener() {
        united_state_location_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iDonateSharedPreference.setLocation(getApplicationContext(), "");
                iDonateSharedPreference.setSelectedtype(getApplicationContext(), "");
                ChangeActivity.changeActivityData(BrowseActivity.this, UnitedStateActivity.class, "0");
            }
        });
        name_relative_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iDonateSharedPreference.setLocation(getApplicationContext(), "");
                iDonateSharedPreference.setSelectedtype(getApplicationContext(), "");
                iDonateSharedPreference.setcountrycode(getApplicationContext(), "normalsearch");
                ChangeActivity.changeActivityData(BrowseActivity.this, NameSearchActivity.class, "0");
            }
        });
        advance_search_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (session.isLoggedIn()) {
                    iDonateSharedPreference.setAdvancepage(getApplicationContext(), "namesearch");
                    iDonateSharedPreference.setLocation(getApplicationContext(), "");
                    iDonateSharedPreference.setSelectedtype(getApplicationContext(), "advancesearch");
                    iDonateSharedPreference.setselected_iem_list(getApplicationContext(), arraychecked_item);
                    ChangeActivity.changeActivity(BrowseActivity.this, AdvanceCompletedActivity.class);
                } else {
                    LoginDialog();
                }
            }
        });
        type_relative_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iDonateSharedPreference.setLocation(getApplicationContext(), "");
                iDonateSharedPreference.setAdvancepage(getApplicationContext(), "typesearch");
                iDonateSharedPreference.setcountrycode(getApplicationContext(), "normalsearch");
                iDonateSharedPreference.setSelectedtype(getApplicationContext(), "typesearch");
                ChangeActivity.changeActivityData(BrowseActivity.this, NewtypesActivity.class, "0");
            }
        });
        international_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iDonateSharedPreference.setLocation(getApplicationContext(), "");
                iDonateSharedPreference.setSelectedtype(getApplicationContext(), "");
                ChangeActivity.changeActivityData(BrowseActivity.this, InternationalCharitiesActivity.class, "0");
            }
        });

        country_spinner.setSelectionListener(new SearchableSpinner.OnSelectionListener() {
            @Override
            public void onSelect(int spinnerId, int i, String value) {
                Log.e("Select2", "Position : " + i + " : Value : " + value + " : " + spinnerId);
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(country_spinner.getWindowToken(),
                        InputMethodManager.RESULT_UNCHANGED_SHOWN);
                for (int i1 = 0; i1 < jsonArray.length(); i1++) {
                    JSONObject countryobject = null;
                    try {
                        countryobject = jsonArray.getJSONObject(i1);
                        if (countryobject.getString("name").equals(value)) {
                            country_symbol = countryobject.getString("sortname");
                            Log.e(TAG, country_symbol);
                        }
                    } catch (JSONException e) {
                    }
                }
            }
        });

    }

    private void LoginDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(BrowseActivity.this);
        builder.setTitle("");
        builder.setMessage("For Advance Features Please Log-in/Register");
        builder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        ChangeActivity.changeActivity(BrowseActivity.this, LoginActivity.class);
                    }
                });
        builder.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setCancelable(false);
        builder.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        listOfdate.clear();
        iDonateSharedPreference.setselectedtypedata(getApplicationContext(), listOfdate);
        iDonateSharedPreference.setselectedcategorydata(getApplicationContext(), listOfdate);
        iDonateSharedPreference.setselectedsubcategorydata(getApplicationContext(), listOfdate);
        iDonateSharedPreference.setselectedchildcategorydata(getApplicationContext(), listOfdate);
        iDonateSharedPreference.setSearchName(getApplicationContext(), "");
        iDonateSharedPreference.setLocation(getApplicationContext(), "");
        iDonateSharedPreference.setRevenue(getApplicationContext(), "");
        iDonateSharedPreference.setDeductible(getApplicationContext(), "");
        CategorylistAdapter.categoty_item.clear();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        View view = getCurrentFocus();
        boolean ret = super.dispatchTouchEvent(event);

        if (view instanceof EditText) {
            View w = getCurrentFocus();
            int scrcoords[] = new int[2];
            w.getLocationOnScreen(scrcoords);
            float x = event.getRawX() + w.getLeft() - scrcoords[0];
            float y = event.getRawY() + w.getTop() - scrcoords[1];

            if (event.getAction() == MotionEvent.ACTION_UP
                    && (x < w.getLeft() || x >= w.getRight()
                    || y < w.getTop() || y > w.getBottom())) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getWindow().getCurrentFocus().getWindowToken(), 0);
            }
        }
        return ret;
    }
}
