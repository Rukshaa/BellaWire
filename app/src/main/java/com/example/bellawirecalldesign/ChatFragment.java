package com.example.bellawirecalldesign;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bellawirecalldesign.adapter.ChatAdapter;
import com.example.bellawirecalldesign.dashboard.chat.ChatsFragment;
import com.example.bellawirecalldesign.databinding.FragmentChatBinding;
import com.example.bellawirecalldesign.model.ChatModel;
import com.example.bellawirecalldesign.utils.SectionPageAdapter;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {
    List<ChatModel> chat = new ArrayList<>();
    ChatAdapter chatAdapter;


    FragmentChatBinding binding;

    public ChatFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.fragment_chat, container, false);
        binding.imgBoy.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), MainActivity.class));
        });
        setupViewPager(binding.viewpager);

        binding.tabs.setupWithViewPager(binding.viewpager);
        return binding.getRoot();
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionPageAdapter adapter = new SectionPageAdapter(getChildFragmentManager());
        adapter.addFragment(new ChatsFragment(), "Chats");
        adapter.addFragment(new HomeFragment(), "Groups");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
