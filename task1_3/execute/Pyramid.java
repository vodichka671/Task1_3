package task1_3.execute;

public class Pyramid {

    public static char transform(int i){
        char ourReturn='0';
        switch (i){
            case 0: ourReturn=' ';
            break;
            case 1: ourReturn='1';
            break;
            case 2: ourReturn='2';
            break;
            case 3: ourReturn='3';
            break;
            case 4: ourReturn='4';
            break;
            case 5: ourReturn='5';
            break;
            case 6: ourReturn='6';
            break;
            case 7: ourReturn='7';
            break;
            case 8: ourReturn='8';
            break;
            case 9: ourReturn='9';
            break;

        }
        return ourReturn;
    }




    public int[][] buildPyramid(int height){
        int sizeOfLast=height*2-1;
        int [][] Pyramid = new int[height][sizeOfLast];


        for (int i = 0; i < height; i++) {

            Pyramid[i][(sizeOfLast-1)/2]=i+1;                  //
            for (int j = 0; j <(sizeOfLast-1)/2+1 ; j++) {
                Pyramid[i][(sizeOfLast-1)/2-j]=Pyramid[i][(sizeOfLast-1)/2]-j;
                Pyramid[i][(sizeOfLast-1)/2+j]=Pyramid[i][(sizeOfLast-1)/2]-j;
                if(Pyramid[i][(sizeOfLast-1)/2-j]==0||Pyramid[i][(sizeOfLast-1)/2+j]==0){break;}
            }

        }




        return Pyramid;
    }

}
