            package p000;

            import android.app.Application;
            import com.google.android.recaptcha.Recaptcha;
            import com.google.android.recaptcha.RecaptchaClient;
            import io.flutter.plugin.common.MethodChannel;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b12 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public d12 f2165a;

                /* JADX INFO: renamed from: b */
                public int f2166b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ d12 f2167c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Application f2168d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f2169e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MethodChannel.Result f2170f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b12(d12 d12Var, Application application, String str, MethodChannel.Result result, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.f2167c = d12Var;
/* 3 */             this.f2168d = application;
/* 5 */             this.f2169e = str;
/* 7 */             this.f2170f = result;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            return new b12(this.f2167c, this.f2168d, this.f2169e, this.f2170f, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((b12) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    d12 d12Var;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f2166b;
/* 6 */             MethodChannel.Result result = this.f2170f;
                    try {
/* 9 */                 if (i == 0) {
/* 27 */                    pg3.m7417A(obj);
/* 30 */                    d12 d12Var2 = this.f2167c;
/* 32 */                    Recaptcha recaptcha = Recaptcha.INSTANCE;
/* 34 */                    Application application = this.f2168d;
/* 36 */                    String str = this.f2169e;
/* 38 */                    this.f2165a = d12Var2;
/* 40 */                    this.f2166b = 1;
/* 42 */                    Object objFetchClient = recaptcha.fetchClient(application, str, this);
/* 46 */                    if (objFetchClient == z10Var) {
/* 48 */                        return z10Var;
                            }
/* 50 */                    obj = objFetchClient;
/* 51 */                    d12Var = d12Var2;
                        } else {
/* 11 */                    if (i != 1) {
/* 23 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 13 */                    d12Var = this.f2165a;
/* 15 */                    pg3.m7417A(obj);
                        }
/* 54 */                d12Var.f6958b = (RecaptchaClient) obj;
/* 58 */                result.success(Boolean.TRUE);
                    } catch (Exception e) {
/* 68 */                result.error("FL_INIT_FAILED", e.toString(), null);
                    }
/* 71 */            return Unit.f12910a;
                }
            }
