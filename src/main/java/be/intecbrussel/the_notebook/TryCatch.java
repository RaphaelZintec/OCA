package be.intecbrussel.the_notebook;



class TryCatch {

    String testRef() {
        String str = "trying: ";
        try {
            throw new NullPointerException();
        } catch (NullPointerException npe) {
            return str+="bob";
        } finally {
            throw new NumberFormatException(str);
        }
    }

    int testPrim() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException npe) {
            return 10;
        } finally {
            return 20;
        }
    }

    public static void main(String[] args) {
        TryCatch t = new TryCatch();
        System.out.println(t.testRef());
        //System.out.println(t.testPrim());
    }


}