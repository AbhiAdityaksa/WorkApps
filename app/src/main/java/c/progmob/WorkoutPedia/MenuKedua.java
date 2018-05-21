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
        setContentView(R.layout.menukedua);

        rc2 = (RecyclerView) findViewById(R.id.RV2);
        pediaMenuList.add(new WorkPediaMenu("Jumping Jack ","",R.drawable.gambar1));
        pediaMenuList.add(new WorkPediaMenu("Incline Push-Ups","",R.drawable.gambar2));
        pediaMenuList.add(new WorkPediaMenu("Push-Up","",R.drawable.gambar3));
        pediaMenuList.add(new WorkPediaMenu("Wide Arm Push-Up","",R.drawable.gambar4));
        pediaMenuList.add(new WorkPediaMenu("Russian Twist","",R.drawable.gambar5));
        pediaMenuList.add(new WorkPediaMenu("Leg Raises","",R.drawable.gambar6));

        RecyclerAdapterKedua adapter2 = new RecyclerAdapterKedua(this,pediaMenuList) ;
        rc2.setAdapter(adapter2);
        rc2.setHasFixedSize(true);
        rc2.setLayoutManager(new LinearLayoutManager(this));
    }
}
