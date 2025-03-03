public class Main{
    public static void main(String[] holi){
	// objetos a repartir
	String[] obj = {"obj1","obj2","obj3","obj4","obj5","obj6"};
	
	// personas participantes 
	String[] names = {"part1","part2","part3"};
	
	//primer parámetro (número de integrantes)
	Roulette roulette = new Roulette(names.length,obj,names);
	roulette.repartir();
    }
}
