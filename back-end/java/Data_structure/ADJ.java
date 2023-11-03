package Data_structure;

public class ADJ {
	private boolean adjMatrix[][];
	private int numVertices;

	// Add edges
	public void addEdge(int i, int j) {
	 adjMatrix[i][j] = true;
	 adjMatrix[j][i] = true;
	}

	// Remove edges
	public void removeEdge(int i, int j) {
	 adjMatrix[i][j] = false;
	 adjMatrix[j][i] = false;
	}
	public String toString() {
		 StringBuilder s = new StringBuilder();
		 for (int i = 0; i < numVertices; i++) {
		   s.append(i + ": ");
		   for (boolean j : adjMatrix[i]) {
		     s.append((j ? 1 : 0) + " ");
		   }
		   s.append("\n");
		 }
		 return s.toString();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
