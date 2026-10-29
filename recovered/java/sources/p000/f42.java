            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.util.Base64;
            import android.view.View;
            import com.google.firebase.datatransport.TransportRegistrar;
            import com.supercell.titan.TitanApplication;
            import io.flutter.util.ViewUtils;
            import io.sentry.C1443f;
            import io.sentry.C1486i0;
            import io.sentry.InterfaceC1382b6;
            import io.sentry.InterfaceC1537l4;
            import io.sentry.InterfaceC1743x1;
            import io.sentry.InterfaceC1747x5;
            import io.sentry.android.core.SentryAndroidOptions;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InvalidObjectException;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class f42 implements q52, InterfaceC1537l4, InterfaceC1747x5, InterfaceC1382b6, InterfaceC0934fy, ViewUtils.ViewVisitor, q31, InterfaceC1743x1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7993a;

                public /* synthetic */ f42(int i) {
/* 1 */             this.f7993a = i;
                }

                /* JADX INFO: renamed from: e */
                public static /* synthetic */ void m3649e() {
/* 6 */             throw new IllegalArgumentException();
                }

                /* JADX INFO: renamed from: f */
                public static /* synthetic */ void m3650f(int i, long j) throws IOException {
/* 33 */            throw new IOException("Content-Length (" + j + ((Object) ") and stream length (") + i + ((Object) ") disagree"));
                }

                /* JADX INFO: renamed from: g */
                public static /* synthetic */ void m3651g(int i, String str) throws InvalidObjectException {
/* 23 */            throw new InvalidObjectException(str + i + '.');
                }

                /* JADX INFO: renamed from: h */
                public static /* synthetic */ void m3652h(int i, StringBuilder sb) {
/* 1 */             sb.append(i);
/* 17 */            throw new IllegalArgumentException(sb.toString().toString());
                }

                /* JADX INFO: renamed from: i */
                public static /* synthetic */ void m3653i(Object obj, Object obj2, int i, Object obj3, int i2) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             sb.append(obj);
