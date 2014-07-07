public class PipeTest {

    public static void main(String[] args) throws java.io.IOException, java.lang.InterruptedException {
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        // Start two processes: ps ax | grep rbe
        java.lang.Process p1 = rt.exec("ps ax");
        // grep will wait for input on stdin
        java.lang.Process p2 = rt.exec("grep java");
        // Create and start Piper
        Piper pipe = new Piper(p1.getInputStream(), p2.getOutputStream());
        new Thread(pipe).start();
        // Wait for second process to finish
        p2.waitFor();
        // Show output of second process
        java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(p2.getInputStream()));
        String s = null;
        while ((s = r.readLine()) != null) {
            System.out.println(s);
        }
        
        //Test 2
        
        System.out.println("test 2");
        // Start three processes: ps ax | grep Java | grep -Jar
        p1 = rt.exec("ps ax");
        p2 = rt.exec("grep java");
        java.lang.Process p3 = rt.exec("grep Flowdroid");
        // Start piping
        java.io.InputStream in = Piper.pipe(p1, p2, p3);
        // Show output of last process
        r = new java.io.BufferedReader(new java.io.InputStreamReader(in));
        s = null;
        while ((s = r.readLine()) != null) {
            System.out.println(s);
        }
    }
}