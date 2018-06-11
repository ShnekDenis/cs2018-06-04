package by.it.shnek.lesson02;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int z = i * i;
        int k = j*j+z*z;
        System.out.println(j + "*" + j + "+" + z + "*"+ z + "=" + k);
    }
}
