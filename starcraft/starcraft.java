package starcraft;

public class starcraft {
    public static void main(String[] args) {
        Zerg drone = new Zerg();
        Zerg zergling = new Zerg();
        Zerg roach = new Zerg();
        Zerg hydralisk = new Zerg();
        Zerg baneling = new Zerg();

        drone.nome = "Uma unidade trabalhadora que coleta recursos e constrói estruturas.";
        zergling.nome = "Uma unidade de infantaria rápida e barata, ideal para ataques rápidos e flanqueamentos.";
        roach.nome = "Uma unidade de infantaria terrestre robusta, eficaz contra unidades terrestres e com capacidade de regeneração de vida.";
        hydralisk.nome = "Uma unidade de infantaria terrestre de longo alcance, capaz de atacar tanto unidades terrestres quanto aéreas.";
        baneling.nome = "Uma unidade suicida que explode ao se aproximar de unidades inimigas, causando danos em área.";

        Protoss probe = new Protoss();
        Protoss zealot = new Protoss();
        Protoss stalker = new Protoss();

        probe.nome = "Uma unidade trabalhadora que constrói estruturas e coleta recursos.";
        zealot.nome = "Uma unidade de infantaria corpo a corpo, robusta e eficaz contra unidades terrestres.";
        stalker.nome = "Uma unidade de infantaria que pode atacar tanto terrestres quanto aéreas. Possui capacidade de teletransporte curto, o que lhe confere mobilidade adicional.";

        Terrano marine = new Terrano();
        Terrano siegeTank = new Terrano();
        Terrano medivac = new Terrano();
        Terrano banshee = new Terrano();

        marine.nome = "Uma unidade de infantaria básica, rápida e versátil. É eficaz contra outras unidades de infantaria e pode ser aprimorada para ter melhorias adicionais.";
        siegeTank.nome = "Uma unidade de veículo que pode alternar entre modos de cerco e assalto. No modo de cerco, pode causar danos pesados a unidades .";
        medivac.nome = "Uma nave de suporte que pode transportar unidades de infantaria e curá-las. É essencial para movimentos rápidos de tropas e para manter a infantaria viva durante os combates.";
        banshee.nome = "Uma aeronave furtiva que pode atacar unidades terrestres e aéreas. É particularmente eficaz contra unidades de infantaria e estruturas.";
    }

    public static class Zerg {
        public String nome;
    }

    public static class Protoss {
        public String nome;
    }

    public static class Terrano {
        public String nome;
    }
}
