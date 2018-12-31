package com.bitfitfitnessprivatelimited.databindingsample_basic;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;

import com.bitfitfitnessprivatelimited.databindingsample_basic.databinding.ActivityMainBinding;
import com.bitfitfitnessprivatelimited.databindingsample_basic.interfaces.NormalInterface;
import com.bitfitfitnessprivatelimited.databindingsample_basic.pojo.EmpInfoModal;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements NormalInterface {
    public static ActivityMainBinding binding;
    EmpInfoModal empInfoModal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        empInfoModal = new EmpInfoModal("Umesh Jangid", 28, "Programmer", 1001, "https://www.gstatic.com/webp/gallery/1.jpg", 5500, 4.5f);
        // empInfoModal = new EmpInfoModal("Ankit Luka", 28, "DotNet", 1001, 5500, new BigDecimal(0));
        binding.setEmpinfo(empInfoModal);
        binding.setNormalInterface((NormalInterface) this);
        binding.setTesturl("https://avatars3.githubusercontent.com/u/10571832?s=400&u=ed8bec7d43de36c3b37c756761249e5b65d7a38a&v=4");
        binding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivitySecond.class));
            }
        });
    }

    @Override
    public void showDateDialog() {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    @SuppressLint("ValidFragment")
    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog dialog = new DatePickerDialog(getActivity(), this, year, month, day);
            dialog.getDatePicker().setMaxDate(c.getTimeInMillis());
            return dialog;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            /*  btnDate.setText(ConverterDate.ConvertDate(year, month + 1, day));*/
            binding.button.setText((year + "-" + (month + 1) + "-" + day));
        }
    }
}
