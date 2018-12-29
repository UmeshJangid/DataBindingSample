package com.bitfitfitnessprivatelimited.databindingsample_basic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.bitfitfitnessprivatelimited.databindingsample_basic.adapters.MyDemoAdapter;
import com.bitfitfitnessprivatelimited.databindingsample_basic.databinding.ActivitySecondBinding;
import com.bitfitfitnessprivatelimited.databindingsample_basic.pojo.EmpInfoModal;

import java.util.ArrayList;
import java.util.List;

public class ActivitySecond extends AppCompatActivity implements MyDemoAdapter.EmpAdapterListener {
    ActivitySecondBinding secondBinding;
    private RecyclerView recyclerView;
    private MyDemoAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        secondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        initRecyclerView();
    }

    /**
     * Renders RecyclerView with Grid Images in 3 columns
     */
    private void initRecyclerView() {
        recyclerView = secondBinding.rrEmpList;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setNestedScrollingEnabled(false);
        mAdapter = new MyDemoAdapter(getEmpInfo(), this);
        recyclerView.setAdapter(mAdapter);
    }

    private List<EmpInfoModal> getEmpInfo() {
        List<EmpInfoModal> empInfoModals = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            EmpInfoModal empInfoModal = new EmpInfoModal("Test" + i, 26, "SE(Android)", i, (5550 + i), 2.5f);
            empInfoModals.add(empInfoModal);
        }
        return empInfoModals;
    }

    @Override
    public void onPostClicked(EmpInfoModal empInfoModal) {
        Toast.makeText(getApplicationContext(), "Post clicked! " + empInfoModal.getName(), Toast.LENGTH_SHORT).show();
    }
}
