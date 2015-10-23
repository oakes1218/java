package Grade;

public class Student implements IStudent{

	private String name;
	private int score;
	private int id; 
	@Override
	public String getName() {	
		return name;
	}

	@Override
	public void setName(String name) {		
		this.name = name;
	}

	@Override
	public Integer getScore() {
		return score;
	}
	@Override
	public void setScore(Integer score) {
		this.score = score ;
	}

	@Override
	public Integer getId() {	
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}


}
