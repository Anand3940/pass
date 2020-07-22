package com.example.pass;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.FragmentTransaction;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);
            TextView o;
                String s=null;
                Bundle sd=getIntent().getExtras();
                s=sd.getString("Name");
                o = (TextView) findViewById(R.id.textView4);
                o.setText(s);
Button btn;
btn=(Button)findViewById(R.id.button2);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        FragmentTransaction fg=getSupportFragmentManager().beginTransaction();
        fg.replace(R.id.linearLayout,new Fragment1());
        fg.commit();
    }
});
            }
        }