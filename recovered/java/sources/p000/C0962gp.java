            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.os.Build;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: gp */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0962gp {

                /* JADX INFO: renamed from: b */
                public final qc3 f8757b;

                /* JADX INFO: renamed from: c */
                public final String f8758c;

                /* JADX INFO: renamed from: a */
                public final HashMap f8756a = new HashMap();

                /* JADX INFO: renamed from: d */
                public ac1 f8759d = null;

                public C0962gp(CameraCharacteristics cameraCharacteristics, String str) {
/* 18 */            if (Build.VERSION.SDK_INT >= 28) {
/* 27 */                this.f8757b = new C0925fp(cameraCharacteristics, 14);
                    } else {
/* 37 */                this.f8757b = new qc3(cameraCharacteristics, 14);
                    }
/* 39 */            this.f8758c = str;
                }

                /* JADX INFO: renamed from: a */
                public final Object m3981a(CameraCharacteristics.Key key) {
/* 7 */             if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
/* 15 */                return ((CameraCharacteristics) this.f8757b.f15492b).get(key);
                    }
                    synchronized (this) {
                        try {
/* 23 */                    Object obj = this.f8756a.get(key);
/* 27 */                    if (obj != null) {
/* 30 */                        return obj;
                            }
/* 39 */                    Object obj2 = ((CameraCharacteristics) this.f8757b.f15492b).get(key);
/* 43 */                    if (obj2 != null) {
/* 47 */                        this.f8756a.put(key, obj2);
                            }
/* 51 */                    return obj2;
                        } catch (Throwable th) {
/* 53 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final ac1 m3982b() {
/* 3 */             if (this.f8759d == null) {
                        try {
/* 12 */                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m3981a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
/* 14 */                    if (streamConfigurationMap == null) {
/* 35 */                        C1951n4.m6859j("StreamConfigurationMap is null!");
/* 5 */                         return null;
                            }
/* 30 */                    this.f8759d = new ac1(streamConfigurationMap, new wc0(this.f8758c, 22));
                        } catch (AssertionError | NullPointerException e) {
/* 46 */                    C1951n4.m6859j(e.getMessage());
/* 5 */                     return null;
                        }
                    }
/* 50 */            return this.f8759d;
                }
            }
