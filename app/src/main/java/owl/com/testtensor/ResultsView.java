package owl.com.testtensor;

import java.util.List;

/**
 * Created by julienathomas on 22/05/2018.
 */


public interface ResultsView {
    public void setResults(final List<Classifier.Recognition> results);
}
