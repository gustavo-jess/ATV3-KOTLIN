import java.text.DecimalFormat

fun main() {
    val nomeProduto: String = "Notebook";
    val precoUnitario: Double = 2500.0;
    val quantidadeComprada: Int = 3;
    val taxaImposto: Double = 12.0;
    val margemLucro: Double = 20.0;

    val valorTotalSemImpostos: Double = precoUnitario * quantidadeComprada;
    val valorImposto: Double = valorTotalSemImpostos * (taxaImposto / 100);
    val valorTotalComImpostos: Double = valorTotalSemImpostos + valorImposto;
    val precoVenda: Double = valorTotalComImpostos * (1 + margemLucro / 100);

    val decimalFormat = DecimalFormat("R$ #,##0.00");
    val valorTotalComImpostosFormatado = decimalFormat.format(valorTotalComImpostos);
    val precoVendaFormatado = decimalFormat.format(precoVenda);

    val mensagemFinal = "Produto: $nomeProduto\n" + "Valor Total com Impostos: $valorTotalComImpostosFormatado\n" + "Preço de Venda Sugerido: $precoVendaFormatado";

    println("Nome do Produto: $nomeProduto");

    println("Preço Unitário: R$${"%.2f".format(precoUnitario)}");

    println("Quantidade Comprada: $quantidadeComprada");

    println("Taxa de Imposto: $taxaImposto%");

    println("Margem de Lucro: $margemLucro%");

    println("Valor Total Sem Impostos: R$${"%.2f".format(valorTotalSemImpostos)}");

    println("Valor do Imposto: R$${"%.2f".format(valorImposto)}");

    println("Valor Total com Impostos: $valorTotalComImpostosFormatado");

    println("Preço de Venda Sugerido: $precoVendaFormatado");

    println(mensagemFinal);
}