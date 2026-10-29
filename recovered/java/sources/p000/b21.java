            package p000;

            import io.sentry.C1697u2;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class b21 {

                /* JADX INFO: renamed from: a */
                public static final r11 f2178a;

                static {
/* 1 */             a11 a11Var = b11.f2161d;
/* 3 */             a11Var.getClass();
/* 6 */             C0168b5 c0168b5 = a11Var.f2163b;
/* 11 */            wl0 wl0Var = new wl0(true, true, true);
/* 16 */            c0168b5.getClass();
/* 19 */            r11 r11Var = new r11(wl0Var, c0168b5);
/* 24 */            if (c0168b5 != oa2.f14694a) {
/* 42 */                for (Map.Entry entry : ((Map) c0168b5.f2211b).entrySet()) {
/* 60 */                    if (entry.getValue() != null) {
/* 63 */                        C1697u2.m5431g();
/* 66 */                        return;
                            }
                        }
/* 83 */                for (Map.Entry entry2 : ((Map) c0168b5.f2212c).entrySet()) {
/* 95 */                    o21 o21Var = (o21) entry2.getKey();
/* 115 */                   for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
/* 127 */                       o21 o21Var2 = (o21) entry3.getKey();
/* 133 */                       KSerializer kSerializer = (KSerializer) entry3.getValue();
/* 135 */                       o21Var.getClass();
/* 138 */                       o21Var2.getClass();
/* 141 */                       kSerializer.getClass();
/* 144 */                       SerialDescriptor descriptor = kSerializer.getDescriptor();
/* 148 */                       py0 py0VarMo134e = descriptor.mo134e();
/* 156 */                       if ((py0VarMo134e instanceof lt1) || Intrinsics.m6216a(py0VarMo134e, ba2.f2339k)) {
/* 246 */                           ds0.m3197n("Serializer for ", ((C0857dv) o21Var2).m3242b(), " can't be registered as a subclass for polymorphic serialization because its kind ", py0VarMo134e, " is not concrete. To work with multiple hierarchies, register it as a base class.");
/* 249 */                           return;
                                }
/* 172 */                       if (Intrinsics.m6216a(py0VarMo134e, ei2.f7699l) || Intrinsics.m6216a(py0VarMo134e, ei2.f7700m) || (py0VarMo134e instanceof gx1) || (py0VarMo134e instanceof ca2)) {
/* 232 */                           ds0.m3197n("Serializer for ", ((C0857dv) o21Var2).m3242b(), " of kind ", py0VarMo134e, " cannot be serialized polymorphically with class discriminator.");
/* 235 */                           return;
                                }
/* 190 */                       int iMo135f = descriptor.mo135f();
/* 195 */                       for (int i = 0; i < iMo135f; i++) {
/* 197 */                           String strMo136g = descriptor.mo136g(i);
/* 207 */                           if (Intrinsics.m6216a(strMo136g, "type")) {
/* 218 */                               s80.m8426g("Polymorphic serializer for ", o21Var2, " has property '", strMo136g, "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
/* 221 */                               return;
                                    }
                                }
                            }
                        }
/* 266 */               for (Map.Entry entry4 : ((Map) c0168b5.f2213d).entrySet()) {
/* 278 */                   o21 o21Var3 = (o21) entry4.getKey();
/* 284 */                   Function1 function1 = (Function1) entry4.getValue();
/* 286 */                   o21Var3.getClass();
/* 289 */                   function1.getClass();
/* 292 */                   gs2.m4011b(1, function1);
                        }
/* 312 */               for (Map.Entry entry5 : ((Map) c0168b5.f2215f).entrySet()) {
/* 324 */                   o21 o21Var4 = (o21) entry5.getKey();
/* 330 */                   Function1 function2 = (Function1) entry5.getValue();
/* 332 */                   o21Var4.getClass();
/* 335 */                   function2.getClass();
/* 338 */                   gs2.m4011b(1, function2);
                        }
                    }
/* 342 */           f2178a = r11Var;
                }

                /* JADX INFO: renamed from: a */
                public static final Object m1203a(b11 b11Var, KSerializer kSerializer, String str, i03 i03Var) {
/* 1 */             b11Var.getClass();
/* 4 */             kSerializer.getClass();
/* 7 */             str.getClass();
                    try {
/* 10 */                return b11Var.m1198a(str, kSerializer);
                    } catch (Throwable th) {
/* 16 */                if (i03Var == null) {
/* 29 */                    return null;
                        }
/* 18 */                String message = th.getMessage();
/* 22 */                if (message == null) {
/* 24 */                    message = "Json parse error";
                        }
/* 26 */                i03Var.mo2907b(message, th);
/* 29 */                return null;
                    }
                }
            }
