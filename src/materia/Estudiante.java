package materia;

public class Estudiante {
    private String nombre;
    private int cod;
    private String asignatura;
    private int nNotas;
    private double [] nota;
    private int [] porNotas;
    private double notaFinal = 0;
            
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    
    public void setcod(int cod){
        this.cod=cod;
    }
    public int getcod(){
        return cod;
    }
    
    public void setasignatura(String asignatura){
        this.asignatura=asignatura;
    }
    public String getasignatura(){
        return asignatura;
    }
    
    public void setnNotas(int nNotas1){
        this.nNotas=nNotas1;
    }
    public int getnNotas(){
        return nNotas;
    }
    
    public void setnota(double [] notas){
        this.nota=notas;
    }
    public double [] getnota (){
        return nota;
    }
    
    public void setporNotas(int [] porNotas){
        this.porNotas=porNotas;
    }
    public int [] getporNotas (){
        return porNotas;
    }
    
    public double calNotaFinal(){
        for (int i = 0; i < nNotas; i++) {
            notaFinal += nota[i]*(porNotas[i]/100);
        }
        return notaFinal;
    }
    
    public void ImprimirDaots(){
        System.out.println("Nobre : "+ nombre);
        System.out.println("Codigo : "+ cod);
        System.out.println("Asignatura: "+ asignatura);
        System.out.println("Nota Final: "+ calNotaFinal());
    }
    
    public void resultadoMateria(){
        if (calNotaFinal() < 2.5) {
            System.out.println("El Estudiante perdio la Asignatura");
        }
        else if (calNotaFinal() >= 2.6 && calNotaFinal() < 3 ){
                System.out.println("El Estudiante puede validar la Asignatura");
            }
        else{
                System.out.println("El Estudiante aprovo la Asignatura");
        }
    }
    
    
     public void filNotas(String Fila){
        String [] Partes;
        Partes = Fila.split(" ",nNotas);
        for (int i = 0; i < nNotas; i++) {
            nota[i] = Double.parseDouble(Partes[i]);
        }
     }
     
     public void filPorce(String Fila){
        String [] Partes;
        Partes = Fila.split(" ");
        for (int i = 0; i < nNotas; i++) {
            porNotas[i] = Integer.parseInt(Partes[i]);
        }
     }

    void setnNota(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}