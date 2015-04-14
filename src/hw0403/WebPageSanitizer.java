package hw0403;
/**
 * Access Code 2.1
 * Ray Acevedo
 * WebPageSanitizer.java
 */

//Search engines like Google have programs called web-scapers which visit webpages and scrape the
//information displayed on the webpage. The displayable information is contained in html tags
//like p, table, h2 etc. When we make a GET request for a webpage, the HTML that is returned
//can also contain tags like script which often do not correspond to the displayable content
//on the webpage. Information inside script tags is not used by scapers and they often ignore
//these tags in the HTML. Write a class called WebPageSanitizer which implements a static
//method called String sanitize(String html) which removes all script tags and the information that
//they encapsulate and returns a sanitized version of the HTML string.

public class WebPageSanitizer
{
    static String initialHtml  = "<html><head><script>hi</script></head><body><script>script2</script></body></html>";
    static String startScript  = "<script>";
    static String endScript    = "</script>";
    static int    scriptLength = startScript.length();

    public static String sanitize(String html)
    {
        String testHtml = html;
        int startIndex = 0;
        //int startSearchAt = 0;
        while((startIndex > - 1))

        {
            startIndex = testHtml.indexOf(startScript);
            if(startIndex > - 1)
            {
                int endIndex = testHtml.indexOf(endScript);
                String cleanHtmlBefore = testHtml.substring(0, startIndex);
                String cleanHtmlAfter = testHtml.substring(endIndex + 1 + scriptLength, testHtml.length());
                testHtml = cleanHtmlBefore + cleanHtmlAfter;

            }
        }
        return testHtml;
    }


    public static void main(String[] args)
    {
        System.out.println(sanitize(initialHtml));
    }
}
