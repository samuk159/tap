/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyweight;

import java.awt.Color;

/**
 *
 * @author samuk159
 */
public class Main {
    public static void main(String[] args) {
        final int TAMANHO_TELA = 500;
        final int N_ARVORES = 1_000_000;
        final int TIPOS = 2;
        
        Floresta floresta = new Floresta();
        for (int i = 0; i < Math.floor(N_ARVORES / TIPOS); i++) {
            floresta.plantar(
                random(0, TAMANHO_TELA), random(0, TAMANHO_TELA), 
                "Carvalho verão", Color.GREEN
            );
            floresta.plantar(
                random(0, TAMANHO_TELA), random(0, TAMANHO_TELA), 
                "Carvalho outono", Color.ORANGE
            );
        }
        floresta.setSize(TAMANHO_TELA, TAMANHO_TELA);
        floresta.setVisible(true);
        
        System.out.println(N_ARVORES + " árvores desenhadas");
        System.out.println("---------------------");
        System.out.println("Uso de memória:");
        System.out.println("Arvore (8 bytes) * " + N_ARVORES);
        System.out.println("+ Tipo arvore (~30 bytes) * " + TIPOS + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((N_ARVORES * 8 + TIPOS * 30) / 1024 / 1024) +
                "MB (ao invés de " + ((N_ARVORES * 38) / 1024 / 1024) + "MB)");
    }
    
    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
