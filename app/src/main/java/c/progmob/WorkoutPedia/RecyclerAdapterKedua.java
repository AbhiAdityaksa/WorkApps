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

import java.util.List;

public class RecyclerAdapterKedua extends RecyclerView.Adapter<RecyclerAdapterKedua.ReyclerViewHolder> {
    private final Context context;

    LayoutInflater inflater;
    List<WorkPediaMenu> pediaMenuList;
    public RecyclerAdapterKedua(Context context,List<WorkPediaMenu> pediaMenuList) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.pediaMenuList=pediaMenuList;
    }

    @Override
    public ReyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_menu2, parent, false);

        ReyclerViewHolder viewHolder = new ReyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ReyclerViewHolder holder, int position) {
        holder.tv1.setText(pediaMenuList.get(position).getNama());
        holder.imageView.setImageResource(pediaMenuList.get(position).getGambar());
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);
    }

    @Override
    public int getItemCount() {
        return pediaMenuList.size();
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
                    switch (position) {
                        case 0:
                            Intent intent = new Intent(context, MenuKedua.class);
                            context.startActivity(intent);
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

