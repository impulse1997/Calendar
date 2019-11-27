package dynamic.final_version;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmailTransmitter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_response);
        Button R1=(Button)findViewById(R.id.notcomming);
      Button R2= (Button)findViewById(R.id.comming);
      Button R3= (Button)findViewById(R.id.myownmessage);
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail1();
            }
        });

        R2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sendEmail2();
        }
    });
        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail3();
            }
        });


    }

    private void sendEmail2() {
        //   String recipentList=  EmailNameSender.getText().toString();
        // String name = Name.getText().toString();
        String CC = "MEETING";
        String Response2="Coming";
        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra(Intent.EXTRA_SUBJECT,CC);
        intent.putExtra(Intent.EXTRA_TEXT,Response2);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose an email client"));
    }
    private void sendEmail3() {
        //   String recipentList=  EmailNameSender.getText().toString();
        // String name = Name.getText().toString();
        String CC = "MEETING";

        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra(Intent.EXTRA_SUBJECT,CC);


        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose an email client"));
    }
    private void sendEmail1() {
        //   String recipentList=  EmailNameSender.getText().toString();
        // String name = Name.getText().toString();
        String CC = "MEETING";
        String Response1 = "Not Coming";
        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra(Intent.EXTRA_SUBJECT, CC);
        intent.putExtra(Intent.EXTRA_TEXT, Response1);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }
}