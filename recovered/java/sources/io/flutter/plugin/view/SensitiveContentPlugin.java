            package io.flutter.plugin.view;

            import android.app.Activity;
            import android.os.Build;
            import android.view.View;
            import io.flutter.embedding.engine.systemchannels.SensitiveContentChannel;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SensitiveContentPlugin implements SensitiveContentChannel.SensitiveContentMethodHandler {
                private Activity mFlutterActivity;
                private final int mFlutterViewId;
                private final SensitiveContentChannel mSensitiveContentChannel;

                public SensitiveContentPlugin(int i, Activity activity, SensitiveContentChannel sensitiveContentChannel) {
/* 4 */             this.mFlutterActivity = activity;
/* 6 */             this.mFlutterViewId = i;
/* 8 */             this.mSensitiveContentChannel = sensitiveContentChannel;
/* 10 */            sensitiveContentChannel.setSensitiveContentMethodHandler(this);
                }

                private String getFlutterViewNotFoundErrorReason() {
/* 12 */            return fm0.m3786l(new StringBuilder("FlutterView with ID "), this.mFlutterViewId, "not found");
                }

                private String getNotSupportedErrorReason() {
/* 1 */             return "isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.";
                }

                public void destroy() {
/* 4 */             this.mSensitiveContentChannel.setSensitiveContentMethodHandler(null);
/* 7 */             this.mFlutterActivity = null;
                }

                @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
                public int getContentSensitivity() {
/* 5 */             if (!isSupported()) {
/* 7 */                 return 2;
                    }
/* 13 */            View viewFindViewById = this.mFlutterActivity.findViewById(this.mFlutterViewId);
/* 17 */            if (viewFindViewById != null) {
/* 1 */                 return viewFindViewById.getContentSensitivity();
                    }
/* 28 */            C1951n4.m6859j(getFlutterViewNotFoundErrorReason());
/* 31 */            return 0;
                }

                @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
                public boolean isSupported() {
                    return Build.VERSION.SDK_INT >= 35;
                }

                @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
                public void setContentSensitivity(int i) {
/* 5 */             if (!isSupported()) {
/* 43 */                f42.m3656l(getNotSupportedErrorReason());
/* 46 */                return;
                    }
/* 11 */            View viewFindViewById = this.mFlutterActivity.findViewById(this.mFlutterViewId);
/* 15 */            if (viewFindViewById == null) {
/* 35 */                C1951n4.m6859j(getFlutterViewNotFoundErrorReason());
                    } else {
/* 21 */                if (viewFindViewById.getContentSensitivity() == i) {
/* 23 */                    return;
                        }
/* 1 */                 viewFindViewById.setContentSensitivity(i);
/* 27 */                viewFindViewById.invalidate();
                    }
                }
            }
