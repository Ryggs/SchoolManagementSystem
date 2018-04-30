class User {
    private int roll;
    private String name, email;
    private long contact;
    
    public User(int roll, String name, String email, long contact){
    
        this.roll=roll;
        this.name=name;
        this.email=email;
        this.contact=contact;
        
    }
    
    public int getRoll(){
        return roll;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public long getContact(){
        return contact;
    }
    
}
