# SOLID Principles
SOLID is a set of 5 design principles that make
software easier to understand, maintain, and extend.

-----

S → Single Responsibility Principle  
O → Open/Closed Principle  
L → Liskov Substitution Principle  
I → Interface Segregation Principle  
D → Dependency Inversion Principle

---

## 1. Single Responsibility Principle
A class should do only one job!

**Example:**  
A Chef cooks. A Cashier handles payments.  
You wouldn’t want one person doing both in a busy restaurant.

```java
class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Printing Invoice");
    }
}

class InvoiceSaver {
    public void save(Invoice invoice) {
        System.out.println("Saving Invoice");
    }
}
