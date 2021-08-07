package com.example.bellawirecalldesign.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bellawirecalldesign.ChatActivity;
import com.example.bellawirecalldesign.R;
import com.example.bellawirecalldesign.databinding.ChatLayoutBinding;
import com.example.bellawirecalldesign.model.ChatModel;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder>{
    private List<ChatModel> chat;
    private Context context;

    public ChatAdapter(List<ChatModel> chat, Context context) {
        this.chat = chat;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         ChatLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.chat_layout, parent, false);

        return new ChatViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        ChatModel chats = chat.get(position);
        holder.binding.angelaProfile.setImageResource(chats.getProfileImage());
        holder.binding.angelaName.setText(chats.getProfileName());
        holder.binding.text.setText(chats.getProfileText());
        holder.binding.timeTxt.setText(chats.getTime());
        holder.binding.chatHolder.setOnClickListener(v -> {
            Intent intent = new Intent(context, ChatActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return chat.size();
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder {

        ChatLayoutBinding binding;
        public ChatViewHolder(@NonNull ChatLayoutBinding b) {
            super(b.getRoot());
            binding=b;
        }
    }
}