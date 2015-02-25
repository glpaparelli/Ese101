package quadraticequationsolver;

import complexnumber.*;

public class QuadraticEquationSolver {
    public  float a;                                                            // dichiaro variabili pubbliche 
    public  float b;                                                            //          //
    public  float c;                                                            //          //
    private float delta;                                                        // dichiare una variabile privata
                                                                                // non sarà visibile dalle altre
                                                                                // classi o oggetti, in quanto non di 
                                                                                // rilevanza per l'utente finale

    private void computeDeterminant() {                                         //   metodo privato  
        this.delta = (float)Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    
    public ComplexNumber computeX1() {
        this.computeDeterminant();
        ComplexNumber r = new ComplexNumber();
        if(this.delta < 0) {
            r.re = -this.b;
            r.im = (float)Math.sqrt(-this.delta);
        }
        else {
            r.re = -this.b + (float)Math.sqrt(this.delta);
            r.im = 0;
        }
        r.re /= (2*this.a);
        r.im /= (2*this.a);
        return r;
    }
    
    public ComplexNumber computeX2() {
        this.computeDeterminant();
        ComplexNumber r = new ComplexNumber();
        if(this.delta < 0) {
            r.re = -this.b;
            r.im = -(float)Math.sqrt(-this.delta);
        }
        else {
            r.re = -this.b - (float)Math.sqrt(this.delta);
            r.im = 0;
        }
        r.re /= (2*this.a);
        r.im /= (2*this.a);
        return r;
    }
}
