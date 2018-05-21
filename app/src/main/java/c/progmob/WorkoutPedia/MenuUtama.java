package c.progmob.WorkoutPedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MenuUtama extends AppCompatActivity {

    RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);

        rc = (RecyclerView) findViewById(R.id.RV1);

        RecyclerAdapterUtama adapter = new RecyclerAdapterUtama(this);
        rc.setAdapter(adapter);
        rc.setHasFixedSize(true);
        rc.setLayoutManager(new LinearLayoutManager(this));
    }
}
