package enu;



enum User{
    GUEST, NORMAL, SILVER, GOLD
}

public class EnumPracticeSwitch {

    public static void main(String[] args) {

        User[] userGrade = User.values(); // User enum타입에 존재하는 모든 상수들을 배열로

        User user = userGrade[1];
        User user2 = userGrade[3];
        User findUser = User.valueOf("NORMAL"); // 특정 상수 변수명으로 enum변수를 찾음.



        System.out.println("findUser = " + findUser);

        System.out.println("user == findUser : " + (user == findUser));
        System.out.println("user.compareTo(user2) : " + user.compareTo(user2)); //user2의 값 - user2 -> -2


        switch (user) {

            case GOLD:
                System.out.println("value = "+ user.ordinal() + ", 골드입니다");
                break;
            case SILVER:
                System.out.println("value = "+ user.ordinal() + ", 실버입니다");
                break;
            case NORMAL:
                System.out.println("value = "+ user.ordinal() + ", 노멀입니다");
                break;
            case GUEST:
                System.out.println("value = "+ user.ordinal() + ", 게스트입니다");
                break;

        }


    }
}

