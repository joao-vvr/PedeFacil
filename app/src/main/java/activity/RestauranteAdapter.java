package activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.joao.materialdesigntheme.R;

import java.util.ArrayList;

/**
 * Created by joao on 08/02/17.
 */

public class RestauranteAdapter extends ArrayAdapter<Restaurante> {

    private final Context context;
    private final ArrayList<Restaurante> elementos;

    public RestauranteAdapter(Context context, ArrayList<Restaurante> elementos) {
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent, false);
        TextView nomeEscola = (TextView) rowView.findViewById(R.id.nome);
        TextView endereco = (TextView) rowView.findViewById(R.id.culinaria);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);
        nomeEscola.setText(elementos.get(position).getNome());
        endereco.setText(elementos.get(position).getTipo());
        imagem.setImageResource(elementos.get(position).getImagem());
        return rowView;
    }
}
