package adapter;

public class AdaptadorSistema implements SistemaExterno {

    private SistemaViejo sistemaViejo;

    public AdaptadorSistema(SistemaViejo sistemaViejo) {
        this.sistemaViejo = sistemaViejo;
    }

    @Override
    public void activar() {
        sistemaViejo.encenderSistema();
    }
}