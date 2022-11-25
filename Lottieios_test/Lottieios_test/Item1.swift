import UIKit
import Lottie

class Item1: UIViewController {
    
    let animatonView : AnimationView = {
        
        let aniView = AnimationView(name: "1")
        aniView.frame = CGRect(x: 0, y: 0, width: 400, height: 400)
        aniView.contentMode = .scaleAspectFit
        return aniView
    }()

    override func viewDidLoad() {
        super.viewDidLoad()
        
        print(self, #function)
        
        initLocation()
        
        play()
    }
    
    override func viewWillAppear(_ animated: Bool) {
        
        //print(self, #function)
    }
    
    override func viewDidAppear(_ animated: Bool) {
        
        //print(self, #function)
    }
    
    override func viewWillDisappear(_ animated: Bool) {
        
        //print(self, #function)
    }
    
    override func viewDidDisappear(_ animated: Bool) {
        
        //print(self, #function)
        
        //stop()
    }
    
    @IBAction func close(_ sender: Any) {
        
        dismiss(animated: true, completion: nil)
    }
    
    func initLocation(){
        
        view.backgroundColor = .white
        view.addSubview(animatonView)
        animatonView.center = view.center
    }
    
    func play(){
        
        //무한
        animatonView.loopMode = .loop
        
        //1회만 실행
        animatonView.loopMode = .playOnce
        
        //5회 실행
        //animatonView.loopMode = .repeat(5)
        
        //재생 속도
        animatonView.animationSpeed = 0.5
        
        //실행
        /*
        if( animatonView.isAnimationPlaying == false){
            animatonView.play()
        }
        */
        
        if( animatonView.isAnimationPlaying == false){
            
            animatonView.play{ (finish) in
                
                print("animatonview 종료")
                
                self.animatonView.removeFromSuperview()
            }
        }
    }
    
    func stop(){
        
        if( animatonView.isAnimationPlaying == true){
            animatonView.stop()
        }
    }
}
