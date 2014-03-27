package delegation;

import com.google.common.collect.Lists;
import delegation.Filter;
import delegation.FilteringIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests delegation.FilteringIterator")
@SuppressWarnings("all")
public class FilteringIteratorTest extends TestCase {
  private List<Integer> list18;
  
  private List<Integer> _init_list18() {
    return Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8)));
  }
  
  private List<Integer> list19;
  
  private List<Integer> _init_list19() {
    return Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9)));
  }
  
  @Override
  protected void setUp() {
    list18 = _init_list18();
    list19 = _init_list19();
    
  }
  
  private void testIterator(final Collection<Integer> col, final int... values) {
    final Filter<Integer> _function = new Filter<Integer>() {
      public boolean shouldSkip(final Integer n) {
        int _modulo = ((n).intValue() % 2);
        boolean _equals = (_modulo == 0);
        return _equals;
      }
    };
    Iterator<Integer> _iterator = col.iterator();
    FilteringIterator<Integer> _filteringIterator = new FilteringIterator<Integer>(_function, _iterator);
    this.testIterator(_filteringIterator, values);
  }
  
  private void testIterator(final Iterator<Integer> iterator, final int... values) {
    for (final int value : values) {
      {
        boolean _hasNext = iterator.hasNext();
        Assert.assertTrue(_hasNext);
        Integer _next = iterator.next();
        Assert.assertEquals(value, (_next).intValue());
      }
    }
    boolean _hasNext = iterator.hasNext();
    Assert.assertFalse(_hasNext);
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCaseEmpty() {
    _test__caseEmpty_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase1() {
    _test__case1_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase12() {
    _test__case12_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase18() {
    _test__case18_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase19() {
    _test__case19_transitions0_effect_state();
    
  }
  
  private void _test__caseEmpty_transitions0_effect_state() {
    _test__caseEmpty_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__caseEmpty_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[]) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case1_transitions0_effect_state() {
    _test__case1_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case1_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1))), 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[1], 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case12_transitions0_effect_state() {
    _test__case12_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case12_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2))), 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[1, 2], 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case18_transitions0_effect_state() {
    _test__case18_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case18_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list18, 1, 3, 5, 7);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list18, 1, 3, 5, 7) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case19_transitions0_effect_state() {
    _test__case19_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case19_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list19, 1, 3, 5, 7, 9);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list19, 1, 3, 5, 7, 9) failed: " + error.getMessage());
    }
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(FilteringIteratorTest.class);
  }
}