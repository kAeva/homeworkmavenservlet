package service;

public class PageParts {

    public static String getTag(String tag, String contx, String attributes) {
        attributes = attributes.length() > 0 ? " " + attributes : "";
        return "<" + tag + attributes + ">" + contx + "</" + tag + ">";
    }

    public static String getColumns(String[][] contx) {
        String tag = "\n<div class=\"row\">\n";
        for(String[] item: contx){
            tag += "\t<div class=\"" + item[1] + "\">\n\t\t" + item[0] + "\n\t</div>\n";
        }
        tag += "</div> <!-- end row -->\n";
        return tag;
    }
}
