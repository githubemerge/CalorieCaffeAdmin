package emerge.project.caloriecaffeadmin.ui.adaptor;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import emarge.project.caloriecaffe.model.DietRequest;

import emerge.project.caloriecaffeadmin.R;
import emerge.project.caloriecaffeadmin.model.DietRequestJava;

import java.util.ArrayList;


/**
 * Created by Himanshu on 4/10/2015.
 */
public class PendingsAdapter extends RecyclerView.Adapter<PendingsAdapter.MyViewHolder> {


    ArrayList<DietRequest> dietItems;
    private ClickListener clickListener;

    public PendingsAdapter(ArrayList<DietRequest> item,ClickListener clic) {
        this.dietItems = item;
        clickListener = clic;
    }




    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_pendings, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        if(dietItems.isEmpty()){

        }else {
           // DietRequest dietRequest = dietItems.get(position);

            DietRequest dietRequest = dietItems.get(position);


            holder.textRequestid.setText(String.valueOf(dietRequest.getDietPlanRequestID()));
            holder.textAge.setText(String.valueOf(dietRequest.getAge()));
            holder.textGender.setText(dietRequest.getGender());
            holder.textWeight.setText(String.valueOf(dietRequest.getWeight())+" Kg");
            holder.textHeight.setText(String.valueOf(dietRequest.getHeight())+" Inch");
            holder.textWaist.setText(String.valueOf(dietRequest.getWaist())+" Inch");

            holder.textType.setText(dietRequest.getDietTypeName());
            holder.textDate.setText(dietRequest.getDateStamp().substring(0,10));


           holder.textUsername.setText(dietRequest.user.getFullName());
           holder.textEmail.setText(dietRequest.user.getEmail());


            holder.textCode.setText(dietRequest.getPaymentCardCode());
            holder.textSerial.setText(dietRequest.getPaymentCardSerialNumber());


            holder.mainLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onPendingRequestClick(v,position);
                }
            });
            holder.fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onFabClick(v,position);
                }
            });
        }



    }

    @Override
    public int getItemCount() {
        return dietItems.size();
    }

    public interface ClickListener {
        void onPendingRequestClick(View v, int position);
        void onFabClick(View v, int position);
    }


    class MyViewHolder extends RecyclerView.ViewHolder{


       RelativeLayout mainLayout;
       TextView textRequestid,textAge,textGender,textWeight,textHeight,textWaist,textType,textDate,textUsername,textEmail,textCode,textSerial;
        FloatingActionButton fab;


        public MyViewHolder(View itemView) {
            super(itemView);
            mainLayout= (RelativeLayout) itemView.findViewById(R.id.relativeLayout_main2);

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

        }

    }



}
