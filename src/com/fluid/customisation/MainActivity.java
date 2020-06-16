package com.fluid.customisation;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Preference.OnPreferenceChangeListener {

    private static final int MENU_HELP  = 0;
    private SharedPreferences pref;
    private CompositeDisposable mCompositeDisposable;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Resources res = getResources();
        Window win = getActivity().getWindow();

        win.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        win.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        View view = inflater.inflate(R.layout.activity_main, container, false);

        final BottomNavigationView bottomNavigation = (BottomNavigationView) view.findViewById(R.id.nav_view);

    	bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

             if (item.getItemId() == bottomNavigation.getSelectedItemId()) {

               return false;

             } else {

				switch(item.getItemId()){
                	case R.id.navigation_status_bar:
                		switchFrag(new StatusBarFragment());
                		break;
                	case R.id.navigation_qs:
                		switchFrag(new QSFragment());
                		break;
                	case R.id.navigation_navigation:
                		switchFrag(new NavigationFragment());
                		break;
                	case R.id.navigation_gestures:
                		switchFrag(new GesturesFragment());
                		break;
                	case R.id.navigation_lockscreen:
                		switchFrag(new LockscreenFragment());
                		break;
                }		
            	return true;
            }
        }
        });
    }

    private void switchFrag(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
        
    ActionBar actionbar = getSupportActionBar();

        // Applies the custom action bar style
        getSupportActionBar().setDisplayOptions
                (actionbar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);    
  }
}
