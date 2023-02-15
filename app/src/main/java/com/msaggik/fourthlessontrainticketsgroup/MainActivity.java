package com.msaggik.fourthlessontrainticketsgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.msaggik.fourthlessontrainticketsgroup.model.RailwayTicket;
import com.msaggik.fourthlessontrainticketsgroup.model.RailwayTicketChild;
import com.msaggik.fourthlessontrainticketsgroup.model.RailwayTicketGrandparents;

public class MainActivity extends AppCompatActivity {


    RailwayTicket railwayTicket = new RailwayTicket(70, 9);

    RailwayTicket railwayTicketChild = new RailwayTicketChild(70, 11, 50);

    RailwayTicket railwayTicketGrandparents = new RailwayTicketGrandparents(70,5,30);


    private TextView railwayTicketOut;
    private TextView railwayTicketChildOut;

    private TextView railwayTicketGrandparentsOut;
    private TextView railwayTicketTotalOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        railwayTicketOut = findViewById(R.id.railwayTicketOut);
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut);
        railwayTicketGrandparentsOut = findViewById(R.id.railwayTicketGrandparentsOut);
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut);


        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceAll()) + " монет");

        railwayTicketChildOut.setText(Float.toString(railwayTicketChild.ticketPriceAll()) + " монет");
        railwayTicketGrandparentsOut.setText(Float.toString(railwayTicketGrandparents.ticketPriceAll()) + " монет");

        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll()) + " монет");

    }
}