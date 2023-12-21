package org.gotson.komga.infrastructure.image

import com.sun.jna.Library
import com.sun.jna.Native

interface ImageSSIMNative : Library {

  fun C_SSIM_Percent(image1: String, image2: String): Double

  companion object {
    const val NAME = "ImageSSIM"
    var INSTANCE: ImageSSIMNative = Native.load(NAME, ImageSSIMNative::class.java)
  }
}
