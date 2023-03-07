public class Main {

    public static void main(String[] args) {

        Table table = new Table(18, 17);

        table.addParam(" border=1 align=top");
        String src = "https://img.imgsmail.ru/static.promo/logo/logo_white.svg";

        for (Row r: table.getRows()){
            for (int i = 0; i < r.getCols().size(); i++) {
                Col col = r.getColByID(i);
                if (i == 0){
                    col.setContent(new Img(src).getImgHTML());
                } else if (i == 1) {
                    col.setContent(new Button("PRESS_ME", "bypass").getButtonHTML());
                } else {
                    col.setContent(i + "");
                }
            }

        }

//
//        table.getRowById(1).getColByID(1).setContent("ASDASDASDASD").addParam(" height=10");
//        Img img = new Img(src, 64, 64);
//        table.getRowById(1).getColByID(0).setContent(img.toString());

        String s = table.printTable();
        System.out.println(s);


    }
}