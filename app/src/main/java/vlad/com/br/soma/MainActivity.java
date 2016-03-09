package vlad.com.br.soma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText op1;
    EditText op2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view) {
        op1 = (EditText) findViewById(R.id.op1);
        op1 = (EditText) findViewById(R.id.op1);
        Integer i = new Integer(op1.getText().toString()) + new Integer(op1.getText().toString());
        resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(i.toString());
    }
}
