package Entity;

public class Class {

	private int classId;
	private int teacherId;
	private int studentId;
	private String className;
	
	public Class(int classId, int teacherId, int studentId, String className) {
		this.setClassId(classId);
		this.setTeacherId(teacherId);
		this.setStudentId(studentId);
		this.setClassName(className);
	}
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	

}
