package los4studios.mica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import los4studios.mica.helpers.Numero;

public class numberActivity extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    Button button;
    EditText eed;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        firebaseDatabase=FirebaseDatabase.getInstance();

        databaseReference= firebaseDatabase.getReference("relation").getRef();
        eed  = (EditText) findViewById(R.id.numero);
        button  = (Button) findViewById(R.id.btnenviarnum);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Numero numero  =new Numero(Long.valueOf(eed.getText().toString()));
                databaseReference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(numero).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Intent intent  = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
