package com.aboba.tikt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class yayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yay);
        TextView ticketInfo = findViewById(R.id.ticketInfo);
        Button newOrderButton = findViewById(R.id.newOrderButton);
        Bundle bundleIntent = getIntent().getExtras();
        TicketOrder ticketOrder =(bundleIntent!=null)
                ? (TicketOrder) bundleIntent.getSerializable(TicketOrder.class.getSimpleName())
                : null;
        newOrderButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
        ticketInfo.setText("ID: " + ticketOrder.getUserId() +
                "\nМесто отправки:  " + ticketOrder.getDepPlace() +
                "\nВремя отправки:\n" + ticketOrder.getDepHour() + ":" +
                ((ticketOrder.getDepMinute()/10==0)?"0":"")+ticketOrder.getDepMinute() +
                "\nМесто прибытия:  " + ticketOrder.getArrivalPlace() +
                "\nВремя прибытия:\n" +
                        ticketOrder.getArrivalHour() + ":" +
                ((ticketOrder.getArrivalMinute()/10==0)?"0":"") + ticketOrder.getArrivalMinute() +
                        "\nСтоимость:   " + ticketOrder.getTicketCost() + " руб.");
    }
}