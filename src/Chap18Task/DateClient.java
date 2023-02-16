package Chap18Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("클라이언트 > 날짜 서버의 IP 주소는 ? ");
        String serverAddress = in.nextLine();
        try (Socket client = new Socket(serverAddress, 9000);
             BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));) {
            String answer = br.readLine();
            System.out.println(answer);
        } catch (Exception e) {
        }
    }
}