/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author estudiantes
 */
public class Lista {
    Nodo cabeza;
    public Lista(){
        cabeza=null;
    }
    Nodo insertar(int d){
        Nodo q;
        Nodo s;
        q=null;
        s=cabeza;
        while(s!=null && d>s.info){
            if(s.info==d){
                return null;
            }
            q=s;
            s=s.sig;
        }
        Nodo n=new Nodo(d);
        if(q==null){
            n.sig=cabeza;
            cabeza=n;
        }
        else if(s==null){
            q.sig=n;
        }
        else{
            n.sig=s;
            q.sig=n;
        }
        
                
        return cabeza;
    }
    String imprimir(){
        Nodo q=cabeza;
        String resul="";
        while(q!=null){
            resul=resul+q.info+"--->";
            q=q.sig;
        }
        return resul;
        
    }
    boolean buscar(int d){
        Nodo q=cabeza;
        while(q!=null){
            if(q.info==d){
                System.out.println("1");
                return true;
            }
            else{
                q=q.sig;
            }
        }
        System.out.println("-1");
        return false;
    }
    int retirar(int d){
        boolean esta;
        esta=buscar(d);
        if(esta==false){
            return -1;
        }
        Nodo aux=null;
        Nodo q=null;
        Nodo s=cabeza;
        while(s!=null && s.info<d){
            aux=q;
            q=s;
            s=s.sig;
        }
        if(s.sig==null){
            q.sig=null;
        }else{
            aux=s.sig;
            s=null;
            q.sig=aux;
        }
        return 1;
        
   
    }
}
