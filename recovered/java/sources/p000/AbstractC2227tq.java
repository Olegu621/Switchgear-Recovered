            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import java.util.LinkedHashSet;
            
            /* JADX INFO: renamed from: tq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2227tq {

                /* JADX INFO: renamed from: a */
                public static final C1802jq f17225a;

                static {
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 12 */            linkedHashSet.add(new q61(2));
/* 20 */            f17225a = new C1802jq(linkedHashSet);
                }

                /* JADX INFO: renamed from: a */
                public static void m8851a(Context context, C0210cb c0210cb, C1802jq c1802jq) throws C2190sq {
                    Integer numM5880b;
/* 5 */             int i = 0;
/* 6 */             IllegalArgumentException illegalArgumentException = null;
/* 9 */             if (Build.VERSION.SDK_INT >= 34 && AbstractC2153rq.m8226b(context) != 0) {
/* 17 */                LinkedHashSet linkedHashSetM1597t = c0210cb.m1597t();
/* 25 */                if (linkedHashSetM1597t.isEmpty()) {
/* 44 */                    throw new C2190sq("No cameras available", 0, null);
                        }
/* 27 */                AbstractC2153rq.m8226b(context);
/* 30 */                linkedHashSetM1597t.size();
/* 33 */                hu0.m4312F0("CameraValidator");
/* 36 */                return;
                    }
/* 45 */            if (c1802jq != null) {
                        try {
/* 47 */                    numM5880b = c1802jq.m5880b();
/* 51 */                    if (numM5880b == null) {
/* 55 */                        hu0.m4315H0("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
/* 58 */                        return;
                            }
                        } catch (IllegalStateException e) {
/* 62 */                    hu0.m4326U("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
/* 65 */                    return;
                        }
                    } else {
/* 66 */                numM5880b = null;
                    }
/* 67 */            String str = Build.DEVICE;
/* 69 */            hu0.m4312F0("CameraValidator");
/* 72 */            PackageManager packageManager = context.getPackageManager();
                    try {
/* 82 */                if (packageManager.hasSystemFeature("android.hardware.camera") && (c1802jq == null || numM5880b.intValue() == 1)) {
/* 103 */                   C1802jq.f12420c.m5881c(c0210cb.m1597t());
/* 106 */                   i = 1;
                        }
                    } catch (IllegalArgumentException e2) {
/* 95 */                illegalArgumentException = e2;
/* 110 */               hu0.m4317I0("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
                    }
                    try {
/* 119 */               if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c1802jq == null || numM5880b.intValue() == 0)) {
/* 139 */                   C1802jq.f12419b.m5881c(c0210cb.m1597t());
/* 142 */                   i++;
                        }
                    } catch (IllegalArgumentException e3) {
/* 131 */               illegalArgumentException = e3;
/* 147 */               hu0.m4317I0("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
                    }
                    try {
/* 156 */               f17225a.m5881c(c0210cb.m1597t());
/* 159 */               hu0.m4312F0("CameraValidator");
/* 162 */               i++;
                    } catch (IllegalArgumentException unused) {
                    }
/* 164 */           if (illegalArgumentException == null) {
/* 166 */               return;
                    }
/* 185 */           hu0.m4325T("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + c0210cb.m1597t());
/* 195 */           throw new C2190sq("Expected camera missing from device.", i, illegalArgumentException);
                }
            }
