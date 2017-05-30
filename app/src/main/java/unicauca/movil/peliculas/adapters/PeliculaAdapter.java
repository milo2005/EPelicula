package unicauca.movil.peliculas.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import unicauca.movil.peliculas.R;
import unicauca.movil.peliculas.databinding.TemplatePeliculaBinding;
import unicauca.movil.peliculas.models.Pelicula;

public class PeliculaAdapter extends  RecyclerView.Adapter<PeliculaAdapter.PeliculaHolder>{

    LayoutInflater inflater;
    List<Pelicula> data;

    public PeliculaAdapter(LayoutInflater inflater, List<Pelicula> data) {
        this.inflater = inflater;
        this.data = data;
    }

    @Override
    public PeliculaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.template_pelicula, parent, false);
        return new PeliculaHolder(v);
    }

    @Override
    public void onBindViewHolder(PeliculaHolder holder, int position) {
        holder.binding.setMovie(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    //region ViewHolders
    static class PeliculaHolder extends RecyclerView.ViewHolder{

        TemplatePeliculaBinding binding;

        public PeliculaHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion
}
