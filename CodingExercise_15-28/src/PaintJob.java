public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double coveredArea = width * height;
        double buckets = Math.ceil(coveredArea / areaPerBucket);
        return (int) buckets - extraBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ) {
            return -1;
        }

        double coveredArea = width * height;
        double buckets = Math.ceil(coveredArea / areaPerBucket);
        return (int) buckets;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

       double buckets = Math.ceil(area / areaPerBucket);
        return (int) buckets;
    }
}
