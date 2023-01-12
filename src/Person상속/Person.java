package Person상속;

// 인간(Person) 클래스를 만들기
// - age (정수값 : 나이) : 필드와 세터/게터
// - sleep (정수값 : 자는 시간) : 필드와 세터/게터
// 인간의 특성을 상속 받아 직장인 만들기
// - worker (정수값 : 일하는 시간) : 필드와 세터/게터
// 인간의 특성을 상속 받아 학생 만들기
// - 공부한다 (열심히/적당히/놀면서) : 필드와 세터/게터
public class Person {
    int age;
    int sleep;
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }
    void setSleep(int sleep) {
        this.sleep = sleep;
    }
    int getSleep() {
        return sleep;
    }
}
class Worker extends Person {
    int work;
    void setWork(int work) {
        this.work = work;
    }
    int getWork() {
        return work;
    }
}
class Student extends Person{
    int study;
    void setStudy(int study) {
        this.study = study;
    }
    String getStudy() {
        String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return studyStr[study];
    }
}

