package de.cau.ffi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionServlet;

/**
 * @author Andre van Hoorn and Florian Fittkau
 */
public class DispatcherServlet extends ActionServlet {
	private static final long serialVersionUID = -7057146298514124495L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,
			ServletException {
		super.doGet(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		super.doPost(request, response);
	}

	@Override
	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// CPUUtilizationIncreaser.doDummyWork();
		super.process(request, response);
	}
}
