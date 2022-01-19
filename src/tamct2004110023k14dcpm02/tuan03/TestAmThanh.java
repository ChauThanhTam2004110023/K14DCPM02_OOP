package tamct2004110023k14dcpm02.tuan03;

public class TestAmThanh {
    public static void main(String[] args) {
        AmThanh am = new AmThanh("Tam Giác", "Đỏ", "360", "Ùn Ùn");
        am.print_Shape();
        am.print_Color();
        am.print_turn();
        am.print_sound();
        AmThanh am1 = new AmThanh("Hình vuông", "Xanh", "360", "Ầm Ầm");
        am1.print_Shape();
        am1.print_Color();
        am1.print_turn();
        am1.print_sound();
        AmThanh am2 = new AmThanh("Tròn", "Trắng", "360", "Bằng Bằng");
        am2.print_Shape();
        am2.print_Color();
        am2.print_turn();
        am2.print_sound();

    }
}
