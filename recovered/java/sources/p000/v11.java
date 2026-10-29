            package p000;

            import android.content.ClipData;
            import android.content.ClipboardManager;
            import android.content.Context;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class v11 extends vo0 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17834a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ v11(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
/* 3 */             super(i, obj, cls, str, str2, i2);
/* 1 */             this.f17834a = i3;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (this.f17834a) {
                        case 0:
/* 121 */                   return w11.m9423d((SerialDescriptor) this.receiver);
                        case 1:
/* 112 */                   return w11.m9423d((SerialDescriptor) this.receiver);
                        case 2:
/* 102 */                   ((sp1) this.receiver).m8604d();
/* 105 */                   return Unit.f12910a;
                        case 3:
/* 92 */                    ((sp1) this.receiver).m8604d();
/* 95 */                    return Unit.f12910a;
                        case 4:
/* 73 */                    fu2 fu2Var = (fu2) this.receiver;
/* 75 */                    DialogInterfaceC1991o7 dialogInterfaceC1991o7 = fu2Var.f8359a;
/* 77 */                    if (dialogInterfaceC1991o7 != null) {
/* 79 */                        dialogInterfaceC1991o7.dismiss();
                            }
/* 83 */                    fu2Var.f8359a = null;
/* 85 */                    return Unit.f12910a;
                        case 5:
/* 65 */                    wv2.m9645m((wv2) this.receiver);
/* 68 */                    return Unit.f12910a;
                        case 6:
/* 18 */                    yv2 yv2Var = (yv2) this.receiver;
/* 20 */                    Context context = yv2Var.f19822a;
/* 22 */                    String str = yv2Var.f19827f;
/* 32 */                    String str2 = (String) ((eq2) yv2Var.f19831j.f15955a).f7832a;
/* 34 */                    str.getClass();
/* 37 */                    str2.getClass();
                            try {
/* 42 */                        Object systemService = context.getSystemService("clipboard");
/* 46 */                        systemService.getClass();
/* 55 */                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str2, str));
                                break;
                            } catch (Throwable unused) {
                            }
/* 58 */                    return Unit.f12910a;
                        default:
/* 10 */                    ((rz2) this.receiver).m8338b();
/* 13 */                    return Unit.f12910a;
                    }
                }
            }
