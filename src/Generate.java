import tags.Img;

public interface Generate {


    default String HEIGHT(int i){
        return " height=\"" + i + "\"";
    }
    default String WIDTH(int i){
        return " width=\"" + i + "\"";
    }

    default String IMG(){
        return new Img().getImgHTML();
    }
    default String IMG(String src){
        return new Img(src).getImgHTML();
    }
    default String IMG(String src, int w, int h){
        return new Img(src, w, h).getImgHTML();
    }

}
