package file;

public class Attachment//附件
{
    private String name;	//文件名

    private byte[] contents; 
    //文件内容放入字节数组

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public byte[] getContents()
    {
        return contents;
    }

    public void setContents(byte[] contents)
    {
        this.contents = contents;
    }
}
