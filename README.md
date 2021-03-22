## **CRUD GENÉRICO - Individual**
#### *Nome:* Luiza Ribeiro Parente Silva
---
### **Registro**
Essa entidade foi desenvolvida como interface para o trabalho do crud, servindo como assinatura das funções que foram implementadas nas classes Produto.java e CRUD.java.

Portanto nessa classe temos os métodos:
<ol>
<li><b>public int getID() e public void setID(int n):</b> Métodos utilizados para a manipulação dos IDS gerados durante o create do CRUD;</li>
<li><b>public byte[] toByteArray() e
  public void fromByteArray(byte[] b):</b> Métodos utilizados para a leitura de um arquivo em bytes (abstraindo as informações dele) e a tradução de um objeto e seus atributos para a escrita em arquivos.</li>
</ol>

---
### **Produto**
A classe *Produto.java* implementa a interface Registro. Nela criei os atributos: preco, nome, qnt, marca e ID que definem a estrutura de um Produto. Os métodos encontrados nessa classe são:
1. **public Produto(float p, String n, int q, String m)** e **public Produto():** Construtores
2. **public float getPreco(), public void setPreco(),public String getNome(), public void setNome(String nome), public int getQnt(), public void setQnt(int qnt), public String getMarca(),public void setMarca(String marca), public int getID(), public void setID(int ID):** Gets e Sets para acessar os atributos.
3. **public byte[] toByteArray() e public void fromByteArray(byte[] b):** Escreve os atributos no registro e retira as informações do registro, respectivamente.
---
### **CRUD**
A classe *CRUD.java* extende a Registro. Nela tem os atributos: arquivo (RandomAccessFile), arq (String) para captar o nome do arquivo e construtor (Constructor <T>)