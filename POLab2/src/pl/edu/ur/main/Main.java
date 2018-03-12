package pl.edu.ur.main;

/**
 *
 * @author Tomasz
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7

        //zad.3
        /*
        
        Scanner x = new Scanner (System.in);
        int[] tablica = new int[10];
        int i = 0, y=0;
            System.out.println("Podaj wartości 10 elementów : ");
            for(i=0;i<10;i++){
            System.out.println("Podaj wartość elementu nr: " +i);
            tablica[i] = x.nextInt();
            }
            System.out.println("Co chcesz zrobić: 1.Wyświetlanie tablicy od pierwszego do ostatniego indeksu. 2.Wyświetlanie tablicy od ostatniego do pierwszego indeksu. 3.Wyświetlanie elementów o nieparzystych indeksach. 4.Wyświetlanie elementów o parzystych indeksach.");
            int wybor;
            wybor = x.nextInt();
            switch(wybor){
            case 1: 
             for(y=0;y<10;y++){
             System.out.println("Wartości elementów tablicy od pierwszego do ostatniego:" +tablica[y]);
             }
            break;     
            
            case 2: 
             y=9;
             do {
                    System.out.println("Wartości elementów tablicy od ostatniego do pierwszego:" +tablica[y]);
                    y-- ;
                    }while(y>=0);
                    break;
            case 3:
                y=9;
                do {
                if(y%2!=0){
                System.out.println("Wartość elementów tablicy o nieparzystych indeksach od najwyższego: " +tablica[y]);
                y--;
                }else{
                    y--;
                }
                }while(y>=0);
                break;
                
            case 4:
                y=9;
                do {
                if(y%2==0){
                System.out.println("Wartość elementów tablicy o parzystych indeksach od najwyższego: " +tablica[y]);
                y--;
                }else{
                    y--;
                }
                }while(y>=0);
                break;
                
            default:
                    System.out.println("Błędna wartość podaj numer działania od 1 do 4");
                    break;  
            }  
         */
        //zad.4
        /*
        
        Scanner x = new Scanner (System.in);
        int[] tablica = new int[10];
        int i = 0, y=0;
            System.out.println("Podaj wartości 10 elementów : ");
            for(i=0;i<10;i++){
            System.out.println("Podaj wartość elementu nr: " +i);
            tablica[i] = x.nextInt();
            }
            System.out.println("Co chcesz zrobić: 1.Obliczyć sumę elementów tablicy. 2.Obliczyć iloczyn elementów tablicy. 3.Wyznaczyć wartość średnią. 4.Wyznaczyć wartość minimalną. 5.Wyznaczyć wartość maksymalną");
            int wybor,suma=0;
            wybor = x.nextInt();
            switch(wybor){
                case 1:
                for(y=0;y<10;y++){
                    suma+=tablica[y];
                }
                System.out.println("Suma elementów tablicy wynosi:" +suma);
                break;
                case 2:
                    int iloczyn = 1;
                    for(y=0;y<10;y++){
                        iloczyn=iloczyn*tablica[y];
                    }
                        System.out.println( "Iloraz elementów tablicy wynosi: " +iloczyn);
                        break;
                case 3:
                    int srednia=0;
                    for(y=0;y<10;y++){
                         srednia=srednia+tablica[y];
                    }
                    System.out.println("Średnia wartość elementów tabliczy wynosi: " +(srednia/10));
                    break;
                case 4:
                    int min=0;
                    min=tablica[0];
                        for(int i=0;i<10;i++){
                            if(min>tablica[y]){
                                min=tablica[y];
                            }
                        }
                        System.out.println("Minimalna wartość elementów tablicy wynosi: " +min);
                        break;
                case 5:
                    int max=0;
                    max=tablica[0];
                    for(y=0;y<10;y++){
                            if(max<tablica[y]){
                                max=tablica[y];
                            }
                        }
                        System.out.println("Maksymalna wartość wynosi: " +max); 
                        break;
            }

         */
        //zad.6
        /*
        Scanner x = new Scanner (System.in);
                int a;
                while(true){
                    System.out.println("Podaj liczbe całkowitą: ");
                    a=x.nextInt();
                    if(a<0){
                       break;
                    }
                }

         */
        //zad.7
        /*
        
        System.out.println("Ile liczb chcesz podać : ");
        Scanner x = new Scanner (System.in);
        int l=x.nextInt();
        int b;
                int[] tablica = new int[l];
                for(b=0;b<l;b++){
                    System.out.println("Podaj "+(b+1)+" liczbe: ");
                    tablica[b]=x.nextInt();
                }
                System.out.println(" ");
                int z=1;  
                int p; 
                while(z>0){
                    z=0;
                    for(b=0;b<l-1;b++){
                        if(tablica[b]>tablica[b+1]){
                            p=tablica[b+1];
                            tablica[b+1]=tablica[b];
                            tablica[b]=p;
                            z++;
                        }
                    }
                }
                for(b=0;b<l;b++){
                    System.out.println(tablica[b]+" ");
                }

         */
    }
}
