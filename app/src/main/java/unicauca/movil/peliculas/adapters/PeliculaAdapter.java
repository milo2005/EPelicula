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

    public interface OnPeliculaListener{
        void onPeliculaClick(int position);
    }

    LayoutInflater inflater;
    List<Pelicula> data;
    OnPeliculaListener listener;

    public PeliculaAdapter(LayoutInflater inflater, List<Pelicula> data, OnPeliculaListener listener) {
        this.inflater = inflater;
        this.data = data;
        this.listener = listener;
    }

    @Override
    public PeliculaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.template_pelicula, parent, false);
        return new PeliculaHolder(v);
    }

    @Override
    public void onBindViewHolder(PeliculaHolder holder, int position) {
        holder.binding.setMovie(data.get(position));
        holder.binding.card.setTag(position);
        holder.binding.setHandler(this);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void onItemClick(int position){
        listener.onPeliculaClick(position);
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
