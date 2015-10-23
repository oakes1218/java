import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Person {
	int age ;
	String name;
	ArrayList<String> hobby = new ArrayList<String>();
	Set<Person> children = new HashSet<Person>();
	Map<String, Integer> experince = new HashMap<String, Integer>(); 
	
	public Person(int age, String name,ArrayList<String> hobby , Map<String, Integer> experince, Set<Person> children){
		this.age = age;
		this.name = name;
		this.hobby = hobby;
		this.experince = experince;
		this.children = children;
	}
	
	@Override
	public String toString() {
	    return age + " " + name + " " + hobby + " " + experince;
	}
	
	public Integer getAge() { 
		return age; 
	}
    public String getName() {
    	return name;
    }

    public ArrayList<String> gethoppy(){
        return hobby;
    }
    public HashMap<String, Integer> getExperiences() {
		return (HashMap<String, Integer>) experince;
    }

    public Set<Person> getChildren() {
    	
        return children;
    }

}
