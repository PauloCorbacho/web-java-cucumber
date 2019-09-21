package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class UtilRelatorio {
    private static File file;

    public static void criarDiretorioParaSalvarPrint(String diretorio){
        File folder = new File(diretorio);
        if (folder.isDirectory()) {
            File[] sun = folder.listFiles();
            for (File toDelete : sun) {
                toDelete.delete();
            }
        }else {
            new File(diretorio).mkdir();
        }
    }
    public static void realizarCapturaDeTela() throws IOException, HeadlessException, AWTException
    {
        criarDiretorioParaSalvarPrint((System.getProperty("user.home") + "\\Desktop\\ImagensProva"));
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File((System.getProperty("user.home") + "\\Desktop\\ImagensProva\\Imagem.png    ")+ "PrintTest.png"));
    }

    public void gerarRelatorio(String NomeDoRelatorio){
        ExtentHtmlReporter Reporter = new ExtentHtmlReporter("src/reports/" + NomeDoRelatorio +".html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(Reporter);
        ExtentTest logger=extent.createTest("LoginTest");
        logger.log(Status.INFO, "Teste");
        logger.log(Status.PASS, "Passou o teste! ");
        extent.flush();
    }
}
