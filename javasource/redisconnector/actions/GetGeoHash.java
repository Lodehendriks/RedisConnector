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
 * Return valid Geohash strings representing the position of one or more elements in a sorted set value representing a geospatial index (where elements were added using GEOADD).
 * Normally Redis represents positions of elements using a variation of the Geohash technique where positions are encoded using 52 bit integers. The encoding is also different compared to the standard because the initial min and max coordinates used during the encoding and decoding process are different. This command however returns a standard Geohash in the form of a string as described in the Wikipedia article and compatible with the geohash.org web site.
 */
public class GetGeoHash extends CustomJavaAction<String>
{
	private String key;
	private String member;

	public GetGeoHash(IContext context, String key, String member)
	{
		super(context);
		this.key = key;
		this.member = member;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		RedisConnector redisconnector = new RedisConnector(); 
		return redisconnector.geohash(key, member);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetGeoHash";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
