import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.regex.*;

public class ImageDownloader {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java ImageDownloader <URL>");
            return;
        }

        try {
            URL url = new URL(args[0]);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder html = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                html.append(linea);
            }
            reader.close();
            Path directorio = Path.of("imagenes");
            Files.createDirectories(directorio);

            Matcher matcher = Pattern.compile("src=[\"'](.*?)[\"']").matcher(html.toString());
            int count = 1;

            while (matcher.find()) {
                String imgUrlStr = matcher.group(1);
                try {
                    URL imgUrl = new URL(url, imgUrlStr);
                    InputStream in = imgUrl.openStream();
                    Path destino = directorio.resolve("imagen_" + count + ".png");

                    Files.copy(in, destino, StandardCopyOption.REPLACE_EXISTING);
                    in.close();

                    System.out.println("Descargada: imagen_" + count);
                    count++;
                } catch (Exception e) {
                }
            }
            System.out.println("¡Proceso terminado!");

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}