package ClasesObjetos;

public class TestFecha {
    public static void main(String[] args){
        //#region Instancia de clase
        Fecha f = new Fecha(27,11,1976);
        Fecha f1 = new Fecha();
        Fecha fs = new Fecha("23/12/1977");
        //#endregion
        
        //#region Inicializa objeto
        f1.setDia(23);            
        f1.setMes(12);
        f1.setAnio(1977);
        //#endregion

        //#region Impresion de resultados
        System.out.println("Dia: " + f.getDia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Anio: " + f.getAnio());
        //impresion de fecha
        System.out.println("f: " + f);

        System.out.println("Dia: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Anio: " + f1.getAnio());
        System.out.println("f1: " + f1);

        System.out.println("fs: " + fs);

        if(f.equals(f1)){
            System.out.println("f y f1 Fechas iguales");
        } else {
            System.out.println("f y f1 Fechas diferentes");
        }

        if(f1.equals(fs)){
            System.out.println("f1 y fs Fechas iguales");
        } else {
            System.out.println("f1 y fs Fechas diferentes");
        }
        //#endregion
    }
}
