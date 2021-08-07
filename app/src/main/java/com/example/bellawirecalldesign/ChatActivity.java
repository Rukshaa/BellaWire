package com.example.bellawirecalldesign;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.bellawirecalldesign.adapter.ChatAdapter;
import com.example.bellawirecalldesign.adapter.CustomAdapter;
import com.example.bellawirecalldesign.databinding.ActivityChatBinding;
import com.example.bellawirecalldesign.databinding.FragmentChatBinding;
import com.example.bellawirecalldesign.model.ChatModel;
import com.example.bellawirecalldesign.model.MessageModel;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    ActivityChatBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_chat);
        ArrayList<MessageModel> messagesList = new ArrayList<>();
        for (int i=0;i<6;i++) {
            messagesList.add(new MessageModel("Android charting application xml ui design tutorial with example. Android charting application", i % 2 == 0 ? CustomAdapter.MESSAGE_TYPE_IN : CustomAdapter.MESSAGE_TYPE_OUT));
        }

        CustomAdapter adapter = new CustomAdapter(this, messagesList);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);













//        FragmentChatBinding binding;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            binding = DataBindingUtil.setContentView(this, R.layout.activity_chat);







      }
    }










