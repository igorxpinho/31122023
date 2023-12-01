import java.util.Scanner;

public class switchcase2 {
    public static void main(String[] args) {
        String[] comodos = {"Sala", "Cozinha", "Quarto", "Banheiro", "Varanda", "Garagem", "Lavabo" };
        for (short c = 0; c < comodos.length; c++) {
            System.out.println("Comodo [" + c +"] - " + comodos [c]);
        }
        Scanner scnComodo = new Scanner(System.in);
        System.out.println("Digite o numero do comodo o qual deseja acender a luz");
        short comodo = scnComodo.nextShort();

        switch (comodo) {
            case 0:
                 System.out.println("Você acertou! Acendendo a luz da sala");
                break;
            case 1:
                System.out.println("Você acertou! Acendendo a luz da sala");
                break;
            case 2:
                System.out.println("Você acertou! Acendendo a luz da sala");
                break;
            case 3:
                System.out.println("Você acertou! Acendendo a luz da sala");
                break;
            case 4:
                System.out.println("Você acertou! Acendendo a luz da sala");
                break;
            case 5:
                System.out.println("Você acertou! Acendendo a luz da sala");
                break;
            case 6:
                System.out.println("Você acertou! Acendendo a luz da sala");
                break;
        
            default:
            System.out.println("Interruptor inválido!");
                break;
        }
    }
}
