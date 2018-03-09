package com.hradecek.patterns.creational.factorymethod.ex01;

class Demo {
    public static void main(String... args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1, image.length());

        switch(format) {
            case "gif":
                reader = new GifReader(image);
            case "jpeg":
                reader = new JpegReader(image);
        }
        assert reader != null;
        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
