package studentApp;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) throws Exception{
		
		int n =0;
		
		ArrayList<Student> catalog = new ArrayList<Student>();
		
		Student s1 = new Student("Alex",7,8,9,10);
		Student s2 = new Student("Mihai",8,9,9,8);
		
		catalog.add(s1);
		catalog.add(s2);

		File f = new File("student.html");
		PrintWriter pw = new PrintWriter(f);
		
		pw.println("<html>");
        pw.println("<head>");
        pw.println("</head>");
        pw.println("<body>");
        
        pw.println("<table style=\"width:100%\">");
        	pw.println("<tr>");
        	
        		for(int i=0; i<catalog.size(); i++)
           			pw.println("<td>" + catalog.get(i) + "</td>");
           			
        
            pw.println("</tr>");
        pw.println("</table>");
        
        pw.println("</body>"); 
        pw.println("</html>");
        
        pw.close();
       
	}

}
