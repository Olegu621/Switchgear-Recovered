            package androidx.lifecycle;

            import android.os.Handler;
            import kotlin.Metadata;
            import p000.RunnableC2166s2;
            import p000.g71;
            import p000.i71;
            import p000.t61;
            import p000.ts0;
            import p000.v61;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m6176d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Lg71;", "<init>", "()V", "tx1", "lifecycle-process_release"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class ProcessLifecycleOwner implements g71 {

                /* JADX INFO: renamed from: w */
                public static final ProcessLifecycleOwner f1535w = new ProcessLifecycleOwner();

                /* JADX INFO: renamed from: a */
                public int f1536a;

                /* JADX INFO: renamed from: b */
                public int f1537b;

                /* JADX INFO: renamed from: e */
                public Handler f1540e;

                /* JADX INFO: renamed from: c */
                public boolean f1538c = true;

                /* JADX INFO: renamed from: d */
                public boolean f1539d = true;

                /* JADX INFO: renamed from: f */
                public final i71 f1541f = new i71(this);

                /* JADX INFO: renamed from: i */
                public final RunnableC2166s2 f1542i = new RunnableC2166s2(this, 28);

                /* JADX INFO: renamed from: v */
                public final ts0 f1543v = new ts0(this);

                private ProcessLifecycleOwner() {
                }

                /* JADX INFO: renamed from: a */
                public final void m755a() {
/* 4 */             int i = this.f1537b + 1;
/* 5 */             this.f1537b = i;
/* 7 */             if (i == 1) {
/* 11 */                if (this.f1538c) {
/* 17 */                    this.f1541f.m4487e(t61.ON_RESUME);
/* 21 */                    this.f1538c = false;
                        } else {
/* 24 */                    Handler handler = this.f1540e;
/* 26 */                    handler.getClass();
/* 31 */                    handler.removeCallbacks(this.f1542i);
                        }
                    }
                }

                @Override // p000.g71
                public final v61 getLifecycle() {
/* 1 */             return this.f1541f;
                }
            }
