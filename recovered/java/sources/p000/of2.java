            package p000;

            import android.content.Context;
            import com.appsflyer.AppsFlyerProperties;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class of2 implements FlutterPlugin, MethodChannel.MethodCallHandler {

                /* JADX INFO: renamed from: a */
                public MethodChannel f14736a;

                /* JADX INFO: renamed from: b */
                public Context f14737b;

                /* JADX INFO: renamed from: a */
                public static void m7141a(MethodCall methodCall, MethodChannel.Result result) {
                    ht1 ht1VarM6974a;
                    lb2 lb2VarM4272A;
/* 1 */             Object obj = methodCall.arguments;
/* 5 */             String str = null;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null && (ht1VarM6974a = nf2.m6974a((String) mc1.m6638a(map, yq0.f19752a[0].getName()))) != null && (lb2VarM4272A = ht1VarM6974a.m4272A()) != null) {
/* 51 */                za2 za2Var = ((qa2) lb2VarM4272A.f16749a).m7750d().f17657k;
/* 53 */                if (za2Var == null) {
/* 55 */                    String str2 = lb2VarM4272A.f13172b;
/* 57 */                    str2.getClass();
/* 64 */                    k50.m5957K(str2, "Attempt to access SessionController fields when disabled", new Object[0]);
/* 67 */                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
/* 70 */                    C1837kn c1837kn = za2Var.f20042e;
/* 72 */                    if (c1837kn != null) {
/* 77 */                        str = (String) c1837kn.f12884d;
                            }
                        }
                    }
/* 79 */            result.success(str);
                }

                /* JADX INFO: renamed from: b */
                public static void m7142b(MethodCall methodCall, MethodChannel.Result result) {
                    ht1 ht1VarM6974a;
                    lb2 lb2VarM4272A;
/* 1 */             Object obj = methodCall.arguments;
/* 5 */             String str = null;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null && (ht1VarM6974a = nf2.m6974a((String) mc1.m6638a(map, yq0.f19752a[0].getName()))) != null && (lb2VarM4272A = ht1VarM6974a.m4272A()) != null) {
/* 51 */                za2 za2Var = ((qa2) lb2VarM4272A.f16749a).m7750d().f17657k;
/* 53 */                if (za2Var == null) {
/* 55 */                    String str2 = lb2VarM4272A.f13172b;
/* 57 */                    str2.getClass();
/* 64 */                    k50.m5957K(str2, "Attempt to access SessionController fields when disabled", new Object[0]);
/* 67 */                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
/* 70 */                    str = za2Var.f20038a;
                        }
                    }
/* 72 */            result.success(str);
                }

                /* JADX INFO: renamed from: c */
                public static void m7143c(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                Map mapM3914b = gf0Var.m3914b();
/* 25 */                C1774iz c1774iz = new C1774iz(mapM3914b);
/* 30 */                u21[] u21VarArr = C1774iz.f11967c;
/* 75 */                C1009hz c1009hz = new C1009hz((String) mc1.m6638a(mapM3914b, u21VarArr[1].getName()), (String) mc1.m6638a(mapM3914b, u21VarArr[2].getName()), ((Boolean) mc1.m6638a(mapM3914b, u21VarArr[0].getName())).booleanValue());
/* 81 */                String name = u21VarArr[3].getName();
/* 85 */                Map map2 = c1774iz.f11968a;
/* 91 */                String str = (String) mc1.m6638a(map2, name);
/* 93 */                if (str != null) {
/* 95 */                    c1009hz.f9368e = str;
                        }
/* 108 */               String str2 = (String) mc1.m6638a(map2, u21VarArr[4].getName());
/* 110 */               if (str2 != null) {
/* 112 */                   c1009hz.f9369f = str2;
                        }
/* 120 */               List list = (List) c1774iz.f11969b.getValue();
/* 122 */               if (list != null) {
/* 124 */                   LinkedList linkedList = c1009hz.f9370g;
/* 126 */                   linkedList.clear();
/* 129 */                   linkedList.addAll(list);
                        }
/* 132 */               gf0Var.m3913a(c1009hz);
/* 135 */               he3.m4199v(c1009hz, gf0Var);
                    }
