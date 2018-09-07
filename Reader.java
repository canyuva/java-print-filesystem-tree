

public class Reader {
     
    public void printTree(File[] arr,int index,int level) {
        

        if(index == arr.length)
            return ;

        for (int i = 0; i < level; i++)
           System.out.print("\t");

        if(arr[index].isFile()){
            
            System.out.println("|--"+arr[index].getName());
        }
        else if(arr[index].isDirectory())
        {
            System.out.println("|--"+arr[index].getName());
        
            printTree(arr[index].listFiles(), 0, level + 1);
        }

        printTree(arr,++index, level);

    }

    public void getTree(String rootPath){

        File root = new File(rootPath);

        if(root.exists() && root.isDirectory())
        {
            File arr[] = root.listFiles();
            printTree(arr,0,0);
        }

    }


}
