package recap.abstraction;

public abstract class AbstractParent {

    public AbstractParent(int var1, String var2, boolean var3, int var4) {
        this.var1 = var1;
        this.var4 = var4;
        this.var2 = var2;
        this.var3 = var3;
    }

    public int var1;
    public int var4;
    public String var2;
    public boolean var3;

    public abstract int getSumOfVar1And4();
    public abstract String firstThreeChars();

}
