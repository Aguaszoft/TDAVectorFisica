public class Vector2D {
    double coorI;
    double coorJ;
    public Vector2D(double coorI, double coorJ){
        this.coorI=coorI;
        this.coorJ=coorJ;
    }
    public Vector2D(){
        coorI=0.0;
        coorJ=0.0;
    }
    //Para visualizar
    public void ver(){

            System.out.println("("+ coorI+"i + "+ coorJ+"j)");

    }
    public double get_coorI(){
        return coorI;
    }
    public double get_coorJ(){
        return coorJ;
    }
    public void set_coorI(double coorI){
        this.coorI=coorI;
    }
    public void set_coorJ(double coorJ){
        this.coorJ=coorJ;
    }
    public double modulo(){
        return Math.sqrt(coorI*coorI+coorJ*coorJ);
    }
    public String toString(){
        if(coorJ>0)
            return new String((double)Math.round(100*coorI)/100+" + "+
                    (double)Math.round(100*coorJ)/100+"*i");
        return new String((double)Math.round(100*coorI)/100+" - "+
                (double)Math.round(-100*coorJ)/100+"*i");
    }
    public double angulo(){
        double angulo=Math.atan2(coorJ, coorI);
        if(angulo<0) angulo=2*Math.PI+angulo;
        return angulo*180/Math.PI;
    }

}
