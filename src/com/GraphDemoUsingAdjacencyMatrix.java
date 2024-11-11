package com;

public class GraphDemoUsingAdjacencyMatrix {
	public static void createGraph(int[][] matrix) {
		matrix[0][2] = 1;

		matrix[1][2] = 1;
		matrix[1][3] = 1;

		matrix[2][0] = 1;
		matrix[2][1] = 1;
		matrix[2][3] = 1;

		matrix[3][1] = 1;
		matrix[3][2] = 1;
	}

	public static void main(String[] args) {
		int V = 4; 
		int[][] matrix = new int[V][V]; 

		createGraph(matrix);

		System.out.println("Adjacency Matrix:");
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
