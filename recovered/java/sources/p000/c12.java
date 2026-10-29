            package p000;

            import android.app.Application;
            import com.google.android.recaptcha.Recaptcha;
            import com.google.android.recaptcha.RecaptchaClient;
            import io.flutter.plugin.common.MethodChannel;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c12 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public int f2650a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f2651b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Double f2652c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Application f2653d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f2654e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ d12 f2655f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ MethodChannel.Result f2656i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c12(Double d, Application application, String str, d12 d12Var, MethodChannel.Result result, c10 c10Var) {
/* 12 */            super(2, c10Var);
/* 1 */             this.f2652c = d;
/* 3 */             this.f2653d = application;
/* 5 */             this.f2654e = str;
/* 7 */             this.f2655f = d12Var;
/* 9 */             this.f2656i = result;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 14 */            c12 c12Var = new c12(this.f2652c, this.f2653d, this.f2654e, this.f2655f, this.f2656i, c10Var);
/* 17 */            c12Var.f2651b = obj;
/* 19 */            return c12Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((c12) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
                
                    if (r14 == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
                
                    if (r14 == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
                
                    return r0;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    c12 c12Var;
                    Object objM10484getClientBWLJW6A$default;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f2650a;
/* 8 */             if (i == 0) {
/* 30 */                pg3.m7417A(obj);
/* 37 */                Double d = this.f2652c;
/* 39 */                Application application = this.f2653d;
/* 41 */                String str = this.f2654e;
/* 43 */                if (d != null) {
/* 45 */                    Recaptcha recaptcha = Recaptcha.INSTANCE;
/* 51 */                    long jDoubleValue = (long) d.doubleValue();
/* 52 */                    this.f2650a = 1;
/* 54 */                    c12Var = this;
/* 55 */                    objM10484getClientBWLJW6A$default = recaptcha.m10485getClientBWLJW6A(application, str, jDoubleValue, c12Var);
                        } else {
/* 62 */                    c12Var = this;
/* 63 */                    Recaptcha recaptcha2 = Recaptcha.INSTANCE;
/* 65 */                    c12Var.f2650a = 2;
/* 71 */                    objM10484getClientBWLJW6A$default = Recaptcha.m10484getClientBWLJW6A$default(recaptcha2, application, str, 0L, c12Var, 4, null);
                        }
                    } else {
/* 10 */                if (i != 1 && i != 2) {
/* 17 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 21 */                pg3.m7417A(obj);
/* 26 */                objM10484getClientBWLJW6A$default = ((o42) obj).f14613a;
/* 28 */                c12Var = this;
                    }
/* 78 */            m42 m42Var = o42.f14612b;
/* 80 */            boolean z = objM10484getClientBWLJW6A$default instanceof n42;
/* 82 */            MethodChannel.Result result = c12Var.f2656i;
/* 84 */            if (!z) {
/* 91 */                c12Var.f2655f.f6958b = (RecaptchaClient) objM10484getClientBWLJW6A$default;
/* 95 */                result.success(Boolean.TRUE);
                    }
/* 98 */            Throwable thM7099a = o42.m7099a(objM10484getClientBWLJW6A$default);
/* 102 */           if (thM7099a != null) {
/* 110 */               result.error("FL_INIT_FAILED", thM7099a.toString(), null);
                    }
/* 113 */           return Unit.f12910a;
                }
            }
