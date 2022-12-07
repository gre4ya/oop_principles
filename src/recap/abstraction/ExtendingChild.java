package recap.abstraction;

import javafx.scene.Parent;

class ExtendingChild extends AbstractParent {

    public ExtendingChild(int var1, String var2, boolean var3, int var4) {
        super(var1, var2, var3, var4);
    }

    @Override
    public int getSumOfVar1And4() {
        return var1 + var4;
    }

    @Override
    public String firstThreeChars() {
        return var2.substring(0,3);
    }

    public static void main(String[] args) {
        AbstractParent ap = new ExtendingChild(2, "String", true, 3);
        System.out.println(ap.var1);
        System.out.println(ap.var4);
        System.out.println("Sum of var1 and var4 = " + ap.getSumOfVar1And4());
        System.out.println(ap.firstThreeChars());
    }

}
