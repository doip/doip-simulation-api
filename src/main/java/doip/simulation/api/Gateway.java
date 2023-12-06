package doip.simulation.api;

import java.io.IOException;
import java.util.List;

import doip.library.exception.DoipException;

public interface Gateway {

	public void start() throws DoipException;
	
	public void stop();
	
	public ServiceState getState();
	
	public String getName();
	
	public Ecu getEcuByName(String name);
	
	public List<Ecu> getEcus();

}









