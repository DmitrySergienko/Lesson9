package ru.geekbrins.Lesson9;

public class AppLaunch {


    public static void main(String[] args) throws MyArrayDataException {
        String[][] anyArray = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        try {
            if (anyArray.length != 4){ // если массив не состоит из 4 массивов
            throw new MyArraySizeException(); // вывожу мой eception
        }
            else if (anyArray.length == 4 ){    //если массив состоит из 4 массивов
                for (int i = 0; i < anyArray.length; i++) { //пробегаюсь по каждому из 4
                    if(anyArray[i].length !=4){                  //если любой из этих массивов не равен 4
                        throw new MyArraySizeException(); // вывожу мой eception

                    }
                }System.out.println("Массив 4х4");}

           } catch (MyArraySizeException e) {
               e.printStackTrace();
               System.out.println("Введен массив другого размера!");
            }
       doubleArray(anyArray);
    }

    public static void doubleArray(String[][] anyArray) throws MyArrayDataException {
        Integer[][] myIntArray = new Integer[4][4]; //создаю массив Integer (ров)
        int  arraySum  = 0;
        for (int i = 0; i < anyArray.length; i++){  // пробегаюсь по всем элементам массива
            for (int j = 0; j < anyArray.length; j++) {
                try {
                    myIntArray[i][j] = Integer.parseInt(anyArray[i][j]);//перевожу String в Int
                    arraySum = arraySum + myIntArray[i][j]; // сумирую элементы массива

                }catch (NumberFormatException e){
                    e.printStackTrace();
                    throw new MyArrayDataException("");
                }
                System.out.print(" " + myIntArray[i][j]); //вывожу массив в консоль
            }System.out.println(" "); //вывожу массив в консоль
        }
    }
}
