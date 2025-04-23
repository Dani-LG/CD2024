package daniellg.com;

public class Fecha {
    private static int num31 = 31;
    private static int num12 = 12;
    private static int num30 = 30;
    private static int num400 = 400;
    private static int num4 = 4;
    private static int num100 = 100;
    private static int num29 = 29;
    private static int num28 = 28;
    private static final int NUM3 = 3;
    private static final int NUM4 = 4;
    private static final int NUM5 = 5;
    private static final int NUM6 = 6;
    private static final int NUM7 = 7;
    private static final int NUM8 = 8;
    private static final int NUM9 = 9;
    private static final int NUM10 = 10;
    private static final int NUM11 = 11;
    private static final int NUM12 = 12;
    private int dia;

    private int mes;

    private int anio;

    public Fecha(int dia, int mes, int anio) {

        this.dia = dia;

        this.mes = mes;

        this.anio = anio;
    }

    public boolean valida() {

        if (dia < 1 || dia > num31) {

            return false;
        }
        if (mes < 1 || mes > num12) {

            return false;
        }
        // determinamos la cantidad de días del mes:

        int diasMes = 0;

        switch (mes) {

            case 1:

            case NUM3:

            case NUM5:

            case NUM7:

            case NUM8:

            case NUM10:

            case NUM12:
                diasMes = num31;
                break;

            case NUM4:

            case NUM6:

            case NUM9:

            case NUM11:
                diasMes = num30;
                break;

            case 2: // verificación de año bisiesto

                if (anio % num400 == 0 || anio % num4 == 0 && anio % num100 != 0) {

                    diasMes = num29;
                } else {
                    diasMes = num28;
                }

                break;
            default:

        }

        return !(dia > diasMes);
    }

}
