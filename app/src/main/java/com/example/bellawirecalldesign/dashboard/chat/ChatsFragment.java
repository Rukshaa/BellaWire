package com.example.bellawirecalldesign.dashboard.chat;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bellawirecalldesign.R;
import com.example.bellawirecalldesign.adapter.ChatAdapter;
import com.example.bellawirecalldesign.databinding.FragmentChatsBinding;
import com.example.bellawirecalldesign.model.ChatModel;

import java.util.ArrayList;
import java.util.List;


public class ChatsFragment extends Fragment {
    FragmentChatsBinding binding;
    List<ChatModel> chat = new ArrayList<>();
    ChatAdapter chatAdapter;

    LinearLayoutManager layoutManager;

    public ChatsFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.fragment_chats, container, false);

        chat.add(new ChatModel(R.drawable.angela_garrett, "Angela Garrett", "Hello,how are you?", "12min"));
        chat.add(new ChatModel(R.drawable.tammy_hayes, "Tammy Hayes", "Thanks pretty wild on you", "5:45 PM"));
        chat.add(new ChatModel(R.drawable.leon_hunt, "Leon Hunt", "I really love that!", "6:14 PM"));
        chat.add(new ChatModel(R.drawable.sandra, "Sandra Aquilar", "You interest in movie...", "10:54 PM"));
        chat.add(new ChatModel(R.drawable.marie, "Marie Fowler", "Thank you so much!", "Sun"));
        chat.add(new ChatModel(R.drawable.cynthia, "Cynthia Medina", "Hey what are your favourites.", "Oct 23"));
        chat.add(new ChatModel(R.drawable.zeya, "Zeya Rynzhuk", "Hello,how are you?", ""));
        chat.add(new ChatModel(R.drawable.angela_garrett, "Angela Garrett", "Hello,how are you?", "12min"));
        chat.add(new ChatModel(R.drawable.angela_garrett, "Angela Garrett", "Hello,how are you?", "12min"));
        chat.add(new ChatModel(R.drawable.angela_garrett, "Angela Garrett", "Hello,how are you?", "12min"));
        chat.add(new ChatModel(R.drawable.angela_garrett, "Angela Garrett", "Hello,how are you?", "12min"));
        chat.add(new ChatModel(R.drawable.angela_garrett, "Angela Garrett", "Hello,how are you?", "12min"));
        chat.add(new ChatModel(R.drawable.angela_garrett, "Angela Garrett", "Hello,how are you?", "12min"));
        chat.add(new ChatModel(R.drawable.angela_garrett, "Angela Garrett", "Hello,how are you?", "12min"));
        chatAdapter = new ChatAdapter(chat, getContext());
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        binding.chatList.setLayoutManager(layoutManager);
        binding.chatList.setAdapter(chatAdapter);
        return binding.getRoot();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}