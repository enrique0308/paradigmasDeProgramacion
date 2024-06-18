/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio9;

import java.util.List;

/**
 *
 * @author ENRIQUE
 */
public class Laboratorio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0, -1},
            {0, -1, 0, 0},
            {0, 0, -1, 0},
            {0, -1, 0, 0}
        };

        Robot robot = new Robot();
        List<List<Integer>> paths = robot.findPath(grid);

        if (paths.isEmpty()) {
            System.out.println("No se encontró un camino válido.");
        } else {
            for (List<Integer> path : paths) {
                System.out.print("Camino encontrado: ");
                for (int i = path.size() - 2; i >= 0; i -= 2) {
                    System.out.print("(" + path.get(i) + ", " + path.get(i + 1) + ") ");
                }
                System.out.println();
            }
        }
    }
    
}
