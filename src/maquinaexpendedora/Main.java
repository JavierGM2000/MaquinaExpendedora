/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaexpendedora;

/**
 *
 * @author Suplente
 */
//Para arrays dinamicos
import java.util.*;
// Java Program to illustrate reading from FileReader
// using BufferedReader
import java.io.*;
//Para leer una input
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.text.DecimalFormat;
public class Main {

    private static DecimalFormat df = new DecimalFormat("0.00");

    static JFrame frame = new JFrame("JOptionPane showMessageDialog example");
    /**
     * @param args the command line arguments
     */
    //Funcion que recibe una pregunta y espera un integer
    public static int GetInt(String pregunta)
    {
        //Guardamos la respuesta que nos da el usuario
        String input = JOptionPane.showInputDialog(pregunta);
        //Si es nullo lo devolvemos 0 para volver a bienvenida
        if(input == null)
            return 0;
        //Si la longitud es cero devolvemos un error
        if(input.length() == 0)
        //devolvemos -1 que para nostros es que hay un error
            return -1;
        //Creamos un for para ir por todos los caracteres de su respuesta
        for (int i = 0; i < input.length(); i++)
            //A cada caracter le preguntamos si es un digito
            if (Character.isDigit(input.charAt(i))== false)
                //Si no es un digito devolveremeos un numero negativp que para
                //Nosotros significara que hay un error.
                return -1;
        //Si no devolvemos el valor positivo del input, por que un
        //callor negativo significa un error
        return Math.abs(Integer.parseInt(input));
    }
    //Comprobamos el input si corresponde a un codigo
    public static int CheckProductInput(int codigo)
    {
        //Conseguimos los productos que tenemos
        int max_product = Producto.total_codigo;
        //Vemos si el numero esta entre 0 y el maximo
        if(codigo>= 0 && codigo <max_product)
            //si lo esta devolvemos 1 que significa que todo correcto
            return 1;
        else
            //Si no -1 significara que ha habido un error
            return -1;
    }

