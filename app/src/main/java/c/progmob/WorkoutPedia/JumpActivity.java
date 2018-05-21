package c.progmob.WorkoutPedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import java.util.List;

public class JumpActivity extends AppCompatActivity {

    LayoutInflater inflater;
    List<WorkPediaMenu> pediaMenuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);
    }
}
