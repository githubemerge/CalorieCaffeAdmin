package emerge.project.caloriecaffeadmin.ui.adaptor;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import emarge.project.caloriecaffe.model.DietCard;
import emarge.project.caloriecaffe.model.DietRequest;
import emerge.project.caloriecaffeadmin.R;


/**
 * Created by Himanshu on 4/10/2015.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {


    ArrayList<DietCard> dietItems;

    public CardAdapter(ArrayList<DietCard> item) {
        this.dietItems = item;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_card, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        if(dietItems.isEmpty()){

        }else {
            DietCard dietCard = dietItems.get(position);



           holder.textCardcode.setText(dietCard.getPaymentCardCode());
            holder.textSerialnumber.setText(dietCard.getPaymentCardSerialNumber());
            holder.textName.setText(dietCard.getFullName());

            if(dietCard.getDietPlanRequestStatus()){
                holder.textStatus.setText("Submit");
            }else {
                holder.textStatus.setText("Pending");
            }

            holder.textDate.setText(dietCard.getDateStamp());
        }



    }

    @Override
    public int getItemCount() {
        return dietItems.size();
    }



    class MyViewHolder extends RecyclerView.ViewHolder{
       TextView textCardcode,textSerialnumber,textName,textStatus,textDate;
        public MyViewHolder(View itemView) {
            super(itemView);

            textCardcode= (TextView) itemView.findViewById(R.id.textView_cardcode);
            textSerialnumber= (TextView) itemView.findViewById(R.id.textView_cardserialnumber);
            textName= (TextView) itemView.findViewById(R.id.textView_name);
            textStatus= (TextView) itemView.findViewById(R.id.textView_cardstatus);
            textDate= (TextView) itemView.findViewById(R.id.textView_date);




        }

    }



}
