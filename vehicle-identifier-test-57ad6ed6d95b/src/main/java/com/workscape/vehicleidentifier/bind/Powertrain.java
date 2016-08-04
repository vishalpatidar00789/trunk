package com.workscape.vehicleidentifier.bind;

import java.io.Serializable;

import com.workscape.vehicleidentifier.constants.Powertrains;

public class Powertrain implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8521474821572715924L;
	
	private String human;
	private String internalCombustion;
	private String bernoulli;
	
	public Powertrain() {
		super();
	}
	
	public Powertrain(String human, String internalCombustion, String bernoulli) {
		super();
		this.human = human;
		this.internalCombustion = internalCombustion;
		this.bernoulli = bernoulli;
	}

	public String getHuman() {
		if(null== human || "".equals(human)){
			return Powertrains.HUMAN;
		}
		return human;
	}

	public void setHuman(String human) {
		if(null== human || "".equals(human)){
			this.human =  Powertrains.HUMAN;
		}
		this.human = human;
	}

	public String getInternalCombustion() {
		if(null== internalCombustion || "".equals(internalCombustion)){
			return Powertrains.INTERNALCOMBUSTION;
		}
		return internalCombustion;
	}

	public void setInternalCombustion(String internalCombustion) {
		if(null== internalCombustion || "".equals(internalCombustion)){
			this.internalCombustion =  Powertrains.INTERNALCOMBUSTION;
		}
		this.internalCombustion = internalCombustion;
	}

	public String getBernoulli() {
		if(null== bernoulli || "".equals(bernoulli)){
			return Powertrains.BERNOULLI;
		}
		return bernoulli;
	}

	public void setBernoulli(String bernoulli) {
		if(null== bernoulli || "".equals(bernoulli)){
			this.bernoulli =  Powertrains.BERNOULLI;
		}
		this.bernoulli = bernoulli;
	}
}
