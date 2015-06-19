package arquimago.listadecompras;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private ViewPager mPager;
    private SlidingTabLayout mTabs;
    private ScreenSlidePagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        mTabs = (SlidingTabLayout) findViewById(R.id.tabs);
        mTabs.setBackgroundColor(0xC0C0C0);
        mTabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            public int getIndicatorColor(int position) {
                return 0xffffffff;
            }
        });
        //A linha abaixo serve pra distribuir igualmente as abas
        //mTabs.setDistributeEvenly(true);
        mTabs.setViewPager(mPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        ///vamos simular uma paginação fixa, mas pode ser dinamica
        private String[] abas = new String[]{"Temperos", "Cozinha", "Café da Manhã", "Diversos", "Feira", "Limpeza", "Higiene", "Bebidas"};

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return abas[position];
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new Principal(0);
                case 1: return new Principal(1);
                case 2: return new Principal(2);
                case 3: return new Principal(3);
                case 4: return new Principal(4);
                case 5: return new Principal(5);
                case 6: return new Principal(6);
                case 7: return new Principal(7);
            }
            return null;
        }

        @Override
        public int getCount() {
            return abas.length;
        }
    }
}
