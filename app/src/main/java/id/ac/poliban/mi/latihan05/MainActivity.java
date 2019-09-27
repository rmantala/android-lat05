package id.ac.poliban.mi.latihan05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!= null) getSupportActionBar().setTitle("Registrasi Mahasiswa");

        TextView tvNim = findViewById(R.id.tvNim);
        TextView tvName = findViewById(R.id.tvName);
        TextView tvAddress = findViewById(R.id.tvAddress);
        TextView tvPhone = findViewById(R.id.tvPhone);

        EditText etNim = findViewById(R.id.etNim);
        EditText etName = findViewById(R.id.etName);
        EditText etAddress = findViewById(R.id.etAddress);
        EditText etPhone = findViewById(R.id.etPhone);

        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);

        btClear.setOnClickListener((v)-> {
            etNim.setText("");
            etName.setText("");
            etAddress.setText("");
            etPhone.setText("");
            etNim.requestFocus();
        });

        btSubmit.setOnClickListener((v)->{
            etNim.setText("");
            etName.setText("");
            etAddress.setText("");
            etPhone.setText("");
            Toast.makeText(this, "data has been submitted!", Toast.LENGTH_SHORT).show();
        });
    }
}
