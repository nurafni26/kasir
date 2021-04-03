package com.tugasday1.kasir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etkodebarang,etjumlahbarang;
    private Button btnkalkulasi;
    private TextView tvnamabarang,tvhargabarang,tvtotalharga,tvdiscount,tvjumlahbayar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nurafnisyahfiti);
        etkodebarang =(EditText) findViewById(R.id.kodebarang);
        etjumlahbarang =(EditText) findViewById(R.id.jumlahbarang);
        btnkalkulasi=(Button) findViewById(R.id.tombol1);
        tvnamabarang =(TextView) findViewById(R.id.namabarang);
        tvhargabarang =(TextView) findViewById(R.id.hargabarang);
        tvtotalharga =(TextView) findViewById(R.id.totalharga);
        tvdiscount =(TextView) findViewById(R.id.discount);
        tvjumlahbayar =(TextView) findViewById(R.id.jumlahbayar);

        btnkalkulasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.tombol1) {
            String kodebarang = etkodebarang.getText().toString().trim();
            String jumlahbarang = etjumlahbarang.getText().toString().trim();
            String hargabarang = tvhargabarang.getText().toString().trim();
            String totalharga = tvtotalharga.getText().toString().trim();

            int hargaAND = 1000000;
            int hargaIOS = 2000000;
            int hargaBLB = 1750000;
            int hargaWNP = 2500000;

            double total = Double.valueOf(jumlahbarang) * Double.valueOf(hargabarang);
            double disc = Double.valueOf(totalharga) * 20 / 100;
            double jumlah = Double.valueOf(totalharga) * Double.valueOf(disc);

            if (kodebarang == "AND"){
                tvnamabarang.setText("Nama Barang : Android");
                tvhargabarang.setText("Harga Barang :" + hargaAND);
                tvtotalharga.setText("Total Harga :" + total);
                tvdiscount.setText("Discount :" + disc);
                tvjumlahbayar.setText("Jumlah Bayar :" + jumlah);
            } else if (kodebarang == "IOS"){
                tvnamabarang.setText("Nama Barang : Apple");
                tvhargabarang.setText("Harga Barang :" + hargaIOS);
                tvtotalharga.setText("Total Harga :" + total);
                tvdiscount.setText("Discount :" + disc);
                tvjumlahbayar.setText("Jumlah Bayar :" + jumlah);
            }else if (kodebarang == "BLB"){
                tvnamabarang.setText("Nama Barang : Black Berry");
                tvhargabarang.setText("Harga Barang :" + hargaBLB);
                tvtotalharga.setText("Total Harga :" + total);
                tvdiscount.setText("Discount :" + disc);
                tvjumlahbayar.setText("Jumlah Bayar :" + jumlah);
            }else {
                tvnamabarang.setText("Nama Barang : Windows Phone");
                tvhargabarang.setText("Harga Barang :" + hargaWNP);
                tvtotalharga.setText("Total Harga :" + total);
                tvdiscount.setText("Discount :" + disc);
                tvjumlahbayar.setText("Jumlah Bayar :" + jumlah);
            }


        }
    }
}
