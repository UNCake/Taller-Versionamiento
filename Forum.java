public class Forum{

	private String name;
	private Date dateCreated;
	private String category;

	public Forum(String name, Date dateCreated, String category){
		this.name = name;
		this.dateCreated = dateCreated;
		this.category = category;
	}

	public String getName(){
		return this.name;
	}
	public Date getDateCreated(){
		return this.dateCreated;
	}
	public String getCategory(){
		return this.category;
	}
	public setName( String name ){
		this.name = name;
	}
	public setDateCreated( Date dateCreated ){
		this.dateCreated = dateCreated;
	}
	public getCategory( String category ){
		this.category = category;
	}

}