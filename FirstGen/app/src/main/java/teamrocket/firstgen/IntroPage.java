package teamrocket.firstgen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class IntroPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page);
        Button btnFacebook=(Button)findViewById(R.id.btn_facebook);
        btnFacebook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IntroPage.this,MainPage.class);
                startActivity(intent);
            }
        });

        Button btnGmail=(Button)findViewById(R.id.btn_gmail);
        btnGmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IntroPage.this,MainPage.class);
                startActivity(intent);
            }
        });

        Button btnSignIn=(Button)findViewById(R.id.btn_sign_in);
        btnSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IntroPage.this,MainPage.class);
                startActivity(intent);
            }
        });
    }
    /*public void onClickSignup(View view){
        Intent intent = new Intent(this,LoginPage.class);
        intent.putExtra("value","");
        startActivity(intent);

        //Toast.makeText(this, "Signup clicked", Toast.LENGTH_LONG).show();
    }
    public void onClickLogin(View view){
        Intent intent = new Intent(this,LoginPage.class);
        intent.putExtra("value", "login");
        startActivity(intent);
        //Toast.makeText(this, "Login clicked", Toast.LENGTH_LONG).show();

    }*/

}
