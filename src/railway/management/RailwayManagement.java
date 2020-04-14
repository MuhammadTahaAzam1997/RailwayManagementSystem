/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.management;
import java.util.Scanner;
/**
 *
 * @author Muhammad Taha Azam
 */
public class RailwayManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int choice=0;
  
        Scanner obj=new Scanner(System.in);
    
    
    while(choice !=5){
         System.out.println("---------------------------------------------------------------------------------------------------------------------");
        
         System.out.println("Press: \n 1- TrainSchedule & Departure  \n 2- Seat Reservation \n 3- Loading and Uploading your goods \n 4-Waiting Lounge \n 5- Exit");
         System.out.println("---------------------------------------------------------------------------------------------------------------------\n\n");
         choice =obj.nextInt();
    
        if(choice==1){
        TrainSchedule obj1=new TrainSchedule();
        obj1.showSchedule();
        obj1.Departure();
        }
        
        else if(choice ==2){
        SeatReservation obj2=new SeatReservation();
        obj2.Destination();
        obj2.Seat();    
        }
        else if(choice ==3){
        LoadingandUnloading obj3=new LoadingandUnloading();
        obj3.Goods();
        }
        else if(choice==4){
        Waitinglounge obj4=new Waitinglounge();
        obj4.lounge();
        }
    
    }
    }
}
