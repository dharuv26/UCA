public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real,double imaginary){
        this.real=real;
        //Earlier output: 4.0 + 0.0i => imaginary number has not been initialized

        //Imaginary number initialized
        this.imaginary=imaginary;
    }

    public ComplexNumber add(ComplexNumber other){
        real+=other.real;
        //After running the code the output is 4.0 + -Infinity => somewhere it has been divided by 0

        //Removed division by 0
        imaginary+=other.imaginary;
        return new ComplexNumber(real, imaginary);
    }

    public String toString(){
        return real+" + "+imaginary+"i";
    }

    public static void main(String[] args){
        ComplexNumber num1=new ComplexNumber(3, 2);
        ComplexNumber num2= new ComplexNumber(1, -4);
        ComplexNumber sum=num1.add(num2);
        System.out.println("Sum of complex numbers: "+sum);
    }
}