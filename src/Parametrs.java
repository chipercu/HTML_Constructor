import tags.parameters.ParametrValue;

public class Parametrs {

    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    public static final String TOP = "top";
    public static final String CENTER = "center";

    public static String align(String value){
        return new ParametrValue(" align=\"",value).toString();
    }

    public static String valign(String value){
        return new ParametrValue(" valign=\"",value).toString();
    }

    public static String background(String value){
        return new ParametrValue(" background=\"",value).toString();
    }

    public static String color(String value){
        return new ParametrValue(" color=\"",value).toString();
    }

    public static String value(String value){
        return new ParametrValue(" value=\"",value).toString();
    }

    public static String action(String value){
        return new ParametrValue(" action=\"",value).toString();
    }

    public static String back(String value){
        return new ParametrValue(" back=\"",value).toString();
    }

    public static String fore(String value){
        return new ParametrValue(" fore=\"",value).toString();
    }

    public static String src(String value){
        return new ParametrValue(" src=\"",value).toString();
    }

    public static String cellpadding(int size){
        return new ParametrValue(" cellpadding=\"",size).toString();
    }

    public static String border(int size){
        return new ParametrValue(" border=", size).toString();
    }

    public static String cellspacing(int size){
        return new ParametrValue(" cellspacing=", size).toString();
    }

    public static String width(int size){
        return new ParametrValue(" width=", size).toString();
    }

    public static String FIXWIDTH(int size){
        return new ParametrValue(" FIXWIDTH=", size).toString();
    }

    public static String height(int size){
        return new ParametrValue(" height=", size).toString();
    }





}
