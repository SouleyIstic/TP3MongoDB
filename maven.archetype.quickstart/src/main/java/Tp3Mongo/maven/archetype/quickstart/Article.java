package Tp3Mongo.maven.archetype.quickstart;

import java.util.ArrayList;
import java.util.List;

import org.bson.BSONObject;
import org.bson.BasicBSONObject;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
	public class Article {
	@Id
	    private ObjectId objectId;
	    private String name;
	    private int stars;
	    private List<Person> person;

	    public Article() {
	    }

	    Article(String name, int stars) {
	        this.name = name;
	        this.stars = stars;
	        person = new ArrayList<Person>();
	    }

	    public ObjectId getObjectId() {
	        return objectId;
	    }

	    public void setObjectId(ObjectId objectId) {
	        this.objectId = objectId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getStars() {
	        return stars;
	    }

	    public void setStars(int stars) {
	        this.stars = stars;
	    }
	
	    public List<Person> getPerson() {
	        return person;
	    }
	    boolean addPerson(Person pers) {
	        if (pers == null)
	            return false;
	        else
	            person.add(pers);
	        return true;
	    }

	    public void setPerson(List<Person> pers) {
	        person = pers;
	    }

	    BSONObject toBson() {
	        BasicBSONObject res = new BasicBSONObject();
	        res.put("objectId", objectId.toString());
	        res.put("name", name);
	        res.put("stars", stars);
	        BasicBSONObject personBSON = new BasicBSONObject();
	        for (Person pers : person)
	            personBSON.put(pers.getObjectId().toString(), pers.convertToBson());
	        res.put("person", personBSON);
	        return res;
	    }
	    
}
