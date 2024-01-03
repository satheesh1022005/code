 public static String fairRations(List<Integer> B) {
    int ans = 0;
    int oddCount = 0;
    for (int i=0;i<B.size();i++) {
        if (B.get(i)%2!=0) {
            oddCount++;
        }
    }
    if (oddCount%2!=0) {
        return "NO";
    }

    for (int i=0;i<B.size();i++) {
        if (B.get(i) % 2 != 0) {
            B.set(i,B.get(i)+1);
            B.set(i+1,B.get(i+1)+1);
            ans += 2;
        }
    }

    return String.valueOf(ans);
}
