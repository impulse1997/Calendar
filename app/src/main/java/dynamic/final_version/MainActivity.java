package dynamic.final_version;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    public EditText Nume;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button EmailTest;
    private int counter = 5;
    private TextView UserRegistration;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nume=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login=(Button)findViewById(R.id.btnLogin);
        EmailTest=(Button)findViewById(R.id.tmail);
        Info.setText("Nr of attempts remaining: 5");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Nume.getText().toString(), Password.getText().toString());
            }
        });

        EmailTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent it =new Intent(MainActivity.this,EmailTransmitter.class);
              startActivity(it);

            }
        });

    }

    private void validate(String userName, String userPassword)
    {   if(userName.equals("Vladimir") && userPassword.equals("1234")){
        Intent intent= new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
        }
        else{
            counter--;
        Info.setText("No of attempts remaining: " + counter);
        if(counter == 0){
            Login.setEnabled(false);

        }
    }
}

public EditText getName(){
        return Nume;
}
}


