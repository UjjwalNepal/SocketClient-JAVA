/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Ujjwal
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String serverAddress = JOptionPane.showInputDialog("Enter the ip address of the machine that is \n"+ "running the date service on port 8080:");
        Socket s = new Socket(serverAddress,8080);
        
        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String answer = input.readLine();
        JOptionPane.showMessageDialog(null, answer);
        System.exit(0);
    }
    
}
