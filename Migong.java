public class Migong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int j = 1; j < 8; j++) {
            map[j][0] = 1;
            map[j][6] = 1;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
//哈四大皆空浪费
        T t1 = new T();
        t1.Findway(map, 1, 1);

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@找路后的情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T {
    public boolean Findway(int[][] map, int i, int j) {
        if (map[i][j] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (Findway(map, i, j + 1)) {
                    return true;
                } else if (Findway(map, i + 1, j)) {
                    return true;
                } else if (Findway(map, i - 1, j)) {
                    return true;
                } else if (Findway(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }                                       
    }
}
