package unicauca.movil.peliculas;

import android.databinding.DataBindingUtil;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.view.MenuItem;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import unicauca.movil.peliculas.databinding.ActivityDetailBinding;
import unicauca.movil.peliculas.models.Pelicula;
import unicauca.movil.peliculas.util.Data;

public class DetailActivity extends AppCompatActivity implements Callback {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int pos = getIntent().getExtras().getInt("pos");
        Pelicula pelicula = Data.getPeliculas().get(pos);

        binding.setMovie(pelicula);

        Picasso.with(this)
                .load(Uri.parse(pelicula.getImagen()))
                .into(binding.img, this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSuccess() {
        BitmapDrawable drawable = (BitmapDrawable) binding.img.getDrawable();
        Palette palette =  new Palette
                .Builder(drawable.getBitmap())
                .generate();

        int colorDefault = ContextCompat.getColor(this, R.color.colorPrimary);
        int color = palette.getVibrantColor(colorDefault);
        binding.collapsingToolbar.setContentScrimColor(color);
    }

    @Override
    public void onError() { }
}