/* 138 */           result.success(null);
                }

                /* JADX INFO: renamed from: d */
                public static void m7144d(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                Map mapM3914b = gf0Var.m3914b();
/* 25 */                h81 h81Var = new h81(mapM3914b);
/* 30 */                u21[] u21VarArr = h81.f8961b;
/* 45 */                int iIntValue = ((Number) mc1.m6638a(mapM3914b, u21VarArr[0].getName())).intValue();
/* 62 */                Integer num = (Integer) mc1.m6638a(h81Var.f8962a, u21VarArr[1].getName());
/* 64 */                g81 g81Var = new g81();
/* 67 */                g81Var.f8514b = iIntValue;
/* 69 */                g81Var.f8515c = num;
/* 71 */                gf0Var.m3913a(g81Var);
/* 74 */                he3.m4199v(g81Var, gf0Var);
                    }
/* 77 */            result.success(null);
                }

                /* JADX INFO: renamed from: e */
                public static void m7145e(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                vd1 vd1Var = new vd1();
/* 24 */                gf0Var.m3913a(vd1Var);
/* 27 */                he3.m4199v(vd1Var, gf0Var);
                    }
/* 30 */            result.success(null);
                }

                /* JADX INFO: renamed from: f */
                public static void m7146f(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 30 */                Integer numM1345a = new be1(gf0Var.m3914b()).m1345a();
/* 34 */                xd1 xd1Var = new xd1();
/* 37 */                xd1Var.f19039b = numM1345a;
/* 39 */                gf0Var.m3913a(xd1Var);
/* 42 */                he3.m4199v(xd1Var, gf0Var);
                    }
/* 45 */            result.success(null);
                }

                /* JADX INFO: renamed from: g */
                public static void m7147g(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                yd1 yd1Var = new yd1();
/* 24 */                gf0Var.m3913a(yd1Var);
/* 27 */                he3.m4199v(yd1Var, gf0Var);
                    }
/* 30 */            result.success(null);
                }

                /* JADX INFO: renamed from: h */
                public static void m7148h(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                de1 de1Var = new de1();
/* 24 */                gf0Var.m3913a(de1Var);
/* 27 */                he3.m4199v(de1Var, gf0Var);
                    }
/* 30 */            result.success(null);
                }

                /* JADX INFO: renamed from: i */
                public static void m7149i(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 30 */                Integer numM1345a = new be1(gf0Var.m3914b()).m1345a();
/* 34 */                ee1 ee1Var = new ee1();
/* 37 */                ee1Var.f7656b = numM1345a;
/* 39 */                gf0Var.m3913a(ee1Var);
/* 42 */                he3.m4199v(ee1Var, gf0Var);
                    }
/* 45 */            result.success(null);
                }

                /* JADX INFO: renamed from: j */
                public static void m7150j(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 30 */                Integer numM1345a = new be1(gf0Var.m3914b()).m1345a();
/* 34 */                ge1 ge1Var = new ge1();
/* 37 */                ge1Var.f8569b = numM1345a;
/* 39 */                gf0Var.m3913a(ge1Var);
/* 42 */                he3.m4199v(ge1Var, gf0Var);
                    }
/* 45 */            result.success(null);
                }

                /* JADX INFO: renamed from: k */
                public static void m7151k(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                he1 he1Var = new he1();
/* 24 */                gf0Var.m3913a(he1Var);
/* 27 */                he3.m4199v(he1Var, gf0Var);
                    }
/* 30 */            result.success(null);
                }

                /* JADX INFO: renamed from: l */
                public static void m7152l(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                se1 se1Var = new se1();
/* 24 */                gf0Var.m3913a(se1Var);
/* 27 */                he3.m4199v(se1Var, gf0Var);
                    }
