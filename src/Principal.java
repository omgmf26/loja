
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABORATORIO_INFO
 */
public class Principal {
  
   public static void main(String[] args){  
       
          Carro carro2 = new Carro();
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Nome: ");
   carro2.nome = scan.next ();
   
   System.out.print("Marca: ");
   carro2.cor = scan.next ();
   
   System.out.print("Cor: ");
   carro2.cor = scan.next ();
   
   System.out.print("Fabricação: ");
   carro2.cor = scan.next ();
   
   System.out.print("Largura(mm): ");
   carro2.cor = scan.next ();
   
   System.out.print("Peso(kg): ");
   carro2.cor = scan.next ();
   
      System.out.println("\n");
      
      Carro carro = new Carro();  
      carro.nome = "Carrera GT";
      carro.marca = "Porsche";
      carro.cor = "Cinza";
      carro.fabricacao = "2004";
      carro.largura = "1915mm";
      carro.peso = "1380kg";
      
      System.out.println("Nome: "+carro.nome);
      System.out.println("Marca: "+carro.marca);
      System.out.println("Cor: "+carro.cor);
      System.out.println("Fabricação: "+carro.fabricacao);
      System.out.println("Largura: "+carro.largura);
      System.out.println("Peso: "+carro.peso);
     
      System.out.println("\n");
        
      Carro carro1 = new Carro();  
      carro1.nome = "Sesto Elemento";
      carro1.marca = "Lamborghini";
      carro1.cor = "Preto";
      carro1.fabricacao = "2010";
      carro1.largura = "1900mm";
      carro1.peso = "999kg";
      
      System.out.println("Nome: "+carro1.nome);
      System.out.println("Marca: "+carro1.marca);
      System.out.println("Cor: "+carro1.cor);
      System.out.println("Fabricação: "+carro1.fabricacao);
      System.out.println("Largura: "+carro1.largura);
      System.out.println("Peso: "+carro1.peso);
      
      

   
   
   
   
}

}