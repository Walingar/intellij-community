import pkg.ExperimentalClass
import pkg.ExperimentalClass.NON_EXPERIMENTAL_CONSTANT_IN_EXPERIMENTAL_CLASS
import pkg.ExperimentalClass.staticNonExperimentalMethodInExperimentalClass
import pkg.ExperimentalClass.EXPERIMENTAL_CONSTANT_IN_EXPERIMENTAL_CLASS
import pkg.ExperimentalClass.staticExperimentalMethodInExperimentalClass

import pkg.NonExperimentalClass 
import pkg.NonExperimentalClass.NON_EXPERIMENTAL_CONSTANT_IN_NON_EXPERIMENTAL_CLASS 
import pkg.NonExperimentalClass.staticNonExperimentalMethodInNonExperimentalClass 
import pkg.NonExperimentalClass.EXPERIMENTAL_CONSTANT_IN_NON_EXPERIMENTAL_CLASS
import pkg.NonExperimentalClass.staticExperimentalMethodInNonExperimentalClass

import pkg.ExperimentalEnum
import pkg.NonExperimentalEnum 
import pkg.ExperimentalEnum.NON_EXPERIMENTAL_VALUE_IN_EXPERIMENTAL_ENUM
import pkg.ExperimentalEnum.EXPERIMENTAL_VALUE_IN_EXPERIMENTAL_ENUM
import pkg.NonExperimentalEnum.NON_EXPERIMENTAL_VALUE_IN_NON_EXPERIMENTAL_ENUM 
import pkg.NonExperimentalEnum.EXPERIMENTAL_VALUE_IN_NON_EXPERIMENTAL_ENUM

import pkg.ExperimentalAnnotation
import pkg.NonExperimentalAnnotation

import unstablePkg.ClassInUnstablePkg

@Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE", "UNUSED_VALUE")
class UnstableElementsIgnoreImportsTest {
  fun test() {
    var s = <warning descr="'ExperimentalClass' is marked unstable">ExperimentalClass</warning>.NON_EXPERIMENTAL_CONSTANT_IN_EXPERIMENTAL_CLASS 
    <warning descr="'ExperimentalClass' is marked unstable">ExperimentalClass</warning>.staticNonExperimentalMethodInExperimentalClass() 
    val experimentalClassInstanceViaNonExperimentalConstructor : <warning descr="'ExperimentalClass' is marked unstable">ExperimentalClass</warning> = ExperimentalClass() 
    s = experimentalClassInstanceViaNonExperimentalConstructor.nonExperimentalFieldInExperimentalClass 
    experimentalClassInstanceViaNonExperimentalConstructor.nonExperimentalMethodInExperimentalClass() 
    s = NON_EXPERIMENTAL_CONSTANT_IN_EXPERIMENTAL_CLASS 
    staticNonExperimentalMethodInExperimentalClass() 

    s = <warning descr="'ExperimentalClass' is marked unstable">ExperimentalClass</warning>.<warning descr="'EXPERIMENTAL_CONSTANT_IN_EXPERIMENTAL_CLASS' is marked unstable">EXPERIMENTAL_CONSTANT_IN_EXPERIMENTAL_CLASS</warning> 
    <warning descr="'ExperimentalClass' is marked unstable">ExperimentalClass</warning>.<warning descr="'staticExperimentalMethodInExperimentalClass' is marked unstable">staticExperimentalMethodInExperimentalClass</warning>() 
    val experimentalClassInstanceViaExperimentalConstructor : <warning descr="'ExperimentalClass' is marked unstable">ExperimentalClass</warning> = <warning descr="'ExperimentalClass' is marked unstable">ExperimentalClass</warning>("") 
    s = experimentalClassInstanceViaExperimentalConstructor.<warning descr="'experimentalFieldInExperimentalClass' is marked unstable">experimentalFieldInExperimentalClass</warning> 
    experimentalClassInstanceViaExperimentalConstructor.<warning descr="'experimentalMethodInExperimentalClass' is marked unstable">experimentalMethodInExperimentalClass</warning>() 
    s = <warning descr="'EXPERIMENTAL_CONSTANT_IN_EXPERIMENTAL_CLASS' is marked unstable">EXPERIMENTAL_CONSTANT_IN_EXPERIMENTAL_CLASS</warning> 
    <warning descr="'staticExperimentalMethodInExperimentalClass' is marked unstable">staticExperimentalMethodInExperimentalClass</warning>() 

    // ---------------------------------

    s = NonExperimentalClass.NON_EXPERIMENTAL_CONSTANT_IN_NON_EXPERIMENTAL_CLASS 
    NonExperimentalClass.staticNonExperimentalMethodInNonExperimentalClass() 
    val nonExperimentalClassInstanceViaNonExperimentalConstructor = NonExperimentalClass() 
    s = nonExperimentalClassInstanceViaNonExperimentalConstructor.nonExperimentalFieldInNonExperimentalClass 
    nonExperimentalClassInstanceViaNonExperimentalConstructor.nonExperimentalMethodInNonExperimentalClass() 
    s = NON_EXPERIMENTAL_CONSTANT_IN_NON_EXPERIMENTAL_CLASS 
    staticNonExperimentalMethodInNonExperimentalClass() 

    s = NonExperimentalClass.<warning descr="'EXPERIMENTAL_CONSTANT_IN_NON_EXPERIMENTAL_CLASS' is marked unstable">EXPERIMENTAL_CONSTANT_IN_NON_EXPERIMENTAL_CLASS</warning> 
    NonExperimentalClass.<warning descr="'staticExperimentalMethodInNonExperimentalClass' is marked unstable">staticExperimentalMethodInNonExperimentalClass</warning>() 
    val nonExperimentalClassInstanceViaExperimentalConstructor = <warning descr="'NonExperimentalClass' is marked unstable">NonExperimentalClass</warning>("") 
    s = nonExperimentalClassInstanceViaExperimentalConstructor.<warning descr="'experimentalFieldInNonExperimentalClass' is marked unstable">experimentalFieldInNonExperimentalClass</warning> 
    nonExperimentalClassInstanceViaExperimentalConstructor.<warning descr="'experimentalMethodInNonExperimentalClass' is marked unstable">experimentalMethodInNonExperimentalClass</warning>() 
    s = <warning descr="'EXPERIMENTAL_CONSTANT_IN_NON_EXPERIMENTAL_CLASS' is marked unstable">EXPERIMENTAL_CONSTANT_IN_NON_EXPERIMENTAL_CLASS</warning> 
    <warning descr="'staticExperimentalMethodInNonExperimentalClass' is marked unstable">staticExperimentalMethodInNonExperimentalClass</warning>() 

    // ---------------------------------

    var nonExperimentalValueInExperimentalEnum : <warning descr="'ExperimentalEnum' is marked unstable">ExperimentalEnum</warning> = <warning descr="'ExperimentalEnum' is marked unstable">ExperimentalEnum</warning>.NON_EXPERIMENTAL_VALUE_IN_EXPERIMENTAL_ENUM 
    nonExperimentalValueInExperimentalEnum = NON_EXPERIMENTAL_VALUE_IN_EXPERIMENTAL_ENUM 
    var experimentalValueInExperimentalEnum : <warning descr="'ExperimentalEnum' is marked unstable">ExperimentalEnum</warning> = <warning descr="'ExperimentalEnum' is marked unstable">ExperimentalEnum</warning>.<warning descr="'EXPERIMENTAL_VALUE_IN_EXPERIMENTAL_ENUM' is marked unstable">EXPERIMENTAL_VALUE_IN_EXPERIMENTAL_ENUM</warning> 
    experimentalValueInExperimentalEnum = <warning descr="'EXPERIMENTAL_VALUE_IN_EXPERIMENTAL_ENUM' is marked unstable">EXPERIMENTAL_VALUE_IN_EXPERIMENTAL_ENUM</warning> 

    var nonExperimentalValueInNonExperimentalEnum = NonExperimentalEnum.NON_EXPERIMENTAL_VALUE_IN_NON_EXPERIMENTAL_ENUM 
    nonExperimentalValueInNonExperimentalEnum = NON_EXPERIMENTAL_VALUE_IN_NON_EXPERIMENTAL_ENUM 
    var experimentalValueInNonExperimentalEnum = NonExperimentalEnum.<warning descr="'EXPERIMENTAL_VALUE_IN_NON_EXPERIMENTAL_ENUM' is marked unstable">EXPERIMENTAL_VALUE_IN_NON_EXPERIMENTAL_ENUM</warning> 
    experimentalValueInNonExperimentalEnum = <warning descr="'EXPERIMENTAL_VALUE_IN_NON_EXPERIMENTAL_ENUM' is marked unstable">EXPERIMENTAL_VALUE_IN_NON_EXPERIMENTAL_ENUM</warning> 

    // ---------------------------------

    @<warning descr="'ExperimentalAnnotation' is marked unstable">ExperimentalAnnotation</warning> class C1 
    @<warning descr="'ExperimentalAnnotation' is marked unstable">ExperimentalAnnotation</warning>(nonExperimentalAttributeInExperimentalAnnotation = "123") class C2 
    @<warning descr="'ExperimentalAnnotation' is marked unstable">ExperimentalAnnotation</warning>(<warning descr="'experimentalAttributeInExperimentalAnnotation' is marked unstable">experimentalAttributeInExperimentalAnnotation</warning> = "123") class C3 
    @NonExperimentalAnnotation class C4 
    @NonExperimentalAnnotation(nonExperimentalAttributeInNonExperimentalAnnotation = "123") class C5 
    @NonExperimentalAnnotation(<warning descr="'experimentalAttributeInNonExperimentalAnnotation' is marked unstable">experimentalAttributeInNonExperimentalAnnotation</warning> = "123") class C6 
  }
}