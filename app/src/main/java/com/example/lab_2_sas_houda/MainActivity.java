package com.example.lab_2_sas_houda;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editSuperficie, editChambres;
    private CheckBox checkJardin;
    private TextView textResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editSuperficie = findViewById(R.id.edit_superficie);
        editChambres   = findViewById(R.id.edit_chambres);
        checkJardin    = findViewById(R.id.check_jardin);
        textResultat   = findViewById(R.id.text_resultat);

        findViewById(R.id.btn_estimer).setOnClickListener(v -> estimerTaxe());
    }

    private void estimerTaxe() {
        double superficie = Double.parseDouble(editSuperficie.getText().toString());
        int chambres      = Integer.parseInt(editChambres.getText().toString());
        boolean jardin    = checkJardin.isChecked();

        double taxeBase      = superficie * 2;
        double taxeExtra     = chambres * 50 + (jardin ? 100 : 0);
        double taxeTotale    = taxeBase + taxeExtra;

        textResultat.setText(
                "Taxe de base : " + taxeBase + " DH\n" +
                        "Taxe supplémentaire : " + taxeExtra + " DH\n" +
                        "Taxe totale : " + taxeTotale + " DH"
        );
    }
}