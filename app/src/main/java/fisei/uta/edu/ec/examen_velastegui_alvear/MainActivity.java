package fisei.uta.edu.ec.examen_velastegui_alvear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Seguir_VLAV(View view){
        Intent siguiente = new Intent(this, MainActivity2_VLAV.class);

        startActivity(siguiente);
    }

}