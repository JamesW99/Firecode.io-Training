package level1;

public static boolean areAllCharactersUnique(String str){

        if (str == null)
        return true;
        if (str == "")
        return true;

        char[] arr = str.toCharArray(); //string converted to be char array

        for(int i = 0; i < arr.length; i++){
        for(int j = i + 1; j < arr.length; j++){
        //System.out.println(arr[i]);
        if (arr[i] == arr[j])
        return false;
        }
        }

        return true;

        }