       public static void CambioCents(double Recibido, double Total)
    {
        int Eur = (int)(Recibido*100) - (int)(Total*100);
        int EurCopy = Eur;
        int Bil500;
        int Bil200;
        int Bil100;
        int Bil50;
        int Bil20;
        int Bil10;
        int Bil5;
        int Bil2;
        int Bil1;
        int Cent50;
        int Cent20;
        int Cent10;
        int Cent5;
        int Cent2;
        int Cent1;
        for(Bil500 = 0; 500*100 <= Eur; Bil500++ )
        {
            Eur -= 500*100;
        }
        for(Bil200 = 0; 200*100 <= Eur; Bil200++ )
        {
            Eur -= 200*100;
        }
        for(Bil100 = 0; 100*100 <= Eur; Bil100++ )
        {
            Eur -= 100*100;
        }
        for(Bil50 = 0; 50*100 <= Eur; Bil50++ )
        {
            Eur -= 50*100;
        }
        for(Bil20 = 0; 20*100 <= Eur; Bil20++ )
        {
            Eur -= 20*100;
        }
        for(Bil10 = 0; 10*100 <= Eur; Bil10++ )
        {
            Eur -= 10*100;
        }
        for(Bil5 = 0; 5*100 <= Eur; Bil5++ )
        {
            Eur -= 5*100;
        }
        for(Bil2 = 0; 2*100 <= Eur; Bil2++ )
        {
            Eur -= 2*100;
        }
        for(Bil1 = 0; 1*100 <= Eur; Bil1++ )
        {
            Eur -= 1*100;
        }
        for(Cent50 = 0; 0.5*100 <= Eur; Cent50++ )
        {
            Eur -= 0.5*100;
        }
        for(Cent20 = 0; 0.2*100 <= Eur; Cent20++ )
        {
            Eur -= 0.2*100;
        }
        for(Cent10 = 0; 0.1*100 <= Eur; Cent10++ )
        {
            Eur -= 0.1*100;
        }
        for(Cent5 = 0; 0.05*100 <= Eur; Cent5++ )
        {
            Eur -= 0.05*100;
        }
        for(Cent2 = 0; 0.02*100 <= Eur; Cent2++ )
        {
            Eur -= 0.02*100;
        }
        for(Cent1 = 0; 0.01*100 <= Eur; Cent1++ )
        {
            Eur -= 0.01*100;
        }
        System.out.println("Hay que devolver "+ (double)EurCopy/100 + "\u20AC");
        if((int)Bil200!=0)
            System.out.println((int)Bil200 + " billetes de 200 euros");
        if((int)Bil100!=0)
        System.out.println((int)Bil100 + " billetes de 100 euros");
        if((int)Bil50!=0)
        System.out.println((int)Bil50 + " billetes de 50 euros");
        if((int)Bil20!=0)
        System.out.println((int)Bil20 + " billetes de 20 euros");
        if((int)Bil10!=0)
        System.out.println((int)Bil10 + " billetes de 10 euros");
        if((int)Bil5!=0)
        System.out.println((int)Bil5 + " billetes de 5 euros");
        if((int)Bil2!=0)
        System.out.println((int)Bil2 + " monedas de 2 euros");
        if((int)Bil1!=0)
        System.out.println((int)Bil1 + " monedas de 1 euros");
        if((int)Cent50!=0)
        System.out.println((int)Cent50 + " monedas de 50 centimos");
        if((int)Cent20!=0)
        System.out.println((int)Cent20 + " monedas de 20 centimos");
        if((int)Cent10!=0)
        System.out.println((int)Cent10 + " monedas de 10 centimos");
        if((int)Cent5!=0)
        System.out.println((int)Cent5 + " monedas de 5 centimos");
        if((int)Cent2!=0)
        System.out.println((int)Cent2 + " monedas de 2 centimos");
        if((int)Cent1!=0)
        System.out.println((int)Cent1 + " monedas de 1 centimos");
    }
    public static void ParseListaArchivo(File Archivo, ArrayList Lista) throws FileNotFoundException, IOException
    {
        //Primero miramos si el archivo
        if(Archivo != null)
        {
            BufferedReader reader = new BufferedReader(new FileReader(Archivo));
            String Linea = reader.readLine();
            while(Linea != null)
            {
                int iend = Linea.indexOf(":");
                Lista.add(new Producto(Linea.substring(0, iend),Float.parseFloat(Linea.substring(iend+1))));
                Linea = reader.readLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //Crea una lista dinamica que podemos añadir productos que queramos
        //Creamos la lista dinamica que guardara los productos
        ArrayList Lista = new ArrayList();
        //Cogemos el archivo del que leemos los productos
        File ListaFile = new File("ListaProductos.txt");
        //Miramos si el archivo existe
        if (ListaFile.createNewFile())
        {
            System.out.println("File is created!");
            //A continuacion añadimos mis productos
            Lista.add(new Producto("Botellin agua", 1.5f));
            Lista.add(new Producto("Botellin coca cola", 2f));
            Lista.add(new Producto("Botellin refresco naranja", 2f));
            Lista.add(new Producto("Botellin refresco limon", 2f));
            Lista.add(new Producto("Nestea", 1.80f));
            Lista.add(new Producto("Kit-Kat", 1.5f));
            Lista.add(new Producto("Toblerone", 2f));
            Lista.add(new Producto("Frutos Secos", 1f));
        } else {
            System.out.println("File already exists.");
            ParseListaArchivo(ListaFile, Lista);
        }
        
        boolean cerrar = false;
        //Lista para guardar productos comprados
        int[] Compra = new int[Producto.total_codigo-1];

        while(cerrar==false)
        {
            //Llena la lista de la compra con 0
            Arrays.fill(Compra, 0);
                    //damos la bienvenida
            System.out.println("BIENVENIDO");
            //Le enseñamos la lista de prouctos
            System.out.println("Inserte 0 para salir. Lista de productos:");
            //Luego imprimimos los prodctos que tengamos
            for(int x=0;x<Producto.total_codigo-1;x++)
            {
                //Conseguimos la informacion del producto numero x
                Producto Get = (Producto)Lista.get(x);
                //Y a continueacion imprimimos su imformacion
                System.out.println(Get.codigo +" "+ Get.Nombre + " " + df.format(Get.precio) + "€");
            }
            //Una variable para guardar si hemos acabado la compra
            boolean CompraFinalizada=false;
            do{
                //Boolean para saber si tenemos que pedir un codigo otra vez
                boolean correcto = false;
                //Variable para guardar el objecto elegido
                int CodigoElegido;
                do{
                    //Le pedimos que consiga un numero
                    CodigoElegido = GetInt("Insertar codigo del prodcto");
                    if(CodigoElegido == -1)
                    {
                        //Si el codigo elegido es -1 significa que ha habido un error
                        System.out.println("Por favor inserte un codigo valido");
                        //Al hacer un continue volvemos al principio de la compra
                        continue;
                    }
                    //Now we have to ceck
                    int check = CheckProductInput(CodigoElegido);
                    if(check == 1)
                    {
                        correcto = true;
                    }
                    else
                        System.out.println("Por favor inserte un codigo entre 0 y " + (Producto.total_codigo-1));
                    }while(correcto == false);//Mientras a compra no este comfirmada
                //Si el codigo es 0 queremos cancelar la compra
                if(CodigoElegido==0)
                {
                    //Significa que cerramos la maquina
                    JOptionPane.showMessageDialog(frame, "Gracias por haber utilizado nuestra maquina");
                    cerrar = true;
                    break;
                }
                //Añadimos a la lista de la compra uno en la posicion del producto
                Compra[CodigoElegido-1]++;
                //Creamos un valor que indica que queremos un dialogo de si o no
                int dialogButton = JOptionPane.YES_NO_OPTION;
                //Le enseñamos al usuario una caja de comfirmacion
                int dialogResult = JOptionPane.showConfirmDialog (null, "¿Quiere comprar otro producto?","Gracias",dialogButton);
                //Si el resultado es si
                if(dialogResult == JOptionPane.YES_OPTION)
                {
                  //Le enseñamos una lista con los productos comprados
                  System.out.println("Producto(s) comprado(s):");
                  //Vamos por toda la lista de productos
                  for(int x=0;x<Producto.total_codigo-1;x++)
                  {
                      //Si el producto no es cero, significa que lo hemos comprado
                      if(Compra[x]!=0)
                      {
                          //Conseguimos la informacion del producto numero x
                         Producto Get = (Producto)Lista.get(x);
                            //Y a continueacion imprimimos su imformacion
                          System.out.println(Get.Nombre + " " + Get.precio + "€ x "+ Compra[x]);
                      }
                  }
                //en el caso de que haya hecho click en no
                }else
                {
                    //significa que ha finalizado la compra
                    CompraFinalizada = true;
                }
            }while(CompraFinalizada == false);
            //Creamos una variable
            float total = 0;
            //Le preguntamos si quiere comfirmar la compra
            System.out.println("Confirmar compra?");
            //Volvemos a imprimir la lista de la compra
            for(int x=0;x<Producto.total_codigo-1;x++)
              {
                  if(Compra[x]!=0)
                  {
                      //Conseguimos la informacion del producto numero x
                     Producto Get = (Producto)Lista.get(x);
                        //Y a continueacion imprimimos su imformacion
                     System.out.println(Get.Nombre + " " + df.format(Get.precio) + "€ x "+ Compra[x]);
                     total += Get.precio * Compra[x];
                  }
              }
            //Estetica
            System.out.println("---------------------------------------------");
            //Imprimimos el total
            System.out.println("Total: "+df.format(total)+"€");
            //Variable para guardar lo comprado
            float Pagado=0;
            do{
                //Le damos las diferentes opciones para pagar
                String[] choices = { "200€", "100€", "50€", "20€", "10€", "5€", "2€", "1€", "0.50€", "0.20€", "0.10€", "0.05€", "0.02€","0.01€" };
                //Guardamos la opcion que elija el usuario de la lista
                String input = (String) JOptionPane.showInputDialog(null, "Inserte efectivo",
                "Gracias por la compra", JOptionPane.QUESTION_MESSAGE, null,
                choices, // Array of choices
                choices[0]); // Initial choice
                //Aqui leemos el input y le sumamos a pagado lo que haya elegido
                if( input.equals("200€"))
                    Pagado+=200f;
                else if(input.equals("100€"))
                    Pagado+=100f;
                else if(input.equals("50€"))
                    Pagado+=50f;
                else if(input.equals("20€"))
                    Pagado+=20f;
                else if(input.equals("10€"))
                    Pagado+=10f;
                else if(input.equals("5€"))
                    Pagado+=5f;
                else if(input.equals("2€"))
                    Pagado+=2f;
                else if(input.equals("1€"))
                    Pagado+=1f;
                else if(input.equals("0.50€"))
                    Pagado+=0.50f;
                else if(input.equals("0.20€"))
                    Pagado+=0.2f;
                else if(input.equals("0.10€"))
                    Pagado+=0.1f;
                else if(input.equals("0.05€"))
                    Pagado+=0.05f;
                else if(input.equals("0.02€"))
                    Pagado+=0.02f;
                else if(input.equals("0.01€"))
                    Pagado+=0.01f;
                //Le enseñamos lo que ha pagado
                System.out.println("Pagado: "+Pagado+"€");
                //calculamos el cambio restantes
                float cambio = total - Pagado;
                //Vemos si es positivo
                if(cambio>0)
                    //Le decimos que tiene que meter el cambio
                    System.out.println("Todavia tienes que meter: "+cambio+"€");
            }while(Pagado<total);//Y todo esto se hace mientra no haya pagado el cliente
            CambioCents(Pagado,total);//Calculamos el cambio y acabamos la compra
        }
    }

}