/* 9 */             sb.append(obj2);
/* 12 */            sb.append(i);
/* 15 */            sb.append(obj3);
/* 18 */            sb.append(i2);
/* 30 */            throw new IllegalArgumentException(sb.toString());
                }

                /* JADX INFO: renamed from: j */
                public static /* synthetic */ void m3654j(Object obj, String str) throws FileNotFoundException {
/* 18 */            throw new FileNotFoundException(str + obj);
                }

                /* JADX INFO: renamed from: k */
                public static /* synthetic */ void m3655k(Object obj, String str, Object obj2) {
/* 21 */            throw new C2086px(str + obj + obj2);
                }

                /* JADX INFO: renamed from: l */
                public static /* synthetic */ void m3656l(String str) {
/* 6 */             throw new IllegalStateException(str);
                }

                /* JADX INFO: renamed from: m */
                public static /* synthetic */ void m3657m(String str, double d) {
/* 18 */            throw new IllegalArgumentException(str + d);
                }

                /* JADX INFO: renamed from: n */
                public static /* synthetic */ void m3658n(String str, Object obj, Throwable th) {
/* 18 */            throw new RuntimeException(str + obj, th);
                }

                /* JADX INFO: renamed from: o */
                public static /* synthetic */ void m3659o(StringBuilder sb, Object obj) {
/* 1 */             sb.append(obj);
/* 13 */            throw new IllegalStateException(sb.toString());
                }

                /* JADX INFO: renamed from: p */
                public static /* synthetic */ void m3660p() {
/* 6 */             throw new UnsupportedOperationException();
                }

                /* JADX INFO: renamed from: q */
                public static /* synthetic */ void m3661q(Object obj, String str) throws IOException {
/* 18 */            throw new IOException(str + obj);
                }

                /* JADX INFO: renamed from: r */
                public static /* synthetic */ void m3662r(Object obj, String str, Object obj2) {
/* 21 */            throw new IllegalArgumentException(str + obj + obj2);
                }

                /* JADX INFO: renamed from: s */
                public static /* synthetic */ void m3663s(String str) {
/* 6 */             throw new RuntimeException(str);
                }

                /* JADX INFO: renamed from: t */
                public static /* synthetic */ void m3664t() {
/* 6 */             throw new IllegalStateException();
                }

                /* JADX INFO: renamed from: u */
                public static /* synthetic */ void m3665u(Object obj, String str, Object obj2) {
/* 21 */            throw new NumberFormatException(str + obj + obj2);
                }

                @Override // io.sentry.InterfaceC1743x1
                /* JADX INFO: renamed from: a */
                public Object mo3666a() {
/* 1 */             return null;
                }

                @Override // p000.q52
                public Object apply(Object obj) {
/* 8 */             Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                    try {
/* 14 */                ArrayList arrayList = new ArrayList();
/* 21 */                while (cursorRawQuery.moveToNext()) {
/* 23 */                    C0875ec c0875ecM10147a = C2497yg.m10147a();
/* 32 */                    c0875ecM10147a.m3373L(cursorRawQuery.getString(1));
/* 44 */                    c0875ecM10147a.f7615d = rx1.m8317b(cursorRawQuery.getInt(2));
/* 47 */                    String string = cursorRawQuery.getString(3);
/* 59 */                    c0875ecM10147a.f7614c = string == null ? null : Base64.decode(string, 0);
/* 65 */                    arrayList.add(c0875ecM10147a.m3390m());
                        }
/* 72 */                return arrayList;
                    } finally {
/* 74 */                cursorRawQuery.close();
                    }
                }

                @Override // io.sentry.InterfaceC1747x5
                /* JADX INFO: renamed from: b */
                public C1443f mo3667b(C1443f c1443f, C1486i0 c1486i0) {
/* 1 */             TitanApplication titanApplication = TitanApplication.f5937b;
/* 11 */            if (c1443f.f10932i.equals("device.event") && c1443f.f10931f.get("action").equals("BATTERY_CHANGED")) {
/* 33 */                int iHashCode = c1443f.m5207b().hashCode();
/* 43 */                boolean z = iHashCode != qj3.f15592m;
/* 44 */                qj3.f15592m = iHashCode;
/* 46 */                if (!z) {
/* 48 */                    return null;
                        }
                    }
/* 50 */            return c1443f;
                }

                @Override // p000.q31
                /* JADX INFO: renamed from: c */
                public de3 mo3209c(xy1 xy1Var) throws GeneralSecurityException {
                    C2131r4 c2131r4;
/* 12 */            if (!((String) xy1Var.f19393a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
/* 129 */               C1951n4.m6859j("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
/* 11 */                return null;
                    }
                    try {
/* 22 */                l93 l93VarM6408B = l93.m6408B((AbstractC2298vl) xy1Var.f19396d, dg0.m3057a());
/* 30 */                if (l93VarM6408B.m6412z() != 0) {
/* 120 */                   throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
/* 34 */                wq1 wq1Var = (wq1) xy1Var.f19398f;
/* 36 */                int iOrdinal = wq1Var.ordinal();
/* 41 */                if (iOrdinal == 1) {
/* 83 */                    c2131r4 = C2131r4.f15863r;
                        } else if (iOrdinal == 2) {
/* 80 */                    c2131r4 = C2131r4.f15864s;
                        } else if (iOrdinal == 3) {
/* 77 */                    c2131r4 = C2131r4.f15865t;
                        } else {
/* 50 */                    if (iOrdinal != 4) {
/* 76 */                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + wq1Var.m9602b());
                            }
/* 80 */                    c2131r4 = C2131r4.f15864s;
                        }
/* 108 */               return m93.m6630J(c2131r4, new fs0(C2335wl.m9584a(l93VarM6408B.m6411y().m9304e()), 12), (Integer) xy1Var.f19394b);
                    } catch (pz0 unused) {
/* 123 */               ds0.m3203t("Parsing XChaCha20Poly1305Key failed");
/* 11 */                return null;
                    }
                }

                @Override // p000.InterfaceC0934fy
                public Object create(InterfaceC0824cy interfaceC0824cy) {
/* 3 */             C0168b5 c0168b5 = (C0168b5) interfaceC0824cy;
                    switch (this.f7993a) {
                        case 14:
/* 1 */                     return TransportRegistrar.lambda$getComponents$0(c0168b5);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1 */                     return TransportRegistrar.lambda$getComponents$1(c0168b5);
                        default:
/* 1 */                     return TransportRegistrar.lambda$getComponents$2(c0168b5);
                    }
                }

                @Override // io.sentry.InterfaceC1537l4
                /* JADX INFO: renamed from: d */
                public void mo3668d(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             TitanApplication titanApplication = TitanApplication.f5937b;
/* 10 */            sentryAndroidOptions.setBeforeBreadcrumb(new f42(11));
/* 20 */            sentryAndroidOptions.setBeforeSendTransaction(new f42(12));
                }

                @Override // io.flutter.util.ViewUtils.ViewVisitor
                public boolean run(View view) {
/* 1 */             return view.hasFocus();
                }
            }
