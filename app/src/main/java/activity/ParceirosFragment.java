package activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.joao.materialdesigntheme.R;

import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 */
public class ParceirosFragment extends Fragment {


    public ParceirosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_parceiros, container, false);

        ListView lista = (ListView) view.findViewById(R.id.lvParceiros);
        ArrayAdapter adapter = new RestauranteAdapter(getActivity(), adicionarRestaurantes());
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), ParceirosInfo.class);

                int opc = position;
                //Compartilha o valor da variável 'opc' com a intent ParceirosInfo
                Bundle bundle = new Bundle();
                bundle.putInt("opc", opc);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        return view;
    }

    private ArrayList<Restaurante> adicionarRestaurantes() {
        ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
        Restaurante r = new Restaurante("Cabana do Sol", "Restaurante", R.drawable.logo_cabanadosol);
        restaurantes.add(r);
        r = new Restaurante("Cheiro Verde", "Restaurante", R.drawable.logo_cheiroverde);
        restaurantes.add(r);
        r = new Restaurante("Taipan", "Culinária chinesa e japonesa", R.drawable.logo_taipan);
        restaurantes.add(r);
        r = new Restaurante("Amendoeira", "Restaurante", R.drawable.logo_amendoeira);
        restaurantes.add(r);
        r = new Restaurante("Amendoeira", "Restaurante", R.drawable.logo_amendoeira);
        restaurantes.add(r);
        r = new Restaurante("Amendoeira", "Restaurante", R.drawable.logo_amendoeira);
        restaurantes.add(r);
        r = new Restaurante("Amendoeira", "Restaurante", R.drawable.logo_amendoeira);
        restaurantes.add(r);
        r = new Restaurante("Amendoeira", "Restaurante", R.drawable.logo_amendoeira);
        restaurantes.add(r);
        return restaurantes;
    }

}
