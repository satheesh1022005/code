static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c); 
        int maxDistance = Math.max(c[0],n-1-c[c.length-1]); 
        for (int i=1;i<c.length;i++) {
            int distance = (c[i]-c[i-1])/2;
            maxDistance = Math.max(maxDistance, distance);
        }
        return maxDistance;
    }