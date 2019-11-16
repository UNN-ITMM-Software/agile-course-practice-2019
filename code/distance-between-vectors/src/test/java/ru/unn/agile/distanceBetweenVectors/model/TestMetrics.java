package ru.unn.agile.distanceBetweenVectors.model;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class TestMetrics {
    @Test
    public void canCalculateMetricOneDimensionalVector_L1() {
        Vector<Float> v = new Vector<Float>();
        v.add(-2.2f);
        float metricL1 = new VectorMetric().Calculate_L1(v);
        assertEquals(2.2f, metricL1, 0.0001);
    }

    @Test
    public void canCalculateMetricTwoDimensionalVector_L1() {
        Vector<Float> v = new Vector<Float>();
        v.add(3.3f);
        v.add(-6.7f);
        float metricL1 = new VectorMetric().Calculate_L1(v);
        assertEquals(10f, metricL1, 0.0001);
    }

    @Test
    public void canCalculateMetricThreeDimensionalVector_L1() {
        Vector<Float> v = new Vector<Float>();
        v.add(1.0f);
        v.add(5.8f);
        v.add(-0.3f);
        float metricL1 = new VectorMetric().Calculate_L1(v);
        assertEquals(7.1f, metricL1, 0.0001);
    }

    @Test
    public void canCalculateMetricOneDimensionalVector_L2() {
        Vector<Float> v = new Vector<Float>();
        v.add(-2.5f);
        float metricL2 = new VectorMetric().Calculate_L2(v);
        assertEquals(2.5f, metricL2, 0.0001);
    }

    @Test
    public void canCalculateMetricTwoDimensionalVector_L2() {
        Vector<Float> v = new Vector<Float>();
        v.add(1.0f);
        v.add(-2.0f);
        float metricL2 = new VectorMetric().Calculate_L2(v);
        assertEquals(2.23606797749979f, metricL2, 0.0001);
    }

    @Test
    public void canCalculateMetricThreeDimensionalVector_L2() {
        Vector<Float> v = new Vector<Float>();
        v.add(-3.0f);
        v.add(7.1f);
        v.add(0.5f);
        float metricL2 = new VectorMetric().Calculate_L2(v);
        assertEquals(7.723988606931007f, metricL2, 0.0001);
    }

    @Test
    public void canCalculateMetricOneDimensionalVector_L3() {
        Vector<Float> v = new Vector<Float>();
        v.add(-2.0f);
        float metricL3 = new VectorMetric().Calculate_L3(v);
        assertEquals(2.0f, metricL3, 0.0001);
    }

    @Test
    public void canCalculateMetricTwoDimensionalVector_L3() {
        Vector<Float> v = new Vector<Float>();
        v.add(2.0f);
        v.add(-3.0f);
        float metricL3 = new VectorMetric().Calculate_L3(v);
        assertEquals(3.2710663101886f, metricL3, 0.0001);
    }

    @Test
    public void canCalculateMetricThreeDimensionalVector_L3() {
        Vector<Float> v = new Vector<Float>();
        v.add(2.0f);
        v.add(2.5f);
        v.add(-4.0f);
        float metricL3 = new VectorMetric().Calculate_L3(v);
        assertEquals(4.4416330599643f, metricL3, 0.0001);
    }

    @Test
    public void canCalculateMetricOneDimensionalVector_L4() {
        Vector<Float> v = new Vector<Float>();
        v.add(-2.0f);
        float metricL4 = new VectorMetric().Calculate_L4(v);
        assertEquals(2.0f, metricL4, 0.0001);
    }

    @Test
    public void canCalculateMetricTwoDimensionalVector_L4() {
        Vector<Float> v = new Vector<Float>();
        v.add(-2.0f);
        v.add(1.0f);
        float metricL4 = new VectorMetric().Calculate_L4(v);
        assertEquals(2.0305431848689f, metricL4, 0.0001);
    }

    @Test
    public void canCalculateMetricThreeDimensionalVector_L4() {
        Vector<Float> v = new Vector<Float>();
        v.add(-2.0f);
        v.add(-2.0f);
        v.add(-2.1f);
        float metricL4 = new VectorMetric().Calculate_L4(v);
        assertEquals(2.678195865012f, metricL4, 0.0001);
    }

    @Test
    public void canCalculateMetricOneDimensionalVector_Linf() {
        Vector<Float> v = new Vector<Float>();
        v.add(-2.0f);
        float metricLinf = new VectorMetric().Calculate_Linf(v);
        assertEquals(-2.0f, metricLinf, 0.0001);
    }

    @Test
    public void canCalculateMetricTwoDimensionalVector_Linf() {
        Vector<Float> v = new Vector<Float>();
        v.add(4.0f);
        v.add(-100.0f);
        float metricLinf = new VectorMetric().Calculate_Linf(v);
        assertEquals(4.0f, metricLinf, 0.0001);
    }

    @Test
    public void canCalculateMetricThreeDimensionalVector_Linf() {
        Vector<Float> v = new Vector<Float>();
        v.add(-55.0f);
        v.add(-2.0f);
        v.add(150.1f);
        float metricLinf = new VectorMetric().Calculate_Linf(v);
        assertEquals(150.1f, metricLinf, 0.0001);
    }
}