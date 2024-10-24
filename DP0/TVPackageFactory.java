package org.example.DP0;

class TVPackageFactory {
    public static TVPackage createPackage(String type) {
        switch (type) {
            case "Lite":
                return new LitePackage();
            case "Plus":
                return new PlusPackage();
            default:
                throw new IllegalArgumentException("Unknown package type: " + type);
        }
    }
}
