public class Contenedor implements Comparable<Contenedor>{

    private Integer numeroId;
    private PaisProcedencia paisProcedencia;
    private Boolean transportaMaterialesPeligrosos;

    public Contenedor(Integer numeroId, PaisProcedencia paisProcedencia, Boolean transportaMaterialesPeligrosos) {
        this.numeroId = numeroId;
        this.paisProcedencia = paisProcedencia;
        this.transportaMaterialesPeligrosos = transportaMaterialesPeligrosos;
    }

    public Boolean getTransportaMaterialesPeligrosos() {
        return transportaMaterialesPeligrosos;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numeroId=" + this.numeroId +
                ", paisProcedencia='" + this.paisProcedencia + '\'' +
                ", transportaMaterialesPeligrosos=" + this.transportaMaterialesPeligrosos +
                '}';
    }

    @Override
    public int compareTo(Contenedor o) {
        return this.numeroId.compareTo(o.numeroId);
    }
}
