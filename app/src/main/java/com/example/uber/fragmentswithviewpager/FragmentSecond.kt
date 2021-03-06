import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uber.R

// Here ":" symbol is indicate that SignupFragment
// is child class of Fragment Class
class FragmentSecond : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_fragment_second, container, false
        )
    }
    // Here "layout_signup" is a name of layout file
    // created for SignFragment
}