package suraj.snapchat.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import suraj.snapchat.R;
import suraj.snapchat.Adapter.StoriesAdapter;
import suraj.snapchat.DataList.StoriesList;

public class Stories  extends Fragment {
    View view;
    ListView storyListView;
    final ArrayList<StoriesList> storiesLists = new ArrayList<>();
    ImageView storyAdd;
    Fragment fragment = null;

    public static Fragment create() {
        return new Stories();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.stories, container, false);
        storyAdd = view.findViewById(R.id.storyAdd);

        storyListView = view.findViewById(R.id.storyListView);
        storiesLists.add(new StoriesList("Priyanka","08:45",R.drawable.avatarstory));
        storiesLists.add(new StoriesList("Swapnil","02:58",R.drawable.avatarstory2));
        storiesLists.add(new StoriesList("Anand","05:40",R.drawable.avatarstory3));
        storiesLists.add(new StoriesList("Nihal","04:10",R.drawable.avatarstory3));
        storiesLists.add(new StoriesList("Akhil","06:15",R.drawable.avatarstory3));
        storiesLists.add(new StoriesList("Nitin","07:11",R.drawable.avatarstory3));
        storiesLists.add(new StoriesList("Abhishek","11:02",R.drawable.avatarstory3));

        StoriesAdapter storiesAdapter = new StoriesAdapter(getActivity(), storiesLists);
        if (storyListView != null) {
            storyListView.setAdapter(storiesAdapter);
        }



        storyAdd.setOnClickListener(view -> fragment = new Camera());
        return view;


    }
}
