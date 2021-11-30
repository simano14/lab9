/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import bai3.Server_Thread;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author phamv
 */
public class Server_Thread extends Thread {

    /**
     * @param args the command line arguments
     */
    ServerSocket mServer;
    JTextArea mTxaStatus;
    public Server_Thread(JTextArea txaStatus)
    {
        mTxaStatus = txaStatus;
    }
    @Override
    public void run() 
    {
        try
        {
            String so1,so2,so3, so4, so5, so6; 
            int tong,hieu,nhan,chia;            
            mServer = new ServerSocket(1234); 
            mTxaStatus.append("Server đã sẵn sàng!\nĐang chờ dữ liệu...\n\n");
            while(true)
            { 
                Socket connectionSocket = mServer.accept(); 
                DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream()); 
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream()); 
                so1 = inFromClient.readLine(); 
                so2 = inFromClient.readLine(); 
                mTxaStatus.append("Đã nhận 2 số a = " + so1 +", b = "+ so2 +"\n");
                int a = Integer.parseInt(so1); 
                int b = Integer.parseInt(so2);
                
                tong = a + b;
                so3 = String.valueOf(tong);
                mTxaStatus.append("Thực hiện phép tính a + b\n");
                outToClient.writeBytes(so3 + '\n');

                /*hieu = a - b;
                so3 = String.valueOf(hieu);
                mTxaStatus.append("Thực hiện phép tính a - b\n");
                outToClient.writeBytes(so3+'\n');
                
                nhan = a * b;
                so3 = String.valueOf(nhan);
                mTxaStatus.append("Thực hiện phép tính a * b\n");
                outToClient.writeBytes(so3+'\n');
                
                chia = a / b;
                so3 = String.valueOf(chia);
                mTxaStatus.append("Thực hiện phép tính a / b\n");
                outToClient.writeBytes(so3+'\n');
                mTxaStatus.append("Đã gửi kết quả về cho Client thành công\n\n");*/
            }
            
        }
        catch(Exception ex)
        {
            System.Logger.getLogger(Server_Thread.class.getName()).log(System.Logger.Level.SEVERE, null, ex);
            mTxaStatus.append("Server đã xảy ra lỗi\n");
        }
    }
    public void StopServer()
    {
        super.stop();
        try 
        {
            mServer.close();
        } 
        catch (IOException ex) 
        { 
            System.Logger.getLogger(Server_Thread.class.getName()).log(System.Logger.Level.SEVERE,null, ex);
        }
    }    
}
