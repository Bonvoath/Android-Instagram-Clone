package cambo.com.app.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import cambo.com.app.materialcamera.internal.BaseCaptureActivity;
import cambo.com.app.materialcamera.internal.Camera2Fragment;


public class CaptureActivity2 extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return Camera2Fragment.newInstance();
  }
}
