public class Main
{
  public static void main(String[] args)
  {
    //k=0 - календарь, другое - фигня
    int k=0;
    if(k!=0) {
      //что? я положил 5 миллионов рублей, а char дал 䭀, short 19264, byte 64, double int float  5000000
      System.out.println("что? я положил 5 миллионов рублей, а char дал 䭀, short 19264, byte 64, double int float  5000000.");
      byte x = (byte) 5000000;
      System.out.println(x);
      char x1 = (char) 5000000;
      System.out.println(x1);
      double x2 = (double) 5000000;
      System.out.println(x2);
      int x3 = (int) 5000000;
      System.out.println(x3);
      float x4 = (float) 5000000;
      System.out.println(x4);
      short x5 = (short) 5000000;
      System.out.println(x5);


      int[] arr;
      int[] newArr = new int[12];
      newArr[11] = 9;
      newArr[10] = 4;
      newArr[9] = 13;
      newArr[8] = 8;
      newArr[7] = 77;
      newArr[6] = 3;
      newArr[5] = 11;
      newArr[4] = 13;
      newArr[3] = 8;
      newArr[2] = 77;
      newArr[1] = 3;
      newArr[0] = 11;
      System.out.println(" ");
      System.out.println("Массивчик");
      for (int i = 0; i < 12; i++) {
        System.out.println(newArr[i]);
      }
      System.out.println(" ");
      System.out.println("Дни месяца");
      for (int z = 1; z < 32; z++) {
        System.out.println(z);
      }
    }
    else{
      //Год после слова Calendar
      System.out.println("Calendar 2019");
      //Первый день года, 2-Вторник
      int thisDay=2;
      String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
      //Количество дней во 2 месяце надо менять с изменением года
      int[] lenOfMonth={31,28,31,30,31,30,31,31,30,31,30,31};
      String[] week={"П","В","С","Ч","П","С","В"};
      for (int pozMonth=0;pozMonth<12;pozMonth++)
      {
        System.out.println(month[pozMonth]);
        for(int dayOfWeek=0;dayOfWeek<7;dayOfWeek++){
        System.out.print(week[dayOfWeek]);
        System.out.print("  ");
        }
        System.out.println("");
        int[] probels={-1,2,5,8,12,15,18};
        for(int propusk=1;propusk<probels[thisDay-1]+1;propusk++){
          System.out.print(" ");
        }

        for(int day=1;day<lenOfMonth[pozMonth]+1;day++){
          System.out.print(day);
          System.out.print("  ");
          thisDay=thisDay+1;
          if(thisDay==8){
            thisDay=1;
            System.out.println("");
          }
        }
        System.out.println("");
      }
    }

  }

  public void fm() {}

}
