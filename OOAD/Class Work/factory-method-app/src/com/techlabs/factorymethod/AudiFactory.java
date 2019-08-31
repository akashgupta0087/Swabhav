package com.techlabs.factorymethod;

public class AudiFactory implements IAutoFactory {
		
		private static AudiFactory factory;
		
		private AudiFactory() {
		}

		@Override
		public IAutomobile make() {
			return new Audi();
		}

		public static IAutoFactory getInstance() {
			if(factory == null)
				return factory = new AudiFactory();
			return null;
		}
		
}
