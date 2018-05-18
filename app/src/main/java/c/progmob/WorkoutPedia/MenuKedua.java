package c.progmob.WorkoutPedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuKedua extends AppCompatActivity {

    RecyclerView rc2;
    List<WorkPediaMenu> pediaMenuList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rc2 = (RecyclerView) findViewById(R.id.RV2);
        pediaMenuList.add(new WorkPediaMenu("nasigoreng","",R.drawable.download));
        RecyclerAdapterKedua adapter2 = new RecyclerAdapterKedua(this,pediaMenuList) ;
        rc2.setAdapter(adapter2);
        rc2.setHasFixedSize(true);
        rc2.setLayoutManager(new LinearLayoutManager(this));
    }
}
