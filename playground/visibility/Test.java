// compilation error since private and protected classes not allowed at the top
protected class Test {
    private int x;
    private int y;

    public Test() {
        this.x = 0;
        this.y = 0;
    }

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }
}