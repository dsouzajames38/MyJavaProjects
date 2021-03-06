/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package hello.swf;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternal;

/**
 * Generated from {@link hello.swf.GreeterWorkflow}. 
 * Used to start workflow executions or send signals from outside of the scope of a workflow.
 * Created through {@link GreeterWorkflowClientExternalFactory#getClient}.
 * <p>
 * When starting child workflow from a parent workflow use {@link GreeterWorkflowClient} instead.
 */
public interface GreeterWorkflowClientExternal extends WorkflowClientExternal
{

    /**
     * Generated from {@link hello.swf.GreeterWorkflow#greet}
     */
    void greet();

    /**
     * Generated from {@link hello.swf.GreeterWorkflow#greet}
     */
    void greet(StartWorkflowOptions optionsOverride);
}