package kata6.main;

import java.io.IOException;
import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;
import kata6.view.HistogramDisplay;
import kata6.view.MailHistogramBuilder;
import kata6.view.MailListReader;

public class Kata6 {
  
    public static void main(String[] args) throws Exception {
      Kata6 kata4 = new Kata6();
      kata4.execute();       
    }
    
    String fileName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata6\\src\\kata6\\main\\emails.txt";
    List<Mail> mailList;
    Histogram<String> histogram;
    
    private void execute() throws Exception{
        input();
        process();
        output();
    }

    private void input() throws IOException{
        mailList = MailListReader.read(fileName);
    }
    
    private void process() throws Exception{
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
       
}
