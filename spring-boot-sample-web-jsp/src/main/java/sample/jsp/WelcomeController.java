package sample.jsp;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(HttpServletRequest request,Map<String, Object> model) {
        invlidateSession(request);
		model.put("time", new Date());
		model.put("message", this.message);
		return "hello";
	}

	@RequestMapping(value = "/home")
	public String home(HttpServletRequest request,Map<String, Object> model) {
        invlidateSession(request);
		model.put("time", new Date());
		model.put("message", this.message);
		return "login";
	}

    private void invlidateSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if(session!=null)
            session.invalidate();
    }

    @RequestMapping("/createotp")
	public String test(Map<String, Object> model) {

		return "hello";
	}


}
