            package p000;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class gj1 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8633a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ kj1 f8634b;

                public /* synthetic */ gj1(kj1 kj1Var, int i) {
/* 1 */             this.f8633a = i;
/* 3 */             this.f8634b = kj1Var;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f8633a;
/* 7 */             kj1 kj1Var = this.f8634b;
                    switch (i) {
                        case 0:
/* 78 */                    String str = (String) obj;
/* 80 */                    str.getClass();
/* 105 */                   kj1Var.f12821b.m9012a(oc1.m7131e(new Pair("name", "barcode"), new Pair(SharedDataContentProvider.BASE_PATH, str)));
                            break;
                        case 1:
/* 45 */                    String str2 = (String) obj;
/* 47 */                    str2.getClass();
/* 72 */                    kj1Var.f12821b.m9012a(oc1.m7131e(new Pair("name", "error"), new Pair(SharedDataContentProvider.BASE_PATH, str2)));
                            break;
                        default:
/* 12 */                    Integer num = (Integer) obj;
/* 14 */                    num.getClass();
/* 39 */                    kj1Var.f12821b.m9012a(oc1.m7131e(new Pair("name", "rotation"), new Pair(SharedDataContentProvider.BASE_PATH, num)));
                            break;
                    }
/* 42 */            return Unit.f12910a;
                }
            }
