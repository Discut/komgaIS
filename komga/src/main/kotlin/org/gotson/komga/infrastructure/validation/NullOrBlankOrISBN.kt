package org.gotson.komga.infrastructure.validation

import org.hibernate.validator.constraints.CompositionType
import org.hibernate.validator.constraints.ConstraintComposition
import org.hibernate.validator.constraints.ISBN
import javax.validation.Constraint
import javax.validation.constraints.Null
import kotlin.reflect.KClass

@ConstraintComposition(CompositionType.OR)
@Constraint(validatedBy = [])
@Null
@Blank
@ISBN
@Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.PROPERTY_GETTER)
@Retention(AnnotationRetention.RUNTIME)
annotation class NullOrBlankOrISBN(
  val message: String = "Must be null or blank or valid ISBN-13",
  val groups: Array<KClass<out Any>> = [],
  val payload: Array<KClass<out Any>> = []
)
