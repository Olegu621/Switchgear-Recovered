            package p000;

            import android.content.Context;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nl0 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14355a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f14356b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Context f14357c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C0168b5 f14358d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f14359e;

                public /* synthetic */ nl0(String str, Context context, C0168b5 c0168b5, int i, int i2) {
/* 1 */             this.f14355a = i2;
/* 3 */             this.f14356b = str;
/* 5 */             this.f14357c = context;
/* 7 */             this.f14358d = c0168b5;
/* 9 */             this.f14359e = i;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
/* 1 */             int i = this.f14355a;
/* 3 */             int i2 = this.f14359e;
/* 5 */             C0168b5 c0168b5 = this.f14358d;
/* 7 */             Context context = this.f14357c;
/* 9 */             String str = this.f14356b;
                    switch (i) {
                        case 0:
/* 26 */                    return pl0.m7477a(str, context, c0168b5, i2);
                        default:
                            try {
/* 14 */                        return pl0.m7477a(str, context, c0168b5, i2);
                            } catch (Throwable unused) {
/* 22 */                        return new ol0(-3);
                            }
                    }
                }
            }
