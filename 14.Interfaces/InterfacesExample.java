/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author USER
 */
class phone{
    void call(){
        System.out.println("Call any specific Contacts.");
    }
    void sms(){
        System.out.println("Please send a message to this Number.");
    }
}
interface camera{
    void click();
    void record();
    
}
interface MusicPlayer{
    void play();
    void pause();
    void stop();
}
class smartPhone extends phone implements camera,MusicPlayer{
    void Videocall(){
        System.out.println("Please Make a video call.");
    }
    public void click(){
        System.out.println("Please select the Desired function.");
    }
    @Override
    public void record(){
        System.out.println("Recording the desired thing.");
    }
    @Override
    public void play(){
        System.out.println("Play The Player.");
    }
    @Override
    public void pause(){
        System.out.println("Pause the Player.");
    }
    @Override
    public void stop(){
        System.out.println("Stop the Player.");
    }
}
public class InterfacesExample {
    public static void main(String[] args) {
        smartPhone s=new smartPhone();
        System.out.println("------\"smartPhone\" type object can only call these functions.-----");
        s.Videocall();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
        
        phone p=s;
        System.out.println("------\"Phone\" type object can only call these functions.-----");
        p.call();
        p.sms();
        
        camera c=s;
        System.out.println("------\"camera\" type object can only call these functions.-----");
        c.click();
        c.record();
        
        MusicPlayer m=s;
        System.out.println("------\"MusicPlayer\" type object can only call these functions.-----");
        m.play();
        m.pause();
        m.stop();
    }
    
}
