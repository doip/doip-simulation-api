package doip.simulation.api;

import doip.library.util.LookupTable;

/**
 * Represents a ECU in the DoIP Simulation.
 * A ECU contains a lookup table which contains pairs of
 * request and responses of diagnostic messages. Please check documentation
 * for LookupTable. The ECU has two tables. One table, the "configured" table
 * is the table which has been passed to this class when creating a new instance
 * of an ECU. But the lookup table shall be able to be modified during runtime
 * and then have the capability to reset the table to its original version
 * during configuration. Therefore we use a second table called runtime table.
 * At beginning the runtime table is a exact copy of the configuration table. 
 * The runtime table then can be changed. When the function "reset()" will be
 * called, we create a new copy of the original table at configuration time
 * and set this copy as the new runtime table.
 */
public interface Ecu {
	
	public String getNamme();

	/**
	 * Resets the runtime lookup table so that it contains a new
	 * copy of the configuration lookup table.
	 */
	public void reset();

	/**
	 * Returns the lookup table at time of creating a new instance
	 * of the ECU.
	 * @return
	 */
	public LookupTable getConfiguredLookupTable();
	
	public LookupTable getRuntimeLookupTable();
}
