package packt.jee.eclipse.ws.soap;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Courses {
	
	private List<Course> courseList;

	public Courses() {
	}

	public Courses(List<Course> courseList) {
		this.courseList = courseList;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
}
