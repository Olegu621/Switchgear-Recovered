            package p000;

            import com.google.android.recaptcha.RecaptchaAction;
            import com.google.android.recaptcha.RecaptchaClient;
            import io.flutter.plugin.common.MethodChannel;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a12 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public int f25a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ d12 f26b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Double f27c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ RecaptchaAction f28d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ MethodChannel.Result f29e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a12(d12 d12Var, Double d, RecaptchaAction recaptchaAction, MethodChannel.Result result, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.f26b = d12Var;
/* 3 */             this.f27c = d;
/* 5 */             this.f28d = recaptchaAction;
/* 7 */             this.f29e = result;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            return new a12(this.f26b, this.f27c, this.f28d, this.f29e, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((a12) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
                
                    if (r9 == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
                
                    if (r9 == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
                
                    return r0;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objMo10487executegIAlus;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f25a;
/* 8 */             if (i == 0) {
/* 29 */                pg3.m7417A(obj);
/* 34 */                RecaptchaClient recaptchaClient = this.f26b.f6958b;
/* 36 */                if (recaptchaClient == null) {
/* 101 */                   Intrinsics.m6220e("recaptchaClient");
/* 104 */                   throw null;
                        }
/* 38 */                Double d = this.f27c;
/* 40 */                RecaptchaAction recaptchaAction = this.f28d;
/* 42 */                if (d != null) {
/* 48 */                    long jDoubleValue = (long) d.doubleValue();
/* 49 */                    this.f25a = 1;
/* 51 */                    objMo10487executegIAlus = recaptchaClient.mo10486execute0E7RQCE(recaptchaAction, jDoubleValue, this);
                        } else {
/* 58 */                    this.f25a = 2;
/* 60 */                    objMo10487executegIAlus = recaptchaClient.mo10487executegIAlus(recaptchaAction, this);
                        }
                    } else {
/* 10 */                if (i != 1 && i != 2) {
/* 17 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 21 */                pg3.m7417A(obj);
/* 26 */                objMo10487executegIAlus = ((o42) obj).f14613a;
                    }
/* 67 */            m42 m42Var = o42.f14612b;
/* 69 */            boolean z = objMo10487executegIAlus instanceof n42;
/* 71 */            MethodChannel.Result result = this.f29e;
/* 73 */            if (!z) {
/* 78 */                result.success((String) objMo10487executegIAlus);
                    }
/* 81 */            Throwable thM7099a = o42.m7099a(objMo10487executegIAlus);
/* 85 */            if (thM7099a != null) {
/* 93 */                result.error("FL_EXECUTE_FAILED", thM7099a.toString(), null);
                    }
/* 96 */            return Unit.f12910a;
                }
            }
