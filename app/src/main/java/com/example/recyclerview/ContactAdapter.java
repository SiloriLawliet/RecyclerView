package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private String[] contactList;

    public ContactAdapter(String[] contactList) {
        this.contactList = contactList;
    }


    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.contact_view, parent, false);


        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        String contactName = contactList[position];
        holder.contactName.setText(contactName);

    }

    @Override
    public int getItemCount() {
        return contactList.length;
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView contactName;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            contactName = itemView.findViewById(R.id.contactName);
        }
    }


}
