/**
 * Created by �� on 04.09.2016.
 */
public class PrintIP {
    public static void main(String[] args) {
        myPrintIp("192.168.0.9","192.168.0.14");
    }

    protected static void myPrintIp(String firstIp, String secondIP) {
        int first = Integer.parseInt(firstIp.substring(firstIp.lastIndexOf('.') + 1, firstIp.length()));
        int second = Integer.parseInt(secondIP.substring(firstIp.lastIndexOf('.') + 1, secondIP.length()));
        // ���� ����� ��� �������� ip ����� ������ 1 �� �������
        for (int i = first + 1; i < second; i++) {
            System.out.println(new StringBuilder(firstIp).delete(firstIp.lastIndexOf('.') + 1, firstIp.length()).append(i));
        }
    }
}

