/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.tests;

import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;
import org.palladiosimulator.spd.triggers.stimuli.TaskCount;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Task Count</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class TaskCountTest extends ManagedElementsStateStimulusTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(TaskCountTest.class);
    }

    /**
     * Constructs a new Task Count test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public TaskCountTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Task Count test case. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    protected TaskCount getFixture() {
        return (TaskCount) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(StimuliFactory.eINSTANCE.createTaskCount());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        this.setFixture(null);
    }

} // TaskCountTest
