package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void Boxes(View view){
        EditText edlength = findViewById(R.id.ed_lenght);
        EditText edwidth = findViewById(R.id.ed_width);
        EditText edheight = findViewById(R.id.ed_height);
        double length = Double.parseDouble(edlength.getText().toString());
    double width = Double.parseDouble(edwidth.getText().toString());
    double  height = Double.parseDouble(edheight.getText().toString());
    if(length<=23&&width<=14&&height<=13){
        Intent intent =new Intent(this,ResultActivity.class);
        intent.putExtra("box","box3");
        intent.putExtra("Dimention","23/14/13");
        intent.putExtra("price","65");
    startActivity(intent);
    }else {
        Intent intent =new Intent(this,ResultActivity.class);
        intent.putExtra("box","box5");
        intent.putExtra("Dimention","39.5/27.5/23");
        intent.putExtra("price","90");
        startActivity(intent);
    }
}

    }


