// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package redisconnector.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import redisconnector.impl.RedisConnector;

/**
 * GEOADD key longitude latitude member [longitude latitude member ...]
 * 
 * Available since 3.2.0.
 * Time complexity: O(log(N)) for each item added, where N is the number of elements in the sorted set.
 * Adds the specified geospatial items (latitude, longitude, name) to the specified key. Data is stored into the key as a sorted set, in a way that makes it possible to later retrieve items using a query by radius with the GEORADIUS or GEORADIUSBYMEMBER commands.
 * The command takes arguments in the standard format x,y so the longitude must be specified before the latitude. There are limits to the coordinates that can be indexed: areas very near to the poles are not indexable. The exact limits, as specified by EPSG:900913 / EPSG:3785 / OSGEO:41001 are the following:
 * Valid longitudes are from -180 to 180 degrees.
 * Valid latitudes are from -85.05112878 to 85.05112878 degrees.
 * The command will report an error when the user attempts to index coordinates outside the specified ranges.
 * Note: there is no GEODEL command because you can use ZREM in order to remove elements. The Geo index structure is just a sorted set.
 */
public class AddGeoPosition extends CustomJavaAction<Boolean>
{
	private String key;
	private java.math.BigDecimal latitude;
	private java.math.BigDecimal longitude;
	private String name;

	public AddGeoPosition(IContext context, String key, java.math.BigDecimal latitude, java.math.BigDecimal longitude, String name)
	{
		super(context);
		this.key = key;
		this.latitude = latitude;
		this.longitude = longitude;
		this.name = name;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		RedisConnector redisconnector = new RedisConnector();        
		redisconnector.geoadd(key, latitude.doubleValue(), longitude.doubleValue(), name);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "AddGeoPosition";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
