/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettodacorreggere;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class pazienti {
    
    private String nome; 
  
    private int posizione;
    pazienti[] array = new pazienti[10];
    private int contatore = 0;
    Scanner input = new Scanner(System.in);
    private int priorità;
   

    public pazienti() {
    }

    public pazienti(String nome, int posizione, int priorità) {
        this.nome = nome;
        this.posizione = posizione;
        this.priorità = priorità;
    }

    public void aggiungiPersona() {
        if (contatore < array.length) {
            System.out.print("Inserisci il nome: ");
            nome = input.nextLine();
            priorità = (int)(Math.random() * 3 + 1); 
            
            pazienti persona = new pazienti(nome, posizione + 1, priorità);
            array[contatore] = persona;
            contatore++;
            posizione = contatore;
           
        } else {
            System.out.println("La coda e' piena!");
        }
    }

    public void ServiPersona() {
        if (contatore == 0) {
            System.out.println("La coda e' vuota");
        } else {
            System.out.println("La prima persona della coda e' stata servita");
            for (int i = 0; i < contatore; i++) {
                for (int j = i + 1; j < contatore; j++) {
                    if (array[i].priorità > array[j].priorità) {
                        pazienti temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            for (int i = 0; i < contatore ; i++) {
                array[i].posizione = i;  //CORREZIONE
                array[i] = array[i + 1];
                
                
            }
          
            contatore--;
        }
    }
             
        

    public void stampacoda() {
        if (contatore == 0) {
            System.out.println("la coda e' vuota");
          
        } else {
            System.out.println("coda : ");
            for (int i = 0; i < contatore; i++) {
                System.out.println(array[i]); 
            }
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Paziente: " + nome + ", posizione: " + posizione + ",emergenza" + priorità;
    }
}