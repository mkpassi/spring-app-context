package beans;

import org.springframework.stereotype.Component;



@Component
public class SimpleBean3 {

	public SimpleBean3() {
		System.out.println(getClass().getSimpleName() + "::constructor");
	}


}
