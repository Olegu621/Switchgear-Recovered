            package p000;

            import android.content.Context;
            import com.supercell.p007id.scid_plugin.PlatformInterfacePlugin;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedAccountStorage;
            import io.flutter.plugin.common.MethodChannel;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vs1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public int f18340a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PlatformInterfacePlugin f18341b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f18342c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f18343d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f18344e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MethodChannel.Result f18345f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public vs1(PlatformInterfacePlugin platformInterfacePlugin, String str, String str2, String str3, MethodChannel.Result result, c10 c10Var) {
/* 12 */            super(2, c10Var);
/* 1 */             this.f18341b = platformInterfacePlugin;
/* 3 */             this.f18342c = str;
/* 5 */             this.f18343d = str2;
/* 7 */             this.f18344e = str3;
/* 9 */             this.f18345f = result;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 14 */            return new vs1(this.f18341b, this.f18342c, this.f18343d, this.f18344e, this.f18345f, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((vs1) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
                
                    if (p000.i13.m4422D(r10, r1, r9) == r0) goto L28;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f18340a;
/* 5 */             MethodChannel.Result result = this.f18345f;
                    try {
/* 11 */                if (i != 0) {
/* 13 */                    if (i == 1) {
/* 36 */                        pg3.m7417A(obj);
                            } else {
/* 15 */                        if (i != 2 && i != 3) {
/* 26 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 19 */                        pg3.m7417A(obj);
                            }
/* 138 */                   return Unit.f12910a;
                        }
/* 40 */                pg3.m7417A(obj);
/* 1 */                 Context context = this.f18341b.applicationContext;
/* 51 */                if (context == null) {
/* 97 */                    Intrinsics.m6220e("applicationContext");
/* 100 */                   throw null;
                        }
/* 62 */                e70 e70VarLoadSharedAccounts = new SharedAccountStorage(context, this.f18342c, this.f18343d).loadSharedAccounts(this.f18344e);
/* 66 */                this.f18340a = 1;
/* 68 */                obj = e70VarLoadSharedAccounts.await(this);
/* 72 */                if (obj == z10Var) {
                        }
/* 137 */               return z10Var;
/* 77 */                m60 m60Var = z80.f19975a;
/* 79 */                kt0 kt0Var = gb1.f8531a;
/* 83 */                ts1 ts1Var = new ts1(result, (List) obj, null);
/* 86 */                this.f18340a = 2;
/* 92 */                if (i13.m4422D(kt0Var, ts1Var, this) == z10Var) {
/* 137 */                   return z10Var;
                        }
                    } catch (Exception e) {
/* 117 */               AbstractC1245n0.m4877e("ScidPlugin", "Failed to load shared accounts " + e, e);
/* 120 */               m60 m60Var2 = z80.f19975a;
/* 122 */               kt0 kt0Var2 = gb1.f8531a;
/* 126 */               us1 us1Var = new us1(result, null);
/* 129 */               this.f18340a = 3;
                    }
/* 138 */           return Unit.f12910a;
                }
            }
