package mz.ac.isutc.lecc.mt2.tpc2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mz.ac.isutc.lecc.mt2.tpc2.R;
import mz.ac.isutc.lecc.mt2.tpc2.databinding.FragmentEstudanteBinding;

public class EstudanteFragment extends Fragment {

    private FragmentEstudanteBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEstudanteBinding.inflate(inflater,container,false);
        

        return binding.getRoot();
    }
}