package renderEngine;

public class Model {
	public int vaoID;
	public int vertexCount;
	
	public Model(int vaoID, int vertexCount) {
		this.vaoID = vaoID;
		this.vertexCount=vertexCount;
	}

	public int getVaoID() {
		return vaoID;
	}

	public int getVertexCount() {
		return vertexCount;
	}

}
