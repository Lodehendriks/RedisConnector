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
 * HMSET key field value [field value ...]
 * 
 * Available since 2.0.0.
 * Time complexity: O(N) where N is the number of fields being set.
 * Sets the specified fields to their respective values in the hash stored at key. This command overwrites any existing fields in the hash. If key does not exist, a new key holding a hash is created.
 * Return value
 * Simple string reply
 * Examples
 * redis> HMSET myhash field1 "Hello" field2 "World"
 * OK
 * redis> HGET myhash field1
 * "Hello"
 * redis> HGET myhash field2
 * "World"
 * redis> 
 */
public class SetHashmapWithObject extends CustomJavaAction<String>
{
	private String key;
	private IMendixObject hashMapObject;

	public SetHashmapWithObject(IContext context, String key, IMendixObject hashMapObject)
	{
		super(context);
		this.key = key;
		this.hashMapObject = hashMapObject;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		RedisConnector redisconnector = new RedisConnector(); 
		return redisconnector.hmset(getContext(), key, hashMapObject);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "SetHashmapWithObject";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
