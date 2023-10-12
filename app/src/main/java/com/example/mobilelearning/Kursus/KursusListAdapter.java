package com.example.mobilelearning.Kursus;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.mobilelearning.R;
import com.example.mobilelearning.Kursus.KursusModel;
import com.example.mobilelearning.fragment.kursus;

import java.util.List;

public class KursusListAdapter extends BaseAdapter {

    private List<KursusModel> kursusModelList;
    private LayoutInflater layoutInflater;
    private ViewHolder holder;
    private TextView textView;


    public KursusListAdapter(Context context , List<KursusModel> kursusModelList){
        kursusModelList = kursusModelList;
        layoutInflater = LayoutInflater.from(context);
    }
    KursusModel kursus = new KursusModel();
    long id = kursus.getId();


    @Override
    public int getCount() {
        return kursusModelList.size();
    }

    @Override
    public KursusModel getItem(int position) {
        return kursusModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return kursusModelList.get(position).getId();
    }

  //  @Override
    public View getView(int position, View convertView, ViewGroup parent ) {


        if (convertView==null){
           convertView = layoutInflater.inflate(R.layout.list_item_kursus, parent,false);
            holder=new ViewHolder() ;
            holder.nameTextView=convertView.findViewById(R.id. kursus);
            holder.descriptionTextView= convertView.findViewById(R.id.text_view_name);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)  convertView.getTag();
        }

        return convertView;
    }
    KursusModel kursusModel = getItem(holder.getAdapterPosition());
//           holder.nameTextView.(kursus.getName());
//           holder.descriptionTextView.setText(kursus.getDescription());


}

