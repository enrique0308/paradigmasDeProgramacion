/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio9;

/**
 *
 * @author ENRIQUE
 */
import java.util.*;

public class Robot {

    // Método para encontrar el camino desde (0, 0) a (r-1, c-1)
    public List<List<Integer>> findPath(int[][] grid) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        if (dfs(grid, 0, 0, visited, path, result)) {
            result.add(new ArrayList<>(path)); // Guarda la ruta encontrada
        }
        
        return result;
    }

    // Función recursiva para buscar la ruta usando DFS
    private boolean dfs(int[][] grid, int row, int col, boolean[][] visited, List<Integer> path, List<List<Integer>> result) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Verifica si llegamos a la esquina inferior derecha
        if (row == rows - 1 && col == cols - 1) {
            path.add(row);
            path.add(col);
            return true;
        }
        
        // Marca la celda actual como visitada
        visited[row][col] = true;
        
        // Movimiento hacia la derecha
        if (col + 1 < cols && !visited[row][col + 1] && grid[row][col + 1] != -1) {
            if (dfs(grid, row, col + 1, visited, path, result)) {
                path.add(row);
                path.add(col);
                return true;
            }
        }
        
        // Movimiento hacia abajo
        if (row + 1 < rows && !visited[row + 1][col] && grid[row + 1][col] != -1) {
            if (dfs(grid, row + 1, col, visited, path, result)) {
                path.add(row);
                path.add(col);
                return true;
            }
        }
        
        // Si no se puede avanzar en ninguna dirección, retrocede
        visited[row][col] = false;
        return false;
    }

    
}

