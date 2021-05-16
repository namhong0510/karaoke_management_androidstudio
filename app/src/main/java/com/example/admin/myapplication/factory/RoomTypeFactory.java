public class RoomTypeFactory {
    private RoomTypeFactory() {
        public static final RoomType getRoomType(RoomTypes rt) {
            switch (rt) {
                case id:
                    return new TypeID();
                case name:
                    return new TypeName();
                case price:
                    return new TypePrice();
                default:
                throw new IllegalArgumentException("This room type is unsupported");
            }
        }
    }
}

public enum RoomTypes() {
    id, name, price;
}