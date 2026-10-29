            package p000;

            import android.content.Context;
            import android.graphics.Point;
            import android.hardware.display.DisplayManager;
            import android.os.Build;
            import android.util.Size;
            import android.view.Display;
            import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
            import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c90 {

                /* JADX INFO: renamed from: e */
                public static final Size f2767e = new Size(1920, 1080);

                /* JADX INFO: renamed from: f */
                public static final Size f2768f = new Size(320, 240);

                /* JADX INFO: renamed from: g */
                public static final Size f2769g = new Size(640, 480);

                /* JADX INFO: renamed from: h */
                public static final Object f2770h = new Object();

                /* JADX INFO: renamed from: i */
                public static volatile c90 f2771i;

                /* JADX INFO: renamed from: a */
                public final DisplayManager f2772a;

                /* JADX INFO: renamed from: b */
                public volatile Size f2773b = null;

                /* JADX INFO: renamed from: c */
                public final md1 f2774c = new md1(0);

                /* JADX INFO: renamed from: d */
                public final qc3 f2775d = new qc3(21);

                public c90(Context context) {
/* 32 */            this.f2772a = (DisplayManager) context.getSystemService("display");
                }

                /* JADX INFO: renamed from: b */
                public static c90 m1546b(Context context) {
/* 3 */             if (f2771i == null) {
                        synchronized (f2770h) {
                            try {
/* 10 */                        if (f2771i == null) {
/* 17 */                            f2771i = new c90(context);
                                }
                            } catch (Throwable th) {
/* 25 */                        throw th;
                            }
                        }
                    }
/* 26 */            return f2771i;
                }

                /* JADX INFO: renamed from: d */
                public static Display m1547d(Display[] displayArr, boolean z) {
/* 2 */             Display display = null;
/* 3 */             int i = -1;
/* 5 */             for (Display display2 : displayArr) {
/* 9 */                 if (!z || display2.getState() != 1) {
/* 21 */                    Point point = new Point();
/* 24 */                    display2.getRealSize(point);
/* 31 */                    int i2 = point.x * point.y;
/* 32 */                    if (i2 > i) {
/* 34 */                        display = display2;
/* 35 */                        i = i2;
                            }
                        }
                    }
/* 39 */            return display;
                }

                /* JADX INFO: renamed from: a */
                public final Size m1548a() {
                    Size sizeM441b;
/* 3 */             Point point = new Point();
/* 11 */            m1549c(false).getRealSize(point);
/* 20 */            Size size = new Size(point.x, point.y);
/* 23 */            Size size2 = ue2.f17489a;
/* 40 */            if (size.getHeight() * size.getWidth() < ue2.m9005a(f2768f)) {
/* 68 */                size = ((SmallDisplaySizeQuirk) this.f2775d.f15492b) != null ? (Size) SmallDisplaySizeQuirk.f803a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
/* 70 */                if (size == null) {
/* 72 */                    size = f2769g;
                        }
                    }
/* 82 */            if (size.getHeight() > size.getWidth()) {
/* 94 */                size = new Size(size.getHeight(), size.getWidth());
                    }
/* 106 */           int height = size.getHeight() * size.getWidth();
/* 107 */           Size size3 = f2767e;
/* 118 */           if (height > size3.getHeight() * size3.getWidth()) {
/* 120 */               size = size3;
                    }
/* 125 */           if (this.f2774c.f13702a != null && (sizeM441b = ExtraCroppingQuirk.m441b(1)) != null) {
/* 154 */               if (sizeM441b.getHeight() * sizeM441b.getWidth() > size.getHeight() * size.getWidth()) {
/* 156 */                   return sizeM441b;
                        }
                    }
/* 157 */           return size;
                }

                /* JADX INFO: renamed from: c */
                public final Display m1549c(boolean z) {
/* 3 */             Display[] displays = this.f2772a.getDisplays();
/* 10 */            if (displays.length == 1) {
/* 12 */                return displays[0];
                    }
/* 15 */            Display displayM1547d = m1547d(displays, z);
/* 19 */            if (displayM1547d == null && z) {
/* 23 */                displayM1547d = m1547d(displays, false);
                    }
/* 27 */            if (displayM1547d != null) {
/* 29 */                return displayM1547d;
                    }
/* 32 */            C1951n4.m6859j("No display can be found from the input display manager!");
/* 35 */            return null;
                }

                /* JADX INFO: renamed from: e */
                public final Size m1550e() {
/* 3 */             if (this.f2773b != null) {
/* 5 */                 return this.f2773b;
                    }
/* 12 */            this.f2773b = m1548a();
/* 14 */            return this.f2773b;
                }
            }
