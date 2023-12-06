package doip.simulation.api;

import java.util.List;

import doip.library.exception.DoipException;

public interface Platform {
	
	public void start() throws DoipException;
	
	public void stop();
	
	public String getName();
	
	public ServiceState getState();
	
	public Gateway getGatewayByName(String name);
	
	public List<Gateway> getGateways(); 
}