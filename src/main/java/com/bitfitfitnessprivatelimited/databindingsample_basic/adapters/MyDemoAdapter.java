package com.bitfitfitnessprivatelimited.databindingsample_basic.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bitfitfitnessprivatelimited.databindingsample_basic.R;
import com.bitfitfitnessprivatelimited.databindingsample_basic.databinding.ListitemLayoutBinding;
import com.bitfitfitnessprivatelimited.databindingsample_basic.pojo.EmpInfoModal;

import java.util.List;

/**
 * Created on Android Studio
 * Author: Umesh
 * DATE: 12/29/2018
 * TIME :12:56 PM.
 * DAY: Saturday
 * Project: DataBindingSample_Basic
 */
public class MyDemoAdapter extends RecyclerView.Adapter<MyDemoAdapter.MyViewHolder> {

    private List<EmpInfoModal> infoModals;
    private LayoutInflater layoutInflater;
    private EmpAdapterListener listener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final ListitemLayoutBinding binding;

        public MyViewHolder(final ListitemLayoutBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }
    }

    public MyDemoAdapter(List<EmpInfoModal> empInfoModals, EmpAdapterListener listener) {
        this.infoModals = empInfoModals;
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ListitemLayoutBinding binding =
                DataBindingUtil.inflate(layoutInflater, R.layout.listitem_layout, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.binding.setEmpinfo(infoModals.get(position));
        holder.binding.main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onPostClicked(infoModals.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return infoModals.size();
    }

    public interface EmpAdapterListener {
        void onPostClicked(EmpInfoModal empInfoModal);
    }
}