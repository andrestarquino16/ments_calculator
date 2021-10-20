package com.example.training1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.training1.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    int sum_enfpul = 0;
    int sum_enfcard =0;
    int sumaFragme_segundo = 0;
    int diab = 0;
    int sumaFragme_tercero = 0;
    int sumaFragme_primero = 0;


    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_ProcedimientoFragments);
            }
        });


        Spinner enfPul = view.findViewById(R.id.spinner22);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.enfer_pul,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        enfPul.setAdapter(adapter);

        enfPul.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    sum_enfpul = 0;
                }
                if (position == 1) {
                    sum_enfpul = 1;
                }
                if (position == 2) {
                    sum_enfpul = 2;
                }
                if (position == 3) {
                    sum_enfpul = 3;
                }
                if (position == 4) {
                    sum_enfpul = 4;
                }
                if (position == 5) {
                    sum_enfpul = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){
            }

        });
        Spinner enfCard = view.findViewById(R.id.spinner19);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.enfer_card,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        enfCard.setAdapter(adapter1);

        enfCard.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0);{
                    sum_enfcard = 0;
                }
                if (position == 1);{
                    sum_enfcard = 1;
                }
                if (position == 2);{
                    sum_enfcard = 2;
                }
                if (position == 3);{
                    sum_enfcard = 3;
                }
                if (position == 4);{
                    sum_enfcard = 4;
                }
                sumaFragme_segundo = sum_enfcard + sum_enfcard+diab;

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        Spinner diabetes = view.findViewById(R.id.spinner21);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.enfer_pul,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        enfPul.setAdapter(adapter2);

        diabetes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    diab = 0;
                }
                if (position == 1) {
                    diab = 1;
                }
                if (position == 2) {
                    diab = 2;
                }
                if (position == 3) {
                    diab = 3;
                }
                if (position == 4) {
                    diab = 4;
                }
                if (position == 5) {
                    diab = 5;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){
            }

        });



    };
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
