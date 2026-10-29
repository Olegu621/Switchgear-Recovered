            package p000;

            import com.supercell.p007id.scid_plugin.PromiseUtilKt;
            import java.lang.ref.WeakReference;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class hy1 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9361a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ WeakReference f9362b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function2 f9363c;

                public /* synthetic */ hy1(WeakReference weakReference, Function2 function2, int i) {
/* 1 */             this.f9361a = i;
/* 3 */             this.f9362b = weakReference;
/* 5 */             this.f9363c = function2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f9361a;
/* 3 */             Function2 function2 = this.f9363c;
/* 5 */             WeakReference weakReference = this.f9362b;
                    switch (i) {
                        case 0:
/* 1 */                     return PromiseUtilKt.successUiWith$lambda$3(weakReference, function2, obj);
                        default:
/* 1 */                     return PromiseUtilKt.failUiWith$lambda$1(weakReference, function2, (Exception) obj);
                    }
                }
            }
