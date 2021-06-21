/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class ThreadRunnable implements Runnable {
    public void run(){
       try{
            for(int i=0;i<=10;i++){
           
           System.out.println("Thread Running :"+i);
        }  
       
       }
       catch(Exception e){
        System.out.println("Error");
       }
    
    }
    
}
