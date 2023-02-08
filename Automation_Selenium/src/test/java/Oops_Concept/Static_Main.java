package Oops_Concept;

public class Static_Main {

	public static void main(String[] args) {
		Static_Keyword sk1=new Static_Keyword();
		Static_Keyword sk2=new Static_Keyword();
		
		sk1.age=7;
		Static_Keyword.name="Rahul";
		sk1.grade="2nd";
		
		//Here name Rahul is getting override with name Arsh as we have made the name of the student to static.
		//As soon as we make a member a static that belongs to the class not belog to the object. So any change you made to the variable that change is available to all the objecs. 
		//So static members can be used / shared across all the objects. 
		
		//So when we want to share a variable across multiple objects we use Static.
		
		
		sk2.age=8;
		Static_Keyword.name="ARsh";
		sk2.grade="3rd";
		
		sk1.displaydetails();
		sk2.displaydetails();
		}

}
