/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joueurscanner;


import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class JoueurScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
         System.out.println("saisir le type de menu(1,2,3,4 ou 5)");
         
        try{
            System.out.println("1->-----ajouter les joueursFoot");
            System.out.println("2->-----ajouter les joueursRugby");
            System.out.println("3->-----ajouter les joueursHandBall");
            System.out.println("4->-----afficher les équipes");
            System.out.println("5->-----quitter");
           
        
            int typeJoueur = 0;
            String valeur = "";
            
            List<Joueur> listeJoueurs = new ArrayList<Joueur>();
            
            
                
                while(sc.hasNextInt()){
                    
                    typeJoueur = sc.nextInt();
                    if (typeJoueur == 5) break;
                    
                    switch(typeJoueur)
                {
                    case 1 : ajouter_Joueur (listeJoueurs,new JoueurFoot());
                    break;
                    
                    case 2 : ajouter_Joueur (listeJoueurs,new JoueurRugby());
                    break;
                    
                    case 3 : ajouter_Joueur (listeJoueurs,new JoueurHandBall());
                    break;
                    
                    case 4 : afficherEquipes (listeJoueurs);
                    break;
                    
                    default : System.out.println("Erreur try again");
                }
                }
               // valeur = sc.next();
               // typejoueur = Integer.parseInt(valeur);
                
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void ajouter_Joueur(List<Joueur> listeJoueurs,Joueur oj) throws Exception{
        String temp;
        int valtemp = 0;
        
        System.out.println("Vous créez un joueur");
       
        Scanner hc = new Scanner(System.in);
           
        System.out.println("entrez votre nom");
        
        temp = hc.next();
        
        oj.setNom(temp);
        
        System.out.println("entrez votre prenom");
        
        temp = hc.next();
        
        oj.setPrenom(temp);
        
        System.out.println("entrez un mot de passe");
        
          temp = hc.next();
            
           while(temp.length()<=2){
               
               System.out.println("le mot de passe doit contenir plus de 2 caractères");
               
               temp = hc.next();
           }
        oj.setMdp(temp);
        
        System.out.println("entrez un pseudo");
        
        temp = hc.next();
        
        oj.setPseudo(temp);
        
        System.out.println("entrez votre sexe (m ou f)");
        
       temp = hc.next();
        
        while(!temp.equalsIgnoreCase("m")&&!temp.equalsIgnoreCase("f")){
            
            System.out.println("vous devez choisir le sexe de votre joueur (m ou f");
            
             temp = hc.next();
    }
        oj.setGenre(temp);
        
        System.out.println("entrez votre age");
        
        while(!hc.hasNextInt()){
            
            System.out.println("mettre votre âge en chiffre(s)");
            
            hc.next();
            
        }
        temp = hc.next();
        int age = Integer.parseInt(temp);
        
        oj.setAge(age);
        
        // Si le joueur a au moins 12 ans, je l'ajoute à ma liste, sinon je ne l'ajoute pas.
        // if ( ) {  } else {   }
        
        if(age>=12) listeJoueurs.add(oj);
        else System.out.println("tu es trop jeune ah ah ah ah ");
    }
    public static void afficherEquipes(List<Joueur> listeJoueurs)throws Exception{
        System.out.println("afficher les equipes");
        
    }
        
}


