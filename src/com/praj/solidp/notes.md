# SOLID Principles
SOLID is a set of 5 design principles that make
software easier to understand, maintain, and extend.

---

S → Single Responsibility Principle  
O → Open/Closed Principle  
L → Liskov Substitution Principle  
I → Interface Segregation Principle  
D → Dependency Inversion Principle

---

## 1. Single Responsibility Principle
A class should do only one job!

Example:  
A Chef cooks. A Cashier handles payments.  
You wouldn’t want one person doing both in a busy restaurant.

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

---

## 2. Open/Closed Principle
Code should be **open for extension** but **closed for modification**.  
You can add new features without changing existing code.

Example:  
Use interfaces or abstract classes so you can add new payment methods  
or discounts without touching existing code.

    interface Discount {
        double apply(double price);
    }

    class NoDiscount implements Discount {
        public double apply(double price) {
            return price;
        }
    }

    class SeasonalDiscount implements Discount {
        public double apply(double price) {
            return price * 0.8; // 20% off!
        }
    }
**I can add new discounts** without **changing/touching existing code**.

------

## 3. Liskov substitution Principle
If a classwork, it's child classes should work too.

Example:
If you have a base 'NotificationService' , subclasses like 'EmailNotification', 'SMSNotification'
should behave consistently!.

    @Service
    public abstract class NotificationService {
        public abstract void send(String message);
    }

    public class EmailNotification extends NotificationService {
        public void send(String message) {
            // send email!
        }
    }

    public class SMSNotification extends NotificationService {
        public void send(String message) {
            // send sms!
        }
    }

------------------
## 4. Interface Segregation Principle
Many client interface are better than one general purpose interface.
client should not be forced to implement methods they don't need.

Example:
Spilt large interface into smaller ones so classes only implement what they need.

public abstract class NotificationService {
public abstract void send(String message);
}

    public interface Printable {
        public void print();
    }

    public interface Scannable {
        public void scan();
    }

    public class Printer implements Printable {
        public void print() {
            // print logic!
        }
    }

-----------------
## 5. Dependency Inversion Principle:

High level module shouldn't depend on low level module but rather both 
should depend on abstraction.

Depend on abstraction, not concrete classes.

        public interface MessageService {
            public void send(String message);
        }
        public EmailService implements MessageService {
            public void send(String message) {
                    System.out.println("Sending Email: " + message);
            }
        }
        public class Notification {
            private MessageService service;
            
            public Notification(MessageService service) {
                this.service = service;
            }

            public void alert(String message) {
                service.send(message);
            }
        }