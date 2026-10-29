            package p000;

            import android.graphics.Paint;
            import android.graphics.Path;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rc2 {

                /* JADX INFO: renamed from: i */
                public static final int[] f15972i = new int[3];

                /* JADX INFO: renamed from: j */
                public static final float[] f15973j = {0.0f, 0.5f, 1.0f};

                /* JADX INFO: renamed from: k */
                public static final int[] f15974k = new int[4];

                /* JADX INFO: renamed from: l */
                public static final float[] f15975l = {0.0f, 0.0f, 0.5f, 1.0f};

                /* JADX INFO: renamed from: a */
                public final Paint f15976a;

                /* JADX INFO: renamed from: b */
                public final Paint f15977b;

                /* JADX INFO: renamed from: c */
                public final Paint f15978c;

                /* JADX INFO: renamed from: d */
                public int f15979d;

                /* JADX INFO: renamed from: e */
                public int f15980e;

                /* JADX INFO: renamed from: f */
                public int f15981f;

                /* JADX INFO: renamed from: g */
                public final Path f15982g = new Path();

                /* JADX INFO: renamed from: h */
                public final Paint f15983h;

                public rc2() {
/* 13 */            Paint paint = new Paint();
/* 16 */            this.f15983h = paint;
/* 23 */            this.f15976a = new Paint();
/* 27 */            m8131a(-16777216);
/* 31 */            paint.setColor(0);
/* 37 */            Paint paint2 = new Paint(4);
/* 40 */            this.f15977b = paint2;
/* 44 */            paint2.setStyle(Paint.Style.FILL);
/* 52 */            this.f15978c = new Paint(paint2);
                }

                /* JADX INFO: renamed from: a */
                public final void m8131a(int i) {
/* 7 */             this.f15979d = AbstractC0196bx.m1454f(i, 68);
/* 15 */            this.f15980e = AbstractC0196bx.m1454f(i, 20);
/* 22 */            this.f15981f = AbstractC0196bx.m1454f(i, 0);
/* 28 */            this.f15976a.setColor(this.f15979d);
                }
            }
