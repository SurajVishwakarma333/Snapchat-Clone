package suraj.snapchat.Adapter;


import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import suraj.snapchat.Fragment.Camera;
import suraj.snapchat.Fragment.Chat;
import suraj.snapchat.Fragment.Settings;
import suraj.snapchat.Fragment.Stories;

public class MainPagerAdapter extends FragmentPagerAdapter {
    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return Chat.create();
            case 1:
                return Camera.create();
            case 2:
                return Stories.create();
            case 3:
                return Settings.create();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
