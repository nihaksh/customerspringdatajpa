package com.cg.customerjparest.util;

import com.cg.customerjparest.exceptions.*;

public class ValidationUtil {

	public static void checkArgumentNotNull(Object arg) {
		if (arg == null) {
			throw new InvalidIdException("Id can't be null");
		}
	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidNameException("name is not valid");
		}

	}


}
