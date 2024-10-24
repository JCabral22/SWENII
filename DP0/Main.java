package org.example.DP0;

public class Main {
    public static void main(String[] args) {
//        old code
//        String[] packages = {"Lite", "Plus", "Lite", "Lite"};
//        for (String p: packages){
//            if ( p == "Lite"){ //create a lite package
//                LiteData ld = new LiteData();
//                LiteTV lt = new LiteTV();
//                System.out.println(
//                        p+" package has "+
//                                ld.getLiteDownload()+" download and "+
//                                lt.getLiteChannels()+" channels"
//                );
//            }else if (p == "Plus"){ //create a plus package
//                PlusData pd = new PlusData();
//                PlusTV pt = new PlusTV();
//                System.out.println(
//                        p+" package has "+
//                                pd.getPlusDownload()+" download and "+
//                                pt.getPlusChannels()+ " channels"
//                );
//            }
//        }

        String[] packages = {"Lite", "Plus", "Lite", "Lite"}; //Thought about using an enum for this, decided not to
        for(String p : packages){
           TVPackage pkg = TVPackageFactory.createPackage(p);
           pkg.print();
        }

    }
}