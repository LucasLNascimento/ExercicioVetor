/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolarvetor;

import java.io.DataInputStream;
import java.io.IOException;


public class EscolarVetor {


    public static void main(String[] args) throws IOException{
        String s = "";
        float nota = 0, media = 0;
        float[] notas = new float[4];
        float somaNotas = 0;
        DataInputStream dado;
        
        for(int i = 0; i < notas.length; i++){
            System.out.println("Informe as quatro notas: " + (i+1));
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            nota = Float.parseFloat(s);
            notas[i] = nota;
            somaNotas += nota;
        }
        
        media = (somaNotas) / notas.length;
        int frequencia = 0;
        System.out.println("Informe sua presença: ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        frequencia = Integer.parseInt(s);
        
        if(media >= 7 && frequencia >= 75){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("Sua frequência foi de " + frequencia + "%" + " e sua média foi " + media);
    }
}
