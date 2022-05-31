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
    private ArrayAdapter<Integer> adapter_VLAV;
    private ArrayAdapter<Integer> adapter1_VLAV;
    private ListView listaIndice_VLAV;
    private ListView listaOrdenada_VLAV;
    private ArrayList<Integer> lista;






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

        lista = getIntent().getIntegerArrayListExtra("lista1");

        adapter_VLAV = new ArrayAdapter<Integer>(this
                , android.R.layout.simple_list_item_1,lista);
        listaRecuperada_VLAV.setAdapter(adapter_VLAV);


    }

    public void Ordenar_VLAV(View view){
        adapter1_VLAV = new ArrayAdapter<Integer>(this
                , android.R.layout.simple_list_item_1,ord_VLAV(lista));
        listaOrdenada_VLAV.setAdapter(adapter1_VLAV);

    }
    public static void intercambiar_VLAV(ArrayList<Integer> a, int i, int j)
    {
        int aux = a.get(i);
        a.set(i, a.get(j));
        a.set(j, aux);
    }


    public ArrayList<Integer> ord_VLAV(ArrayList<Integer> a){
        int indiceMenor, i,j,n;
        n=a.toArray().length;
        i=0;
        do {

            indiceMenor = i;
            for (j = i+1; j < n; j++)
                if (a.get(j) < a.get(indiceMenor))
                    indiceMenor = j;
            if (i != indiceMenor)
                intercambiar_VLAV(a, i, indiceMenor);
            i++;
        }while(i < n-1);

        return a;
    }
    }



