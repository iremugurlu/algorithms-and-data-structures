public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        if(fruits.length == 0) return 0;
        int b1type = fruits[0];
        int b2type = -1;
        int b1 = 1;
        int b2 = 0;
        int prev = 0;
        int max = 0;
        for(int i=1; i<fruits.length; i++) {
            if(fruits[i] == b1type) {
                if(b2type == -1) b1++;
                else {
                    prev = b1;
                    b1++;
                    int tmptype = b1type;;
                    int tmp = b1;
                    b1type = b2type;
                    b1 = b2;
                    b2type = tmptype;
                    b2 = tmp;
                }
            } else if(fruits[i] == b2type) {
                b2++;
            } else if(b2type == -1) {
                b2type = fruits[i];
                b2++;
            } else {
                b1type = b2type;
                b1 = b2-prev;
                b2type = fruits[i];
                b2 = 1;
                prev = 0;
            }
            max = Math.max(max, b1+b2);
        }
        return Math.max(max, b1+b2);
    }
}