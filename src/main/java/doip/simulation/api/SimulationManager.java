package doip.simulation.api;

import java.util.List;

public interface SimulationManager {

	public void start(String platform);
	
	public void start(String platform, String host);
	
	public void stop();
	
	public Platform getPlatformByName(String name);
	
	public List<Platform> getPlatforms();
}