package inheritance;

// 다형성
// 여러가지 형태를 가질 수 있는 능력
// 부모 = new 자식()
// --------------------
// print(자식)
// void print(부모) {}

public class AnimalEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        Animal animal = new Animal();

        Carnivore carnivore = new Carnivore();
        carnivore.eat();
        carnivore.print();

        Herbivore herbivore = new Herbivore();
        herbivore.eat();

        // 부모 = 자식 (자동 형변환)
        Animal cAnimal = new Carnivore();
        cAnimal.eat(); // 자식 클래스에서 오버라이딩 된 메소드 호출
        // cAnimal.print(); // 자식 클래스에서 오버라이딩 된 메소드가 아닌 메소드는 호출 불가
        ((Carnivore) cAnimal).print(); // 강제 형변환

        Animal hAnimal = new Herbivore();
        hAnimal.eat();

        // 형제 관계는 성립 안됨!
        // Carnivore c = new Herbivore();
        // herbivore = (Herbivore)carnivore;

        // 자식 = 부모 (X)
        // ClassCastException
        herbivore = (Herbivore) animal;
        herbivore.eat();
    }
}
