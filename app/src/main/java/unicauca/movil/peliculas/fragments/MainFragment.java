package unicauca.movil.peliculas.fragments;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import unicauca.movil.peliculas.R;
import unicauca.movil.peliculas.adapters.PeliculaAdapter;
import unicauca.movil.peliculas.databinding.FragmentMainBinding;
import unicauca.movil.peliculas.util.Data;

public class MainFragment extends Fragment {

    public static MainFragment instance(){
        return new MainFragment();
    }

    FragmentMainBinding binding;
    PeliculaAdapter adapter;

  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
      adapter = new PeliculaAdapter(getLayoutInflater(null), Data.getPeliculas());
      binding.recycler.setAdapter(adapter);
      //binding.recycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
      binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));

      return binding.getRoot();
    }



}
