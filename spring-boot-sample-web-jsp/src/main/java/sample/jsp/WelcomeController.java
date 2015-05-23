package sample.jsp;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "hello";
	}

	@RequestMapping("/home")
	public String home(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "login";
	}
//    @RequestMapping(value = "/logout",method = RequestMethod.POST)
//    public String logout(Map<String, Object> model) {
//        return "logout";
//    }
    @RequestMapping("/errorlogin")
    public String error(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "error";
    }
	@RequestMapping("/createotp")
	public String test(Map<String, Object> model) {

		return "hello";
	}

	@RequestMapping("/foo")
	public String foo(Map<String, Object> model) {
		throw new RuntimeException("Foo");
	}

}
