package doip.simulation.api;

import java.util.List;

public interface Platform {
	
	public void start();
	
	public void stop();
	
	public String getName();
	
	public ServiceState getState();
	
	public Gateway getGatewayByName(String name);
	
	public List<Gateway> getGateways(); 
}