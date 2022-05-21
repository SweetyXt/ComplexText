class Complex{
    private double real;
    private double imagin;
    public Complex(double r, double i){
        real=r;
        imagin=i;
    }
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImagin() {
        return imagin;
    }

    public void setImagin(double imagin) {
        this.imagin = imagin;
    }
    public Complex add(Complex c){
        return new Complex(real+c.real,imagin+c.imagin);
    }
    public Complex minus(Complex c){
        return new Complex(real-c.real,imagin-c.imagin);
    }
    public Complex multiple(Complex c){
        double r=real*c.real-imagin*c.imagin;
        double i=real*c.imagin+imagin*c.real;
        return new Complex(r,i);
    }
    public String toString(){
        return real+"+"+imagin+"i";
    }

}

public class Text {
    public static void main(String args[]){
        Complex c1,c2,c3;
        c1=new Complex(3,4);
        c2=new Complex(1,2);
        System.out.printf("c1+c2=%s\n",c1.add(c2));
        System.out.printf("c1-c2=%s\n",c1.minus(c2));
        System.out.printf("c1*c2=%s\n",c1.multiple(c2));
    }
}
