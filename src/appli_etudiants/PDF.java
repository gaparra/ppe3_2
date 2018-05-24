/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

//C:\Users\gaelp\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar
//C:\Users\gaelp\.m2\repository\junit\junit\4.12\junit-4.12.jar
//C:\Users\gaelp\.m2\repository\log4j\log4j\1.2.17\log4j-1.2.17.jar
//C:\Users\gaelp\.m2\repository\ch\qos\logback\logback-classic\1.1.3\logback-classic-1.1.3.jar
//C:\Users\gaelp\.m2\repository\ch\qos\logback\logback-core\1.1.3\logback-core-1.1.3.jar
//C:\Users\gaelp\.m2\repository\org\slf4j\slf4j-api\1.7.13\slf4j-api-1.7.13.jar
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.test.annotations.WrapToTest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gaelp
 */
@WrapToTest
public class PDF {

    public static String DEST;

// 
//    public static void main(String args[]) throws IOException {
//        File file = new File(DEST);
//        file.getParentFile().mkdirs();
//        new PDF().createPdf(DEST);
//    }
    public static List recupElementsListe(ArrayList<String> liste) throws IOException {
        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        // Create a List
        List list = new List()
                .setSymbolIndent(12)
                .setListSymbol("\u2022")
                .setFont(font);
        // Add ListItem objects
        for (int i = 0; i < liste.size(); i++) {
            list.add(new ListItem(liste.get(i) + " : " + liste.get(i + 1)));
            i++;

        }
        return list;
    }

    public static void creaList(String chemin, ArrayList<String> listeStage, ArrayList<String> listeHobbie,
            ArrayList<String> listeForm, ArrayList<String> listeLangue, ArrayList<String> listePermis,
            String nom, String prenom, String nais, String tel, String adresse, String ville, Integer cp, String mail) throws IOException {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(chemin);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);

        // Initialize document
        Document document = new Document(pdf);

        // Create a PdfFont
        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        // Add a Paragraph
        document.add(new Paragraph(prenom).setFont(font).setBold().setFontSize(25));
        document.add(new Paragraph(nom).setFont(font).setBold().setFontSize(25));

        //age
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date();
        Integer age = Integer.parseInt(dateFormat.format(date)) - Integer.parseInt(nais);
        Paragraph textage = new Paragraph();
        textage.add(String.valueOf(age)).setFont(font);
        textage.add(" ans").setFixedPosition(130, 775, 200).setFontSize(10);
        document.add(textage); //fin age
        document.add(new Paragraph(  tel).setFixedPosition(130, 760, 200)).setFontSize(10);
        document.add(new Paragraph(adresse + " " + cp + " " + ville).setFixedPosition(130, 745, 200)).setFontSize(10);
        document.add(new Paragraph( mail).setFixedPosition(130, 730, 200)).setFontSize(10);

        document.add(new Paragraph("Mes Stages ").setFont(font).setBold());
        // Add the list
        document.add(PDF.recupElementsListe(listeStage));
        document.add(new Paragraph("Mes Hobbies ").setFont(font).setBold());
        // Add the list
        document.add(PDF.recupElementsListe(listeHobbie));
        document.add(new Paragraph("Mes Formations ").setFont(font).setBold());
        // Add the list
        document.add(PDF.recupElementsListe(listeForm));
        document.add(new Paragraph("Les Langues que je pratique ").setFont(font).setBold());
        // Add the list
        document.add(PDF.recupElementsListe(listeLangue));
        document.add(new Paragraph("Mes Permis ").setFont(font).setBold());
        // Add the list
        document.add(PDF.recupElementsListe(listePermis));
//      /photo/god-of-war-ps4-28d4d7e7
        //Close document
        document.close();
    }

    public static void creaPDF(ArrayList<String> listeStage, ArrayList<String> listeHobbie, ArrayList<String> listeForm, ArrayList<String> listeLangue,
            ArrayList<String> listePermis, String nom, String prenom, String nais, String chemin, String tel, String ville, String adresse, Integer cp, String mail) throws IOException {
        File file = new File(chemin + "/CV.pdf");
        file.getParentFile().mkdirs();
        chemin = chemin + "/CV.pdf";
        new PDF().creaList(chemin, listeStage, listeHobbie, listeForm, listeLangue, listePermis, nom, prenom, nais, tel, ville, adresse, cp, mail);
    }

//
//
//
//
//
//CREATION PDF DE BASE
//
//
//
//
//
//
    public static void crea(String test) throws IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new PDF().createPdf(DEST, test);
    }

    public static void createPdf(String dest, String test) throws IOException {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);

        // Initialize document
        Document document = new Document(pdf);

        //Add paragraph to the document
        document.add(new Paragraph(test));

        //Close document
        document.close();
    }

}
