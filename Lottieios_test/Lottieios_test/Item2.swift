import UIKit
import Lottie

class Item2: UIViewController {
    
    let animatonView : AnimationView = {
        
        let aniView = AnimationView(name: "2")
        return aniView
    }()
    
    override func viewDidLoad() {
        super.viewDidLoad()

        initLocation()
        
        initConstraints()
        
        play()
        
    }
    
    override func viewDidDisappear(_ animated: Bool) {
        
        print(self, #function)
    }
    
    @IBAction func close(_ sender: Any) {
        
        dismiss(animated: true, completion: nil)
    }
    
    func initLocation(){
        
        view.backgroundColor = .white
        view.addSubview(animatonView)
    }
    
    func initConstraints(){
        
        animatonView.translatesAutoresizingMaskIntoConstraints = false
        animatonView.widthAnchor.constraint(equalToConstant: 400).isActive = true
        animatonView.heightAnchor.constraint(equalToConstant: 400).isActive = true
        animatonView.centerXAnchor.constraint(equalTo: view.centerXAnchor).isActive = true
        animatonView.centerYAnchor.constraint(equalTo: view.centerYAnchor).isActive = true
    }
    
    func play(){
        
        //무한
        animatonView.loopMode = .loop
      
        //실행
        if( animatonView.isAnimationPlaying == false){
            
            animatonView.play{ (finish) in
                
                print("animatonview 종료")
                
                self.animatonView.removeFromSuperview()
            }
        }
    }
    
}
