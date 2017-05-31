package unicauca.movil.peliculas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unicauca.movil.peliculas.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        putFragment(R.id.container, MainFragment.instance());
    }

    public void putFragment(int container, Fragment fragment){
        FragmentTransaction ft =  getSupportFragmentManager().beginTransaction();
        ft.replace(container, fragment);
        ft.commit();
    }
}
