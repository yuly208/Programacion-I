package model;

public enum Especialidad {
    MEDICINA_GENERAL(0),
    CIRUJIA(1),
    DERMATOLOGIA(2);

    private final int codigo;

    private Especialidad(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public static Especialidad obtenerCodigo(int codigo){
        for(Especialidad e : Especialidad.values()){
            if(e.getCodigo() == codigo){
                return e;
            }
        }
        return null;
    }

}
