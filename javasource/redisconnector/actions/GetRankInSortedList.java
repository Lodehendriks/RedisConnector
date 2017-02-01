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
 * Returns the rank of member in the sorted set stored at key, with the scores ordered from low to high. The rank (or index) is 0-based, which means that the member with the lowest score has rank 0.
 */
public class GetRankInSortedList extends CustomJavaAction<Long>
{
	private String key;
	private String member;
	private redisconnector.proxies.Enum_Sort sort;

	public GetRankInSortedList(IContext context, String key, String member, String sort)
	{
		super(context);
		this.key = key;
		this.member = member;
		this.sort = sort == null ? null : redisconnector.proxies.Enum_Sort.valueOf(sort);
	}

	@Override
	public Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		RedisConnector redisconnector = new RedisConnector(); 
		return redisconnector.zrank(key,member, sort);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetRankInSortedList";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
