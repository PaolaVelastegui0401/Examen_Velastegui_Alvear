package fisei.uta.edu.ec.examen_velastegui_alvear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2_VLAV extends AppCompatActivity {
    private EditText numero_VLAV;

    //generar Lista
    private ListView lista_VLAV;
    private ArrayAdapter<String> adapter_VLAV;
    private ArrayList<String> arrayList_VLAV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_vlav);

        numero_VLAV = findViewById(R.id.numero_VLAV);
        lista_VLAV = findViewById(R.id.listaNumeros_VLAV);

        arrayList_VLAV = new ArrayList<String>();
        adapter_VLAV = new ArrayAdapter<String>(this
                , android.R.layout.simple_list_item_1,arrayList_VLAV);
        lista_VLAV.setAdapter(adapter_VLAV);


    }

    //Metodo boton agregar
    public void Agregar_VLAV(View view){
        arrayList_VLAV.add(numero_VLAV.getText().toString());
        adapter_VLAV.notifyDataSetChanged();
    }

    public void Cerrar_VLAV(View view){

        Intent siguiente2 = new Intent(this, MainActivity.class);
        siguiente2.putStringArrayListExtra("lista1", (ArrayList<String>) arrayList_VLAV);
        startActivity(siguiente2);
    }






}