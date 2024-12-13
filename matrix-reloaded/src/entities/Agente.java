package entities;

// import java.util.ArrayList;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private int nivelDePoder;
    // private Anomalia anomalia;
    // private ArrayList anomaliasAsignadas;

    public Agente(int id, String nombre, String habilidadEspecial, int nivelDePoder) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.nivelDePoder = nivelDePoder;
        // System.out.println("Nivel de agente: " + this.nivelDePoder);

    }
    // public void asignarAnomalia(){
    //     System.out.println("Lista de anomalias " + anomaliasAsignadas);
    // }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    public int getNivelDePoder() {
        return nivelDePoder;
    }

    public void setNivelDePoder(int nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }
    public void incrementarNivel(){
        nivelDePoder *= nivelDePoder;
    }

    // public void asignarMision(String mision) {
    //     this.misionAsignada = mision;
    // }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
