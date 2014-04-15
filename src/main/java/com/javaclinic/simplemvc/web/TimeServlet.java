package com.javaclinic.simplemvc.web;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaclinic.simplemvc.services.TimeService;
import com.javaclinic.simplemvc.services.TimeServiceImpl;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(TimeServlet.class.getCanonicalName());
  
	private static final long serialVersionUID = 1L;
	
	private TimeService service = new TimeServiceImpl();
	
    public TimeServlet() {
    	LOGGER.info("Inside " + this.getClass().getSimpleName() + "() constructor method. Instantiating servlet.");
    }
    
    @Override
    public void init() throws ServletException {
    	LOGGER.info("Inside " + this.getClass().getSimpleName() + ".init() initialization method. Initializing servlet.");
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	LOGGER.info("Inside " + this.getClass().getSimpleName() + ".doGet() service method. Processing GET request.");
    	
    	Date now = service.getCurrentDate();
    	request.setAttribute("NOW", now);
    	request.getRequestDispatcher("/WEB-INF/views/time.jsp").forward(request, response);
    	
    }


}
