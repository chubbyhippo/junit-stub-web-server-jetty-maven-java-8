package stub;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class TestHandler extends AbstractHandler {
	@Override
	public void handle(String target, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// Declare response encoding and types
		response.setContentType("text/html; charset=utf-8");

		// Declare response status code
		response.setStatus(HttpServletResponse.SC_OK);

		// Write back response
		response.getWriter().print("<h1>It works</h1>");

		// Inform jetty that this request has now been handled
		baseRequest.setHandled(true);	
	}
}
