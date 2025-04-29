
import java.time.LocalDate;
import java.time.LocalTime;

public class Data_for_format {
    private String home;
    private LocalDate present;
    private LocalTime time;
    private String description;
    private String vendor;
    private double amount;

    public LocalDate getPresent() {return present;}

    public void setPresent(LocalDate present) {this.present = present;}

    public LocalTime getTime() {return time;}

    public void setTime(LocalTime time) {this.time = time;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getVendor() {return vendor;}

    public void setVendor(String vendor) {this.vendor = vendor;}

    public double getAmount() {return amount;}

    public void setAmount(double amount) {this.amount = amount;}

    public void descib_add_d(){
        System.out.println("Add Deposit");
    }
}
