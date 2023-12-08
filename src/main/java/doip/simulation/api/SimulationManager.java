package doip.simulation.api;

import java.util.List;

import doip.library.exception.DoipException;

public interface SimulationManager {

	public void start(String platform) throws DoipException;
	
	// public void start(String platform, String host);
	
	public void stop(String platform);
	
	public Platform getPlatformByName(String name);
	
	public List<Platform> getPlatforms();
}