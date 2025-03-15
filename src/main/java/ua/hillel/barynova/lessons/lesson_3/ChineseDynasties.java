package ua.hillel.barynova.lessons.lesson_3;

public class ChineseDynasties {
    public static void main(String[] args) {

        int liDynastyWarrior = 13;
        int liDynastyArcher = 24;
        int liDynastyVernier = 46;

        int mingDynastyWarrior = 9;
        int mingDynastyArcher = 35;
        int mingDynastyVernier = 12;

        int warriorsLi = 860;
        int warriorsMing = (int) (warriorsLi * 1.5);

        int generalAttackLi = warriorsLi * (liDynastyWarrior + liDynastyArcher + liDynastyVernier);
        int generalAttackMing = warriorsMing * (mingDynastyWarrior + mingDynastyArcher + mingDynastyVernier);

        System.out.println("The total attack rate of the Li Dynasty: " + generalAttackLi);
        System.out.println("The total attack rate of the Ming Dynasty: " + generalAttackMing);

    }
}
