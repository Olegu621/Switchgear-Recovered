            package p000;

            import java.util.concurrent.atomic.AtomicLong;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qg3 extends xh3 {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ int f15539c = 0;

                /* JADX INFO: renamed from: b */
                public final AtomicLong f15540b = new AtomicLong(-1);

                static {
/* 4 */             new ng3(1);
                }

                @Override // p000.xh3
                /* JADX INFO: renamed from: a */
                public final void mo7170a() {
/* 1 */             AtomicLong atomicLong = this.f15540b;
/* 14 */            atomicLong.set(Math.max(-atomicLong.get(), 0L));
                }
            }
