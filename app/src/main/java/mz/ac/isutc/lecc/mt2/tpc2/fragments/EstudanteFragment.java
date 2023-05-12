package mz.ac.isutc.lecc.mt2.tpc2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import mz.ac.isutc.lecc.mt2.tpc2.Armazenamento;
import mz.ac.isutc.lecc.mt2.tpc2.MainActivity;
import mz.ac.isutc.lecc.mt2.tpc2.R;
import mz.ac.isutc.lecc.mt2.tpc2.databinding.FragmentEstudanteBinding;

public class EstudanteFragment extends Fragment {

    private FragmentEstudanteBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEstudanteBinding.inflate(inflater,container,false);

        binding.btRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = binding.nome.getText().toString();
                String curso = binding.curso.getText().toString();
                int idade = Integer.parseInt(binding.idade.getText().toString());

                Armazenamento.add(nome,curso,idade);

                Toast.makeText(getContext(), "Armazenado", Toast.LENGTH_SHORT).show();
            }
        });

        return binding.getRoot();
    }
}