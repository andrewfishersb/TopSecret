package fisher.topsecret;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = findViewById(R.id.viewPager);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

//        vp.setCurrentItem(3,true);//set to the last element


    }

    private static class PagerAdapter extends FragmentPagerAdapter{

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return SlideShowFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return 3;//total number
        }
    }
}
