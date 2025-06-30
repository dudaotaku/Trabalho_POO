//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FormatadorUtil {
    public static int calcularIdade(Date dataNascimento) {
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return hoje.getYear() - nascimento.getYear();
    }

    public static String formatarData(Date data, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(data);
    }
}
