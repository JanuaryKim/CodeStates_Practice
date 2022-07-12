package subPractice;


/**
 *
 * 현재 상황
 * 스타가 있다. (요즘은 가수이면서 연기자이면서 심지어 댄서인 사람도 있다)
 * 스타는 여러 종목에서 활약이 가능하다.
 * 필요한 능력들을 인터페이스로 구현해보고 해당 동작들을 재정의 해보자
 *
 */


public class InterfacePractice {
    public static void main(String[] args) {
        Song[] songs = new Song[]{new Song("romantico"), new Song("빨간맛")};
        Drama drama = new Drama("발리에서 생긴일");

        Entertainer entertainer = new Entertainer();
        entertainer.act(drama);
        entertainer.sing(songs[0]);
        entertainer.dance(songs[1]);

    }
}



interface Singer {
    void sing(Song song);
}

interface Actor {
    void act(Drama drama);
}

interface Dancer {
    void dance(Song song);
}





class Song{
    String title;

    public Song(String title) {
        this.title = title;
    }
}

class Drama{
    String title;

    public Drama(String title) {
        this.title = title;
    }
}


class Entertainer implements Dancer, Actor, Singer {

    @Override
    public void dance(Song song) {
        System.out.println(song.title + "에 맞춰서 춥을 춥니다~");
    }



    @Override
    public void act(Drama drama) {
        System.out.println(drama.title + "에서 연기를 합니다");
    }

    @Override
    public void sing(Song song) {
        System.out.println(song.title + "를 노래 합니다");
    }
}


