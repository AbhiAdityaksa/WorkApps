package c.progmob.WorkoutPedia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerAdapterUtama extends RecyclerView.Adapter<RecyclerAdapterUtama.ReyclerViewHolder> {
    private final Context context;

    int[] gambar = {R.drawable.otot, R.drawable.ic_launcher_background, R.drawable.download, R.drawable.download, R.drawable.download, R.drawable.download,};
    String[] name={"samsung","nene","nono","jaj","kaka","kakak"};
    LayoutInflater inflater;

    public RecyclerAdapterUtama(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ReyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_menu1, parent, false);

        ReyclerViewHolder viewHolder = new ReyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ReyclerViewHolder holder, int position) {
        holder.tv1.setText(name[position]);
        holder.imageView.setImageResource(gambar[position]);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    class ReyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2;
        ImageView imageView;

        public ReyclerViewHolder(View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById(R.id.ini_judul);
            imageView = (ImageView) itemView.findViewById(R.id.df_icon);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
//                    Toast.makeText(context, "tes "+position, Toast.LENGTH_SHORT).show();
                    switch (position) {
                        case 0:
                            Intent intent = new Intent(context, MenuKedua.class);
                            context.startActivity(intent);
//                            CharSequence text = tv1.getText();
                            Toast.makeText(context, "Open", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
//                            Intent intent =
                    }
                }
            });

        }
    }
}

