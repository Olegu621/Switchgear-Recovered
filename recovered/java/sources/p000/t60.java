            package p000;

            import android.view.ViewGroup;
            import androidx.fragment.app.C0095g;
            import io.sentry.EnumC1567n6;
            import io.sentry.android.replay.C1326k;
            import io.sentry.android.replay.capture.AbstractC1301c;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class t60 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16926a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f16927b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f16928c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f16929d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public t60(C0095g c0095g, ViewGroup viewGroup, Object obj) {
/* 10 */            super(0);
/* 2 */             this.f16926a = 0;
/* 4 */             this.f16928c = c0095g;
/* 6 */             this.f16929d = viewGroup;
/* 8 */             this.f16927b = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f16926a;
/* 3 */             Object obj = this.f16929d;
/* 5 */             Object obj2 = this.f16928c;
                    switch (i) {
                        case 0:
/* 58 */                    ((C0095g) obj2).f1429f.mo5865c((ViewGroup) obj, this.f16927b);
                            break;
                        case 1:
/* 30 */                    Integer num = (Integer) obj2;
/* 34 */                    C1326k c1326k = ((AbstractC1301c) obj).f10465h;
/* 36 */                    if (c1326k != null) {
/* 44 */                        c1326k.m5016h("segment.id", String.valueOf(num));
                            }
                            break;
                        default:
/* 10 */                    EnumC1567n6 enumC1567n6 = (EnumC1567n6) obj2;
/* 14 */                    C1326k c1326k2 = ((AbstractC1301c) obj).f10465h;
/* 16 */                    if (c1326k2 != null) {
/* 24 */                        c1326k2.m5016h("replay.type", String.valueOf(enumC1567n6));
                            }
                            break;
                    }
/* 27 */            return Unit.f12910a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public /* synthetic */ t60(Object obj, Object obj2, AbstractC1301c abstractC1301c, int i) {
                    super(0);
/* 14 */            this.f16926a = i;
                    this.f16927b = obj;
                    this.f16928c = obj2;
                    this.f16929d = abstractC1301c;
                }
            }
