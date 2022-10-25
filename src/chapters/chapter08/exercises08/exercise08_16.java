package chapters.chapter08.exercises08;

public class exercise08_16 {
    public static void main(String[] args) {
        int[][] list = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        displayList(list);

        sort(list);
        displayList(list);
    }

    public static void sort(int[][] list) {
        int point ;
        for (int i = 0; i < list.length - 1; i++) {
            point = i;
            for (int j = i + 1; j < list.length; j++) {

                if (list[j][0] < list[point][0]) {
                    point = j;
                }
                else if (list[j][0] == list[point][0]) {
                    if (list[j][1] < list[i][1]) {
                        point = j;
                    }
                }
            }
            if(point != i){

                int temp = list[i][0];
                list[i][0] = list[point][0];
                list[point][0] = temp;

                temp = list[i][1];
                list[i][1] = list[point][1];
                list[point][1] = temp;
            }
        }
    }

    public static void displayList(int[][] list) {
        for (int[] point : list) {
            System.out.print("(" + point[0] + ", " + point[1] + ")  ");
        }
        System.out.println();
    }
}
