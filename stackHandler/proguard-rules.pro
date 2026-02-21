-ignorewarnings
-dontwarn **

-dontoptimize
-dontshrink
-dontpreverify

-keepattributes *Annotation*,Signature,InnerClasses,EnclosingMethod,SourceFile,LineNumberTable

-keep public class umg.edu.gt.handler.App {
    public static void main(java.lang.String[]);
}

-keep class umg.edu.gt.handler.SymbolValidator { *; }