package cambo.com.app.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import cambo.com.app.materialcamera.internal.BaseCaptureActivity;
import cambo.com.app.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
