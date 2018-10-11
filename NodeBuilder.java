import java.util.ArrayList;
import java.util.Scanner;

public class NodeBuilder {

	public static void main(String[] args) {
		//Initialize ArrayList to store created nodes
		ArrayList<Node> nodes = new ArrayList<Node>();
		
		Scanner kb = new Scanner(System.in);
		
		// Initializing node variables
		String activityName;
		int duration;
		ArrayList<String> dependencies = new ArrayList<String>();
		
		String input = "";
		
		boolean stop = false;
		int i = 0;
		do
		{
			//Receive user node input
			System.out.println("Enter Node Information.");
			input = kb.nextLine();
			
			
			//Setting up new Scanner and delimiter
			Scanner s = new Scanner(input);
			s.useDelimiter(",");
			
			//Set node variables with user input
			if(s.hasNext()) {
				activityName = s.next();
				System.out.println(activityName);
			} else
				activityName = "Activity " + i;
			
			if(s.hasNext()) {
				duration = s.nextInt();
				System.out.println(duration);
			} else
				duration = 0;
			
			
			while (s.hasNext()) {
				dependencies.add(s.next());
			}
			
			if(dependencies.isEmpty()) {
				dependencies.add("1");
			}
			
			if(activityName.equals("stop")) {
				Node myNode = new Node(activityName, duration, dependencies);
				nodes.add(myNode);
			} else {
				stop = true;
			}
			
			System.out.println(nodes.size());
			
			//Closing Scanner
			s.close();
			
			i += 1;
			
		} while (stop);
		
		kb.close();
	}

}