package maven.jenkins.test;

public class Main {
    public static void main(String[] args) {
        Laskin laskin = new Laskin();
        System.out.println("Etäisyys = " + laskin.laskeEtaisyys(2, 2, 5, 5));
    }
}