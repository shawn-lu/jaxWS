package ctsjavacoe.ws.fromjava;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {
	@WebMethod
	public String say(String name) {
		return ("Hello: " + name);
	}
}