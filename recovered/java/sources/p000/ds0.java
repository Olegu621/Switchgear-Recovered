            package p000;

            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.PushMessageService;
            import com.supercell.titan.RequestPermissionListener;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.security.GeneralSecurityException;
            import java.util.List;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ds0 implements fx1, q31, er2, tz1, OnCompleteListener, RequestPermissionListener, so0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7395a;

                public /* synthetic */ ds0(int i) {
/* 1 */             this.f7395a = i;
                }

                /* JADX INFO: renamed from: b */
                public static /* synthetic */ void m3187b() {
/* 6 */             throw new pn1();
                }

                /* JADX INFO: renamed from: d */
                public static /* synthetic */ void m3188d(int i, Object obj) {
/* 28 */            throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
                }

                /* JADX INFO: renamed from: f */
                public static /* synthetic */ void m3189f(int i, Object obj, int i2) {
/* 5 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append(obj);
/* 11 */            sb.append(i2);
/* 21 */            throw new IllegalArgumentException(sb.toString());
                }

                /* JADX INFO: renamed from: g */
                public static /* synthetic */ void m3190g(Object obj) {
/* 10 */            throw new IllegalStateException(obj.toString());
                }

                /* JADX INFO: renamed from: h */
                public static /* synthetic */ void m3191h(Object obj, Object obj2) throws IOException {
/* 5 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(obj);
/* 11 */            sb.append(obj2);
/* 21 */            throw new IOException(sb.toString());
                }

                /* JADX INFO: renamed from: i */
                public static /* synthetic */ void m3192i(Object obj, Object obj2, Object obj3, Throwable th) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             sb.append(obj);
/* 9 */             sb.append(obj2);
/* 12 */            sb.append(obj3);
/* 24 */            throw new IllegalStateException(sb.toString(), th);
                }

                /* JADX INFO: renamed from: j */
                public static /* synthetic */ void m3193j(Object obj, String str) {
/* 27 */            throw new IllegalArgumentException((str + obj + '\"').toString());
                }

                /* JADX INFO: renamed from: k */
                public static /* synthetic */ void m3194k(Object obj, String str, Object obj2) {
/* 30 */            throw new IllegalArgumentException((str + obj + ((Object) " and ") + obj2).toString());
                }

                /* JADX INFO: renamed from: l */
                public static /* synthetic */ void m3195l(String str) throws IOException {
/* 6 */             throw new IOException(str);
                }

                /* JADX INFO: renamed from: m */
                public static /* synthetic */ void m3196m(String str, Object obj, Object obj2, Object obj3) {
/* 24 */            throw new IllegalArgumentException(str + obj + obj2 + obj3);
                }

                /* JADX INFO: renamed from: n */
                public static /* synthetic */ void m3197n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
