package org.gotson.komga.infrastructure.image

import org.springframework.stereotype.Component

@Component
class ImageSimilarity {
  companion object {
    val service = ImageSSIMNative.INSTANCE
  }

  fun similarity(imagePath: String, image2Path: String): Double {
    return service.C_SSIM_Percent(imagePath, image2Path)
  }
}
