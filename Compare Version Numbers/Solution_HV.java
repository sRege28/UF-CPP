class Solution_HV{
    public int compareVersion(String version1, String version2) {
        if(version1.length()==0 && version2.length()==0)
            return 0;
        if(version1.length()==0)
            return -1;
        if(version2.length()==0)
            return 1;
        String[] strarr1=version1.split("\\.");
        String[] strarr2=version2.split("\\.");
        int l=Math.min(strarr1.length,strarr2.length);
        int[] arr1=strToInt(strarr1);
        int[] arr2=strToInt(strarr2);
        for(int i=0;i<l;i++){
            if(arr1[i]>arr2[i])
                return 1;
            else if(arr1[i]<arr2[i])
                return -1;
        }
        
        if(arr1.length>arr2.length)
        {
            for(int i=l;i<arr1.length;i++)
            {
                if(arr1[i]>0)
                    return 1;
            }
        }
        else if(arr1.length<arr2.length)
            {
            for(int i=l;i<arr2.length;i++)
            {
                if(arr2[i]>0)
                    return -1;
            }
        }
        return 0;
    }
    public int[] strToInt(String[] arr){
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=Integer.parseInt(arr[i]);
        }
        return res;
    }
}