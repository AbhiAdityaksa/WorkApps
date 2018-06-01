package c.progmob.WorkoutPedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuKetiga extends AppCompatActivity {
    RecyclerView rc3;
    List<WorkPediaMenu> pediaMenuList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuketiga);

        rc3 = (RecyclerView) findViewById(R.id.RV3);
        pediaMenuList.add(new WorkPediaMenu("Arm Raises","Berdiri dilantai dengan merentangkan kedua tangan ke depan sejajar dengan bahu.\n" +
                "\n" +
                "Angkat kedua tangan ke atas kepala. Kembali ke posisi semula dan ulangi.\n",R.drawable.arm,"https://www.youtube.com/watch?v=D-3JnFrFUOw"));
        pediaMenuList.add(new WorkPediaMenu("Rhomboid pulls","Berdiri dengan kaki selebar bahu. Angkat kedua lengan sampai sejajar dengan lantai, dan tekukkan kedua siku. Tarik kedua siku kebelakang dan kencangkan kedua tulang belikat.\n" +
                "\n" +
                "Ulangi latihan ini\n",R.drawable.rhamboid,"https://www.youtube.com/watch?v=KMgAmFD-Z6U"));
        pediaMenuList.add(new WorkPediaMenu("Knee push-up","Mulai dengan push up seperti biasanya dengan lutut menyentuh lantai, sedangkan telapak kaki diangkat.\n" +
                "\n" +
                "Lalu dorong badan anda naik dan turun.\n",R.drawable.kneepushup,"https://www.youtube.com/watch?v=EgIMk-PZwo0"));
        pediaMenuList.add(new WorkPediaMenu("prone triceps push up","Berbaling telungkup dengan kedua telapak tangan di bawah bahu dan siku ditekuk\n" +
                "Angkat dada sedikit, dan kembali ke posisi awal. Ulangi latihan ini.\n",R.drawable.prone1,"https://www.youtube.com/watch?v=Z7QSvBmy9Ms"));
        pediaMenuList.add(new WorkPediaMenu("Reclined rhomboid squeezes","Berbaring miring ke kanan dengan lutu kanan sedikit ditekuk ke depan dan kaki kiri diregangkan ke belakang kaki kanan.\n" +
                "\n" +
                "Duduk dengan lutut ditekuk. Miringkan sedikit tubuh bagian atas ke belakang.\n" +
                "\n" +
                "Luruskan kedua lengan ke depan, lalu tarik kedua siku ke belakang untuk membentuk sudut 90 derajat dan kencangkan kedua tulang belikat.\n",R.drawable.recline1,"https://www.youtube.com/watch?v=RqRwRE0CEoA"));



        RecyclerAdapterKetiga adapter3 = new RecyclerAdapterKetiga(this,pediaMenuList) ;
        rc3.setAdapter(adapter3);
        rc3.setHasFixedSize(true);
        rc3.setLayoutManager(new LinearLayoutManager(this));
    }
}