import java.util.ArrayList;

public enum Setor {
    REQUISITOS("Requisitos"),
    MODELAGEM("Modelagem"),
    CODIFICACAO("Codificação"),
    TESTES("Testes"),
    RECURSOS_HUMANOS("Recursos Humanos");

    ArrayList <Contrato>contratos = new ArrayList<Contrato>();
    private String nome;

    private Setor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Contrato> getContratos(){
        return contratos;
    }

    public void contratarFuncionario(Contrato contrato){
        contratos.add(contrato);
  }

  public void demitirFuncionario(Contrato contrato){
        contratos.remove(contrato);    
  }
}

/*
Setor[] values = Setor.values();

       Arrays.asList( values ).forEach(setor -> {
           System.out.print( setor.name() );
           System.out.print( " = " );
           System.out.println( setor.getDescricao() );
       });
*/