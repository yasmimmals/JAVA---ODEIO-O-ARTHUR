public class SmartTv {
    private String marca, modelo;
    private int volume;

    public SmartTv(){ // SmartTv obj1 = new Smart()


    }
    public SmartTv(String marca, String modelo, int volume){
        this.marca = marca;
        this.modelo = modelo;
        this. setVolume(volume);
    }
    // setters e getters
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }
    public int getVolume(){
        return this.volume;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
}












// Encapsulamento é guardar para proteger, o meu objetivo é esconder para prevenir mau uso
// podemos encapsular variaveis e metódos
// para encapsular variavel é proibido usar public e vão passar a ser private