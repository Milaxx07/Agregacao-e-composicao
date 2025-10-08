import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<ItemPedido> itens = new ArrayList<>();
    class ItemPedido {
        String nomeProduto;
        int quantidade;
        double precoUnitario;

        ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        double subtotal() {
            return quantidade * precoUnitario;
        }
    }

    public void adicionarItem(String nomeProduto, int quantidade, double precoUnitario) {
        ItemPedido item = new ItemPedido(nomeProduto, quantidade, precoUnitario);
        itens.add(item);
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }
}
