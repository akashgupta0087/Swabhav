package com.techlabs.factorymethod;

public class TeslaFactory implements IAutoFactory{
	
	private static TeslaFactory factory;
	
	private TeslaFactory() {
	}

	@Override
	public IAutomobile make() {
		return new Tesla();
	}

	public static IAutoFactory getInstance() {
		if(factory == null)
			return factory = new TeslaFactory();
		return null;
	}

}
