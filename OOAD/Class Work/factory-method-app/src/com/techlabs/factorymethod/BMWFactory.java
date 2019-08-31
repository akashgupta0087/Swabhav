package com.techlabs.factorymethod;

public class BMWFactory implements IAutoFactory{
	
	private static BMWFactory factory;
	
	private BMWFactory() {
	}

	@Override
	public IAutomobile make() {
		return new BMW();
	}

	public static IAutoFactory getInstance() {
		if(factory == null)
			return factory = new BMWFactory();
		return null;
	}
	

}
