package activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.joao.materialdesigntheme.R;

/**
 * Created by joao on 08/02/17.
 */

public class ParceirosInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int opc = bundle.getInt("opc");
        if(opc == 0){
            setContentView(R.layout.info_cabanadosol);
        }
        else if(opc == 1){
            setContentView(R.layout.info_cheiroverde);
        }
        else if(opc == 2){
            setContentView(R.layout.info_taipan);
        }
        else if(opc == 3){
            setContentView(R.layout.info_amendoeira);
        }
        else{
            setContentView(R.layout.fragment_parceiros);
        }
    }
}
