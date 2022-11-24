import UIKit
import Lottie

class Item1: UIViewController {
    
    let animatonView : AnimationView = {
        
        let ani = AnimationView(name: "1")
        ani.frame = CGRect(x: 0, y: 0, width: 300, height: 300)
        ani.contentMode = .scaleAspectFit
        ani.loopMode = .loop
        ani.animationSpeed = 0.5
        return ani
    }()

    override func viewDidLoad() {
        super.viewDidLoad()
        
        view.addSubview(animatonView)
        animatonView.center = view.center
        
        animatonView.play{ (finish) in
            self.animatonView.removeFromSuperview()
            self.view.backgroundColor = .white
        }
        
    }
    
    @IBAction func close(_ sender: Any) {
        
        dismiss(animated: true, completion: nil)
    }
}
