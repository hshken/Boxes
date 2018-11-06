package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView result1 =findViewById(R.id.resulta);
        TextView result2 =findViewById(R.id.resultb);
        TextView result3 =findViewById(R.id.resultc);
        String resulta = getIntent().getStringExtra("box");
        String resultb = getIntent().getStringExtra("Dimention");
        String resultc = getIntent().getStringExtra("price");
        result1.setText(resulta);
        result2.setText(resultb);
        result3.setText(resultc);

    }

}
