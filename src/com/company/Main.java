package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        pedal ped = new pedal(null);
        button ba = new button(1);
        pianino pi = new pianino(ped,ba);
        pi.addbutt(ba);
        pi.addPed(ped);
        pi.pressbutton(ba);
        pi.nastroyka();
        pi.presspedal(ped);
    }
}
class pianino {
    List<pedal> pedals = new ArrayList<>() ;
    List<button> buttons = new ArrayList<>();
    void nastroyka(){
        System.out.println("пианино настроено");
    }
    void addPed(pedal pedal){
        pedals.add(pedal);
    }
    void addbutt(button button){
        buttons.add(button);
    }
    void presspedal(pedal pedal){
        try {
            if(pedal.name == Integer.parseInt(null)){
            }
            System.out.println("Нажата педаль: "+pedal.name);
        } catch (Exception e) {
            System.out.println("Требуется дать номер педали для работы");
        }
    }
    void pressbutton(button button){
        try {
            if(button.name == Integer.parseInt(null)){
            }
            System.out.println("Нажата клавиша: "+button.name);
        } catch (Exception e) {
            System.out.println("Требуется дать номер клавишы для работы");
        }
    }
    pianino(pedal pedals, button buttons){
        this.pedals.add(pedals);
        this.buttons.add(buttons) ;
    }
}
class button{
    int name;
    public button(int number){
        this.name=number;
    }
}
class pedal{
    int name;
    pedal(Integer name){
    }
    public void setName(int name) {
        this.name = name;
    }
}
