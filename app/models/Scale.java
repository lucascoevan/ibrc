package models;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Scale extends Model {
	@Required
	public String scaleName;
	
	public boolean active;

	public String toString() {
		return scaleName;
	}

}
