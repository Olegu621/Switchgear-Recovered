            package p000;

            import android.graphics.Rect;
            
            /* JADX INFO: renamed from: wk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2334wk {

                /* JADX INFO: renamed from: a */
                public final int f18665a;

                /* JADX INFO: renamed from: b */
                public final int f18666b;

                /* JADX INFO: renamed from: c */
                public final int f18667c;

                /* JADX INFO: renamed from: d */
                public final int f18668d;

                public C2334wk(Rect rect) {
/* 1 */             rect.getClass();
/* 4 */             int i = rect.left;
/* 6 */             int i2 = rect.top;
/* 8 */             int i3 = rect.right;
/* 10 */            int i4 = rect.bottom;
/* 15 */            this.f18665a = i;
/* 17 */            this.f18666b = i2;
/* 19 */            this.f18667c = i3;
/* 21 */            this.f18668d = i4;
/* 24 */            if (i > i3) {
/* 49 */                ds0.m3200q(AbstractC0886en.m3506j("Left must be less than or equal to right, left: ", i, i3, ", right: "));
/* 52 */                throw null;
                    }
/* 26 */            if (i2 <= i4) {
/* 28 */                return;
                    }
/* 37 */            ds0.m3200q(AbstractC0886en.m3506j("top must be less than or equal to bottom, top: ", i2, i4, ", bottom: "));
/* 40 */            throw null;
                }

                /* JADX INFO: renamed from: a */
                public final Rect m9582a() {
/* 11 */            return new Rect(this.f18665a, this.f18666b, this.f18667c, this.f18668d);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (!C2334wk.class.equals(obj != null ? obj.getClass() : null)) {
/* 19 */                return false;
                    }
/* 23 */            obj.getClass();
/* 26 */            C2334wk c2334wk = (C2334wk) obj;
                    return this.f18665a == c2334wk.f18665a && this.f18666b == c2334wk.f18666b && this.f18667c == c2334wk.f18667c && this.f18668d == c2334wk.f18668d;
                }

                public final int hashCode() {
/* 17 */            return (((((this.f18665a * 31) + this.f18666b) * 31) + this.f18667c) * 31) + this.f18668d;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 12 */            sb.append(C2334wk.class.getSimpleName());
/* 17 */            sb.append(" { [");
/* 22 */            sb.append(this.f18665a);
/* 27 */            sb.append(',');
/* 32 */            sb.append(this.f18666b);
/* 35 */            sb.append(',');
/* 40 */            sb.append(this.f18667c);
/* 43 */            sb.append(',');
/* 50 */            return fm0.m3786l(sb, this.f18668d, "] }");
                }
            }
