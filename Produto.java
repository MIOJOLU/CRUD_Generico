import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;


public class Produto implements Registro{
    private float preco;
    private String nome;
    private int qnt;
    private String marca;
    private int ID;

    public Produto(float p, String n, int q, String m){
        this.preco = p;
        this.nome = n;
        this.qnt = q;
        this.marca = m;
    }

    public Produto() {
        this.preco = 0F;
        this.nome = "";
        this.qnt = -1;
        this.marca = "";
    }


    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQnt() {
        return this.qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }    

    @Override
    public String toString() {
        return "{" +
            " preco:'" + getPreco() + "'" +
            ", nome:'" + getNome() + "'" +
            ", qnt:'" + getQnt() + "'" +
            ", marca:'" + getMarca() + "'" +
            ", ID:'" + getID() + "'" +
            "}";
    }

    @Override
    public byte[] toByteArray() throws IOException {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        DataOutputStream d = new DataOutputStream(b);
        d.writeInt(ID);
        d.writeUTF(nome);
        d.writeUTF(marca);
        d.writeInt(qnt);
        d.writeFloat(preco);
        return b.toByteArray();
    }

    @Override
    public void fromByteArray(byte[] b) throws IOException {
        ByteArrayInputStream i = new ByteArrayInputStream(b);
        DataInputStream d = new DataInputStream(i);
        
        // this.ID = d.readInt();
        this.nome = d.readUTF();
        this.marca = d.readUTF();
        this.qnt = d.readInt();
        this.preco = d.readFloat();
        
    }
    
}
