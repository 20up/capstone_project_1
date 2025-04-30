
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Format {
    static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");

    private LocalDate present;
    private LocalTime time;
    private String description;
    private String vendor;
    private double amount;

    public Format(LocalDate present, LocalTime time, String description, String vendor, double amount){
        this.present = present;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    public LocalDate getPresent() {

        return present;
    }

    public void setPresent(LocalDate present) {this.present = present;}

    public LocalTime getTime() {return time;}

    public void setTime(LocalTime time) {this.time = time;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getVendor() {return vendor;}

    public void setVendor(String vendor) {this.vendor = vendor;}

    public double getAmount() {return amount;}

    public void setAmount(double amount) {this.amount = amount;}

    public void date_time(){
        System.out.println(present +" | "+ time.format(dtf1));
    }
}
