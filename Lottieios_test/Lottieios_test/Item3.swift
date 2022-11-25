import UIKit

class Item3: UIViewController {

    @IBOutlet weak var item1: itemView!
    @IBOutlet weak var item2: itemView!
    @IBOutlet weak var item3: itemView!
    @IBOutlet weak var item4: itemView!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        item1.play(name: "1")
        item2.play(name: "2")
        item3.play(name: "3")
        item4.play(name: "1")
    }
    
    @IBAction func close(_ sender: Any) {
        
        dismiss(animated: true, completion: nil)
    }
}