/* 27 */            throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
                }

                /* JADX INFO: renamed from: o */
                public static /* synthetic */ void m3198o(String str, Throwable th) {
/* 6 */             throw new RuntimeException(str, th);
                }

                /* JADX INFO: renamed from: p */
                public static /* synthetic */ void m3199p(Throwable th) {
/* 6 */             throw new RuntimeException(th);
                }

                /* JADX INFO: renamed from: q */
                public static /* synthetic */ void m3200q(Object obj) {
/* 10 */            throw new IllegalArgumentException(obj.toString());
                }

                /* JADX INFO: renamed from: r */
                public static /* synthetic */ void m3201r(Object obj, String str) {
/* 22 */            throw new IllegalStateException((str + obj).toString());
                }

                /* JADX INFO: renamed from: s */
                public static /* synthetic */ void m3202s(Object obj, String str, Object obj2) {
/* 25 */            throw new IllegalStateException((str + obj + obj2).toString());
                }

                /* JADX INFO: renamed from: t */
                public static /* synthetic */ void m3203t(String str) throws GeneralSecurityException {
/* 6 */             throw new GeneralSecurityException(str);
                }

                /* JADX INFO: renamed from: u */
                public static /* synthetic */ void m3204u(Object obj, String str) {
/* 18 */            throw new IllegalStateException(str + obj);
                }

                /* JADX INFO: renamed from: v */
                public static /* synthetic */ void m3205v(Object obj, String str, Object obj2) throws GeneralSecurityException {
/* 21 */            throw new GeneralSecurityException(str + obj + obj2);
                }

                /* JADX INFO: renamed from: w */
                public static /* synthetic */ void m3206w(Object obj, String str) {
/* 18 */            throw new IllegalStateException(str + obj);
                }

                /* JADX INFO: renamed from: x */
                public static /* synthetic */ void m3207x(Object obj, String str) throws GeneralSecurityException {
/* 18 */            throw new GeneralSecurityException(str + obj);
                }

                @Override // p000.fx1
                /* JADX INFO: renamed from: a */
                public Object mo3208a(de3 de3Var) throws GeneralSecurityException {
/* 5 */             C1903lu c1903lu = new C1903lu();
/* 13 */            if (pm2.m7479b(2)) {
/* 15 */                return c1903lu;
                    }
/* 18 */            m3203t("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
/* 21 */            return null;
                }

                @Override // p000.er2, p000.so0
                public Object apply(Object obj) {
                    switch (this.f7395a) {
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 10 */                    bi1 bi1Var = (bi1) obj;
/* 12 */                    bi1Var.getClass();
/* 15 */                    ac1 ac1Var = uy1.f17740a;
/* 17 */                    ac1Var.getClass();
/* 22 */                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
/* 25 */                        ac1Var.m180j(byteArrayOutputStream, bi1Var);
                                break;
                            } catch (IOException unused) {
                            }
/* 28 */                    return byteArrayOutputStream.toByteArray();
                        default:
/* 8 */                     return null;
                    }
                }

                @Override // p000.q31
                /* JADX INFO: renamed from: c */
                public de3 mo3209c(xy1 xy1Var) throws GeneralSecurityException {
/* 12 */            if (!((String) xy1Var.f19393a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
/* 164 */               C1951n4.m6859j("Wrong type URL in call to HmacProtoSerialization.parseKey");
/* 11 */                return null;
                    }
                    try {
/* 22 */                mu0 mu0VarM6802E = mu0.m6802E((AbstractC2298vl) xy1Var.f19396d, dg0.m3057a());
/* 30 */                if (mu0VarM6802E.m6809C() != 0) {
/* 155 */                   throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
/* 34 */                ra2 ra2Var = new ra2();
/* 37 */                ra2Var.f15955a = null;
/* 39 */                ra2Var.f15956b = null;
/* 41 */                ra2Var.f15957c = null;
/* 45 */                ra2Var.f15958d = C2131r4.f15862q;
/* 59 */                ra2Var.f15955a = Integer.valueOf(mu0VarM6802E.m6807A().size());
/* 73 */                ra2Var.f15956b = Integer.valueOf(mu0VarM6802E.m6808B().m8638A());
/* 87 */                ra2Var.f15957c = tu0.m8917a(mu0VarM6802E.m6808B().m8639z());
/* 97 */                ra2Var.f15958d = tu0.m8918b((wq1) xy1Var.f19398f);
/* 99 */                qu0 qu0VarM8103e = ra2Var.m8103e();
/* 107 */               C0875ec c0875ec = new C0875ec(26);
/* 110 */               c0875ec.f7614c = null;
/* 112 */               c0875ec.f7615d = null;
/* 114 */               c0875ec.f7613b = qu0VarM8103e;
/* 135 */               c0875ec.f7614c = new fs0(C2335wl.m9584a(mu0VarM6802E.m6807A().m9304e()), 12);
/* 141 */               c0875ec.f7615d = (Integer) xy1Var.f19394b;
/* 143 */               return c0875ec.m3391n();
                    } catch (IllegalArgumentException | pz0 unused) {
/* 158 */               m3203t("Parsing HmacKey failed");
/* 11 */                return null;
                    }
                }

                @Override // p000.tz1
                /* JADX INFO: renamed from: e */
                public void mo3210e(C1833kj c1833kj, List list) {
/* 1 */             c1833kj.getClass();
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
/* 1 */             int i = PushMessageService.f5887b;
/* 9 */             if (task.isSuccessful()) {
/* 18 */                GameApp.queuePushNotificationValueUpdate(0, (String) task.getResult(), HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
/* 26 */                AbstractC1245n0.m4889q("FirebaseService", "FCM Fetching registration token failed");
/* 32 */                GameApp.queuePushNotificationValueUpdate(-1, HttpUrl.FRAGMENT_ENCODE_SET, "Fetching registration token failed");
                    }
                }

                @Override // com.supercell.titan.RequestPermissionListener
                public void onPermissionResult(boolean z) {
/* 1 */             PushMessageService.getToken(z);
                }
            }
