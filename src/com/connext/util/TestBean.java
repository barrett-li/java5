package com.connext.util;

public class TestBean {
	
	public static final String flagA = "flagA";
	
	public static String getStr(){
		return "fuck you";
	}
	
	private int intA;
	
	private float floatB;
	
	private byte byteC;
	
	private short shortD;
	
	private long longE;
	
	private double doubleF;
	
	
	
	public int getIntA() {
		return intA;
	}

	public void setIntA(int intA) {
		this.intA = intA;
	}

	public float getFloatB() {
		return floatB;
	}

	public void setFloatB(float floatB) {
		this.floatB = floatB;
	}

	public byte getByteC() {
		return byteC;
	}

	public void setByteC(byte byteC) {
		this.byteC = byteC;
	}

	public short getShortD() {
		return shortD;
	}

	public void setShortD(short shortD) {
		this.shortD = shortD;
	}

	public long getLongE() {
		return longE;
	}

	public void setLongE(long longE) {
		this.longE = longE;
	}

	public double getDoubleF() {
		return doubleF;
	}

	public void setDoubleF(double doubleF) {
		this.doubleF = doubleF;
	}

	public char getCharG() {
		return charG;
	}

	public void setCharG(char charG) {
		this.charG = charG;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public TestInnerBean gettIBean() {
		return tIBean;
	}

	public void settIBean(TestInnerBean tIBean) {
		this.tIBean = tIBean;
	}

	public String getStrA() {
		return strA;
	}

	public void setStrA(String strA) {
		this.strA = strA;
	}

	public String[] getStrArray() {
		return strArray;
	}

	public void setStrArray(String[] strArray) {
		this.strArray = strArray;
	}

	private char charG;
	
	private boolean flag;
	
	private TestInnerBean tIBean;
	
	private String strA;
	
	private String[] strArray;

}
