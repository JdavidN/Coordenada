package modelo;


public class Coordenadas
{
    private double x;
    private double y;
    private String Coordenada;


    public Coordenada()
    {
 
    }

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;

     }


     public double getX()
     {
        return x;
     }

     public double getY()
     {
        return y;
     }

     public void setX(double x)
     {
        this.x = x;
     }
     public void setY(double y)
     {
        this.y = y;
     }
    
   public String toString()
   {
      return x + "/" + y;
   }
   public String toString2()
   {
      return Coordenada;
   }

   public boolean equals(Object o)
   {
      Coordenada otra = (Coordenada)o;
      return (this.x == otra.x) && (this.y == otra.y)
   }

   public 
    }
