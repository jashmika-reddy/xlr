class Demo054 {
    void display(int num) {
        System.out.println("Integer value: " + num);
    }
    void display(double num) {
        System.out.println("Double value: " + num);
    }
    void display(int num, String text) {
        System.out.println("Integer: " + num + ", String: " + text);
    }
    void display(String text, int num) {
        System.out.println("String: " + text + ", Integer: " + num);
    }
    public static void main(String[] args) {
        Demo054 obj = new Demo054();
        obj.display(10);
        obj.display(10.5);
        obj.display(42, "Hello");
        obj.display("Java", 100);
    }
}

