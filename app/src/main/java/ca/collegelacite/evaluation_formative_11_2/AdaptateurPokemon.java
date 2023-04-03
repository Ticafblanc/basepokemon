package ca.collegelacite.evaluation_formative_11_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptateurPokemon extends BaseAdapter {
    private final Context contexte;
    private final LayoutInflater inflater;
    private final ArrayList<Pokemon> listeDePokemons;
    public AdaptateurPokemon(Context ctx) {
        this.contexte = ctx;
        this.listeDePokemons = Pokemon.lireDonnées(ctx);
        this.inflater = (LayoutInflater)this.contexte.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listeDePokemons.size();
    }

    @Override
    public Object getItem(int i) {
        return listeDePokemons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowview = inflater.inflate(R.layout.own_list, viewGroup, false);

        ImageView iv = rowview.findViewById(R.id.imageView);
        listeDePokemons.get(i).intoImageView(iv);
        TextView textview = rowview.findViewById(R.id.nomTextView);
        textview.setText(listeDePokemons.get(i).getNomFrançais());
        textview = rowview.findViewById(R.id.typeTextView);
        textview.setText(listeDePokemons.get(i).getType());
        textview = rowview.findViewById(R.id.descTextView);
        textview.setText(listeDePokemons.get(i).getDescription());

        return rowview;
    }
}
