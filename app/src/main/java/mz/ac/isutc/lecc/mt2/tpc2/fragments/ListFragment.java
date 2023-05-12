package mz.ac.isutc.lecc.mt2.tpc2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mz.ac.isutc.lecc.mt2.tpc2.R;
import mz.ac.isutc.lecc.mt2.tpc2.databinding.FragmentListBinding;

public class ListFragment extends Fragment {

    private FragmentListBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentListBinding.inflate(inflater,container,false);

        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}