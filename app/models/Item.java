package	models;	
import	java.util.*;	
import	javax.persistence.*;	
import	play.db.ebean.*;	
import	play.data.format.*;	
import	play.data.validation.*;	
@Entity
public	class	Item	extends	Model	{	
	@Id	
	public	Long	id;	
	public	String	title;	
	public	String	author;	
	public	String	body;	
	

	public	static	Finder<Long,Item>	find	=	new	Finder<Long,Item>(	Long.class,	Item.class);	

	public static List<Item> page(){
		return find.all();
	}
}	