package be.intecbrussel.the_notebook;

class StringAndStringBuilder {

    public static void main(String[] args) {
        String s = "hallo";
        /*Only String*/
            s.concat("d"); //doesnt change var value
            System.out.println(s);

        StringBuilder sb = new StringBuilder("hallo");
        /*Only StringBuilder*/
            //sb.append("d");   //change var value: hallod
            //sb.insert(1,"d"); //change var value: hdallo
            //sb.delete(1,2);   //change var value: hllo
        System.out.println(sb.substring(1,2)); //doesnt change var value: a


    }


}