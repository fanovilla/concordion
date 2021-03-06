package org.concordion.api;

import java.util.List;

/**
 * Extension interface for {@link Specification}s that contain Concordion examples.
 *
 * @since 2.0.0
 */
public interface SpecificationByExample extends Specification {

    /**
     * Returns whether the specification contains example nodes.
     *
     * @return true if specification has one or more nodes with an example command on
     */
    boolean hasExampleCommandNodes();

    /**
     * Gets all the examples in the specification.
     *
     * @return names of the examples
     */
    List<String> getExampleNames();

    /**
     * Processes a single example.
     * @param evaluator evaluator
     * @param example name of the example
     * @param resultRecorder result recorder
     * @param fixture the example's fixture
     */
    void processExample(Evaluator evaluator, String example, ResultRecorder resultRecorder, Fixture fixture);

    /**
     * Called once all examples have been executed so the spec can do things like "save HTML results to file".
     */
    void finish();
}
