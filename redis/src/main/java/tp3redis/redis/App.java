package tp3redis.redis;

import redis.clients.jedis.Jedis;

public class App 
{
	
	//Exemple1:Crée un client
	/*public static void main( String[] args )
	{
		Jedis jedis = new Jedis("localhost");
		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		
		System.err.println(value);	
	}*/
	
	//======================================================================
	
	//Exemple2:on incremente un compteur 
		
	/*public static void main(String[] args) {
	Jedis jedis = new Jedis("localhost");
	System.out.println(jedis.get("counter"));
	jedis.incr("counter");
	System.out.println(jedis.get("counter"));
}*/

//======================================================================
	
	//Exemple 3: Cree un client pendant en certain temps 
	
	/*public static void main(String[] args) throws InterruptedException {
		String cacheKey = "cachekey";
		Jedis jedis = new Jedis("localhost");
		// adding a new key
		jedis.set(cacheKey, "cached value");
		// setting the TTL in seconds
		jedis.expire(cacheKey, 15);
		// Getting the remaining ttl
		System.out.println("TTL:" + jedis.ttl(cacheKey));
		Thread.sleep(1000);
		System.out.println("TTL:" + jedis.ttl(cacheKey));
		// Getting the cache value
		System.out.println("Cached Value:" + jedis.get(cacheKey));

		// Wait for the TTL finishs
		Thread.sleep(15000);

		// trying to get the expired key
		System.out.println("Expired Key:" + jedis.get(cacheKey));
	}
*/
	//Exemple 4:
	
	//Ajoute des cles -->caches keys 
	
	public static void main(String[] args) {
		String cacheKey = "languages";
		Jedis jedis = new Jedis("localhost");
		// Adding a set as value

		jedis.sadd(cacheKey, "Java");
		jedis.sadd(cacheKey, "C#");
		jedis.sadd(cacheKey, "Python");// SADD

		// Getting all values in the set: SMEMBERS
		System.out.println("Languages: " + jedis.smembers(cacheKey));
		// Adding new values
		jedis.sadd(cacheKey, "Java");
		jedis.sadd(cacheKey, "Ruby");
		// Getting the values... it doesn't allow duplicates
		System.out.println("Languages: " + jedis.smembers(cacheKey));

	}


	

}