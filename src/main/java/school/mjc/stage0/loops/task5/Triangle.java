package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < cathetusLength;i++){
            for(int y = 0;y <= i;y++){
                result.append('8');
            }
            result.append(System.lineSeparator());
        }
        System.out.println(result.toString());

    }
}
