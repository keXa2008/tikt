package com.aboba.tikt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText userId = findViewById(R.id.userId);
        EditText depPlace = findViewById(R.id.depPlace);
        TimePicker depTime = findViewById(R.id.depTime);
        depTime.setIs24HourView(true);
        EditText arrivalPlace = findViewById(R.id.arrivalPlace);
        TimePicker arrivalTime = findViewById(R.id.arrivalTime);
        arrivalTime.setIs24HourView(true);
        EditText ticketCost = findViewById(R.id.ticketCost);
        Button placeOrderButton = findViewById(R.id.placeOrderButton);
        placeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TicketOrder ticketOrder = new TicketOrder(Integer.parseInt(String.valueOf(userId.getText())),
                        depPlace.getText().toString(), depTime.getHour(), depTime.getMinute(),
                        arrivalPlace.getText().toString(), arrivalTime.getHour(),
                        arrivalTime.getMinute(),
                        Integer.parseInt(String.valueOf(ticketCost.getText())));
                Intent intent = new Intent(getApplicationContext(), yayActivity.class);
                intent.putExtra(TicketOrder.class.getSimpleName(), ticketOrder);
                startActivity(intent);
            }
        });
    }
}