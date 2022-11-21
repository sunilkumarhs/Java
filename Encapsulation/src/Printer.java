import java.util.Scanner;

public class Printer {
    Scanner scan = new Scanner(System.in);
    private int tonerLevel;
    private int noPages;
    private int printedPages;
    private boolean duplex;

    public Printer() {
        this.tonerLevel=0;
        this.noPages=0;
        this.printedPages=0;
        this.duplex=false;
    }

    public void addToner() {
        if(this.tonerLevel == 100) {
            System.out.println("Toner Level is full!!");
        }else {
            System.out.println("Enter the toner ink to be filled :");
            int ink = scan.nextInt();
            if(ink <= 0 || ink > 100) {
                System.out.println("Invalid Ink value!!");
                addToner();
            }else {
                if(this.tonerLevel+ink >100) {
                    System.out.println("Added ink more to fill!!");
                    addToner();
                }else {
                    this.tonerLevel += ink;
                    System.out.println("The current Toner Level is " + this.tonerLevel + "%");
                }
            }
        }
    }

    public void print() {
        System.out.println("Enter the number of pages to be printed :");
        int pages = scan.nextInt();
        if(pages > 0) {
            System.out.println("Enter true to print in duplex otherwise false to print normally");
            this.duplex = scan.nextBoolean();
            this.noPages += pages;
            System.out.println("THe pages to be printed is " + this.noPages + " pages");
            if(this.duplex) {
                if(this.tonerLevel > 0) {
                    this.printedPages += (this.noPages / 2)+(noPages%2);
                    this.noPages = 0;
                } else {
                    System.out.println("NO enough toner ink to print the pages");
                    addToner();
                    this.printedPages += (this.noPages / 2)+(noPages%2);
                    this.noPages = 0;
                }
            } else {
                if(this.tonerLevel > 0) {
                    this.printedPages += this.noPages;
                    this.noPages = 0;
                } else {
                    System.out.println("NO enough toner ink to print the pages");
                    addToner();
                    this.printedPages += this.noPages;
                    this.noPages = 0;
                }
            }
            System.out.println("The total number of pages printed is " + this.printedPages + " pages");
        }else {
            System.out.println("Enter the proper page number !!");
            print();
        }
    }
}
