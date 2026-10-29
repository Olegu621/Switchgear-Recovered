            package p000;

            import android.net.NetworkInfo;
            import java.util.Locale;
            import kotlin.jvm.functions.Function0;
            import kotlin.text.C1852e;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class es1 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7863a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ gs1 f7864b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ NetworkInfo f7865c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ es1(gs1 gs1Var, NetworkInfo networkInfo, int i) {
/* 8 */             super(0);
/* 1 */             this.f7863a = i;
/* 3 */             this.f7864b = gs1Var;
/* 5 */             this.f7865c = networkInfo;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f7863a;
/* 3 */             NetworkInfo networkInfo = this.f7865c;
/* 5 */             gs1 gs1Var = this.f7864b;
                    switch (i) {
                        case 0:
/* 38 */                    gs1Var.f8795c.getClass();
/* 41 */                    if (networkInfo != null) {
/* 43 */                        String typeName = networkInfo.getTypeName();
/* 47 */                        typeName.getClass();
/* 50 */                        Locale locale = Locale.getDefault();
/* 54 */                        locale.getClass();
/* 57 */                        String lowerCase = typeName.toLowerCase(locale);
/* 61 */                        lowerCase.getClass();
/* 80 */                        if (lowerCase.equals("mobile") ? true : lowerCase.equals("wifi")) {
/* 85 */                            return lowerCase;
                                }
                            }
/* 83 */                    return "offline";
                        default:
/* 12 */                    gs1Var.f8795c.getClass();
/* 15 */                    if (networkInfo == null || !C1852e.m6258h(networkInfo.getTypeName(), "MOBILE")) {
/* 34 */                        return null;
                            }
/* 29 */                    return networkInfo.getSubtypeName();
                    }
                }
            }
