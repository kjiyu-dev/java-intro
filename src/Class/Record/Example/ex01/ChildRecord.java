package Class.Record.Example.ex01;

// 💡 record: enum과 비슷한 맥락이지만, 주로 간단하게 데이터를 저장하고 옮기는 역할
// 생성자, getter, hashCode(), equals(), toString()을 제공해준다.
// instance 불가, 클래스가능 (ex02에서 확인)
public record ChildRecord(
        String name,
        int birthYear,
        Gender gender
) { }
