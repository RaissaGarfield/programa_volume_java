public class Prisma {
    public static double calcularPrisma(double raio, double altura){
        double volume = 0.0;
        volume = (3* Math.sqrt(3) * raio * raio * altura)/2.3;
        return volume;
    }
}
