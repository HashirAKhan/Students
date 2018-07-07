import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student[] theStudents = new Student[31];
		
		theStudents[0] = new Student("Nguyen","Christina",
						"Electrical Engineering", true, 6.5);
		theStudents[1] = new Student("Li","Angie",
						"Mathematics",true,8);
		theStudents[2] = new Student("Chen","Yu Feng",
						"Mathematics",false,9);
		theStudents[3] = new Student("Khan","Hashir",
						"Biological Sciences",false,12);
		theStudents[4] = new Student("Marin","Tayler",
						"Mechatronics",false,11);
		theStudents[5] = new Student("Mina","Andy",
						"Media",false,10);
		theStudents[6] = new Student("Middleton","Masiah",
						"Finance",false,10.5);
		theStudents[7] = new Student("Li","Simon",
						"Mechatronics",false,9);
		theStudents[8] = new Student("Zhong","Jeffrey",
						"Mathematics",false,10);
		theStudents[9] = new Student("Tom","Ethan",
						"Finance",false,8);
		theStudents[10] = new Student("Ngai","Richard",
						"Mechatronics",false,9.5);
		theStudents[11] = new Student("Pan","Zhen Yi",
						"Gateway",false,9.5);
		theStudents[12] = new Student("Zheng","Ye Cheng",
						"Chemistry",true,9.5);
		theStudents[13] = new Student("Loja","Luis",
						"Mathematics",false,7);
		theStudents[14] = new Student("Nasimov","Umarbek",
						"Aerospace",false,8.5);
		theStudents[15] = new Student("Andall Blake","Burlyn",
						"Biological Science",true,11);
		theStudents[16] = new Student("Tang","Carmen",
						"Industrial Design",true,7);
		theStudents[17] = new Student("Song","Kathy",
						"Law and Society",true,4.5);
		theStudents[18] = new Student("Shah","Divya",
						"Aerospace",true,7.5);
		theStudents[19] = new Student("Siddiqui","Hammad",
						"Chemistry",false,10);
		theStudents[20] = new Student("Paul","Lukasz",
						"Gateway",false,10);
		theStudents[21] = new Student("Hartley","Conor",
						"Industrial Design",false,8.5);
		theStudents[22] = new Student("Lei","Terry",
						"Finance",true,8);
		theStudents[23] = new Student("Zabin","Zaarib",
						"Civil Engineering",false,9.5);
		theStudents[24] = new Student("Sykakis","Nikos",
						"Law and Socieyt",false,11);
		theStudents[25] = new Student("Hryhartsevich","Vlad",
						"Gateway",false,7);
		theStudents[26] = new Student("Gorovyy","Vova",
						"Gateway",false,9);
		theStudents[27] = new Student("Fang","Yuki",
						"Mechatronics",true,8);
		theStudents[28] = new Student("Huang","Amy",
						"Mechatronics",true,6);
		theStudents[29] = new Student("Liu","Sharon",
						"Industrial Design",true,7);
		theStudents[30] = new Student("Xue","David",
						"Mathematics",false,9.5);
		
		Students myStudents = new Students(theStudents);
		List<Student> media = myStudents.getStudentInMajor("major");
		System.out.println(media);
	}

}
