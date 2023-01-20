public class Pattern {
    public static void main(String[] args) {
      int count = 1;
      for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(count + " ");
          count++;
        }
        System.out.println();
      }
    }
  }



// public class Main
// {
// 	public static void main(String[] args) {
// 	    int counter = 1;
// 		for(int i = 1;i<=4;i++){
// 		    for(int j = 0;j<i;j++){
// 		        System.out.print(counter + "\t");
// 		        counter++;
// 		    }
// 		    System.out.println();
// 		}
// 	}
// }