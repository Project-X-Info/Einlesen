package graph;

public class Node {
	private double y;
	private double x;
	private int nodeId;
	private boolean visited;

	public Node(int nodeId, double y, double x) {
		this.y = y;
		this.x = x;
		this.nodeId = nodeId;
		visited = false;
	}

	public double getY() {
		return y;
	}

	public double getX() {
		return x;
	}

	public int getNodeId() {
		return nodeId;
	}

	public void setVisited(Boolean visited) {
		this.visited = visited;
	}

	public Boolean getVisited() {
		return visited;
	}

}
