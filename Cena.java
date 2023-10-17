import java.util.ArrayList;
import java.util.List;

public class Cena {
        private final List<Luminaria> luminarias;

        public Cena(String nome){
            this.luminarias = new ArrayList<>();
        }
        public void adicionarLuminarias(Luminaria luminaria){
            if(!luminarias.contains(luminaria)){
                luminarias.add(luminaria);
            }
        }

        public void ligarLuminarias(){
            for (Luminaria luminaria : luminarias){
                luminaria.ligar();
            }
        }

        public void desligarLuminaras(){
            for(Luminaria luminaria : luminarias){
                luminaria.desligar();
            }
        }

    }


