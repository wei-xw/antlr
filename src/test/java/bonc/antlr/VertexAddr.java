package bonc.antlr;

public class VertexAddr {
	String vertexId;
	int x;
	int y;
	int lengh;
	int width;
	boolean isExpand;

	public VertexAddr(String vertexId, int x, int y, int lengh, int width, boolean isExpand) {
		this.vertexId = vertexId;
		this.x = x;
		this.y = y;
		this.lengh = lengh;
		this.width = width;
		this.isExpand = isExpand;
	}
}
