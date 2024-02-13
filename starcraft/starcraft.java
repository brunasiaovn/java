package starcraft;

public class starcraft {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();

        zerg1.nome = "z1";
        zerg2.nome = "z2";
        zerg3.nome = "z3";
        zerg4.nome = "z4";
        zerg5.nome = "z5";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();

        protoss1.nome = "p1";
        protoss2.nome = "p2";
        protoss3.nome = "p3";

        Terrano terran01 = new Terrano();
        Terrano terran02 = new Terrano();
        Terrano terran03 = new Terrano();
        Terrano terran04 = new Terrano();

        terran01.nome = "terrano1";
        terran02.nome = "terrano2";
        terran03.nome = "terrano3";
        terran04.nome = "terrano4";
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
