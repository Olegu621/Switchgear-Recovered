            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            /* JADX INFO: renamed from: ch */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0216ch {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f2916b = AtomicIntegerFieldUpdater.newUpdater(C0216ch.class, "notCompletedCount$volatile");

                /* JADX INFO: renamed from: a */
                public final e70[] f2917a;
                private volatile /* synthetic */ int notCompletedCount$volatile;

                public C0216ch(e70[] e70VarArr) {
/* 4 */             this.f2917a = e70VarArr;
/* 7 */             this.notCompletedCount$volatile = e70VarArr.length;
                }
            }
