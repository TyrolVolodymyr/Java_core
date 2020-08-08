package java_core.lesson_07_Weight;

public class Main {
    public static void main(String[] args) {
        String allWeights = "" +
                "27.04 - 67.7," +
                "28.04 - 68.0," +
                "29.04 - 67.7," +
                "30.04 - 67.4," +
                "01.05 - 67.8,"+
                "02.05 - 68.0,"+
                "03.05 - ?," +
                "04.05 - 68.4,"+
                "05.05 - 67.9,"+
                "06.05 - 67.4,"+
                "07.05 - 67.3,"+
                "08.05 - 67.8,"+
                "09.05 - 67.2,"+
                "10.05 - 68.0,"+
                "11.05 - 68.2,"+
                "12.05 - 68.3,"+
                "13.05 - 68.0,"+
                "14.05 - 68.2,"+
                "15.05 - 67.6,"+
                "16.05 - 67.5,"+
                "17.05 - 67.5,"+
                "18.05 - 67.5,"+
                "19.05 - 67.5,"+
                "20.05 - 67.5,"+
                "21.05 - 68.0,"+
                "22.05 - 67.4,"+
                "23.05 - ?,"+
                "24.05 - 67.2,"+
                "25.05 - 67.4,"+
                "26.05 - 67.2,"+
                "27.05 - ?,"+
                "28.05 - 67.3,"+
                "29.05 - ?,"+
                "30.05 - ?,"+
                "31.05 - 68.1,"+
                "01.06 - 67.7,"+
                "02.06 - 67.4,"+
                "03.06 - 67.1,";

        String[] str= allWeights.split(",");
        double[] weight = new double[str.length];
        double sum = 0;
        double max = 0;
        double min;
        double middle;
        int count = 0;

        for (int i = 0; i <str.length ; i++) {
            str[i] = str[i].replace("?", "0");
            weight[i]= Double.parseDouble(str[i].substring(str[i].indexOf("- ")+1));
  //          System.out.println(weight[i]);
        }
        for (int i = 0; i <weight.length ; i++) {
            if (max<weight[i]){
                max=weight[i];
            }
        }
        min=max;
        for (int i = 0; i <weight.length ; i++) {
            if (weight[i]!=0 && min>weight[i]){
                min=weight[i];
            }
        }
        middle = min+((max-min)/2);
        System.out.println("max = "+max);
        System.out.println("min = "+ min);
        System.out.println("middle = "+ middle);
        for (int i = 0; i <weight.length ; i++) {
            if(weight[i]!=0){
                sum+=weight[i];
                count++;
            }
        }

        System.out.println("average = "+sum/count);

        }
    }
