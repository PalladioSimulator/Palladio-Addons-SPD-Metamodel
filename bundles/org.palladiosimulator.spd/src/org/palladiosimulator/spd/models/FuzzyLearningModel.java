/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Fuzzy Learning
 * Model</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getWorkloadStimulus <em>Workload
 * Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getResponseTimeStimulus
 * <em>Response Time Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getTargetResponseTime <em>Target
 * Response Time</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getResponseTimeAggregationMethod
 * <em>Response Time Aggregation Method</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getEpsilon <em>Epsilon</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getDiscountFactor <em>Discount
 * Factor</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getInitializationType
 * <em>Initialization Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getFuzzyLearningModel()
 * @model abstract="true"
 * @generated
 */
public interface FuzzyLearningModel extends LearningBasedModel {
    /**
     * Returns the value of the '<em><b>Workload Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Workload Stimulus</em>' containment reference.
     * @see #setWorkloadStimulus(Stimulus)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getFuzzyLearningModel_WorkloadStimulus()
     * @model containment="true" required="true"
     * @generated
     */
    Stimulus getWorkloadStimulus();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getWorkloadStimulus <em>Workload
     * Stimulus</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Workload Stimulus</em>' containment reference.
     * @see #getWorkloadStimulus()
     * @generated
     */
    void setWorkloadStimulus(Stimulus value);

    /**
     * Returns the value of the '<em><b>Response Time Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Response Time Stimulus</em>' containment reference.
     * @see #setResponseTimeStimulus(OperationResponseTime)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getFuzzyLearningModel_ResponseTimeStimulus()
     * @model containment="true" required="true"
     * @generated
     */
    OperationResponseTime getResponseTimeStimulus();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getResponseTimeStimulus
     * <em>Response Time Stimulus</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Response Time Stimulus</em>' containment reference.
     * @see #getResponseTimeStimulus()
     * @generated
     */
    void setResponseTimeStimulus(OperationResponseTime value);

    /**
     * Returns the value of the '<em><b>Target Response Time</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Target Response Time</em>' attribute.
     * @see #setTargetResponseTime(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getFuzzyLearningModel_TargetResponseTime()
     * @model required="true"
     * @generated
     */
    double getTargetResponseTime();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getTargetResponseTime <em>Target
     * Response Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Target Response Time</em>' attribute.
     * @see #getTargetResponseTime()
     * @generated
     */
    void setTargetResponseTime(double value);

    /**
     * Returns the value of the '<em><b>Response Time Aggregation Method</b></em>' attribute. The
     * literals are from the enumeration
     * {@link org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Response Time Aggregation Method</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD
     * @see #setResponseTimeAggregationMethod(AGGREGATIONMETHOD)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getFuzzyLearningModel_ResponseTimeAggregationMethod()
     * @model
     * @generated
     */
    AGGREGATIONMETHOD getResponseTimeAggregationMethod();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getResponseTimeAggregationMethod
     * <em>Response Time Aggregation Method</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Response Time Aggregation Method</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD
     * @see #getResponseTimeAggregationMethod()
     * @generated
     */
    void setResponseTimeAggregationMethod(AGGREGATIONMETHOD value);

    /**
     * Returns the value of the '<em><b>Epsilon</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Epsilon</em>' attribute.
     * @see #setEpsilon(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getFuzzyLearningModel_Epsilon()
     * @model dataType="org.palladiosimulator.spd.datatypes.PercentDouble"
     * @generated
     */
    double getEpsilon();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getEpsilon
     * <em>Epsilon</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Epsilon</em>' attribute.
     * @see #getEpsilon()
     * @generated
     */
    void setEpsilon(double value);

    /**
     * Returns the value of the '<em><b>Discount Factor</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Discount Factor</em>' attribute.
     * @see #setDiscountFactor(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getFuzzyLearningModel_DiscountFactor()
     * @model dataType="org.palladiosimulator.spd.datatypes.PercentDouble"
     * @generated
     */
    double getDiscountFactor();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getDiscountFactor <em>Discount
     * Factor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Discount Factor</em>' attribute.
     * @see #getDiscountFactor()
     * @generated
     */
    void setDiscountFactor(double value);

    /**
     * Returns the value of the '<em><b>Initialization Type</b></em>' attribute. The literals are
     * from the enumeration {@link org.palladiosimulator.spd.models.InitializationType}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Initialization Type</em>' attribute.
     * @see org.palladiosimulator.spd.models.InitializationType
     * @see #setInitializationType(InitializationType)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getFuzzyLearningModel_InitializationType()
     * @model
     * @generated
     */
    InitializationType getInitializationType();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getInitializationType
     * <em>Initialization Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Initialization Type</em>' attribute.
     * @see org.palladiosimulator.spd.models.InitializationType
     * @see #getInitializationType()
     * @generated
     */
    void setInitializationType(InitializationType value);

} // FuzzyLearningModel
