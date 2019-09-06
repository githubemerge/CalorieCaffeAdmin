package emerge.project.caloriecaffeadmin.ui.adaptor;


import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import emarge.project.caloriecaffe.model.DietRequest;
import emerge.project.caloriecaffeadmin.R;

import java.util.ArrayList;


/**
 * Created by Himanshu on 4/10/2015.
 */
public class CompleteAdapter extends RecyclerView.Adapter<CompleteAdapter.MyViewHolder> {


    ArrayList<DietRequest> dietItems;
    private ClickListener clickListener;

    public CompleteAdapter(ArrayList<DietRequest> item) {
        this.dietItems = item;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_pendings, parent, false);
        return new MyViewHolder(itemView);
    }


    @SuppressLint("RestrictedApi")
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        DietRequest dietRequest = dietItems.get(position);

       holder.textRequestid.setText(String.valueOf(dietRequest.getDietPlanRequestID()));
        holder.textAge.setText(String.valueOf(dietRequest.getAge()));
        holder.textGender.setText(dietRequest.getGender());
        holder.textWeight.setText(String.valueOf(dietRequest.getWeight())+" Kg");
        holder.textHeight.setText(String.valueOf(dietRequest.getHeight())+" Inch");
        holder.textWaist.setText(String.valueOf(dietRequest.getWaist())+" Inch");

        holder.textType.setText(dietRequest.getDietTypeName());
        holder.textDate.setText(dietRequest.getDateStamp().substring(0,10));
        holder.textUsername.setText(dietRequest.user.fullName);
        holder.textEmail.setText(dietRequest.user.email);


        holder.textCode.setText(dietRequest.getPaymentCardCode());
        holder.textSerial.setText(dietRequest.getPaymentCardSerialNumber());



        holder.fab.setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {
        return dietItems.size();
    }

    public interface ClickListener {
        void onPendingRequestClick(View v, int position);
    }
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


       CardView cardView;
       TextView textRequestid,textAge,textGender,textWeight,textHeight,textWaist,textType,textDate,textUsername,textEmail,textCode,textSerial;
        FloatingActionButton fab;


        public MyViewHolder(View itemView) {
            super(itemView);
            cardView= (CardView) itemView.findViewById(R.id.card_view);

            textRequestid= (TextView) itemView.findViewById(R.id.textView_requestid);
            textAge= (TextView) itemView.findViewById(R.id.textView_age);
            textGender= (TextView) itemView.findViewById(R.id.textView_gender);
            textWeight= (TextView) itemView.findViewById(R.id.textView_weight);
            textHeight= (TextView) itemView.findViewById(R.id.textView_height);
            textWaist= (TextView) itemView.findViewById(R.id.textView_waist);
            textType= (TextView) itemView.findViewById(R.id.textView_type);
            textDate= (TextView) itemView.findViewById(R.id.textView_date);
            textUsername= (TextView) itemView.findViewById(R.id.textView_username);
            textEmail= (TextView) itemView.findViewById(R.id.textView_email);


            textCode= (TextView) itemView.findViewById(R.id.textView_cardcode);
            textSerial= (TextView) itemView.findViewById(R.id.textView_cardSerial);



            fab = (FloatingActionButton)itemView.findViewById(R.id.floatingActionButton);

            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null) {
                clickListener.onPendingRequestClick(view, getAdapterPosition());
            }
        }
    }



}
