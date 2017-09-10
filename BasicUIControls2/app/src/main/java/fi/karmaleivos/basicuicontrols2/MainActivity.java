package fi.karmaleivos.basicuicontrols2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.login); // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
    }


    public void loginButtonClicked(View view){
        EditText et = (EditText) findViewById(R.id.login);
        EditText et2 = (EditText) findViewById(R.id.pwd);



        Toast toast = new Toast(getApplicationContext());

        toast.makeText(MainActivity.this, et.getText(),  toast.LENGTH_SHORT).show();
        toast.makeText(MainActivity.this, et2.getText(),  toast.LENGTH_SHORT).show();

    }


}
