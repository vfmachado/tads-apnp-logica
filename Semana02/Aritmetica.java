
public class Aritmetica {

    public static void main(String[] args) {
    
        //operações
        int intA, intB;
        intA = 5;
        intB = 3;

        int res;

        res = intA + intB;
        System.out.printf("%d + %d = %d\n", intA, intB, res);

        res = intA / intB;  //res é 1 e o resto é 2
        System.out.printf("%d / %d = %d\n", intA, intB, res);

        res = intA % intB;
        System.out.printf("%d %% %d = %d\n", intA, intB, res);

        //cuidados com int vs float/double

        float floatA, floatB;
        floatA = 5;
        floatB = 3.0f;

        float floatRes;

        floatRes = floatA + floatB;
        System.out.printf("%f + %f = %f\n", floatA, floatB, floatRes);

        floatRes = floatA / floatB;  //res é 1 e o resto é 2
        System.out.printf("%f / %f = %f\n", floatA, floatB, floatRes);

        floatRes = floatA % floatB;
        System.out.printf("%f %% %f = %f\n", floatA, floatB, floatRes);

        //problema com precisão 
        double value = 0.1 + 0.1 + 0.1; //0.3
        System.out.println(value);

    }

}
