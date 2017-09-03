package trinomiocp;
/** Clase de numeros
 * 
 * @author net_m
 */
public class Numero {
 /**Recibe el numero a 
  * 
  */
   private int num1 = 0;
    /**Recibe el numero b
     * 
     */
   private double num2; 
    /**Recibe el numero c
     * 
     */
   private double num3;
   /**Ayuda a guardar el primer valor de a
    * 
    */
   private double num4; 
    /**Ayuda a validar
     * 
     */
   private int numV; 
   /**Cadena de la ecuación
   * 
   */
   private String ec; 
   
   
   /** Regresa el valor V que ayudara a validar
    * 
    * @return 
    */
    public int getNumV() {
        return numV;
    }
    
    /** Guarda el valor V que ayudara a validar
     * 
     * @param numV 
     */
    public void setNumV(int numV) {
        this.numV = numV;
    }
 /** Regresa el num1 
  * 
  * @return 
  */
    public int getNum1() {
        return num1;
    }
    /** Guardar el num1
     * 
     * @param num1 
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    /** Regresa el num2
     * 
     * @return 
     */
    public double getNum2() {
        return num2;
    }
    /** Guarda el num2
     * 
     * @param num2 
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    /** Regresa el num3
     * 
     * @return 
     */
    public double getNum3() {
        return num3;
    }
    /** Guarda el num3
     * 
     * @param num3 
     */
    public void setNum3(double num3) {
        this.num3 = num3;
    }

    /**Divide toda la ecuación entre el coeficiente de la cuadratica a
     * 
     */
    public void Dividir() {
        this.num2 = num2 / num1;
        this.num4 = this.num1;
        this.num1 = num1 / num1;
    }

    /**Otiene el valor de C 
     * 
     * @return 
     */
    public double ObtenerC() {
        this.num3 = Math.pow((this.num2 / 2), 2);
        return num3;
    }

    /**Obtiene la ecuación
     * 
     * @return 
     */
    public String ecuacion() {
        this.ec = num1 + "x2 + " + num2 + "x + " + num3 * num4;
        return this.ec;
    }

}
