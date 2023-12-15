import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        dataPrecedente(data1, data2);
        dataPrecedente(data2, data1);
        oraUguale(data1, data2);
    }
    public static void dataPrecedente (OffsetDateTime dataN1, OffsetDateTime dataN2) {
        if (dataN1.getYear() < dataN2.getYear()) {
            System.out.println("prima data inserita è precedente");
        } else if (dataN1.getYear() == dataN2.getYear() && dataN1.getMonthValue() < dataN2.getMonthValue()) {
            System.out.println("prima data inserita è precedente");
        } else if (dataN1.getMonthValue() == dataN2.getMonthValue() && dataN1.getDayOfYear() < dataN2.getDayOfYear()) {
            System.out.println("prima data inserita è precedente");
        } else {
            System.out.println("prima data inserita non è precedente");
        }
    }

    public static void oraUguale (OffsetDateTime dataN1, OffsetDateTime dataN2) {
        if (dataN1.getHour() == dataN2.getHour()) {
            System.out.println("Le date hanno ora uguale");
        } else {
            System.out.println("Le date non hanno ora uguale");
        }
    }
}
