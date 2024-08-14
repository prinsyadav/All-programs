class countnumberofwords{
    public static void main(String[] args){

        String words="Hello there!!, my name is Prince.";
        int countwords = words.split("\\s").length;
        System.out.println(countwords);
    }
}