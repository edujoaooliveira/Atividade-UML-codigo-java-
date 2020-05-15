# Atividade-UML-codigo-java-
Pessoa/ Cargo/ Caneta
//PESSOA
package pessoa;
public class Pessoa {
    public static void main(String[] args){
        PessoaMain m1 = new PessoaMain();
        m1.setNome("Eduardo");
        m1.setIdade(27);
        m1.setEndereco("Rua 4 naus");
        m1.status();
        
    
    }

}
package pessoa;
public class PessoaMain {
    private String nome;
    private int idade;
    private String endereco;
    private int CEP;
    private String nomePai;
    private String nomeMae;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public void setEndereco(String e) {
        this.endereco = e ;
    }
    
    void status () {
        System.out.println("nome:" + this.nome);
        System.out.println("idade:" + this.idade);
        System.out.println("endereco:" + this.endereco);

    }
     
}
//CARGO
package cargo;
public class Cargo {
    public static void main(String[] args){
        CargoMain cm = new CargoMain();
        cm.setNome("Eduardo");
        cm.setCargaHoraria(4);
        cm.setDescricao("turno da noite");
        cm.setPisoSalarial(998);
        cm.status();
        
        
    }
    
}
package cargo;
public class CargoMain {
    private String nome;
    private int PisoSalarial;
    private String descricao;
    private int CargaHoraria;

    public String getNome() {
        return nome;
    }

    public int getPisoSalarial() {
        return PisoSalarial;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setPisoSalarial(int ps) {
        this.PisoSalarial = ps;
    }

    public void setDescricao(String d) {
        this.descricao = d;
    }

    public void setCargaHoraria(int ch) {
        this.CargaHoraria = ch;
    }
    

    void status () {
        System.out.println("nome:" + this.nome);
        System.out.println("PisoSalarial:" + this.PisoSalarial);
        System.out.println("descricao:" + this.descricao);
        System.out.println("CargaHoraria:" + this.CargaHoraria);

    }
     
}
//CANETA
package caneta01;
public class Caneta01 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        c1.setCor("preto");
        c1.setPonta(1);
        c1.setCarga(90);
        c1.status();
        
     
    }
    
}
package caneta01;
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void setCarga(int c) {
        this.carga = c;
    }

    void status () {
        System.out.println("modelo:" + this.modelo);
        System.out.println("cor:" + this.cor);
        System.out.println("ponta:" + this.ponta);
        System.out.println("carga:" + this.carga);

    }
     
}
