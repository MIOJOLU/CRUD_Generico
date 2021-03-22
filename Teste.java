import java.io.File;
import java.io.IOException;

public class Teste {
    public static void main(String[] args) throws IOException {

        CRUD<Produto> arqProd;

        Produto p1 = new Produto(3.99F, "Biscoito", 30,"Negresco");
        Produto p2 = new Produto(1.50F, "Refri", 100, "Coca");
        Produto p3 = new Produto(100F, "Capa de Celular", 20, "WB");

        int id1, id2, id3;

        try {
            new File("produtos.db").delete();
            arqProd = new CRUD<>(Produto.class.getConstructor(), "produtos.db");

            id1 = arqProd.create(p1);
            p1.setID(id1);
            id2 = arqProd.create(p2);
            p2.setID(id2);
            id3 = arqProd.create(p3);
            p3.setID(id3);

            System.out.println(arqProd.read(id3));
            System.out.println(arqProd.read(id1));

            p2.setMarca("Guaraná");
            arqProd.update(p2);
            System.out.println(arqProd.read(id2));

            p1.setMarca("Oreo");
            arqProd.update(p1);
            System.out.println(arqProd.read(id1));

            arqProd.delete(id3);
            Produto p = arqProd.read(id3);
            if (p == null)
                System.out.println("Produto excluído");
            else
                System.out.println(p.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
