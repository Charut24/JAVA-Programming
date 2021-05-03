package Udemy_Exercise;

    public class PaintJob {
        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
            if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets < 0) {
                return -1;
            }

            return getBucketCount(width, height, areaPerBucket) - extraBuckets;
        }

        public static int getBucketCount(double width, double height, double areaPerBucket) {
            if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) {
                return -1;
            }

            return getBucketCount(width * height, areaPerBucket);
        }

        public static int getBucketCount(double area, double areaPerBucket) {
            if ( area <= 0.0 || areaPerBucket <= 0.0) {
                return -1;
            }

            return (int) Math.ceil(area/areaPerBucket);
        }
    }

    class Main_26
    {
        public static void main(String[] args) {
            System.out.println(PaintJob.getBucketCount(3.4, 1.5));
            System.out.println(PaintJob.getBucketCount(6.26, 2.2));
            System.out.println(PaintJob.getBucketCount(3.26, 0.75));

            System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
            System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
            System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));

            System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
            System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5,2));
            System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        }
    }