/* 30 */            result.success(null);
                }

                /* JADX INFO: renamed from: m */
                public static void m7153m(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 22 */                we1 we1Var = new we1(1);
/* 25 */                gf0Var.m3913a(we1Var);
/* 28 */                he3.m4199v(we1Var, gf0Var);
                    }
/* 31 */            result.success(null);
                }

                /* JADX INFO: renamed from: n */
                public static void m7154n(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                Map mapM3914b = gf0Var.m3914b();
/* 25 */                mapM3914b.getClass();
/* 45 */                boolean zBooleanValue = ((Boolean) mc1.m6638a(mapM3914b, cf1.f2874a[0].getName())).booleanValue();
/* 50 */                ze1 ze1Var = new ze1(1);
/* 53 */                ze1Var.f20126c = zBooleanValue;
/* 55 */                gf0Var.m3913a(ze1Var);
/* 58 */                he3.m4199v(ze1Var, gf0Var);
                    }
/* 61 */            result.success(null);
                }

                /* JADX INFO: renamed from: o */
                public static void m7155o(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                ff1 ff1Var = new ff1();
/* 24 */                gf0Var.m3913a(ff1Var);
/* 27 */                he3.m4199v(ff1Var, gf0Var);
                    }
/* 30 */            result.success(null);
                }

                /* JADX INFO: renamed from: p */
                public static void m7156p(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                Map mapM3914b = gf0Var.m3914b();
/* 25 */                hf1 hf1Var = new hf1(mapM3914b);
/* 30 */                u21[] u21VarArr = hf1.f9054b;
/* 45 */                double dDoubleValue = ((Number) mc1.m6638a(mapM3914b, u21VarArr[1].getName())).doubleValue();
/* 62 */                Double d = (Double) mc1.m6638a(hf1Var.f9055a, u21VarArr[0].getName());
/* 64 */                gf1 gf1Var = new gf1();
/* 67 */                gf1Var.f8583b = dDoubleValue;
/* 69 */                gf1Var.f8584c = d;
/* 71 */                gf0Var.m3913a(gf1Var);
/* 74 */                he3.m4199v(gf1Var, gf0Var);
                    }
/* 77 */            result.success(null);
                }

                /* JADX INFO: renamed from: q */
                public static void m7157q(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 25 */                mf1 mf1Var = new mf1(gf0Var.m3914b());
/* 28 */                u21[] u21VarArr = mf1.f13717b;
/* 33 */                String name = u21VarArr[0].getName();
/* 37 */                Map map2 = mf1Var.f13718a;
/* 43 */                String str = (String) mc1.m6638a(map2, name);
/* 56 */                String str2 = (String) mc1.m6638a(map2, u21VarArr[1].getName());
/* 69 */                Integer num = (Integer) mc1.m6638a(map2, u21VarArr[2].getName());
/* 82 */                Integer num2 = (Integer) mc1.m6638a(map2, u21VarArr[3].getName());
/* 95 */                Boolean bool = (Boolean) mc1.m6638a(map2, u21VarArr[4].getName());
/* 99 */                lf1 lf1Var = new lf1();
/* 102 */               lf1Var.f13223b = str2;
/* 104 */               lf1Var.f13224c = str;
/* 106 */               lf1Var.f13225d = num;
/* 108 */               lf1Var.f13226e = num2;
/* 110 */               lf1Var.f13227f = bool;
/* 112 */               gf0Var.m3913a(lf1Var);
/* 115 */               he3.m4199v(lf1Var, gf0Var);
                    }
/* 118 */           result.success(null);
                }

                /* JADX INFO: renamed from: r */
                public static void m7158r(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 22 */                C2065pc c2065pc = new C2065pc(2);
/* 25 */                gf0Var.m3913a(c2065pc);
/* 28 */                he3.m4199v(c2065pc, gf0Var);
                    }
