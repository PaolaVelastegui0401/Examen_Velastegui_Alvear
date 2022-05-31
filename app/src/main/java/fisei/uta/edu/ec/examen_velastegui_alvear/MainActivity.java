package fisei.uta.edu.ec.examen_velastegui_alvear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private ListView listaRecuperada_VLAV;
    private ArrayAdapter<String> adapter_VLAV;
    private ListView listaIndice_VLAV;
    private ListView listaOrdenada_VLAV;
    private ArrayList<String> lista;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaRecuperada_VLAV = findViewById(R.id.listaRecuperada_VLAV);
        listaIndice_VLAV = findViewById(R.id.listaIndice_VLAV);
        listaOrdenada_VLAV = findViewById(R.id.listaOrdenar_VLAV);




    }

    public void Seguir_VLAV(View view){
        Intent siguiente = new Intent(this, MainActivity2_VLAV.class);

        startActivity(siguiente);
    }

    public void Mostrar_VLAV(View view){
        lista = getIntent().getStringArrayListExtra("lista1");
        adapter_VLAV = new ArrayAdapter<String>(this
                , android.R.layout.simple_list_item_1,lista);
        listaRecuperada_VLAV.setAdapter(adapter_VLAV);
    }

    public void OrdenarIndice_VLAV(View view){

        for(int i=0; i <= lista.toArray().length; i++  ){


        }



    }



}