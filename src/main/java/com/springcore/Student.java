package com.springcore;

/**
 *
 * @author hashstudioz
 */
public class Student {

    private int stdId;
    private String stdName, stdAddress;

    public int getStdId() {
    
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
    System.out.println("call set");
        this.stdName = stdName;
    }

    public String getStdAddress() {
    	System.out.println("Call setter");
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }

    public Student(int stdId, String stdName, String stdAddress) {
        super();
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdAddress = stdAddress;
        
    }

    public Student(String stdName) {
		super();
		this.stdName = stdName;
		System.out.println("constructor");
	}

	public Student() {
		   super();
		System.out.println("hahahah");
     
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", stdName=" + stdName + ", stdAddress=" + stdAddress + '}';
    }

}
