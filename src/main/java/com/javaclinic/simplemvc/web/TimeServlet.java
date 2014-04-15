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

/**
 * 
 * This servlet processes all requests coming through "/time" URL. All GET requests will be
 * processed by doGet() method, whereas other HTTP request will be processed by the parent
 * class HttpServlet doXXXX() methods - implemented as noop.
 * 
 * @author nevenc
 *
 */
@WebServlet("/time")
public class TimeServlet extends HttpServlet {

	private static final long serialVersionUID = 1807697493198672150L;
	
	private static final Logger LOGGER = Logger.getLogger(TimeServlet.class.getCanonicalName());

	private TimeService service;
	
	/*
	 * Constructor.
	 */
    public TimeServlet() {
    	LOGGER.info("Inside " + this.getClass().getSimpleName() + "() constructor method. Instantiating servlet.");
    }
    
    /*
     * Initialization of the servlet. Executed only once.
     * We can initialize(instantiate) our backend service here.
     * 
     * (non-Javadoc)
     * @see javax.servlet.GenericServlet#init()
     */
    @Override
    public void init() throws ServletException {
    	LOGGER.info("Inside " + this.getClass().getSimpleName() + ".init() initialization method. Initializing servlet.");
    	service = new TimeServiceImpl();
    }

    /*
     * Implementing doGet() service processing method. This method gets called everytime servlet processes
     * GET HTTP requests.
     * 
     * (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	LOGGER.info("Inside " + this.getClass().getSimpleName() + ".doGet() service method. Processing GET request.");
    	
    	// Call backend service
    	Date now = service.getCurrentDate();
    	
    	// Bind results of the backend service to request, so we can see it in the view.
    	request.setAttribute("NOW", now);
    	
    	// Forward request to a view
    	request.getRequestDispatcher("/WEB-INF/views/time.jsp").forward(request, response);
    	
    }


}
