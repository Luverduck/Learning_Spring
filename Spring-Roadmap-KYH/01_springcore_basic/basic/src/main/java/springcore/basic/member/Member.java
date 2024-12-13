package springcore.basic.member;

public class Member {
    
    // 속성
    private Long id;
    private String name;
    private Grade grade;
    
    // Getter/Setter
    public Long getId() { return id; }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    // 생성자
    public Member(Grade grade, Long id, String name) {
        this.grade = grade;
        this.id = id;
        this.name = name;
    }

}
