package doip.simulation.api;

import java.util.List;

public interface Gateway {

	public void start();
	
	public void stop();
	
	public ServiceState getState();
	
	public String getName();
	
	public Ecu getEcuByName(String name);
	
	public List<Ecu> getEcus();

}









