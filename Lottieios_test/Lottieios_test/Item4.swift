import UIKit
import WebKit

class Item4: UIViewController {

    var webview : WKWebView!
    
    @IBOutlet weak var view1: UIView!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()

        initLocation()
        
        initConstraints()
        
        loadWeb()
    }
    
    func initLocation(){
        
        webview = WKWebView(frame: .zero)
        webview.backgroundColor = UIColor.white
        webview.scrollView.backgroundColor = UIColor.white
        view1.addSubview(webview)
    }
    
    func initConstraints(){
        
        webview.translatesAutoresizingMaskIntoConstraints = false
        webview.topAnchor.constraint(equalTo: view1.topAnchor).isActive = true
        webview.bottomAnchor.constraint(equalTo: view1.bottomAnchor).isActive = true
        webview.leadingAnchor.constraint(equalTo: view1.leadingAnchor).isActive = true
        webview.trailingAnchor.constraint(equalTo: view1.trailingAnchor).isActive = true
    }
    
    func loadWeb(){
        
        webview.allowsBackForwardNavigationGestures = true
        webview.navigationDelegate = self
        
        loadHtml()
        //loadUrl(sUrl: "https://m.naver.com")
    }
    

    func loadHtml(){
        if let url = Bundle.main.url(forResource: "test", withExtension: "html", subdirectory: "html") {
            webview.loadFileURL(url, allowingReadAccessTo: url)
        }
    }

    func loadUrl(sUrl : String){
        
        webview.load(URLRequest(url: URL(string:sUrl)!) )
    }
}

extension Item4 : WKNavigationDelegate {
    
    func webView(_ webView: WKWebView, didStartProvisionalNavigation navigation: WKNavigation!) {
        print("시작")
    }
    
    func webView(_ webView: WKWebView, didFailProvisionalNavigation navigation: WKNavigation!, withError error: Error) {
        print("로드 실패")
    }
    
    func webView(_ webView: WKWebView, didFinish navigation: WKNavigation!) {
        print("로드 완료")
    }
}
