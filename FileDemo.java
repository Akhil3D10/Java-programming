import java.io.*;
class FileDemo
{

public static void main(String[] args)
{
File f1=new File("cvr.txt");
System.out.println("canread :"+f1.canRead());
System.out.println("canwrite :"+f1.canWrite());
System.out.println("exists :"+f1.exists());
System.out.println("isDirectory:"+f1.isDirectory());
System.out.println("isFile :"+f1.isFile()); 
System.out.println("isHidden :"+f1.isHidden());
System.out.println("lastModified :"+f1.lastModified()); 
System.out.println("length :"+f1.length());
}
}