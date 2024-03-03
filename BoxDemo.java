// Implement a Java program to illustrate the concept of inheritance, polymorphism
public class BoxDemo {
    //Box class
    static class Box {
        double width;
        double height;
        double depth;

        //Constructor used when all dimensions specified 
        Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }

        //Constructor used when no dimensions specified 
        Box() {
            width = -1; //use -1 to indicate
            height = -1; //an uninitialized
            depth = -1; //box
        }

            //Constructor used when cube is created
            Box(double len) {
                width = height = depth = len;
            }

            //Compute and return value
            double volume() {
                return width * height * depth;
            }

            //Display box properties
            void display() {
                System.out.println("Dimensions are " + width + " by " + height + " by " + depth);
            }
        }

        //Boxweight class
        static class Boxweight extends Box {
            double weight; //weight of box

            //Constructor for Boxweight
            Boxweight(double w, double h, double d, double m) {
                super(w, h, d); //Call superclass constructor
                weight = m;
            }

            //Override display method to include weight
            @Override
            void display() {
                super.display(); //Call superclass method
                System.out.println("weight is " + weight);
            }
        }

        //main method to demonstrate the functionality
        public static void main(String[] args) {
            Boxweight mybox1 = new Boxweight(10, 20, 15, 34.3);
            Boxweight mybox2 = new Boxweight(2, 3, 4, 0.076);
            Box mybox3 = new Box(3, 6, 9); //Superclass reference

            //use polymorphism to diaplay properties
            Box[]boxes = new Box[] {mybox1, mybox2, mybox3};
            for(Box box:boxes) {
                box.display(); //polymorphic call
                System.out.println("Volume is " + box.volume());
                System.out.println();
            }
        }
    }
