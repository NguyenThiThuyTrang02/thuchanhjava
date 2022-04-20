package phuongtien;

 class TaxiCar implements Car {
    public void move(){
        System.out.println(" xe roi đi");
    }
    public void stop(){
        System.out.println("xe dung lai");
    }
    public void turnRight(){
        System.out.println("xe re phai");
    }
    public void turnLeft(){
        System.out.println("xe re trái");
    }
    public void reverse(){
        System.out.println("xe quay dau");
    }
}
