class Switch {
    public static void main(String args[]) {
        String city = "New";
        switch (city) {
            case "Surat": {
                System.out.println("City is surat");
                break;
            }
            case "anand": {
                System.out.println("city is anand");
                break;
            }
            case "Ahmedabad": {
                System.out.println("City is ahmedabad");
                break;
            }
            default: {
                System.out.println("none");
                break;
            }
        }
    }
}