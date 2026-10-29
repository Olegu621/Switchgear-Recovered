            package io.sentry.android.replay.viewhierarchy;

            import android.graphics.Rect;
            import io.sentry.android.replay.util.C1350d;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1370h {

                /* JADX INFO: renamed from: a */
                public final int f10691a;

                /* JADX INFO: renamed from: b */
                public final int f10692b;

                /* JADX INFO: renamed from: c */
                public final float f10693c;

                /* JADX INFO: renamed from: d */
                public final boolean f10694d;

                /* JADX INFO: renamed from: e */
                public final boolean f10695e;

                /* JADX INFO: renamed from: f */
                public final Rect f10696f;

                /* JADX INFO: renamed from: g */
                public ArrayList f10697g;

                public AbstractC1370h(int i, int i2, float f, AbstractC1370h abstractC1370h, boolean z, boolean z2, Rect rect) {
/* 4 */             this.f10691a = i;
/* 6 */             this.f10692b = i2;
/* 8 */             this.f10693c = f;
/* 10 */            this.f10694d = z;
/* 12 */            this.f10695e = z2;
/* 14 */            this.f10696f = rect;
                }

                /* JADX INFO: renamed from: a */
                public final void m5052a(C1350d c1350d) {
                    ArrayList arrayList;
/* 11 */            if (!((Boolean) c1350d.invoke(this)).booleanValue() || (arrayList = this.f10697g) == null) {
/* 37 */                return;
                    }
/* 17 */            Iterator it = arrayList.iterator();
/* 25 */            while (it.hasNext()) {
/* 33 */                ((AbstractC1370h) it.next()).m5052a(c1350d);
                    }
                }
            }
