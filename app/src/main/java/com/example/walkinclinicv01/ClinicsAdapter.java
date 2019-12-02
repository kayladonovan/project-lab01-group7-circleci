package com.example.walkinclinicv01;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ClinicsAdapter extends RecyclerView.Adapter<ClinicsAdapter.ClinicViewHolder>  {

    private Context mContext;
    private List<Clinic> clinicList;

    public ClinicsAdapter(Context mContext, List<Clinic> clinicList) {
        this.mContext = mContext;
        this.clinicList = clinicList;
    }


    @Override
    public ClinicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.activity_clinics_adapter, parent, false);
        return new ClinicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClinicViewHolder holder, int position) {
        Clinic clinic = clinicList.get(position);

        holder.textViewName.setText("Name: " + clinic.info.getName());
        holder.textViewAddress.setText("Address: " +clinic.info.getAddress());
        holder.textViewStartTime.setText("Open: " +clinic.day.getOpen());
        holder.textViewEndTime.setText("Close: " +clinic.day.getClosed());
        holder.textViewService.setText("Service: " +clinic.service.getServiceName());

    }
    @Override
    public int getItemCount() {
        return clinicList.size();
    }

    class ClinicViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewAddress, textViewDay, textViewStartTime, textViewEndTime, textViewService;


        public ClinicViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewAddress = itemView.findViewById(R.id.address);
            textViewName = itemView.findViewById(R.id.name);
            textViewDay = itemView.findViewById(R.id.day);
            textViewStartTime = itemView.findViewById(R.id.startTime);
            textViewEndTime = itemView.findViewById(R.id.endTime);
            textViewService = itemView.findViewById(R.id.service);
        }
    }
}
