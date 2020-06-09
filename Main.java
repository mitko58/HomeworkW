public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine(20, 5, "white");
        Machine engine = new Engine(30, 6, "black");
        Machine productionEngine = new ProductionEngine(40, 7, "green");
        Person person = new Person();
        HeatManager wrapperEngine = new WrapperEngine(150);
        HeatManager heatEngine = new HeatEngine( 170);

        Machine[] machines = {machine, engine, productionEngine};
        for (Machine value : machines) {
            System.out.println("Мощността e " + value.getPower());
        }

        HeatManager[] heatManager = {wrapperEngine, heatEngine};
        for (HeatManager manager : heatManager) {
            System.out.println("Максималната работна температура е " + manager.temperature);
        }
    }
}
