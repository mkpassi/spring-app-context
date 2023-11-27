package beans;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class SpringController {

	private SimpleBean simpleBean;

	public void setSimpleBean(SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}

	@RequestMapping
	@ResponseBody
	public String index(){
		return simpleBean.getHello();
	}
}
