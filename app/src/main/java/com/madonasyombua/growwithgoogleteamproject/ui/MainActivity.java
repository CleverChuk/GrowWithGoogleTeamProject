<<<<<<< Updated upstream:app/src/main/java/com/madonasyombua/growwithgoogleteamproject/MainActivity.java
package com.madonasyombua.growwithgoogleteamproject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
=======
package com.madonasyombua.growwithgoogleteamproject.ui;
/**
 * Created by madona on 2/8/18.
 */
import android.os.Bundle;
>>>>>>> Stashed changes:app/src/main/java/com/madonasyombua/growwithgoogleteamproject/ui/MainActivity.java
import android.support.v7.app.AppCompatActivity;

import com.madonasyombua.growwithgoogleteamproject.Adapter.FragmentsAdapter;
import com.madonasyombua.growwithgoogleteamproject.R;
import com.madonasyombua.growwithgoogleteamproject.databinding.ActivityMainBinding;
<<<<<<< Updated upstream:app/src/main/java/com/madonasyombua/growwithgoogleteamproject/MainActivity.java
import com.madonasyombua.growwithgoogleteamproject.ui.fragment.LoginFragment;
=======
import com.madonasyombua.growwithgoogleteamproject.util.Session;
>>>>>>> Stashed changes:app/src/main/java/com/madonasyombua/growwithgoogleteamproject/ui/MainActivity.java

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private FragmentsAdapter fragmentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setViewPager(binding.container);
    }

    private void setViewPager(ViewPager viewPager){
        fragmentsAdapter = new FragmentsAdapter(getSupportFragmentManager());
        fragmentsAdapter.addFragment(new LoginFragment());
        viewPager.setAdapter(fragmentsAdapter);


    }
}