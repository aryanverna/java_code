// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Rectangle {
    int a,b;
    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    int area(){
       return a*b; 
    }
    
    int peri(){
        return (2*a) + (2*b);
    }
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,5);
        int a = r.area();
        int b = r.peri();
        
        System.out.println("Area is " + a);
        System.out.println("\nPerimeter " + b);
    }
}