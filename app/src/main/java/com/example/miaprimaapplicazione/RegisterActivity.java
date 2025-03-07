package com.example.miaprimaapplicazione;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        //Collegamento con elementi grafici
        EditText nome = findViewById(R.id.nome);
        EditText cognome = findViewById(R.id.cognome);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        CalendarView calendario = findViewById(R.id.datanascita);
        Button registrati = findViewById(R.id.registrati);

        registrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creazione utente
                Utente utente = new Utente(nome.getText().toString(), cognome.getText().toString(), email.getText().toString(), password.getText().toString(), calendario.toString());
                //Uso del log
                Log.d("Registrazione", "Nome: " + nome.getText().toString()+ " Cognome: " + cognome.getText().toString() + " Email: " + email.getText().toString() + " Password: " + password.getText().toString()+ " Datanascita: " + calendario.toString());
                //Uso del messaggio di registrazione
                Toast.makeText(RegisterActivity.this, nome.getText().toString()+" registrato", Toast.LENGTH_LONG).show();
            }
        });

    }
}