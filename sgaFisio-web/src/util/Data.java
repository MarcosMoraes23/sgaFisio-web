package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Fabricio Moreira
 */
public class Data {

    private static Data data;

    public static Data getInstance() {
        if (data == null) {
            data = new Data();
        }
        return data;
    } 
    
    private Calendar DateToCalendar(Date date){ 
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }
    
    public Date SqlToDate(String dataSql){
        try {
            if (dataSql == "" || dataSql == null )
                return null;
            
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.setTime(formatoData.parse(dataSql));
            return c.getTime();
 
        } catch (Exception e) {return null;}
    }
    public Date StringToDate(String dataStr){
        try {
            if (dataStr == "" || dataStr == null )
                return null;
            
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            Calendar c = Calendar.getInstance();
            c.setTime(formatoData.parse(dataStr));
            return c.getTime();
 
        } catch (Exception e) {return null;}
    }
    
    public Date StringToDateTime(String dataStr){
        try {
            if (dataStr == "" || dataStr == null )
                return null;
            
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Calendar c = Calendar.getInstance();
            c.setTime(formatoData.parse(dataStr));
            return c.getTime();
 
        } catch (Exception e) {return null;}
    }
    public Date StringToTime(String timeStr){
        try {
            if (timeStr == "" || timeStr == null )
                return null;
            
            SimpleDateFormat formatoData = new SimpleDateFormat("HH:mm:ss");
            Calendar c = Calendar.getInstance();
            c.setTime(formatoData.parse(timeStr));
            return c.getTime();
 
        } catch (Exception e) {return null;}
    }
    
    public String DateToSql(Date date){
        try { 
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
            return formatoData.format(date);
            } catch (Exception e) {return "0000-00-00";}
    }
    
   public Date SqlToDateTime(String dataTimeSql){
       try {
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar c = Calendar.getInstance();
            c.setTime(formatoData.parse(dataTimeSql));
            return c.getTime();
 
        } catch (Exception e) {return null;}
   } 
   
   public String DateTimeToSql(Date dateTime){
        try { 
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return formatoData.format(dateTime);
            } catch (Exception e) {return "0000-00-00 00:00:00";}
    }
   
   public String DataBR(Date date){
        try { 
             SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
             return formatoData.format(date);
        } catch (Exception e) {return "0000-00-00";}

    }
   
   public String parseDataBR(Date date, String formato){
        try { 
             SimpleDateFormat formatoData = new SimpleDateFormat(formato);
             return formatoData.format(date);
        } catch (Exception e) {return "0000-00-00";}

    }
   
   public String DataTimeBR(Date date){
        try { 
             SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
             return formatoData.format(date);
        } catch (Exception e) {return "0000-00-00";}
    }
   
   public Date toDateTime(){
       return new Date();
   }
   
   public String toDateTimeBR(){
    return this.DataTimeBR(new Date());
   }

   public String toDateTimeSql(){
       return DateTimeToSql(new Date());
   }
    
}
