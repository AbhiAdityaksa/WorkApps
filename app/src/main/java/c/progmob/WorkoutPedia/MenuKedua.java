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
        pediaMenuList.add(new WorkPediaMenu("Jumping Jack ","Latihan ini berguna untuk menggerakan semua kelompok otot besar Anda\n" +
                "\n" +
                "Mulai dari posisi berdiri dengan kaki rapat, lalu lompat dengan kaki terbuka dan telapak tangan bersentuhan di atas kepala. Kembali ke posisi awal dan lakukan babak berikutnya.\n",R.drawable.gambar1));
        pediaMenuList.add(new WorkPediaMenu("Incline Push-Ups","Mulai dengan posisi push up seperti biasanya namun dengan meletakkan tangan diatas kursi atau bangku\n" +
                "Lalu dorong badan Anda naik turun dengan kekuatan tangan Anda. Ingat bahwa tubuh Anda harus tetap lurus.\n",R.drawable.gambar2));
        pediaMenuList.add(new WorkPediaMenu("Push-Up","Berbaring di lantai dengan lengan menumpu tubuh anda. \n" +
                "Jaga tubuh anda tetap lurus ketika mengangkat dan menurunkan tubuh anda dengan tangan\n" +
                "Latihan ini melatih dada, bahu, otot trisep, punggung dan kaki\n",R.drawable.gambar3));
        pediaMenuList.add(new WorkPediaMenu("Wide Arm Push-Up","Mulai dengan posisi push up seperti biasanya, tetapi dengan posisi tangan lebih lebar dari bahu Anda.\n" +
                "Lalu dorong badan Anda naik-turun. Ingat bahwa tubuh Anda harus tetap lurus.\n",R.drawable.gambar4));
        pediaMenuList.add(new WorkPediaMenu("Russian Twist","Duduk di lantai dengan lutut ditekuk dan punggung dimiringkan ke belakang. Anda bisa menyilangkan kaki untuk menjaga keseimbangan.\n" +
                "Lalu rapatkan telapak tangan dan lengan menjauh dari tubuh, dan ayun dari satu sisi ke sisi lain.\n" +
                "Latihan ini bekerja pada otot perut dengan melakukan gerak memuntir pada perut.\n",R.drawable.gambar5));
        pediaMenuList.add(new WorkPediaMenu("Leg Raises","Berbaringlah dan letakkan tangan di bawah pinggul Anda.\n" +
                "Lalu angkat kedua kaki ke atas dengan lurus, hingga membentuk sudut yang tepat dengan lantai.\n" +
                "Perlahan turunkan kaki dan ulangi gerakan.\n",R.drawable.gambar6));

        RecyclerAdapterKedua adapter2 = new RecyclerAdapterKedua(this,pediaMenuList) ;
        rc2.setAdapter(adapter2);
        rc2.setHasFixedSize(true);
        rc2.setLayoutManager(new LinearLayoutManager(this));
    }
}
