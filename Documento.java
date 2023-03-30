
public class Documento
{
    private int numeroDePaginas;
    private int numDocumento;
    private int anoDocumento;
    private String dataDocumento;
    
    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }
    public int getNumDocumento(){
        return numDocumento;
    }
    public int getAnoDocumento(){
        return anoDocumento;
    }
    public String getDataDocumento(){
        return dataDocumento;
    }
    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public void setNumDocumento(int numDocumento){
        this.numDocumento = numDocumento;
    }
    public void setAnoDocumento(int anoDocumento){
        this.anoDocumento = anoDocumento;
    }
    public void setDataDocumento(String dataDocumento){
        this.dataDocumento = dataDocumento;
    }
}
