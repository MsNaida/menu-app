package Entity;

public class Class {

	private int classId;
	private String className;
	
	public Class(int classId, String className) {
		this.setClassId(classId);
		this.setClassName(className);
	}
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	

}
