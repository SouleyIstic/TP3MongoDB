package Tp3Mongo.maven.archetype.quickstart;

import java.util.List;

import org.bson.BSONObject;
import org.bson.BasicBSONObject;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Person {
	@Id
	    private ObjectId Id;
	    private String name;
	    private Address address;
	   

	    Person() {

	    }

	    public Person(String name) {
	        this.name = name;
	    }

	    ObjectId getObjectId() {
	        return Id;
	    }

	    public void setObjectId(ObjectId objectId) {
	        this.Id = objectId;
	    }

	    void createAddress(String street, String city, String postCode, String country) {
	        address = new Address(street, city, postCode, country);
	    }

	    public void createAddress(Address address) throws CloneNotSupportedException {
	        this.address = Address.copy(address);
	    }

	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    public String getName() {
	        return name;
	    }

	    void setName(String name) {
	        this.name = name;
	    }

	    BSONObject convertToBson() {
	        BasicBSONObject res = new BasicBSONObject();
	        if (Id != null)
	            res.put("objectId", Id.toString());
	        res.put("name", name);
	        res.put("address", address.toBson());
	        return res;
	    }
	    
}
