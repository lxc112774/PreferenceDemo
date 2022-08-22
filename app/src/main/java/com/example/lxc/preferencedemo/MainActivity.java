package com.example.lxc.preferencedemo;

import com.example.lxc.preferencedemo.R;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.preference.RingtonePreference;
import android.util.Log;

import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;

public class MainActivity extends PreferenceActivity implements Preference.OnPreferenceChangeListener,Preference.OnPreferenceClickListener{

    CheckBoxPreference mCheck;
    RingtonePreference mRing;
    ListPreference aaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.lxcpreference);
        //根据key值找到控件
        mCheck=(CheckBoxPreference) findPreference("checkbox");
        mRing=(RingtonePreference) findPreference("ring");
        mCheck.setOnPreferenceClickListener(this);
        mCheck.setOnPreferenceChangeListener(this);
        mRing=(RingtonePreference) findPreference("ring");
        String name = "ssss";
         name.toString().equals("");

        aaa=(ListPreference) findPreference("list");
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen,
                                         Preference preference) {
        // TODO Auto-generated method stub
        if(preference.getKey().equals("checkbox")){
            Log.i("itchq", "checkbox");
        }
        return true;
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object o) {
        return false;
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        return false;
    }



}
