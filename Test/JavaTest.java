package Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class JavaTest
{
    public static void main(String[] args) {
        Date currDate = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        String strCurrDate = formatDate.format(currDate);
        System.out.println(strCurrDate);
    }
}
