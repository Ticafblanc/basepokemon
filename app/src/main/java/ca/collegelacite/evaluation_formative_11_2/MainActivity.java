package ca.collegelacite.evaluation_formative_11_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    // ListView <---> adaptateur <---> listeDePokemons
    // Adaptateur faisant le pont entre le ListView et les données.
    private AdaptateurPokemon adaptateur;

    // Fonction du cycle de vie exécutée lors de la création de l'activité.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Créer l'adaptateur et le connecter aux données.
        adaptateur = new AdaptateurPokemon(this);

        // Connecter le ListView à l'adaptateur.
        ListView lv = findViewById(R.id.listeViewId);
        lv.setAdapter(adaptateur);

    }

}