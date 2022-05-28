package suraj.snapchat.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import suraj.snapchat.R;
import suraj.snapchat.Adapter.ChatAdapter;
import suraj.snapchat.DataList.ChatList;

public class Chat extends Fragment {
    View view;
    ListView chatList;
    final ArrayList<ChatList> chatListArrayList = new ArrayList<>();

    public static Fragment create() {
        return new Chat();    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.chatlist, container, false);

        chatList = view.findViewById(R.id.chatList);
        chatListArrayList.add(new ChatList("Priyanka","Tap to chat!",R.drawable.avatar8));
        chatListArrayList.add(new ChatList("Swapnil","Tap to chat!",R.drawable.avatar9));
        chatListArrayList.add(new ChatList("Snehal","Tap to chat!",R.drawable.avatar));
        chatListArrayList.add(new ChatList("Riya","Tap to chat!",R.drawable.avatar3));
        chatListArrayList.add(new ChatList("Shailesh","Tap to chat!",R.drawable.avatar6));
        chatListArrayList.add(new ChatList("Hrishikesh","Tap to chat!",R.drawable.avatar4));
        chatListArrayList.add(new ChatList("Ratan","Tap to chat!",R.drawable.avatar5));
        chatListArrayList.add(new ChatList("Roshan","Tap to chat!",R.drawable.avatar2));
        chatListArrayList.add(new ChatList("savan","Tap to chat!",R.drawable.avatar));
        chatListArrayList.add(new ChatList("Ashish","Tap to chat!",R.drawable.avatar8));
        chatListArrayList.add(new ChatList("Aniket","Tap to chat!",R.drawable.avatar9));
        chatListArrayList.add(new ChatList("Hasmuddin","Tap to chat!",R.drawable.avatar));
        chatListArrayList.add(new ChatList("Rohit","Tap to chat!",R.drawable.avatar3));
        chatListArrayList.add(new ChatList("Anand","Tap to chat!",R.drawable.avatar6));
        chatListArrayList.add(new ChatList("Vinayak","Tap to chat!",R.drawable.avatar4));
        chatListArrayList.add(new ChatList("Hritik","Tap to chat!",R.drawable.avatar5));
        chatListArrayList.add(new ChatList("Nitesh","Tap to chat!",R.drawable.avatar2));
        chatListArrayList.add(new ChatList("Vishwas","Tap to chat!",R.drawable.avatar));

        ChatAdapter chatAdapter = new ChatAdapter(getActivity(), chatListArrayList);
        if (chatList != null) {
            chatList.setAdapter(chatAdapter);
        }

        return view;


    }


}
