/*
Mustafa Alibek 
HomeWork 6
Create 2 interfaces ExcellentStudent with field excellentScholarship and BadStudent with field badScholarship.
Create class GoodStudent and implement it from 2 interfaces ExcellentStudent and BadStudent.
Add to class GoodStudent scholarship field. And initialize scholarship as average value from excellentScholarship + badScholarship.
 */

interface ExcellentStudents{
    public int ExcellentScholarship();;
}
interface BadStudents {
    public int BadScholarship();
}

class GoodStudents implements ExcellentStudents, BadStudents {
    public int ExcellentScholarship = 40000;
    public int ExcellentScholarship(){
        return 40000;
    }

    public int BadScholarship = 20000;
    public int BadScholarship(){
        return 20000;
    }

    public int Scholarship = (ExcellentScholarship + BadScholarship) / 2;
}

class Main {
    public static void main(String[] args) {
        GoodStudents id = new GoodStudents();
        System.out.println(id.Scholarship);
    }
}
