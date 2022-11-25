import UIKit
import Lottie

class itemView : UIView {
    
    var animatonView : AnimationView!
    
    override init(frame: CGRect) {
        super.init(frame: frame)
    }
    
    required init?(coder: NSCoder) {
        super.init(coder: coder)
    }
    
    func  play(name : String){
        
        animatonView = AnimationView(name: name)
        animatonView.center = self.center
        animatonView.contentMode = .scaleAspectFill
        addSubview(animatonView)
        
        animatonView.translatesAutoresizingMaskIntoConstraints = false
        animatonView.topAnchor.constraint(equalTo: self.topAnchor).isActive = true
        animatonView.bottomAnchor.constraint(equalTo: self.bottomAnchor).isActive = true
        animatonView.leadingAnchor.constraint(equalTo: self.leadingAnchor).isActive = true
        animatonView.trailingAnchor.constraint(equalTo: self.trailingAnchor).isActive = true
        
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
