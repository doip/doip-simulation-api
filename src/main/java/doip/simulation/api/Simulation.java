package doip.simulation.api;

public interface Simulation {
	
	public void start();
	
	public void stop();
	
	public Gateway getGatewayByName(String name);
}
