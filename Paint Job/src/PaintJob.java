public class PaintJob {
    public static void main(String[] args) {
        PaintJob.getBucketCount(3.4,2.1,1.5,2);
        PaintJob.getBucketCount(7.25,4.3,2.35);
        PaintJob.getBucketCount(6.26,2.2);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0) {
            return -1;
        }else {
            double area=width*height;
            double buckets=Math.ceil(area/areaPerBucket);
            int numberOfBuckets=(int)buckets-extraBuckets;
            System.out.println("The number of buckets needed is :"+numberOfBuckets);
            return numberOfBuckets;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width<=0||height<=0||areaPerBucket<=0) {
            return -1;
        }else {
            double area=width*height;
            double buckets=Math.ceil(area/areaPerBucket);
            int numberOfBuckets=(int)buckets;
            System.out.println("The number of buckets needed is :"+numberOfBuckets);
            return numberOfBuckets;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area<=0||areaPerBucket<=0) {
            return -1;
        }else {
            double buckets=Math.ceil(area/areaPerBucket);
            int numberOfBuckets=(int)buckets;
            System.out.println("The number of buckets needed is :"+numberOfBuckets);
            return numberOfBuckets;
        }
    }
}
