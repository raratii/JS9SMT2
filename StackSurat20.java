public class StackSurat20 {
    Surat20[] stack;
    int top;
    int size;

    public StackSurat20(int size) {
        this.size = size;
        stack = new Surat20[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Surat20 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Stack surat penuh!");
        }
    }
    public Surat20 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat yang bisa diproses.");
            return null;
        }
    }
    public Surat20 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Belum ada surat yang masuk.");
            return null;
        }
    }
    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
