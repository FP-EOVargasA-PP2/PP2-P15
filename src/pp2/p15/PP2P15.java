/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p15;
import java.util.Random;
/**
 *
 * @author osiri
 */
public class PP2P15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int aa,ab,ac,ad,ae,af,ag,ah,ai,aj,ba,bb,bc,bd,be,bf,bg,bh,bi,bj;
        int [][] v = new int [10][10];
        //Proceso
        v = generar ();
        //Se suman las filas
        aa = sumafila (0,v);
        ab = sumafila (1,v);
        ac = sumafila (2,v);
        ad = sumafila (3,v);
        ae = sumafila (4,v);
        af = sumafila (5,v);
        ag = sumafila (6,v);
        ah = sumafila (7,v);
        ai = sumafila (8,v);
        aj = sumafila (9,v);
        //Se suman las columnas
        ba = sumacolumna (0,v);
        bb = sumacolumna (1,v);
        bc = sumacolumna (2,v);
        bd = sumacolumna (3,v);
        be = sumacolumna (4,v);
        bf = sumacolumna (5,v);
        bg = sumacolumna (6,v);
        bh = sumacolumna (7,v);
        bi = sumacolumna (8,v);
        bj = sumacolumna (9,v);
        //Se muestran todos los resultados
        mostrar ("primera fila",aa);
        mostrar ("segunda fila",ab);
        mostrar ("tercera fila",ac);
        mostrar ("cuerta fila",ad);
        mostrar ("quinta fila",ae);
        mostrar ("sexta fila",af);
        mostrar ("septima fila",ag);
        mostrar ("octava fila",ah);
        mostrar ("novena fila",ai);
        mostrar ("decima fila",aj);
        mostrar ("primera columna",ba);
        mostrar ("segunda columna",bb);
        mostrar ("tercera columna",bc);
        mostrar ("cuerta columna",bd);
        mostrar ("quinta columna",be);
        mostrar ("sexta columna",bf);
        mostrar ("septima columna",bg);
        mostrar ("octava columna",bh);
        mostrar ("novena columna",bi);
        mostrar ("decima columna",bj);
    }
    public static int [][] generar (){
        int [][] v = new int [10][10];
        //Se llena la tabla de manera aleatoria
        Random rng = new Random();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                v[i][j] = rng.nextInt();
            }    
        }
        return v;
    }
    public static int sumafila (int a, int [][] v){
        int c = 0;
        for (int b = 0; b < 10; b++){
            c = c + v[a][b];
        }
        return c;
    }
    public static int sumacolumna (int a, int [][] v){
        int c = 0;
        for (int b = 0; b < 10; b++){
            c = c + v[b][a];
        }
        return c;
    }
    public static void mostrar (String a,int b){
        System.out.println("la suma de la "+a+" es "+b);
    }
}
