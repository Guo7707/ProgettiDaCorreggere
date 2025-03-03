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
public class queque {

    int Scelta;

    pazienti cliente = new pazienti();

    public void gestionecoda() {
        do {

            System.out.println("premere 1 per aggiungere una persona alla coda");
            System.out.println("premere 2 per servire il cliente ");
            System.out.println("premere 3 per stamapa dalla coda");
            System.out.print("Scelta: ");
            Scanner scan = new Scanner(System.in);
            Scelta = scan.nextInt();
            scan.nextLine();

            switch (Scelta) {
                case 1:
                    cliente.aggiungiPersona();

                    break;

                case 2:
                    cliente.ServiPersona();

                    break;
                case 3:
                    cliente.stampacoda();

                    break;
                default:
                    System.out.println("scelta non corretta");

            }

        } while (Scelta != 4);
    }
}
