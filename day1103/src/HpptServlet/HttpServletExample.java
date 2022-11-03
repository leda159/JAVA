package HpptServlet;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}
	//자동타입변환
	//HttpServlet servlet = new LoginServlet();
	//HttpServlet servlet = new FileDownloadServlet();
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
