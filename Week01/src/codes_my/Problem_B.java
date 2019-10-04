package codes_my;

public class Problem_B {
    public static void main(String[] args) {

        int cock, hen, chicken;
        for (int i = 0; i <= 20; i++) {
            cock = i;
            for (int j = 0; j <= 33; j++) {
                hen = j;
                chicken = 100 - i - j;
                if (15 * cock + 9 * hen + chicken == 300) {
                    System.out.printf("cock=%d,hen=%d,chicken=%d\n", cock, hen, chicken);
                }
            }
        }

    }
}

