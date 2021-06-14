import java.io.PrintStream
import java.lang.System.`in`
import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(`in`, "UTF-8")
    val print = PrintStream(System.out, true, "UTF-8")
    print.println("حط كسم الكلام الي هعمله uwuify")
    val text: String = reader.nextLine()
    // Original arabic letters: ا ب ت ث ج ح خ د ذ ر ز س ش ص ض ط ظ ع غ ف ق ك ل م ن ه و ي
    // My idea of uwuifying them: ا ب ت-ت ث ج ح خ د ذ و ز ث ش ث ض ت-ت ز ع غ ف ك-ك ك-ك و م ن ح و ي
    val uwuified: String = text.replace("ر", "و").replace("س", "ث").replace("ص", "ث")
        .replace("ط", "ت").replace("ظ", "ز").replace("ق", "ك")
        .replace("و", "و-و").replace("ل", "و").replace("ه", "ح")
        .replace("ت", "ت-ت").replace("ك", "ك-ك") + " >~<"
    print.println(uwuified)
}
