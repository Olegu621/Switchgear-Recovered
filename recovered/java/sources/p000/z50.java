            package p000;

            import android.content.Context;
            import com.google.firebase.messaging.FirebaseMessagingRegistrar;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class z50 implements InterfaceC0934fy {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19938a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ f02 f19939b;

                public /* synthetic */ z50(f02 f02Var, int i) {
/* 1 */             this.f19938a = i;
/* 3 */             this.f19939b = f02Var;
                }

                @Override // p000.InterfaceC0934fy
                public final Object create(InterfaceC0824cy interfaceC0824cy) {
/* 1 */             int i = this.f19938a;
/* 3 */             f02 f02Var = this.f19939b;
                    switch (i) {
                        case 0:
/* 17 */                    C0168b5 c0168b5 = (C0168b5) interfaceC0824cy;
/* 62 */                    return new b60((Context) c0168b5.get(Context.class), ((vi0) c0168b5.get(vi0.class)).m9276d(), c0168b5.mo1257a(f02.m3619a(xt0.class)), c0168b5.mo1258b(a70.class), (Executor) c0168b5.mo1261e(f02Var));
                        default:
/* 1 */                     return FirebaseMessagingRegistrar.lambda$getComponents$0(f02Var, (C0168b5) interfaceC0824cy);
                    }
                }
            }
