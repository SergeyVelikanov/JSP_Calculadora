package com;

import java.io.Serializable;

public class MyBean implements Serializable{
	private static final long serialVersionUID=-3549460069605616059L;
	private String operacion,operando1,operando2,resultado="0.0";
	private String aux;

	public MyBean(){

	}

	/**
	 * @return the operacion
	 */
	public String getOperacion(){
		return operacion;
	}

	/**
	 * @param operacion
	 *            the operacion to set
	 */
	public void setOperacion(String operacion){
		if(operacion==null)
			this.operacion="";
		else
			this.operacion=operacion;

	}

	/**
	 * @return the operando1
	 */
	public String getOperando1(){
		return operando1;
	}

	/**
	 * @param operando1
	 *            the operando1 to set
	 */
	public void setOperando1(String operando1){
		if(operando1==null)
			this.operando1="";
		else{
			aux=operando1.replace(',','.');
			this.operando1=aux;
		}
	}

	/**
	 * @return the operando2
	 */
	public String getOperando2(){
		return operando2;
	}

	/**
	 * @param operando2
	 *            the operando2 to set
	 */
	public void setOperando2(String operando2){
		if(operando2==null)
			this.operando2="";
		else{

			aux=operando2.replace(',','.');
			this.operando2=aux;
		}
	}

	/**
	 * @return the resultado
	 */
	public String getResultado(){
		try{
			if(!operando1.equals("")&&!operando2.equals("")){

				if(operacion.equalsIgnoreCase("sumar"))
					resultado=String.valueOf((Float.valueOf(operando1))+(Float.valueOf(operando2)));

				else if(operacion.equalsIgnoreCase("restar"))
					resultado=String.valueOf((Float.valueOf(operando1))-(Float.valueOf(operando2)));

				else if(operacion.equalsIgnoreCase("multiplicar"))
					resultado=String.valueOf((Float.valueOf(operando1))*(Float.valueOf(operando2)));

				else if(operacion.equalsIgnoreCase("dividir")){
					if(Float.valueOf(operando2)!=0)
						resultado=String.valueOf((Float.valueOf(operando1))/(Float.valueOf(operando2)));
					else
						resultado="Division por \"0\" !!!";
				}

			}

		}catch(Exception e){
			resultado="Corregir operando(s)";
		}
		return resultado;
	}

	/**
	 * @param resultado
	 *            the resultado to set
	 */
	public void setResultado(String resultado){
		this.resultado=resultado;
	}

	/**
	 * @return the aux
	 */
	public String getAux(){
		return aux;
	}

	/**
	 * @param aux
	 *            the aux to set
	 */
	public void setAux(String aux){
		this.aux=aux;
	}
}