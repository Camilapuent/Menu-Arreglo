
package Misclases;

import javax.swing.JOptionPane;

    public class Arreglo {
	int v[]=new int[8];
	public void cargar(){
		for(int i=0;i<8;i++){
		    v[i]=Integer.parseInt(JOptionPane.showInputDialog("v["+i+"]:"));
		}
	}


public void invertir (){
    int aux;
    for (int i = 0; i <= (v.length-1)/2; i++) {
        aux = v[i];
        v[i] = v[(v.length-1)-i];
        v[(v.length-1)-i] = aux;
    }
}


public void burbuja() {
   int auxiliar;
     
      for(int i=0; i < v.length; i++)
      {
        for(int j = 0;j < v.length-1;j++)
        {
          if(v[j] < v[j+1])
          {
            auxiliar = v[j];
            v[j] = v[j+1];
            v[j+1] = auxiliar;
          }   
        }
      }
}
public void secuencial(){
  for (int i = 0; i < v.length - 1; i++) {
        for (int j = i + 1; j < v.length; j++) {
            if (v[i] > v[j]) {
                int temporal = v[i];
                v[i] = v[j];
                v[j] = temporal;
            }
        }
    } 
}

public void impri(){
		String salida="los datos del arreglo son:\n";
		for(int i=0;i<5;i++){
		    salida=salida+v[i]+" ";
		}
		JOptionPane.showMessageDialog(null,salida);
	}

   public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }


    
	


