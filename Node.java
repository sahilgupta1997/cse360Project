import java.util.ArrayList;

public class Node {
	
	private String activityName;
	private int duration;
	private ArrayList<String> dependencies = new ArrayList<String>();
	
	public Node() {
		this.activityName = "ExampleActivity";
		this.duration = 1;
		this.dependencies.add("null");
	}
	public Node(String activityName, int duration, ArrayList<String> dependencies) {
		this.activityName = activityName;
		this.duration = duration;
		this.dependencies = (ArrayList<String>) dependencies.clone();
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public ArrayList<String> getDependencies() {
		return dependencies;
	}
	public void setDependencies(ArrayList<String> dependencies) {
		for(int i=0;i<dependencies.size();i++) {
			this.dependencies.add(dependencies.get(i));
		}
	}
	@Override
	public String toString() {
		return "Node [activityName=" + activityName + ", duration=" + duration
				+ ", dependencies=" + dependencies + "]";
	}
}
