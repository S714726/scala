import scala.reflect.makro.{Context => Ctx}

object Macros {
  object Impls {
    def foo(c: Ctx)(x: c.Expr[Any]) = x
  }

  def foo(x: Any) = macro Impls.foo
}