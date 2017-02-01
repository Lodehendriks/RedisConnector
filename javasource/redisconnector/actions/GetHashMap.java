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
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * HMGET key field [field ...]
 * 
 * Available since 2.0.0.
 * Time complexity: O(N) where N is the number of fields being requested.
 * Returns the values associated with the specified fields in the hash stored at key.
 * For every field that does not exist in the hash, a nil value is returned. Because a non-existing keys are treated as empty hashes, running HMGET against a non-existing key will return a list of nil values.
 * Return value
 * Array reply: list of values associated with the given fields, in the same order as they are requested.
 * redis> HSET myhash field1 "Hello"
 * (integer) 1
 * redis> HSET myhash field2 "World"
 * (integer) 1
 * redis> HMGET myhash field1 field2 nofield
 * 1) "Hello"
 * 2) "World"
 * 3) (nil)
 * redis> 
 */
public class GetHashMap extends CustomJavaAction<IMendixObject>
{
	private String key;
	private IMendixObject objectToReturn;

	public GetHashMap(IContext context, String key, IMendixObject objectToReturn)
	{
		super(context);
		this.key = key;
		this.objectToReturn = objectToReturn;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		RedisConnector redisconnector = new RedisConnector(); 
		return redisconnector.hmget(getContext(), key, objectToReturn);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetHashMap";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
