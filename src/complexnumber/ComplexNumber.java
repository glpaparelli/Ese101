package complexnumber;

public class ComplexNumber {
    public float re;
    public float im;
    
    public String formatComplexNumber() {
        String r = this.re + "+(" + this.im + ")i";
        return r;
    }
}
