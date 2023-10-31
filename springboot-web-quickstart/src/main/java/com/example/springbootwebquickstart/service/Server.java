package com.example.springbootwebquickstart.service;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/28
 * @version: 1.0
 */
public class Server {
    /**
     * @author Jie.
     * @description: TODO
     * @date 2023/10/28
     * @version: 1.0
     */
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(8080);//监听指定端口
        System.out.println("服务器启动成功，监听端口：8080");

        while (true){
            Socket sock = ss.accept();
            System.out.println("接收到客户端连接：" + sock);

            Thread t = new Handler(sock);
            t.start();
        }
    }
}

class Handler extends Thread{
    Socket sock;

    public Handler(Socket sock){
        this.sock = sock;
    }
    public void run(){
        try(InputStream input = this.sock.getInputStream();
            OutputStream output = this.sock.getOutputStream()){
            handler(input, output);
        }catch (Exception e){
            try{
                this.sock.close();
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
            System.out.println("client disconnected.");
        }
    }
    private void handler(InputStream input, OutputStream output) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));

        //读取http请求
        boolean requertOK = false;
        String first = reader.readLine();
        if(first.startsWith("GET / HTTP/1.")){
            requertOK = true;
        }

        for (;;){
            String header = reader.readLine();
            if(header.isEmpty()){//读取到空行时，HTTP Header读取完毕
                break;
            }
            System.out.println(header);
        }
        System.out.println(requertOK ? "Response OK" : "Response Error");
        if (!requertOK){
            //发送错误响应
            writer.write("HTTP/1.0 404 Not Found\r\n");
            writer.write("Content-Length: 0\r\n");
            writer.write("\r\n");
            writer.flush();
        }else {
            //发送成功响应
            InputStream is = Server.class.getResourceAsStream("/static/a.html");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuilder data = new StringBuilder();
            String line = null;
            while ((line = br.readLine()) != null){
                data.append(line);
            }
            br.close();
            int lenth= data.toString().getBytes(StandardCharsets.UTF_8).length;

            writer.write("HTTP/1.0 200 OK\r\n");
            writer.write("Connection: close\r\n");
            writer.write("Content-Type: text/html\r\n");
            writer.write("Content-Length: " + lenth + "\r\n");
            writer.write("\r\n");
            writer.write(data.toString());
            writer.flush();
        }
    }
}
















