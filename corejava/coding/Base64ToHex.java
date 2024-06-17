package corejava.coding;

import java.util.Base64;

public class Base64ToHex {

    public static String base64ToHex(String base64String) {
        byte[] decodedBytes = Base64.getDecoder().decode(base64String);
        return bytesToHex(decodedBytes);
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b & 0xFF));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String base64String = "AEACGJ8kAQKfAgIBAFoIQRERERERERFfKgIJeAMCJJ8kCAQAAAAAAAAAXyoCCCafAgMSNFZaCDeCgiRjEABfnwMBAAM="; // Example base64 string (converts to "Hello World")
        String hexString = base64ToHex(base64String);
        System.out.println("Hexadecimal: " + hexString);
    }
}
