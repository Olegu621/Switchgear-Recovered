            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import com.usercentrics.sdk.UsercentricsDomains;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import kotlin.jvm.functions.Function0;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bb1 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2347a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ fb1 f2348b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ bb1(fb1 fb1Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f2347a = i;
/* 3 */             this.f2348b = fb1Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 3 */             int i = this.f2347a;
/* 7 */             fb1 fb1Var = this.f2348b;
                    switch (i) {
                        case 0:
/* 1223 */                  return new C2484y3(new C2279v3(new C2130r3(fb1Var.m3697c(), (hb1) fb1Var.f8095i.getValue(), 0), fb1Var.m3698d(), fb1Var.m3699e(), (se0) fb1Var.f8082T.getValue(), (fn1) fb1Var.f8090d.getValue()), (g80) fb1Var.f8112z.getValue(), fb1Var.m3699e());
                        case 1:
/* 1157 */                  return new C2321w7(new C0875ec(fb1Var.m3697c(), (hb1) fb1Var.f8095i.getValue(), ((nl1) fb1Var.f8091e.getValue()).m6997a().f7477c), fb1Var.m3700f(), fb1Var.m3696b(), fb1Var.m3699e());
                        case 2:
/* 1108 */                  return new C0182bj(fb1Var.m3697c(), (hb1) fb1Var.f8095i.getValue(), ((nl1) fb1Var.f8091e.getValue()).m6997a().f7477c);
                        case 3:
/* 1076 */                  return new C2003oj(fb1Var.m3696b(), (g80) fb1Var.f8112z.getValue(), (C0182bj) fb1Var.f8098l.getValue());
                        case 4:
/* 1050 */                  return new C2072pj((C2003oj) fb1Var.f8063A.getValue(), (jc2) fb1Var.f8083U.getValue());
                        case 5:
/* 1028 */                  return new C2508yr((g80) fb1Var.f8112z.getValue(), fb1Var.m3699e());
                        case 6:
/* 912 */                   xu0 xu0VarM3697c = fb1Var.m3697c();
/* 916 */                   hk2 hk2Var = fb1Var.f8095i;
/* 922 */                   hb1 hb1Var = (hb1) hk2Var.getValue();
/* 924 */                   a21 a21VarM3698d = fb1Var.m3698d();
/* 934 */                   jc2 jc2Var = (jc2) fb1Var.f8083U.getValue();
/* 936 */                   xu0VarM3697c.getClass();
/* 939 */                   hb1Var.getClass();
/* 942 */                   a21VarM3698d.getClass();
/* 945 */                   jc2Var.getClass();
/* 1010 */                  return new C1945mz(fb1Var.m3696b(), fb1Var.m3699e(), new xq0(), new m62(fb1Var.m3697c(), (hb1) hk2Var.getValue(), fb1Var.m3698d(), (nl1) fb1Var.f8091e.getValue()), (g80) fb1Var.f8112z.getValue(), fb1Var.m3700f(), (ac2) fb1Var.f8068F.getValue());
                        case 7:
/* 858 */                   xu0 xu0VarM3697c2 = fb1Var.m3697c();
/* 862 */                   xu0VarM3697c2.getClass();
/* 865 */                   d52 d52Var = new d52();
/* 868 */                   d52Var.f7001a = xu0VarM3697c2;
/* 876 */                   fb1Var.m3698d().getClass();
/* 879 */                   gr0 gr0Var = new gr0();
/* 882 */                   gr0Var.f8789a = d52Var;
/* 906 */                   return new j10(fb1Var.m3696b(), (gl2) fb1Var.f8072J.getValue(), gr0Var, (ac2) fb1Var.f8068F.getValue());
                        case 8:
/* 831 */                   c41 c41Var = (c41) fb1Var.f8093g.getValue();
/* 833 */                   c41Var.getClass();
/* 838 */                   Context context = c41Var.f2695a;
/* 840 */                   context.getClass();
/* 845 */                   SharedPreferences sharedPreferences = context.getSharedPreferences("usercentrics", 0);
/* 849 */                   sharedPreferences.getClass();
/* 852 */                   return new od2(sharedPreferences);
                        case 9:
/* 821 */                   return new d40((InterfaceC1811jz) fb1Var.f8105s.getValue(), (ac2) fb1Var.f8068F.getValue(), fb1Var.m3700f(), (g80) fb1Var.f8112z.getValue(), (il2) fb1Var.f8073K.getValue(), (C2484y3) fb1Var.f8086X.getValue(), fb1Var.m3699e());
                        case 10:
/* 729 */                   Context context2 = ((c41) fb1Var.f8093g.getValue()).f2695a;
/* 731 */                   context2.getClass();
/* 755 */                   SharedPreferences sharedPreferences2 = context2.getSharedPreferences(context2.getPackageName() + "_preferences", 0);
/* 759 */                   sharedPreferences2.getClass();
/* 762 */                   return new od2(sharedPreferences2);
                        case 11:
/* 715 */                   return new x80((s10) fb1Var.f8075M.getValue(), (s10) fb1Var.f8076N.getValue());
                        case 12:
/* 693 */                   return new se0((ev0) fb1Var.f8078P.getValue(), fb1Var.m3696b());
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 632 */                   gz2 gz2Var = hz2.Companion;
/* 642 */                   long jLongValue = ((Number) fb1Var.f8092f.getValue()).longValue();
/* 646 */                   x80 x80VarM3696b = fb1Var.m3696b();
/* 650 */                   gz2Var.getClass();
/* 653 */                   x80VarM3696b.getClass();
/* 656 */                   hz2 hz2Var = hz2.f9372f;
/* 658 */                   if (hz2Var == null) {
/* 662 */                       hz2Var = new hz2();
/* 665 */                       hz2.f9372f = hz2Var;
                            }
/* 667 */                   C0945g8 c0945g8 = hz2Var.f9375c;
/* 669 */                   if (c0945g8 != null) {
/* 678 */                       return c0945g8;
                            }
/* 673 */                   C0945g8 c0945g9 = new C0945g8(jLongValue, x80VarM3696b);
/* 676 */                   hz2Var.f9375c = c0945g9;
/* 678 */                   return c0945g9;
                        case 14:
/* 628 */                   return new xu0((C0945g8) fb1Var.f8094h.getValue(), (nl1) fb1Var.f8091e.getValue(), fb1Var.m3696b());
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 487 */                   i03 i03VarM3699e = fb1Var.m3699e();
/* 491 */                   hk2 hk2Var2 = fb1Var.f8112z;
/* 602 */                   return new sx0(fb1Var.m3695a(), (g80) hk2Var2.getValue(), (ac2) fb1Var.f8068F.getValue(), (p91) fb1Var.f8065C.getValue(), (il2) fb1Var.f8073K.getValue(), new C0875ec(i03VarM3699e, (g80) hk2Var2.getValue(), (C2508yr) fb1Var.f8071I.getValue()), new kp0(fb1Var.m3699e(), (g80) hk2Var2.getValue(), 1), new kp0(fb1Var.m3699e(), (g80) hk2Var2.getValue(), 0), (jc2) fb1Var.f8083U.getValue(), (C2484y3) fb1Var.f8086X.getValue(), fb1Var.m3699e());
                        case 16:
/* 481 */                   return new g51((n51) fb1Var.f8099m.getValue());
                        case 17:
/* 467 */                   return new n51(new k51(new C2130r3(fb1Var.m3697c(), (hb1) fb1Var.f8095i.getValue(), 1), fb1Var.m3698d(), fb1Var.m3699e(), (se0) fb1Var.f8082T.getValue(), (fn1) fb1Var.f8090d.getValue()), (g80) fb1Var.f8112z.getValue(), fb1Var.m3699e());
                        case 18:
/* 394 */                   C2072pj c2072pj = (C2072pj) fb1Var.f8109w.getValue();
/* 396 */                   c2072pj.getClass();
/* 401 */                   return new C1955n8(c2072pj);
                        case 19:
/* 384 */                   return new l91((od2) fb1Var.f8111y.getValue());
                        case 20:
/* 370 */                   return new o91((l91) fb1Var.f8066D.getValue(), fb1Var.m3698d());
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 352 */                   return new p91((o91) fb1Var.f8067E.getValue());
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 338 */                   return new k03(fb1Var.f8087a.f6052e, new ec0(19));
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 297 */                   UsercentricsDomains usercentricsDomains = fb1Var.f8087a.f6055h;
/* 299 */                   if (usercentricsDomains == null) {
/* 313 */                       usercentricsDomains = new UsercentricsDomains(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                            }
/* 321 */                   return new hb1(fb1Var.f8089c, usercentricsDomains);
                        case 24:
/* 291 */                   return new gv1((il1) fb1Var.f8080R.getValue(), (od2) fb1Var.f8111y.getValue());
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 269 */                   return new m52(new k51(new C0834d7(fb1Var.m3699e(), (hb1) fb1Var.f8095i.getValue(), fb1Var.m3697c(), 1), fb1Var.m3698d(), fb1Var.m3699e(), (se0) fb1Var.f8082T.getValue(), (fn1) fb1Var.f8090d.getValue()), (p91) fb1Var.f8065C.getValue());
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 150 */                   hk2 hk2Var3 = fb1Var.f8069G;
/* 156 */                   vq0 vq0Var = (vq0) hk2Var3.getValue();
/* 158 */                   vq0Var.getClass();
/* 161 */                   ts0 ts0Var = new ts0();
/* 164 */                   ts0Var.f17248a = vq0Var;
/* 203 */                   return new yb2(fb1Var.m3700f(), (sr2) fb1Var.f8102p.getValue(), new ac1(fb1Var.m3699e(), ts0Var, (vq0) hk2Var3.getValue()), (C1032im) fb1Var.f8104r.getValue());
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 144 */                   return new ac2((yb2) fb1Var.f8103q.getValue(), (vq0) fb1Var.f8069G.getValue());
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 122 */                   return new jc2(fb1Var);
                        default:
/* 14 */                    xu0 xu0VarM3697c3 = fb1Var.m3697c();
/* 18 */                    hk2 hk2Var4 = fb1Var.f8095i;
/* 27 */                    C2130r3 c2130r3 = new C2130r3(xu0VarM3697c3, (hb1) hk2Var4.getValue(), 2);
/* 32 */                    a21 a21VarM3698d2 = fb1Var.m3698d();
/* 36 */                    i03 i03VarM3699e2 = fb1Var.m3699e();
/* 40 */                    hk2 hk2Var5 = fb1Var.f8082T;
/* 46 */                    se0 se0Var = (se0) hk2Var5.getValue();
/* 48 */                    hk2 hk2Var6 = fb1Var.f8090d;
/* 116 */                   return new pc2(new lc2(c2130r3, a21VarM3698d2, i03VarM3699e2, se0Var, (fn1) hk2Var6.getValue()), new C2279v3(new C0834d7(fb1Var.m3699e(), (hb1) hk2Var4.getValue(), fb1Var.m3697c(), 0), fb1Var.m3698d(), fb1Var.m3699e(), (se0) hk2Var5.getValue(), (fn1) hk2Var6.getValue()), (C1032im) fb1Var.f8104r.getValue());
                    }
                }
            }
