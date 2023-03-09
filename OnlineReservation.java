import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
 class OnlineReservation
 {
 
   public static void main(String args[])
   { 
    int res=0,login=0;
     while (true)
     {
         String train,tickets,pnr,choice;
        JOptionPane.showMessageDialog(null,"Choose an option for operation:\n1.Login\n2.Reservation\n3.Cancellation\n4.Exit");
        choice=JOptionPane.showInputDialog(null,"Select your choice:");
     int val=Integer.parseInt(choice);    
     int val1,val2;
     String  starting, destination;
     switch(val)
     {
       
      case 1:
         String name,mail,password;
         JOptionPane.showMessageDialog(null,"Enter Login credentials");
         name=JOptionPane.showInputDialog(null,"Enter name");
         mail=JOptionPane.showInputDialog(null,"Enter mail id");
         password=JOptionPane.showInputDialog(null,"Enter password");
         JOptionPane.showMessageDialog(null,"You've logged in successfully");
         login=1;
         break;
       case 2:
         if(login==1)
         {
          JOptionPane.showMessageDialog(null,"Enter details for reservation");
          String stations[]={"Bangalore","Mysore","Ooty","Kollegal","Hyderabad","Vijayawada","Rajuhmandry","Eluru","Vizag"}; 
          JOptionPane.showMessageDialog(null,"Available stations ");
          String s="";
          for(int I=0;I<stations.length;I++)
           {
            s += stations[I] + " \n "; 
           }
           JOptionPane.showMessageDialog(null,s);
           starting=JOptionPane.showInputDialog(null,"Enter starting station");
           destination=JOptionPane.showInputDialog(null,"Enter destination");
           train=JOptionPane.showInputDialog("Enter train number");
           val1=Integer.parseInt(train); 
           tickets=JOptionPane.showInputDialog(null,"Enter number of tickets");
           val2=Integer.parseInt(tickets); 
           JOptionPane.showMessageDialog(null,"Your tickets has been booked successfully");
           res=1;
         }
         else
         {
            JOptionPane.showMessageDialog(null,"You haven't logged");
         }
         break;
      case 3:
         if(res==1)
         {
            JOptionPane.showMessageDialog(null,"Enter train  details for cancellation");
            train=JOptionPane.showInputDialog("Enter train number");
            pnr=JOptionPane.showInputDialog(null,"Enter your PNR number");
            int val3=Integer.parseInt(pnr);
            val1=0;
            starting=null;
            destination=null;
            val2=0;
            JOptionPane.showMessageDialog(null,"Your tickets has been cancelled successfully with PNR:"+pnr);
         }
         else
         {
            JOptionPane.showMessageDialog(null,"You haven't booked any ticket");
         }
         break;
      case 4:
         System. exit(0);
         break;
         
         }
       }  
         
   }
 }
