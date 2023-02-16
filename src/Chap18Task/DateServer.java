package Chap18Task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {


    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(9000);
             Socket connection = ss.accept();
             PrintWriter pw = new PrintWriter(connection.getOutputStream(), true);
             ) {
            pw.println("서버 > " + new Date().toString());
        } catch (Exception e) {
        }
    }
}
