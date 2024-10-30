public class Condicionales{
  public static void main(String arg []){
      int Matematica, Biologia, Quimica, promedio;
      Matematica = 5;
      Biologia = 7;
      Quimica = 8;
      promedio = (Matematica + Biologia + Quimica)/3;

      if (promedio >= 6){
       System.out.println("Aprobado con el promedio: " + promedio);
       } else{
       System.out.println("Reprobado con el promedio: " + promedio);
      }
      
 }
} 