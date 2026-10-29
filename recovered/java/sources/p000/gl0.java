            package p000;

            import android.graphics.Rect;
            import java.util.Comparator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gl0 implements Comparator {

                /* JADX INFO: renamed from: a */
                public final Rect f8693a = new Rect();

                /* JADX INFO: renamed from: b */
                public final Rect f8694b = new Rect();

                /* JADX INFO: renamed from: c */
                public final boolean f8695c;

                /* JADX INFO: renamed from: d */
                public final zb0 f8696d;

                public gl0(boolean z, zb0 zb0Var) {
/* 18 */            this.f8695c = z;
/* 20 */            this.f8696d = zb0Var;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
/* 3 */             this.f8696d.getClass();
/* 8 */             Rect rect = this.f8693a;
/* 10 */            ((C0901f1) obj).m3625f(rect);
/* 15 */            Rect rect2 = this.f8694b;
/* 17 */            ((C0901f1) obj2).m3625f(rect2);
/* 20 */            int i = rect.top;
/* 22 */            int i2 = rect2.top;
/* 24 */            if (i < i2) {
/* 69 */                return -1;
                    }
/* 27 */            if (i > i2) {
/* 71 */                return 1;
                    }
/* 30 */            int i3 = rect.left;
/* 32 */            int i4 = rect2.left;
/* 34 */            boolean z = this.f8695c;
/* 36 */            if (i3 < i4) {
                        return z ? 1 : -1;
                    }
/* 41 */            if (i3 > i4) {
                        return z ? -1 : 1;
                    }
/* 46 */            int i5 = rect.bottom;
/* 48 */            int i6 = rect2.bottom;
/* 50 */            if (i5 < i6) {
/* 69 */                return -1;
                    }
/* 53 */            if (i5 > i6) {
/* 71 */                return 1;
                    }
/* 56 */            int i7 = rect.right;
/* 58 */            int i8 = rect2.right;
/* 60 */            if (i7 < i8) {
                        return z ? 1 : -1;
                    }
/* 65 */            if (i7 > i8) {
                        return z ? -1 : 1;
                    }
/* 73 */            return 0;
                }
            }
