package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        ArrayList<Socket> clients = new ArrayList<>();
ArrayList<String> userNames= new ArrayList<>();
        Socket socket = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("INFO: Сервер запущен");
            while (true){
                socket = serverSocket.accept(); // Ожидаем клиента
                DataInputStream in = new DataInputStream(socket.getInputStream()); // Поток ввода
                DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // Поток вывода
                System.out.println("Клиент подключился");
                clients.add(socket); //Добавляем клиента в список
                Thread thread = new Thread(new Runnable() { // Открываем поток для клиента
                    @Override
                    public void run() {
                        try {
                            out.writeUTF("Введите имя :");
                            String userName =in.readUTF();
                            userNames.add(userName);
                            while (true){
                                System.out.println("Ожидаем сообщение...");
                                String request = in.readUTF();
                                System.out.println(userName+" прислал сообщение: "+request);
                                for (Socket socket: clients) { // Перебираем список клиентов
                                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                                    out.writeUTF(userName+": "+request);
                                }
                            }
                        }catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
