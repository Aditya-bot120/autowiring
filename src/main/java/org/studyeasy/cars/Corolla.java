package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("myCorolla") /*
						 * we need not to include the name cause this component scan has a default name
						 * which name of class with all lowercase letters
						 * 
						 * if we give a custom name themn it overrides the default name
						 */
public class Corolla implements Car {

	@Autowired
	Engine engine;

	@Override

	public String specs() {
		// TODO Auto-generated method stub
		String specs = "Sedan from corolla with engine type as " + engine.type;
		return specs;
	}

}
