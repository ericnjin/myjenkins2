package com.tgw.myfragments;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //start coding .....!!!!
        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        //FragmentTransaction fragmentManager = getFragmentManager().beginTransaction();

        //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        /**
         * Check the device orientation and act accordingly
         */
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            /**
             * Landscape mode of the device
             */
            //LM_Fragment ls_fragment = new LM_Fragment();
            LM_Fragment ls_fragment = new LM_Fragment();
            fragmentTransaction.replace(android.R.id.content, ls_fragment);
            //fragmentManager.replace(android.R.id.content, ls_fragment);
        }else{
            /**
             * Portrait mode of the device
             */
            PM_Fragment pm_fragment = new PM_Fragment();
            //fragmentManager.replace(android.R.id.content, pm_fragment);
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }
        fragmentTransaction.commit();
        //fragmentManager.commit();

    }
}
