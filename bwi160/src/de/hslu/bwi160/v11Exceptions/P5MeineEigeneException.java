package de.hslu.bwi160.v11Exceptions;

public class P5MeineEigeneException
		extends java.lang.Exception {

	private static final long serialVersionUID = 1L;

	public P5MeineEigeneException(){
		super("Da hat doch echt wieder " +
				"so ein Hanswurst versucht," +
				" durch Null zu teilen!");
	}

	public P5MeineEigeneException(String message){
		super(message);
	}

}
