            package p000;

            import android.app.Activity;
            import android.os.Build;
            import android.util.Size;
            import android.view.Display;
            import android.view.WindowManager;
            import io.flutter.view.TextureRegistry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fj1 implements g71 {

                /* JADX INFO: renamed from: U */
                public TextureRegistry.SurfaceTextureEntry f8227U;

                /* JADX INFO: renamed from: V */
                public final y00 f8228V;

                /* JADX INFO: renamed from: W */
                public final a02 f8229W;

                /* JADX INFO: renamed from: X */
                public Size f8230X;

                /* JADX INFO: renamed from: Y */
                public Size f8231Y;

                /* JADX INFO: renamed from: Z */
                public volatile boolean f8232Z;

                /* JADX INFO: renamed from: a */
                public final Activity f8233a;

                /* JADX INFO: renamed from: a0 */
                public int f8234a0;

                /* JADX INFO: renamed from: b */
                public final TextureRegistry f8235b;

                /* JADX INFO: renamed from: b0 */
                public final C2357x6 f8236b0;

                /* JADX INFO: renamed from: c */
                public final gj1 f8237c;

                /* JADX INFO: renamed from: d */
                public final gj1 f8238d;

                /* JADX INFO: renamed from: e */
                public final gj1 f8239e;

                /* JADX INFO: renamed from: f */
                public final i71 f8240f;

                /* JADX INFO: renamed from: i */
                public sx1 f8241i;

                /* JADX INFO: renamed from: v */
                public y61 f8242v;

                /* JADX INFO: renamed from: w */
                public vw1 f8243w;

                public fj1(Activity activity, TextureRegistry textureRegistry, gj1 gj1Var, gj1 gj1Var2, gj1 gj1Var3) {
/* 1 */             activity.getClass();
/* 4 */             textureRegistry.getClass();
/* 10 */            this.f8233a = activity;
/* 12 */            this.f8235b = textureRegistry;
/* 14 */            this.f8237c = gj1Var;
/* 16 */            this.f8238d = gj1Var2;
/* 18 */            this.f8239e = gj1Var3;
/* 25 */            this.f8240f = new i71(this);
/* 33 */            this.f8228V = k50.m5964a(z80.f19975a);
/* 40 */            this.f8229W = new a02();
/* 49 */            this.f8236b0 = new C2357x6(this, 9);
                }

                /* JADX INFO: renamed from: a */
                public final int m3769a() {
                    Display defaultDisplay;
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             Activity activity = this.f8233a;
/* 7 */             if (i >= 30) {
/* 1 */                 defaultDisplay = activity.getDisplay();
/* 13 */                defaultDisplay.getClass();
                    } else {
/* 19 */                Object systemService = activity.getSystemService("window");
/* 23 */                systemService.getClass();
/* 28 */                defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    }
/* 32 */            int rotation = defaultDisplay.getRotation();
/* 36 */            if (rotation == 0) {
/* 57 */                return 0;
                    }
/* 39 */            if (rotation == 1) {
/* 54 */                return 90;
                    }
/* 42 */            if (rotation != 2) {
                        return rotation != 3 ? 0 : 270;
                    }
/* 51 */            return 180;
                }

                @Override // p000.g71
                public final v61 getLifecycle() {
/* 1 */             return this.f8240f;
                }
            }
