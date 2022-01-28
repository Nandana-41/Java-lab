class Main
{

    public static void main(String[] args)
    {
        Main obj = new Main();
        obj=null;
        System.gc();
    }
    public void finalize()
    {
        System.out.println("Garbage Collected");
    }
}
