public class Main {
    public static void main(String[] args) {
        //Задача №1
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println("Dog "+dog);
        System.out.println("Cat "+cat);
        System.out.println("Paper "+paper);
        //Задача №2
        dog=dog*4;
        cat=cat*4;
        paper=paper*4;
        System.out.println(" ");
        System.out.println("Dog "+dog);
        System.out.println("Cat "+cat);
        System.out.println("Paper "+paper);
        //Задача №3
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(" ");
        System.out.println("Dog "+dog);
        System.out.println("Cat "+cat);
        System.out.println("Paper "+paper);
        System.out.println(" ");
//Задача №4
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        System.out.println(" ");
//Задача №5
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        System.out.println(" ");
//Задача №6
        var вес1Боксера=78.2;
        var вес2Боксера=82.7;
        var весОбоихБоксеров=вес1Боксера+вес2Боксера;
        System.out.println("Вес обоих боксеров составляет "+весОбоихБоксеров+ " кг.");
        var разницаВесаБоксеров=вес2Боксера-вес1Боксера;
        System.out.println(" ");
//Задача № 7
        var остатокДеления = вес2Боксера % вес1Боксера;
        System.out.println("Остаток деления "+остатокДеления);
        System.out.println(" ");
//Задача №8
        var hourWork=640;
        var hourPeople=8;
        var inTotalPeople=hourWork/hourPeople;
        System.out.println("Всего работников в компании - "+inTotalPeople+"человек!");
        System.out.println(" ");
        inTotalPeople=inTotalPeople+94;
        hourWork=hourPeople*inTotalPeople;
        System.out.println("Если в компании работает "+inTotalPeople+" человека, то всего "+hourWork+" часов работы может быть поделено между сотрудниками!" );

    }
}