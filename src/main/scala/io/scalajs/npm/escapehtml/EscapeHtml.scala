package io.scalajs.npm.escapehtml

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * escape-html - Escape string for use in HTML
  * @version 1.0.3
  * @see https://www.npmjs.com/package/escape-html
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait EscapeHtml extends js.Object {

  /**
    * Encodes the given URI
    * @param uri the given URI
    * @return the encoded URI
    */
  def apply(uri: String): String = js.native

}

/**
  * Escape-Html Singleton
  * @author lawrence.daniels@gmail.com
  */
@js.native
@JSGlobal
object EscapeHtml extends EscapeHtml