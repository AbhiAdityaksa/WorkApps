package c.progmob.WorkoutPedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class JumpActivity extends AppCompatActivity {
//    private RecyclerView rv;
//    int position;
//    RecyclerView.Adapter adapter;
//    List<WorkPediaMenu> pediaMenuList;
    WorkPediaMenu workPediaMenu;
    TextView deskripsi;
    TextView judulu;
    ImageView gamabar;
    Button btn_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);
        deskripsi = findViewById(R.id.deskripsi);
        gamabar = findViewById(R.id.gambar);
        judulu = findViewById(R.id.judul);
        btn_url = findViewById(R.id.btn_url);

        workPediaMenu=getIntent().getParcelableExtra("menu");

        btn_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriUrl = Uri.parse(workPediaMenu.getUrl());
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
//                startActivity(launchBrowser);
                if (launchBrowser.resolveActivity(getPackageManager()) != null) {
                    startActivity(launchBrowser);
                }
            }
        });
        deskripsi.setText(workPediaMenu.getDeskripsi());
        gamabar.setImageResource(workPediaMenu.getGambar());
        judulu.setText(workPediaMenu.getNama());
//        rv = (RecyclerView) findViewById(R.id.RV2);
//        rv.setHasFixedSize(true);
//        rv.setLayoutManager(new LinearLayoutManager(this));
//        position=getIntent().getIntExtra("position",0);
//        pediaMenuList = new ArrayList<>();

//        pediaMenuList();
    }

    private void pediaMenuList() {
//        switch (position){
//            case 0:
//                pediaMenuList.add(new WorkPediaMenu("Jumping Jack ","Latihan ini berguna untuk menggerakan semua kelompok otot besar Anda\n" +
//                        "\n" +
//                        "Mulai dari posisi berdiri dengan kaki rapat, lalu lompat dengan kaki terbuka dan telapak tangan bersentuhan di atas kepala. Kembali ke posisi awal dan lakukan babak berikutnya.\n",R.drawable.gambar1));
//                break;
//            case 1:
//                pediaMenuList.add(new WorkPediaMenu("Incline Push-Ups","Mulai dengan posisi push up seperti biasanya namun dengan meletakkan tangan diatas kursi atau bangku\n" +
//                        "Lalu dorong badan Anda naik turun dengan kekuatan tangan Anda. Ingat bahwa tubuh Anda harus tetap lurus.\n",R.drawable.gambar2));
//            default:
//        }
        loadRecyclerview();
    }
    public void loadRecyclerview(){
//        adapter = new RecyclerAdapterKedua(getApplicationContext(),pediaMenuList);
//        rv.setAdapter(adapter);
    }
}
