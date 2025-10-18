package Object.Example.ex02;

public class Click {
    int x;
    int y;
    int timestamp;

    public Click(int x, int y, int timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj) {
        // 💡 instanceof: obj가 Click 타입인지 확인
        if (!(obj instanceof Click)) return false;
        // 📃 캐스팅((Click) obj): obj를 Click 타입으로 변환
        return this.x == ((Click) obj).x && this.y == ((Click) obj).y;
    }
}