/* 31 */            result.success(null);
                }

                /* JADX INFO: renamed from: s */
                public static void m7159s(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 21 */                Map mapM3914b = gf0Var.m3914b();
/* 25 */                yf1 yf1Var = new yf1(mapM3914b);
/* 28 */                u21[] u21VarArr = yf1.f19595b;
/* 43 */                Integer num = (Integer) mc1.m6638a(yf1Var.f19596a, u21VarArr[0].getName());
/* 58 */                int iIntValue = ((Number) mc1.m6638a(mapM3914b, u21VarArr[1].getName())).intValue();
/* 64 */                xf1 xf1Var = new xf1();
/* 67 */                xf1Var.f19074b = iIntValue;
/* 69 */                xf1Var.f19075c = num;
/* 71 */                gf0Var.m3913a(xf1Var);
/* 74 */                he3.m4199v(xf1Var, gf0Var);
                    }
/* 77 */            result.success(null);
                }

                /* JADX INFO: renamed from: t */
                public static void m7160t(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             Object obj = methodCall.arguments;
/* 11 */            Map map = obj instanceof Map ? (Map) obj : null;
/* 12 */            if (map != null) {
/* 16 */                gf0 gf0Var = new gf0(map);
/* 25 */                b82 b82Var = new b82(gf0Var.m3914b());
/* 30 */                u21[] u21VarArr = b82.f2326b;
/* 35 */                String name = u21VarArr[0].getName();
/* 39 */                Map map2 = b82Var.f2327a;
/* 45 */                Integer num = (Integer) mc1.m6638a(map2, name);
/* 58 */                Integer num2 = (Integer) mc1.m6638a(map2, u21VarArr[1].getName());
/* 71 */                Integer num3 = (Integer) mc1.m6638a(map2, u21VarArr[2].getName());
/* 84 */                Integer num4 = (Integer) mc1.m6638a(map2, u21VarArr[3].getName());
/* 97 */                Integer num5 = (Integer) mc1.m6638a(map2, u21VarArr[4].getName());
/* 110 */               Integer num6 = (Integer) mc1.m6638a(map2, u21VarArr[5].getName());
/* 112 */               a82 a82Var = new a82();
/* 115 */               a82Var.f114b = num;
/* 117 */               a82Var.f115c = num2;
/* 119 */               a82Var.f116d = num3;
/* 121 */               a82Var.f117e = num4;
/* 123 */               a82Var.f118f = num5;
/* 125 */               a82Var.f119g = num6;
/* 127 */               gf0Var.m3913a(a82Var);
/* 130 */               he3.m4199v(a82Var, gf0Var);
                    }
/* 133 */           result.success(null);
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 12 */            MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "snowplow_tracker");
/* 15 */            this.f14736a = methodChannel;
/* 17 */            methodChannel.setMethodCallHandler(this);
/* 24 */            this.f14737b = flutterPluginBinding.getApplicationContext();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             MethodChannel methodChannel = this.f14736a;
/* 7 */             if (methodChannel == null) {
/* 17 */                Intrinsics.m6220e(AppsFlyerProperties.CHANNEL);
/* 20 */                throw null;
                    }
/* 9 */             methodChannel.setMethodCallHandler(null);
/* 12 */            this.f14737b = null;
                }

                /* JADX WARN: Failed to calculate best type for var: r15v1 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: vq2
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r15v1 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: vq2
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r6v55 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v55 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r6v57 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v57 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r6v59 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v59 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r6v61 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v61 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r6v63 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v63 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r6v65 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v65 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r6v67 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v67 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r6v68 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v68 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r6v69 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v69 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v10 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v10 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v12 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v13 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v13 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v15 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v15 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v16 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v18 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v18 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v19 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v19 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v20 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v20 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v22 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v22 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v23 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v23 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v7 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v7 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r7v9 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /*  JADX ERROR: Types fix failed
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v2 ??, new type: char
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                    */
                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public final void onMethodCall(io.flutter.plugin.common.MethodCall r23, io.flutter.plugin.common.MethodChannel.Result r24) {
                    /*
                        Method dump skipped, instruction units count: 3534
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.of2.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
                }
            }
