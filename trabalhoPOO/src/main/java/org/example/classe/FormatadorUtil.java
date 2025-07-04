//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.classe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatadorUtil {
    public static String formatarData(Date data, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(data);
    }
}
