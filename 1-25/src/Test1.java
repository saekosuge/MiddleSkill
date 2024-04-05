import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test1{
        public static void main(String[] args){
                //改行
                System.out.println("問１");
                //問題1:下記条件になるようログの出力を行いなさい。
                
                //条件１ 例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
                //条件２ "middleskill log"という名前のログのインスタンスを生成する事
                //条件３ srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事
                //条件４ ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
                //条件５ 格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事
                Logger logger = Logger.getLogger("middleskill log");

                try {
                    // 条件１: 例外でヌルポが発生させヌルポをキャッチした場合のみログ出力
                    String s = null;
                    System.out.println(s.length());
                } catch (NullPointerException e) {
                    // ログをファイルに出力するハンドラを作成
                    try {
                        // 条件３: srcディレクトリ内に"middleskill.log"としてログ出力される設定
                        FileHandler fileHandler = new FileHandler("src/middleskill.log");

                        // ログの出力レベルを設定
                        logger.setLevel(Level.INFO);

                        // ハンドラにログのフォーマットを設定
                        SimpleFormatter formatter = new SimpleFormatter();
                        fileHandler.setFormatter(formatter);

                        // ロガーにハンドラを登録
                        logger.addHandler(fileHandler);

                        // 条件４: ログの内容は「情報」
                        // 条件５: 格納するログメッセージは"ミドルスキルログが発生しました。"
                        logger.info("ミドルスキルログが発生しました。");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }