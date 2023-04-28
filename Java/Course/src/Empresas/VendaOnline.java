package Empresas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import SiteVendas.ImportedProduct;
import SiteVendas.Product;
import SiteVendas.UsedProduct;

public class VendaOnline {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> produtos = new ArrayList<>();
        System.out.print("Quantos produtos serão comprados? ");
        int quantidade = sc.nextInt();
        for(int i = 0; i < quantidade; i++){
            System.out.printf("\nProduto #%d\n", i+1);
            System.out.print("Comum, importado ou usado?[c, i, u] ");
            char tipo = sc.next().charAt(0);
            System.out.print("Qual o nome do produto? ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Qual o preço do produto? ");
            double price = sc.nextDouble();
            if (tipo == 'i') {
                System.out.print("Qual a taxa? ");
                double customFee = sc.nextDouble();
                produtos.add(new ImportedProduct(name, price, customFee));
            }
            else if(tipo == 'u'){
                System.out.print("Quando foi produzido? ");
                Date ManufactureDay = sdf.parse(sc.next());
                produtos.add(new UsedProduct(name, price, ManufactureDay));
            }
            else{
                produtos.add(new Product(name, price));
            }
        }
        System.out.println("\nEtiquetas: ");
        for(Product p : produtos){
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
