class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuffer sizeString = new StringBuffer();
        StringBuffer actualString = new StringBuffer(); 
        for(String str: strs){
            sizeString.append(str.length()+",");
            actualString.append(str);
        }
        return sizeString+"#"+actualString;
    }

    public List<String> decode(String str) {
        if(str.length() == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();

        int separatorIndex = str.indexOf('#');
        String sizePart = str.substring(0, separatorIndex);
        String contentPart = str.substring(separatorIndex + 1);

        int[] sizes = Arrays.stream(sizePart.split(","))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        int i = 0;
        for(int x : sizes){
            result.add(contentPart.substring(i, i + x));
            i += x;
        }

        return result;

    }
}
