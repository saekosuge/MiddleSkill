import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
        public static void main(String[] args) {
                String shinyaBirthday = "1998/03/19";
                String minamiBirthday = "2000/02/14";
                String furuyamaBirthday = "1998/09/12";
                //改行
                System.out.println("問１");
                //問題1:現在の時刻を出力してください
                Date date = new Date();
                System.out.println(date);
                //改行
                System.out.println("問２");
                //問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
                try {
                    SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
                    Date shinyaDate = sdFormat.parse(shinyaBirthday);
                    Date minamiDate = sdFormat.parse(minamiBirthday);

                    if (shinyaDate.before(minamiDate)) {
                        System.out.println(shinyaBirthday);
                    } else {
                        System.out.println(minamiBirthday);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                //改行
                System.out.println("問３");
                //問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
                try {
                    SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
                    Date furuyamaDate = sdFormat.parse(furuyamaBirthday);

                    java.util.Calendar cal = java.util.Calendar.getInstance();
                    cal.setTime(furuyamaDate);
                    cal.add(java.util.Calendar.YEAR, 5);
                    cal.add(java.util.Calendar.MONTH, 2);
                    Date newDate = cal.getTime();

                    System.out.println(sdFormat.format(newDate));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
        }
}