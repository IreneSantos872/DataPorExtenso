fun main() {
    val entrada: String? = "25/12/2019";
    
    val(dia, mes, ano) = entrada!!.split("/");
    
    val mesPorExtenso = when (mes.toInt()){
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Marco"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês invalido";
    }
    println(dia + " de " + mesPorExtenso + " de " + ano)
}
