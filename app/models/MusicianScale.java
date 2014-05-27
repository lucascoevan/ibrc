package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.binding.As;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class MusicianScale extends Model {
	@Required
	@ManyToOne
	Scale scale;

	@Required
	String reference;

	String member;

	@As(lang = { "*" }, value = { "yyyy-MM-dd hh:mm:ss" })
	public Date creationDate;


	public String toString() {
		return reference;
	}
}
