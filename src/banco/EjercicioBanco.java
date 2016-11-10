/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EjercicioBanco {
    
        static ArrayList <Banco> bancos_es = new ArrayList <>();
        static ArrayList <Banco> bancos_pt = new ArrayList <>();
        static ArrayList <Caja> cajas = new ArrayList <>();
        
    public static void rellenarDatos(){
        

        
        for (int i=0; i<10; i++) {
            Banco b = new Banco();
            b.setNombre("Santander "+i);
            b.setNum_sucursales(10+i);
            b.setNum_acciones(150+i);
            bancos_es.add(b);
            
            b = new Banco();
            b.setNombre("Novobanco "+i);
            b.setNum_sucursales(10+i);
            b.setNum_acciones(150+i);
            bancos_pt.add(b);
            
        }
        for(int x=0; x<10;x++){
            Caja c =new Caja();
            c.setNombre("Caja "+x);
            c.setNum_sucursales(60+x);
            cajas.add(c);
        }
        
    }
    
    public static void fusionar(Banco b1, Banco b2){
        Banco banconuevo = new Banco();
        banconuevo.setNombre("Banco nuevo");
        banconuevo.setNum_acciones(b1.getNum_acciones()+b2.getNum_acciones());
        banconuevo.setNum_sucursales(b1.getNum_sucursales()+b2.getNum_sucursales());
        bancos_es.remove(b1);
        bancos_es.remove(b2);
        
        bancos_es.add(banconuevo);
        System.out.println(banconuevo.getNombre());
        System.out.println(banconuevo.getNum_acciones());
        System.out.println(banconuevo.getNum_sucursales());
    }
    
    public static void fusionar( Caja c1, Caja c2){
        Caja cajanueva= new Caja();
        cajanueva.setNombre("Caja nueva");
        cajanueva.setNum_sucursales(c1.getNum_sucursales()+c2.getNum_sucursales());
        
        cajas.add(cajanueva);
        
    }
    
    public static Banco fusionar (ArrayList<Banco> vector , int x, int y){
        //Recibe vector y dos pos. los fusiona en el primero y devuelve
        Banco b1 = vector.get(x);
        Banco b2 = vector.get(y);
        b1.setNum_acciones(b1.getNum_acciones()+b2.getNum_acciones());
        b1.setNum_sucursales(b1.getNum_sucursales()+b2.getNum_sucursales());
        
        return b1;
  
    }
    
   /* public static Caja fusionar ( ArrayList <Caja> vector, int z, int p){
        //Los fusiona en el primero, borra el segundo y devuelve el preimero
        //No lo permite por coincidencia de estructura
        
    }*/
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        rellenarDatos();
        fusionar(bancos_es.get(3), bancos_es.get(2));
        fusionar(cajas.get(5), cajas.get(8));
        
        Banco b = fusionar(bancos_es, 4, 6);
        bancos_es.remove(6);
 
    }
    
}
