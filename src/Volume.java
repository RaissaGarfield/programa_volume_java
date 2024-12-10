import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = 0.0, altura = 0.0;
        double comprimento = 0.0, largura = 0.0, lado = 0.0;
        double volume = 0.0;
        int opcao = 0;

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println(" Programa: calcular volume de figuras geométricas    ");
            System.out.println("-----------------------------------------------------");
            System.out.println("   1 - Volume do Cilindro");
            System.out.println("   2 - Volume do Cone");
            System.out.println("   3 - Volume do Prisma");
            System.out.println("   4 - Volume da Esfera");
            System.out.println("   5 - Volume do Cubo");
            System.out.println("   6 - Volume da Pirâmide Quadrângular");
            System.out.println("   7 - Volume do Paralelepípedo");
            System.out.println("   0 - Sair");
            System.out.println("\n\n");
            System.out.println(" Escolha sua opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cilindro.calcularCilindro(raio,altura);

                    System.out.printf(" O volume do cilindro é: %.2f\n\n\n ",volume);

                    break;
                case  2:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cone.calcularVolume(raio,altura);

                    System.out.printf(" O volume do Cone é: %.2f\n\n\n ",volume);
                    break;
                case 3:
                    System.out.println("Digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Prisma.calcularPrisma(raio,altura);

                    System.out.printf(" O volume do Prisma é: %.2f\n\n\n ",volume);
                    break;
                case  4:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();

                    volume = Esfera.calcularEsfera(raio);

                    System.out.printf(" O volume da Esfera é: %.2f\n\n\n ",volume);
                    break;
                case  5:
                    System.out.println("Digite o valor do lado: ");
                    lado = sc.nextDouble();

                    volume = Cubo.calcularCubo(lado);

                    System.out.printf(" O volume do Cubo é: %.2f\n\n\n ",volume);
                    break;
                case  6:
                    System.out.println("Digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Piramide_quadrangular.calcularPiramideQuadrangular(lado, altura);

                    System.out.printf(" O volume da Pirâmide Quadrangular é: %.2f\n\n\n ",volume);
                    break;
                case  7:
                    System.out.println("Digite o valor do comprimento: ");
                    comprimento = sc.nextDouble();
                    System.out.println("Digite o valor da largura: ");
                    largura = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Paralelepipedo.calcularParalelepipedo(comprimento,largura, altura);

                    System.out.printf(" O volume da Paralelepípedo é: %.2f\n\n\n ",volume);
                    break;
                case 0:
                    System.out.println(" sair");
                    break;
                default:
                    System.out.println(" opção inválida !");
                    break;
            }


        }while (opcao != 0);

        sc.close();
    }
}
