
package com.techlabs.inheritance;

import com.techlabs.interfaces.IEmotion;
import com.techlabs.interfaces.IManner;

public class Boy implements IManner, IEmotion {

	@Override
	public void cry() {
		System.out.println("Boy is crying");
		
	}

	@Override
	public void laugh() {
		System.out.println("Boy is laughing");
		
	}

	@Override
	public void wish() {
		System.out.println("Boy is wishing");
		
	}

	@Override
	public void depart() {
		System.out.println("Boy is departing");
		
	}

}
