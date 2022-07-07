package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component // this is to mark a class as bean
public class Swift implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Hatchback from suzuki";
	}

}
