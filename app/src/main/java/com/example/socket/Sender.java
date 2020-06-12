package com.example.socket;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.DataOutputStream;

public class Sender extends AsyncTask<String, Void, Void> {

    Socket s;
    DataOutputStream dos;
    PrintWriter pw;

    @Override
    protected Void doInBackground(String... voids) {
        String message = voids[0];
        try{
            s = new Socket("172.19.119.22", 6000);
            pw = new PrintWriter(s.getOutputStream());
            pw.write(message);
            pw.flush();
            pw.close();
            s.close();
        }

        catch (IOException e){
            e.printStackTrace();
        }




        return null;
    }
}
