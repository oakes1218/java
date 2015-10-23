import java.awt.List;
import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.attribute.standard.MediaSize.Engineering;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Team {
	
	static ArrayList<Person> member = new ArrayList<Person>();
	
	public void addmembers (Person person){
		this.member.add(person);
	}
	public ArrayList<Person> getMember(){
		return this.member;
	}
	
	public static Set removeWTF(ArrayList<Person> member) {
		Set rvname = new HashSet<String>();
		rvname = member.stream()
					   .filter(m -> !"WTF".equals(m.getName()))
					   .collect(Collectors.toSet());	   
		return rvname;
	}
	public static ArrayList<Person> sortList (ArrayList<Person> member) {
        
		member.sort((s1, s2) -> s1.getAge().compareTo(s2.getAge()));
	       
	     	return member;
	}     	
	
	public static void main (String []arge){
		
		ArrayList<Person> teamlist = new ArrayList<Person>();
		Iterator<Person> it ;
		
		Team team = new Team();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("running");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Engineer", 2);
		Person ps1 = new Person(18, "eddie", list, map, null);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("sleep");
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("Teacher", 4);
		Person ps2 = new Person(28, "DT",  list2, map2, null);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Sing");
		Map<String, Integer> map3 = new HashMap<String, Integer>();
		map3.put("Lawyer", 6);
		Person ps3 = new Person(38, "WTF",  list3, map3, null);
		
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("paly");
		Map<String, Integer> map5 = new HashMap<String, Integer>();
		map5.put("Student", 0);
		Person ps5 = new Person(8, "Al",  list5, map5, null);
		
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("read");
		Map<String, Integer> map4 = new HashMap<String, Integer>();
		map4.put("Doctor", 8);
		Set<Person> children = new HashSet<Person>(); 
		children.add(ps5);
		Person ps4 = new Person(48, "JJ",  list4, map4, children);
		
		
		teamlist.add(ps1);
		teamlist.add(ps2);
		teamlist.add(ps3);
		teamlist.add(ps4);
		teamlist.add(ps5);
		
		team.addmembers(ps1);
		team.addmembers(ps2);
		team.addmembers(ps3);
		team.addmembers(ps5);
		team.addmembers(ps4);
		
		it = teamlist.iterator();
		
		for(Person person : teamlist){                  //for 迴圈方式
			if(person.children != null){
				System.out.println(children);
			}
		}
		
		teamlist                                        // aggregage (stream) 方式
				.stream()
				.filter(person -> person.getChildren() != null)
				.forEach(person -> System.out.println(person));
		
		list = (ArrayList<String>) teamlist.stream()    //使用stream()/map()/collect()
										   .map(Person::getName)
										   .collect(Collectors.toList());
		
		System.out.println(list);
		
		//System.out.println(team.removeWTF(member));
		
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
		Set newMember = removeWTF(team.getMember()); 
        newMember
    			 .stream()
    			 .forEach(m -> System.out.println(m));  

        ArrayList<Person> squMember = sortList(team.getMember());
        squMember
        		 .stream()
        		 .forEach(m -> System.out.println(m));
		
	}
}		
