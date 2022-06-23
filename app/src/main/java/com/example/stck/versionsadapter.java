package com.example.stck;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class versionsadapter extends RecyclerView.Adapter<versionsadapter.VersionVh> {

    List<Version> versionList;

    public versionsadapter(List<Version> versionList) {
        this.versionList = versionList;
    }

    @NonNull
    @Override
    public versionsadapter.VersionVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new VersionVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull versionsadapter.VersionVh holder, int position) {

        Version version= versionList.get(position);
        holder.codeNametxt.setText(version.getCodeName());

        holder.descrioptiontxt.setText(version.getDecription());

        boolean isExpandble = versionList.get(position).isExpandble();
        holder.expandblelayout.setVisibility(isExpandble ? View.VISIBLE : View.GONE);


    }

    @Override
    public int getItemCount() {
        return versionList.size();
    }

    public class VersionVh extends RecyclerView.ViewHolder {

        TextView codeNametxt,versiontxt,apileveltxt,descrioptiontxt;
        LinearLayout linearLayout;
        RelativeLayout expandblelayout;

        public VersionVh(@NonNull View itemView) {
            super(itemView);

            codeNametxt = itemView.findViewById(R.id.code_name);

            descrioptiontxt = itemView.findViewById(R.id.description);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandblelayout = itemView.findViewById(R.id.expandble_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Version version = versionList.get(getAdapterPosition());
                    version.setExpandble(!version.isExpandble());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
