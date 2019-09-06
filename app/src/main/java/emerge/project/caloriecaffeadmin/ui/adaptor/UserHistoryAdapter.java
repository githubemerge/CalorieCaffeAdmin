package emerge.project.caloriecaffeadmin.ui.adaptor;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import emarge.project.caloriecaffe.model.DietPlan;
import emarge.project.caloriecaffe.model.DietRequest;
import emarge.project.caloriecaffe.model.DietRequestHistory;
import emerge.project.caloriecaffeadmin.R;

import java.util.ArrayList;


/**
 * Created by Himanshu on 4/10/2015.
 */
public class UserHistoryAdapter extends RecyclerView.Adapter<UserHistoryAdapter.MyViewHolder> {


    ArrayList<DietRequestHistory> dietItems;



    public UserHistoryAdapter(ArrayList<DietRequestHistory> item) {
        this.dietItems = item;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_user_history, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        DietRequestHistory dietRequest = dietItems.get(position);

        holder.textRequestid.setText(String.valueOf(dietRequest.getDietPlanRequestID()));
        holder.textAge.setText(String.valueOf(dietRequest.getAge()));
        holder.textGender.setText(dietRequest.getGender());
        holder.textWeight.setText(String.valueOf(dietRequest.getWeight()));
        holder.textHeight.setText(String.valueOf(dietRequest.getHeight()));
        holder.textWaist.setText(String.valueOf(dietRequest.getWaist()));

        holder.textType.setText(dietRequest.getDietTypeName());
        holder.textDate.setText(dietRequest.getDateStamp().substring(0,10));


        holder.webView.getSettings().setJavaScriptEnabled(true);
        holder.webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
            }
        });

        if(dietRequest.getDietPlanList().isEmpty()){
            holder.textError.setVisibility(View.VISIBLE);
            holder.webView.setVisibility(View.GONE);
        }else {
            holder.webView.setVisibility(View.VISIBLE);
            holder.textError.setVisibility(View.GONE);
            holder.webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+dietRequest.getDietPlanList().get(0).getDietPlanImage()+".pdf");
            holder.webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+dietRequest.getDietPlanList().get(0).getDietPlanImage()+".pdf");
        }


        holder.webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.webView.setVisibility(View.VISIBLE);
                holder.webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+dietRequest.getDietPlanList().get(0).getDietPlanImage()+".pdf");
                holder.webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+dietRequest.getDietPlanList().get(0).getDietPlanImage()+".pdf");
            }
        });




    }

    @Override
    public int getItemCount() {
        return dietItems.size();
    }



    class MyViewHolder extends RecyclerView.ViewHolder{



       TextView textRequestid,textAge,textGender,textWeight,textHeight,textWaist,textType,textDate,textError;
        WebView webView;



        public MyViewHolder(View itemView) {
            super(itemView);


            textRequestid= (TextView) itemView.findViewById(R.id.textView_requestid);
            textAge= (TextView) itemView.findViewById(R.id.textView_age);
            textGender= (TextView) itemView.findViewById(R.id.textView_gender);
            textWeight= (TextView) itemView.findViewById(R.id.textView_weight);
            textHeight= (TextView) itemView.findViewById(R.id.textView_height);
            textWaist= (TextView) itemView.findViewById(R.id.textView_waist);
            textType= (TextView) itemView.findViewById(R.id.textView_type);
            textDate= (TextView) itemView.findViewById(R.id.textView_date);


            textError= (TextView) itemView.findViewById(R.id.textView_error);

            webView= (WebView) itemView.findViewById(R.id.webview_history);

        }

    }



}
