            package p000;

            import android.animation.TimeInterpolator;
            import android.app.Application;
            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Log;
            import android.util.TypedValue;
            import android.view.View;
            import android.widget.TextView;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.Tasks;
            import com.google.android.material.appbar.MaterialToolbar;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.titan.GameApp;
            import io.flutter.embedding.android.KeyboardMap;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.File;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.collections.CollectionsKt;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class hu0 implements Decoder, InterfaceC1870ky {

                /* JADX INFO: renamed from: a */
                public static final C2131r4 f9293a = new C2131r4("CLOSED", 8);

                /* JADX INFO: renamed from: b */
                public static final ec0 f9294b = new ec0(20);

                /* JADX INFO: renamed from: c */
                public static final wa3 f9295c = new wa3(13);

                /* JADX INFO: renamed from: d */
                public static int f9296d = 3;

                public hu0() {
/* 6 */             new ConcurrentHashMap();
                }

                /* JADX INFO: renamed from: A0 */
                public static void m4306A0(GameApp gameApp, String str, HashMap map) {
/* 5 */             if (rs0.m8239b()) {
/* 38 */                xe2.m9775m("Helpshift", "showFAQSection is called with sectionId" + str + " & config: " + map + " \n Is proactive? : false", null);
/* 45 */                if (b40.m1232p(str)) {
/* 49 */                    xe2.m9777o("Helpshift", "Invalid FAQ Section ID. Ignoring call to showFAQSection API.", null);
                        } else {
/* 53 */                    rs0 rs0Var = rs0.f16254y;
/* 66 */                    rs0Var.f16271p.m8115t(new gu0(map, rs0Var, gameApp, str, 0));
                        }
                    }
                }

                /* JADX INFO: renamed from: B0 */
                public static void m4307B0(GameApp gameApp, HashMap map) {
/* 5 */             if (rs0.m8239b()) {
/* 30 */                xe2.m9775m("Helpshift", "showFAQs is called with config: " + map + " \n Is proactive? false", null);
/* 33 */                rs0 rs0Var = rs0.f16254y;
/* 43 */                rs0Var.f16271p.m8115t(new fu0(map, rs0Var, gameApp, 1));
                    }
                }

                /* JADX INFO: renamed from: C0 */
                public static void m4308C0(GameApp gameApp, String str, HashMap map) {
/* 5 */             if (rs0.m8239b()) {
/* 38 */                xe2.m9775m("Helpshift", "showSingleFAQ() is called with publishId" + str + " & config: " + map + " \n Is proactive? : false", null);
/* 45 */                if (b40.m1232p(str)) {
/* 49 */                    xe2.m9777o("Helpshift", "Invalid FAQ ID. Ignoring call to showSingleFAQ API.", null);
                        } else {
/* 53 */                    rs0 rs0Var = rs0.f16254y;
/* 66 */                    rs0Var.f16271p.m8115t(new gu0(map, rs0Var, gameApp, str, 1));
                        }
                    }
                }

                /* JADX INFO: renamed from: D0 */
                public static List m4309D0(Iterable iterable, Function1 function1) {
/* 1 */             iterable.getClass();
/* 6 */             rh2.f16075a.getClass();
/* 11 */            String.CASE_INSENSITIVE_ORDER.getClass();
/* 20 */            return CollectionsKt.m6186E(new C0876ed(function1, 0), iterable);
                }

                /* JADX INFO: renamed from: E0 */
                public static void m4310E0(int i, long j, byte[] bArr) {
/* 1 */             int i2 = 0;
/* 3 */             while (i2 < 4) {
/* 12 */                bArr[i + i2] = (byte) (255 & j);
/* 14 */                i2++;
/* 18 */                j >>= 8;
                    }
                }

                /* JADX INFO: renamed from: F */
                public static C2554zk m4311F(int i, EnumC2464xk enumC2464xk, int i2) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 enumC2464xk = EnumC2464xk.f19232a;
                    }
/* 9 */             if (i == -2) {
/* 81 */                if (enumC2464xk != EnumC2464xk.f19232a) {
/* 98 */                    return new C2348wy(1, enumC2464xk);
                        }
/* 87 */                InterfaceC2509ys.f19799n.getClass();
/* 92 */                return new C2554zk(C2472xs.f19344b);
                    }
/* 12 */            if (i == -1) {
/* 62 */                if (enumC2464xk == EnumC2464xk.f19232a) {
/* 68 */                    return new C2348wy(1, EnumC2464xk.f19233b);
                        }
/* 74 */                C1951n4.m6859j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
/* 77 */                return null;
                    }
/* 14 */            if (i == 0) {
                        return enumC2464xk == EnumC2464xk.f19232a ? new C2554zk(0) : new C2348wy(1, enumC2464xk);
                    }
/* 19 */            if (i != Integer.MAX_VALUE) {
                        return enumC2464xk == EnumC2464xk.f19232a ? new C2554zk(i) : new C2348wy(i, enumC2464xk);
                    }
/* 39 */            return new C2554zk(AbstractC0208c9.API_PRIORITY_OTHER);
                }

                /* JADX INFO: renamed from: F0 */
                public static String m4312F0(String str) {
                    return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
                }

                /* JADX INFO: renamed from: G */
                public static void m4313G(HashMap map) {
/* 3 */             Object objRemove = map.remove("customIssueFields");
                    try {
/* 12 */                xe2.m9775m("Helpshift", "Setting CIFs.", null);
/* 20 */                Map map2 = objRemove instanceof Map ? (Map) objRemove : null;
/* 27 */                C1773iy c1773iy = rs0.f16254y.f16260e;
/* 29 */                c1773iy.getClass();
/* 52 */                ((er0) c1773iy.f11955a).m3595y("custom_issue_fields", map2 != null ? new JSONObject(map2).toString() : HttpUrl.FRAGMENT_ENCODE_SET);
                    } catch (Exception e) {
/* 58 */                xe2.m9777o("Helpshift", "Error setting CIFs", e);
                    }
/* 63 */            C1773iy c1773iy2 = rs0.f16254y.f16260e;
/* 65 */            c1773iy2.getClass();
/* 83 */            ((er0) c1773iy2.f11955a).m3595y("config", new JSONObject(map).toString());
                }

                /* JADX INFO: renamed from: H */
                public static final Boolean m4314H(char c) {
/* 3 */             if (c == 'N') {
/* 5 */                 return Boolean.FALSE;
                    }
/* 10 */            if (c == 'n') {
/* 12 */                return Boolean.FALSE;
                    }
/* 17 */            if (c == 'Y') {
/* 19 */                return Boolean.TRUE;
                    }
/* 24 */            if (c == 'y') {
/* 26 */                return Boolean.TRUE;
                    }
/* 29 */            return null;
                }

                /* JADX INFO: renamed from: H0 */
                public static void m4315H0(String str, String str2) {
/* 1 */             String strM4312F0 = m4312F0(str);
/* 10 */            if (m4346q0(5, strM4312F0)) {
/* 12 */                AbstractC1245n0.m4889q(strM4312F0, str2);
                    }
                }

                /* JADX INFO: renamed from: I */
                public static final String[] m4316I(String... strArr) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 9 */             for (String str : strArr) {
/* 17 */                if (str.length() > 0) {
/* 19 */                    arrayList.add(str);
                        }
                    }
/* 31 */            return (String[]) arrayList.toArray(new String[0]);
                }

                /* JADX INFO: renamed from: I0 */
                public static void m4317I0(String str, String str2, Throwable th) {
/* 1 */             String strM4312F0 = m4312F0(str);
/* 10 */            if (m4346q0(5, strM4312F0)) {
/* 12 */                AbstractC1245n0.m4891s(strM4312F0, str2, th);
                    }
                }

                /* JADX INFO: renamed from: J */
                public static final aa2 m4318J(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
/* 5 */             if (StringsKt.m6228D(str)) {
/* 36 */                C1951n4.m6859j("Blank serial names are prohibited");
/* 39 */                return null;
                    }
/* 9 */             C0894ev c0894ev = new C0894ev(str);
/* 12 */            function1.invoke(c0894ev);
/* 30 */            return new aa2(str, ei2.f7698k, c0894ev.f7887b.size(), C2103qd.m7779n(serialDescriptorArr), c0894ev);
                }

                /* JADX INFO: renamed from: J0 */
                public static void m4319J0(int i, int i2) {
                    String strM7613w0;
/* 1 */             if (i < 0 || i >= i2) {
/* 11 */                if (i < 0) {
/* 69 */                    strM7613w0 = py0.m7613w0("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
                        } else {
/* 13 */                    if (i2 < 0) {
/* 36 */                        C1951n4.m6859j(fm0.m3788n(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
/* 39 */                        return;
                            }
/* 54 */                    strM7613w0 = py0.m7613w0("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
                        }
/* 76 */                throw new IndexOutOfBoundsException(strM7613w0);
                    }
                }

                /* JADX INFO: renamed from: K */
                public static final aa2 m4320K(String str, py0 py0Var, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
/* 6 */             if (StringsKt.m6228D(str)) {
/* 50 */                C1951n4.m6859j("Blank serial names are prohibited");
/* 5 */                 return null;
                    }
/* 14 */            if (py0Var.equals(ei2.f7698k)) {
/* 44 */                C1951n4.m6859j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
/* 5 */                 return null;
                    }
/* 18 */            C0894ev c0894ev = new C0894ev(str);
/* 21 */            function1.invoke(c0894ev);
/* 38 */            return new aa2(str, py0Var, c0894ev.f7887b.size(), C2103qd.m7779n(serialDescriptorArr), c0894ev);
                }

                /* JADX INFO: renamed from: K0 */
                public static void m4321K0(int i, int i2, int i3) {
                    String strM4323L0;
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 11 */                if (i < 0 || i > i3) {
/* 48 */                    strM4323L0 = m4323L0(i, i3, "start index");
                        } else {
/* 41 */                    strM4323L0 = (i2 < 0 || i2 > i3) ? m4323L0(i2, i3, "end index") : py0.m7613w0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        }
/* 55 */                throw new IndexOutOfBoundsException(strM4323L0);
                    }
                }

                /* JADX INFO: renamed from: L */
                public static aa2 m4322L(String str, py0 py0Var, SerialDescriptor[] serialDescriptorArr) {
/* 6 */             if (StringsKt.m6228D(str)) {
/* 47 */                C1951n4.m6859j("Blank serial names are prohibited");
/* 5 */                 return null;
                    }
/* 14 */            if (py0Var.equals(ei2.f7698k)) {
/* 41 */                C1951n4.m6859j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
/* 5 */                 return null;
                    }
/* 18 */            C0894ev c0894ev = new C0894ev(str);
/* 35 */            return new aa2(str, py0Var, c0894ev.f7887b.size(), C2103qd.m7779n(serialDescriptorArr), c0894ev);
                }

                /* JADX INFO: renamed from: L0 */
                public static String m4323L0(int i, int i2, String str) {
/* 1 */             if (i < 0) {
/* 13 */                return py0.m7613w0("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return py0.m7613w0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 60 */            C1951n4.m6859j(fm0.m3788n(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
/* 63 */            return null;
                }

                /* JADX INFO: renamed from: O */
                public static byte[] m4324O(byte[] bArr, byte[] bArr2) {
/* 8 */             if (bArr.length != 32) {
/* 539 */               C1951n4.m6859j("The key length in bytes must be 32.");
/* 542 */               return null;
                    }
/* 18 */            long jM4347r0 = m4347r0(bArr, 0) & 67108863;
/* 19 */            int i = 3;
/* 29 */            long jM4347r1 = (m4347r0(bArr, 3) >> 2) & 67108611;
/* 40 */            long jM4347r2 = (m4347r0(bArr, 6) >> 4) & 67092735;
/* 55 */            long jM4347r3 = (m4347r0(bArr, 9) >> 6) & 66076671;
/* 72 */            long jM4347r4 = (m4347r0(bArr, 12) >> 8) & 1048575;
/* 76 */            long j = jM4347r1 * 5;
/* 78 */            long j2 = jM4347r2 * 5;
/* 80 */            long j3 = jM4347r3 * 5;
/* 82 */            long j4 = jM4347r4 * 5;
/* 90 */            byte[] bArr3 = new byte[17];
/* 92 */            long j5 = 0;
/* 96 */            long j6 = 0;
/* 98 */            long j7 = 0;
/* 100 */           long j8 = 0;
/* 102 */           long j9 = 0;
/* 104 */           int i2 = 0;
/* 112 */           while (i2 < bArr2.length) {
/* 116 */               int iMin = Math.min(16, bArr2.length - i2);
/* 120 */               System.arraycopy(bArr2, i2, bArr3, 0, iMin);
/* 125 */               bArr3[iMin] = 1;
/* 127 */               if (iMin != 16) {
/* 131 */                   Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
                        }
/* 140 */               long jM4347r5 = j9 + (m4347r0(bArr3, 0) & 67108863);
/* 150 */               long jM4347r6 = j5 + ((m4347r0(bArr3, i) >> 2) & 67108863);
/* 160 */               long jM4347r7 = j6 + ((m4347r0(bArr3, 6) >> 4) & 67108863);
/* 172 */               long jM4347r8 = j7 + ((m4347r0(bArr3, 9) >> 6) & 67108863);
/* 188 */               long j10 = jM4347r1;
/* 193 */               long jM4347r9 = j8 + (((m4347r0(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
/* 211 */               long j11 = (jM4347r9 * j) + (jM4347r8 * j2) + (jM4347r7 * j3) + (jM4347r6 * j4) + (jM4347r5 * jM4347r0);
/* 229 */               long j12 = (jM4347r9 * j2) + (jM4347r8 * j3) + (jM4347r7 * j4) + (jM4347r6 * jM4347r0) + (jM4347r5 * j10);
/* 247 */               long j13 = (jM4347r9 * j3) + (jM4347r8 * j4) + (jM4347r7 * jM4347r0) + (jM4347r6 * j10) + (jM4347r5 * jM4347r2);
/* 265 */               long j14 = (jM4347r9 * j4) + (jM4347r8 * jM4347r0) + (jM4347r7 * j10) + (jM4347r6 * jM4347r2) + (jM4347r5 * jM4347r3);
/* 277 */               long j15 = jM4347r8 * j10;
/* 281 */               long j16 = jM4347r9 * jM4347r0;
/* 289 */               long j17 = j12 + (j11 >> 26);
/* 295 */               long j18 = j13 + (j17 >> 26);
/* 301 */               long j19 = j14 + (j18 >> 26);
/* 307 */               long j20 = j16 + j15 + (jM4347r7 * jM4347r2) + (jM4347r6 * jM4347r3) + (jM4347r5 * jM4347r4) + (j19 >> 26);
/* 309 */               long j21 = j20 >> 26;
/* 311 */               j8 = j20 & 67108863;
/* 315 */               long j22 = (j21 * 5) + (j11 & 67108863);
/* 323 */               i2 += 16;
/* 299 */               j6 = j18 & 67108863;
/* 305 */               j7 = j19 & 67108863;
/* 319 */               j9 = j22 & 67108863;
/* 321 */               j5 = (j17 & 67108863) + (j22 >> 26);
/* 335 */               jM4347r1 = j10;
/* 337 */               i = 3;
                    }
/* 344 */           long j23 = j6 + (j5 >> 26);
/* 348 */           long j24 = j23 & 67108863;
/* 350 */           long j25 = j7 + (j23 >> 26);
/* 354 */           long j26 = j25 & 67108863;
/* 356 */           long j27 = j8 + (j25 >> 26);
/* 360 */           long j28 = j27 & 67108863;
/* 364 */           long j29 = ((j27 >> 26) * 5) + j9;
/* 366 */           long j30 = j29 >> 26;
/* 368 */           long j31 = j29 & 67108863;
/* 370 */           long j32 = (j5 & 67108863) + j30;
/* 372 */           long j33 = j31 + 5;
/* 376 */           long j34 = j33 & 67108863;
/* 378 */           long j35 = j32 + (j33 >> 26);
/* 384 */           long j36 = j24 + (j35 >> 26);
/* 390 */           long j37 = j26 + (j36 >> 26);
/* 394 */           long j38 = j37 & 67108863;
/* 401 */           long j39 = (j28 + (j37 >> 26)) - 67108864;
/* 408 */           long j40 = j39 >> 63;
/* 410 */           long j41 = j31 & j40;
/* 411 */           long j42 = j32 & j40;
/* 412 */           long j43 = j24 & j40;
/* 413 */           long j44 = j26 & j40;
/* 414 */           long j45 = j28 & j40;
/* 416 */           long j46 = ~j40;
/* 423 */           long j47 = j42 | (j35 & 67108863 & j46);
/* 427 */           long j48 = j43 | (j36 & 67108863 & j46);
/* 431 */           long j49 = j44 | (j38 & j46);
/* 446 */           long j50 = (j41 | (j34 & j46) | (j47 << 26)) & KeyboardMap.kValueMask;
/* 454 */           long j51 = ((j47 >> 6) | (j48 << 20)) & KeyboardMap.kValueMask;
/* 465 */           long j52 = ((j48 >> 12) | (j49 << 14)) & KeyboardMap.kValueMask;
/* 473 */           long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & KeyboardMap.kValueMask;
/* 479 */           long jM4347r10 = m4347r0(bArr, 16) + j50;
/* 480 */           long j54 = jM4347r10 & KeyboardMap.kValueMask;
/* 489 */           long jM4347r11 = m4347r0(bArr, 20) + j51 + (jM4347r10 >> 32);
/* 490 */           long j55 = jM4347r11 & KeyboardMap.kValueMask;
/* 501 */           long jM4347r12 = m4347r0(bArr, 24) + j52 + (jM4347r11 >> 32);
/* 502 */           long j56 = jM4347r12 & KeyboardMap.kValueMask;
/* 514 */           long jM4347r13 = (m4347r0(bArr, 28) + j53 + (jM4347r12 >> 32)) & KeyboardMap.kValueMask;
/* 516 */           byte[] bArr4 = new byte[16];
/* 518 */           m4310E0(0, j54, bArr4);
/* 523 */           m4310E0(4, j55, bArr4);
/* 528 */           m4310E0(8, j56, bArr4);
/* 533 */           m4310E0(12, jM4347r13, bArr4);
/* 536 */           return bArr4;
                }

                /* JADX INFO: renamed from: T */
                public static void m4325T(String str, String str2) {
/* 1 */             String strM4312F0 = m4312F0(str);
/* 10 */            if (m4346q0(6, strM4312F0)) {
/* 12 */                AbstractC1245n0.m4876d(strM4312F0, str2);
                    }
                }

                /* JADX INFO: renamed from: U */
                public static void m4326U(String str, String str2, Throwable th) {
/* 1 */             String strM4312F0 = m4312F0(str);
/* 10 */            if (m4346q0(6, strM4312F0)) {
/* 12 */                AbstractC1245n0.m4877e(strM4312F0, str2, th);
                    }
                }

                /* JADX INFO: renamed from: V */
                public static final String m4327V(String str) {
/* 1 */             if (str == null || str.length() != 0) {
/* 10 */                return str;
                    }
/* 9 */             return null;
                }

                /* JADX INFO: renamed from: W */
                public static final void m4328W(CoroutineContext coroutineContext) {
/* 7 */             h01 h01Var = (h01) coroutineContext.get(xt0.f19368w);
/* 9 */             if (h01Var != null && !h01Var.isActive()) {
/* 22 */                throw h01Var.getCancellationException();
                    }
                }

                /* JADX INFO: renamed from: X */
                public static vl0 m4329X(vl0[] vl0VarArr, int i) {
/* 8 */             int i2 = (i & 1) == 0 ? 400 : 700;
/* 18 */            boolean z = (i & 2) != 0;
/* 20 */            vl0 vl0Var = null;
/* 21 */            int i3 = AbstractC0208c9.API_PRIORITY_OTHER;
/* 25 */            for (vl0 vl0Var2 : vl0VarArr) {
/* 45 */                int iAbs = (Math.abs(vl0Var2.f18239c - i2) * 2) + (vl0Var2.f18240d == z ? 0 : 1);
/* 46 */                if (vl0Var == null || i3 > iAbs) {
/* 50 */                    vl0Var = vl0Var2;
/* 51 */                    i3 = iAbs;
                        }
                    }
/* 55 */            return vl0Var;
                }

                /* JADX INFO: renamed from: Y */
                public static final Object m4330Y(s82 s82Var, long j, Function2 function2) {
                    while (true) {
/* 5 */                 if (s82Var.f16473e >= j && !s82Var.mo8328g()) {
/* 14 */                    return s82Var;
                        }
/* 15 */                Object objM8326e = s82Var.m8326e();
/* 19 */                C2131r4 c2131r4 = f9293a;
/* 21 */                if (objM8326e == c2131r4) {
/* 23 */                    return c2131r4;
                        }
/* 26 */                s82 s82Var2 = (s82) ((AbstractC2161ry) objM8326e);
/* 28 */                if (s82Var2 == null) {
/* 45 */                    s82Var2 = (s82) function2.invoke(Long.valueOf(s82Var.f16473e + 1), s82Var);
/* 51 */                    if (s82Var.m8331j(s82Var2)) {
/* 57 */                        if (s82Var.mo8328g()) {
/* 59 */                            s82Var.m8330i();
                                }
                            }
                        }
/* 30 */                s82Var = s82Var2;
                    }
                }

                /* JADX INFO: renamed from: Z */
                public static fc3 m4331Z(Context context) {
/* 14 */            return new fc3(context, AbstractC0213ce.f2858a, p20.f14949d, new xt0(16));
                }

                /* JADX INFO: renamed from: a0 */
                public static float m4332a0(String[] strArr, int i) {
/* 3 */             float f = Float.parseFloat(strArr[i]);
/* 10 */            if (f >= 0.0f && f <= 1.0f) {
/* 18 */                return f;
                    }
/* 38 */            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
                }

                /* JADX INFO: renamed from: b0 */
                public static Set m4333b0() {
                    try {
/* 14 */                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
/* 18 */                if (objInvoke == null) {
/* 20 */                    return Collections.EMPTY_SET;
                        }
/* 23 */                Set set = (Set) objInvoke;
/* 25 */                Iterator it = set.iterator();
/* 33 */                while (it.hasNext()) {
/* 41 */                    if (!(it.next() instanceof int[])) {
/* 43 */                        return Collections.EMPTY_SET;
                            }
                        }
/* 45 */                return set;
                    } catch (Throwable unused) {
/* 46 */                return Collections.EMPTY_SET;
                    }
                }

                /* JADX INFO: renamed from: c0 */
                public static String m4334c0(int i) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             if ((i & 4) != 0) {
/* 12 */                arrayList.add("IMAGE_CAPTURE");
                    }
/* 17 */            if ((i & 1) != 0) {
/* 21 */                arrayList.add("PREVIEW");
                    }
/* 26 */            if ((i & 2) != 0) {
/* 30 */                arrayList.add("VIDEO_CAPTURE");
                    }
/* 35 */            StringBuilder sb = new StringBuilder();
/* 38 */            Iterator it = arrayList.iterator();
/* 46 */            if (it.hasNext()) {
                        while (true) {
/* 54 */                    sb.append((CharSequence) it.next());
/* 61 */                    if (!it.hasNext()) {
                                break;
                            }
/* 65 */                    sb.append((CharSequence) "|");
                        }
                    }
/* 69 */            return sb.toString();
                }

                /* JADX INFO: renamed from: d0 */
                public static final h01 m4335d0(CoroutineContext coroutineContext) {
/* 7 */             h01 h01Var = (h01) coroutineContext.get(xt0.f19368w);
/* 9 */             if (h01Var != null) {
/* 11 */                return h01Var;
                    }
/* 14 */            ds0.m3201r(coroutineContext, "Current context doesn't contain Job in it: ");
/* 17 */            return null;
                }

                /* JADX INFO: renamed from: e0 */
                public static void m4336e0(ra2 ra2Var) {
                    C0204c5 c0204c5;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             tj1 tj1Var = tj1.f17127b;
/* 16 */            Iterator it = ((ConcurrentMap) ra2Var.f15955a).values().iterator();
/* 24 */            while (it.hasNext()) {
/* 40 */                for (lx1 lx1Var : (List) it.next()) {
/* 50 */                    int iOrdinal = lx1Var.f13521d.ordinal();
/* 55 */                    if (iOrdinal == 1) {
/* 75 */                        c0204c5 = C0204c5.f2716r;
                            } else if (iOrdinal == 2) {
/* 72 */                        c0204c5 = C0204c5.f2717s;
                            } else {
/* 61 */                        if (iOrdinal != 3) {
/* 68 */                            f42.m3656l("Unknown key status");
/* 71 */                            return;
                                }
/* 63 */                        c0204c5 = C0204c5.f2718t;
                            }
/* 77 */                    int i = lx1Var.f13523f;
/* 79 */                    String strSubstring = lx1Var.f13524g;
/* 87 */                    if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
/* 92 */                        strSubstring = strSubstring.substring(34);
                            }
/* 107 */                   arrayList.add(new uj1(c0204c5, i, strSubstring, lx1Var.f13522e.name()));
                        }
                    }
/* 113 */           lx1 lx1Var2 = (lx1) ra2Var.f15957c;
/* 124 */           Integer numValueOf = lx1Var2 != null ? Integer.valueOf(lx1Var2.f13523f) : null;
/* 125 */           if (numValueOf != null) {
                        try {
/* 127 */                   int iIntValue = numValueOf.intValue();
/* 131 */                   Iterator it2 = arrayList.iterator();
/* 139 */                   while (it2.hasNext()) {
/* 149 */                       if (((uj1) it2.next()).f17557b == iIntValue) {
                                }
                            }
/* 159 */                   throw new GeneralSecurityException("primary key ID is not present in entries");
                        } catch (GeneralSecurityException e) {
/* 166 */                   C1697u2.m5439o(e);
/* 169 */                   return;
                        }
                    }
/* 162 */           Collections.unmodifiableList(arrayList);
                }

                /* JADX INFO: renamed from: f0 */
                public static String m4337f0(int i) {
/* 3 */             if (i == 26540) {
/* 269 */               return "PLAYER_OOB_REQUIRED";
                    }
/* 7 */             if (i == 26541) {
/* 266 */               return "PLAYER_LEVEL_UP";
                    }
                    switch (i) {
                        case 26502:
/* 263 */                   return "CLIENT_RECONNECT_REQUIRED";
                        case 26503:
/* 260 */                   return "NETWORK_ERROR_STALE_DATA";
                        case 26504:
/* 257 */                   return "NETWORK_ERROR_NO_DATA";
                        case 26505:
/* 254 */                   return "NETWORK_ERROR_OPERATION_DEFERRED";
                        case 26506:
/* 251 */                   return "NETWORK_ERROR_OPERATION_FAILED";
                        case 26507:
/* 248 */                   return "LICENSE_CHECK_FAILED";
                        case 26508:
/* 245 */                   return "APP_MISCONFIGURED";
                        case 26509:
/* 242 */                   return "GAME_NOT_FOUND";
                        case 26520:
/* 239 */                   return "RESOLVE_STALE_OR_NO_DATA";
                        case 26620:
/* 236 */                   return "VIDEO_NOT_ACTIVE";
                        case 26621:
/* 233 */                   return "VIDEO_UNSUPPORTED";
                        case 26622:
/* 230 */                   return "VIDEO_PERMISSION_ERROR";
                        case 26623:
/* 227 */                   return "VIDEO_STORAGE_ERROR";
                        case 26624:
/* 224 */                   return "VIDEO_UNEXPECTED_CAPTURE_ERROR";
                        case 26625:
/* 221 */                   return "VIDEO_ALREADY_CAPTURING";
                        case 26626:
/* 218 */                   return "VIDEO_OUT_OF_DISK_SPACE";
                        case 26627:
/* 215 */                   return "VIDEO_NO_MIC";
                        case 26628:
/* 212 */                   return "VIDEO_NO_CAMERA";
                        case 26629:
/* 209 */                   return "VIDEO_SCREEN_OFF";
                        case 26630:
/* 206 */                   return "VIDEO_RELEASE_TIMEOUT";
                        case 26631:
/* 203 */                   return "VIDEO_CAPTURE_VIDEO_PERMISSION_REQUIRED";
                        case 26632:
/* 200 */                   return "CAPTURE_ALREADY_PAUSED";
                        case 26650:
/* 197 */                   return "VIDEO_MISSING_OVERLAY_PERMISSION";
                        case 26652:
/* 194 */                   return "VIDEO_CAPTURE_OVERLAY_VISIBLE";
                        case 26700:
/* 191 */                   return "CLIENT_LOADING";
                        case 26701:
/* 188 */                   return "CLIENT_EMPTY";
                        case 26702:
/* 185 */                   return "CLIENT_HIDDEN";
                        case 26703:
/* 182 */                   return "CONSENT_REQUIRED";
                        case 26704:
/* 179 */                   return "PLAYER_NOT_FOUND";
                        default:
                            switch (i) {
                                case 26530:
/* 176 */                           return "AUTH_ERROR_HARD";
                                case 26531:
/* 173 */                           return "AUTH_ERROR_USER_RECOVERABLE";
                                case 26532:
/* 170 */                           return "AUTH_ERROR_UNREGISTERED_CLIENT_ID";
                                case 26533:
/* 167 */                           return "AUTH_ERROR_API_ACCESS_DENIED";
                                case 26534:
/* 164 */                           return "AUTH_ERROR_ACCOUNT_NOT_USABLE";
                                case 26535:
/* 161 */                           return "AUTH_ERROR_ACCOUNT_UNICORN";
                                case 26536:
/* 158 */                           return "AUTH_ERROR_SERVICE_CACHE_MISTAKE";
                                default:
                                    switch (i) {
                                        case 26550:
/* 155 */                                   return "REQUEST_UPDATE_PARTIAL_SUCCESS";
                                        case 26551:
/* 152 */                                   return "REQUEST_UPDATE_TOTAL_FAILURE";
                                        case 26552:
/* 149 */                                   return "REQUEST_TOO_MANY_RECIPIENTS";
                                        default:
                                            switch (i) {
                                                case 26560:
/* 146 */                                           return "ACHIEVEMENT_UNLOCK_FAILURE";
                                                case 26561:
/* 143 */                                           return "ACHIEVEMENT_UNKNOWN";
                                                case 26562:
/* 140 */                                           return "ACHIEVEMENT_NOT_INCREMENTAL";
                                                case 26563:
/* 137 */                                           return "ACHIEVEMENT_UNLOCKED";
                                                default:
                                                    switch (i) {
                                                        case 26570:
/* 134 */                                                   return "SNAPSHOT_NOT_FOUND";
                                                        case 26571:
/* 131 */                                                   return "SNAPSHOT_CREATION_FAILED";
                                                        case 26572:
/* 128 */                                                   return "SNAPSHOT_CONTENTS_UNAVAILABLE";
                                                        case 26573:
/* 125 */                                                   return "SNAPSHOT_COMMIT_FAILED";
                                                        case 26574:
/* 122 */                                                   return "SNAPSHOT_CONFLICT";
                                                        case 26575:
/* 119 */                                                   return "SNAPSHOT_FOLDER_UNAVAILABLE";
                                                        case 26576:
/* 116 */                                                   return "SNAPSHOT_CONFLICT_MISSING";
                                                        default:
                                                            switch (i) {
                                                                case 26580:
/* 113 */                                                           return "MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";
                                                                case 26581:
/* 110 */                                                           return "MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";
                                                                case 26582:
/* 107 */                                                           return "MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";
                                                                case 26583:
/* 104 */                                                           return "MULTIPLAYER_DISABLED";
                                                                case 26584:
/* 101 */                                                           return "MULTIPLAYER_ERROR_INVALID_OPERATION";
                                                                default:
                                                                    switch (i) {
                                                                        case 26590:
/* 98 */                                                                    return "MATCH_ERROR_INVALID_PARTICIPANT_STATE";
                                                                        case 26591:
/* 95 */                                                                    return "MATCH_ERROR_INACTIVE_MATCH";
                                                                        case 26592:
/* 92 */                                                                    return "MATCH_ERROR_INVALID_MATCH_STATE";
                                                                        case 26593:
/* 89 */                                                                    return "MATCH_ERROR_OUT_OF_DATE_VERSION";
                                                                        case 26594:
/* 86 */                                                                    return "MATCH_ERROR_INVALID_MATCH_RESULTS";
                                                                        case 26595:
/* 83 */                                                                    return "MATCH_ERROR_ALREADY_REMATCHED";
                                                                        case 26596:
/* 80 */                                                                    return "MATCH_NOT_FOUND";
                                                                        case 26597:
/* 77 */                                                                    return "MATCH_ERROR_LOCALLY_MODIFIED";
                                                                        default:
                                                                            switch (i) {
                                                                                case 26600:
/* 74 */                                                                            return "REAL_TIME_CONNECTION_FAILED";
                                                                                case 26601:
/* 71 */                                                                            return "REAL_TIME_MESSAGE_SEND_FAILED";
                                                                                case 26602:
/* 68 */                                                                            return "INVALID_REAL_TIME_ROOM_ID";
                                                                                case 26603:
/* 65 */                                                                            return "PARTICIPANT_NOT_CONNECTED";
                                                                                case 26604:
/* 62 */                                                                            return "REAL_TIME_ROOM_NOT_JOINED";
                                                                                case 26605:
/* 59 */                                                                            return "REAL_TIME_INACTIVE_ROOM";
                                                                                case 26606:
/* 56 */                                                                            return "REAL_TIME_SERVICE_NOT_CONNECTED";
                                                                                case 26607:
/* 53 */                                                                            return "OPERATION_IN_FLIGHT";
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 26610:
/* 50 */                                                                                    return "MILESTONE_CLAIMED_PREVIOUSLY";
                                                                                        case 26611:
/* 47 */                                                                                    return "MILESTONE_CLAIM_FAILED";
                                                                                        case 26612:
/* 44 */                                                                                    return "QUEST_NO_LONGER_AVAILABLE";
                                                                                        case 26613:
/* 41 */                                                                                    return "QUEST_NOT_STARTED";
                                                                                        default:
/* 36 */                                                                                    return m4338g0(i);
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }

                /* JADX INFO: renamed from: g0 */
                public static String m4338g0(int i) {
                    switch (i) {
                        case -1:
/* 83 */                    return "SUCCESS_CACHE";
                        case 0:
/* 80 */                    return "SUCCESS";
                        case 1:
                        case 9:
                        case 11:
                        case 12:
                        default:
/* 21 */                    return fm0.m3788n(new StringBuilder(String.valueOf(i).length() + 21), "unknown status code: ", i);
                        case 2:
/* 77 */                    return "SERVICE_VERSION_UPDATE_REQUIRED";
                        case 3:
/* 74 */                    return "SERVICE_DISABLED";
                        case 4:
/* 71 */                    return "SIGN_IN_REQUIRED";
                        case 5:
/* 68 */                    return "INVALID_ACCOUNT";
                        case 6:
/* 65 */                    return "RESOLUTION_REQUIRED";
                        case 7:
/* 62 */                    return "NETWORK_ERROR";
                        case 8:
/* 59 */                    return "INTERNAL_ERROR";
                        case 10:
/* 56 */                    return "DEVELOPER_ERROR";
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 53 */                    return "ERROR";
                        case 14:
/* 50 */                    return "INTERRUPTED";
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 47 */                    return "TIMEOUT";
                        case 16:
/* 44 */                    return "CANCELED";
                        case 17:
/* 41 */                    return "API_NOT_CONNECTED";
                        case 18:
/* 38 */                    return "DEAD_CLIENT";
                        case 19:
/* 35 */                    return "REMOTE_EXCEPTION";
                        case 20:
/* 32 */                    return "CONNECTION_SUSPENDED_DURING_CALL";
                        case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 29 */                    return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                        case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
/* 26 */                    return "RECONNECTION_TIMED_OUT";
                    }
                }

                /* JADX INFO: renamed from: h0 */
                public static ArrayList m4339h0(MaterialToolbar materialToolbar, CharSequence charSequence) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 11 */            for (int i = 0; i < materialToolbar.getChildCount(); i++) {
/* 13 */                View childAt = materialToolbar.getChildAt(i);
/* 19 */                if (childAt instanceof TextView) {
/* 21 */                    TextView textView = (TextView) childAt;
/* 31 */                    if (TextUtils.equals(textView.getText(), charSequence)) {
/* 33 */                        arrayList.add(textView);
                            }
                        }
                    }
/* 39 */            return arrayList;
                }

                /* JADX INFO: renamed from: k0 */
                public static void m4340k0(Map map) {
/* 5 */             if (!rs0.m8239b() || map.size() == 0) {
/* 36 */                return;
                    }
/* 19 */            xe2.m9775m("Helpshift", "handlePush() is called.", null);
/* 22 */            rs0 rs0Var = rs0.f16254y;
/* 33 */            rs0Var.f16271p.m8116u(new dp0(14, rs0Var, map));
                }

                /* JADX INFO: renamed from: l0 */
                public static void m4341l0(Context context) {
                    boolean z;
                    ApplicationInfo applicationInfo;
                    Bundle bundle;
/* 12 */            if (py0.m7606i0(context).getBoolean("proxy_notification_initialized", false)) {
/* 84 */                return;
                    }
                    try {
/* 17 */                Context applicationContext = context.getApplicationContext();
/* 21 */                PackageManager packageManager = applicationContext.getPackageManager();
/* 56 */                z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
/* 61 */            if (Build.VERSION.SDK_INT < 29) {
/* 81 */                Tasks.forResult(null);
/* 84 */                return;
                    }
/* 65 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 73 */            new al0(context, z, taskCompletionSource).run();
/* 76 */            taskCompletionSource.getTask();
                }

                /* JADX INFO: renamed from: m0 */
                public static synchronized void m4342m0(Application application, String str, String str2, HashMap map) {
/* 4 */             AtomicBoolean atomicBoolean = rs0.f16255z;
/* 10 */            if (atomicBoolean.get()) {
/* 17 */                xe2.m9775m("Helpshift", "Helpshift is already initialized !", null);
/* 21 */                return;
                    }
/* 25 */            m72.m6617a(str2, str);
/* 28 */            HashMap mapM10199E = yy1.m10199E(map);
                    synchronized (rs0.class) {
/* 37 */                if (rs0.f16254y == null) {
/* 44 */                    rs0.f16254y = new rs0(application);
                        }
                    }
/* 51 */            rs0 rs0Var = rs0.f16254y;
/* 63 */            rs0Var.f16271p.m8117v(new js0(rs0Var, application, mapM10199E, 2, false));
/* 78 */            rs0Var.f16271p.m8116u(new eu0(rs0Var, str, str2, application, mapM10199E, map));
/* 83 */            atomicBoolean.compareAndSet(false, true);
                }

                /* JADX INFO: renamed from: n0 */
                public static e90 m4343n0(h01 h01Var, boolean z, o01 o01Var, int i) {
/* 4 */             if ((i & 1) != 0) {
/* 6 */                 z = false;
                    }
/* 9 */             boolean z2 = (i & 2) != 0;
/* 14 */            if (h01Var instanceof z01) {
/* 18 */                return ((z01) h01Var).m10237B(z, z2, o01Var);
                    }
/* 38 */            return h01Var.invokeOnCompletion(z, z2, new n01(1, o01Var, hz0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
                }

                /* JADX INFO: renamed from: o0 */
                public static boolean m4344o0(String str) {
/* 6 */             return m4346q0(3, m4312F0(str));
                }

                /* JADX INFO: renamed from: p0 */
                public static boolean m4345p0(String str, String str2) {
                    return str.startsWith(str2.concat("(")) && str.endsWith(")");
                }

                /* JADX INFO: renamed from: q0 */
                public static boolean m4346q0(int i, String str) {
                    return f9296d <= i || Log.isLoggable(str, i);
                }

                /* JADX INFO: renamed from: r0 */
                public static long m4347r0(byte[] bArr, int i) {
/* 38 */            return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & KeyboardMap.kValueMask;
                }

                /* JADX INFO: renamed from: y0 */
                public static TimeInterpolator m4348y0(Context context, int i, TimeInterpolator timeInterpolator) {
/* 3 */             TypedValue typedValue = new TypedValue();
/* 15 */            if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
/* 131 */               return timeInterpolator;
                    }
/* 21 */            if (typedValue.type != 3) {
/* 127 */               C1951n4.m6859j("Motion easing theme attribute must be a string");
/* 19 */                return null;
                    }
/* 25 */            String strValueOf = String.valueOf(typedValue.string);
/* 35 */            if (!m4345p0(strValueOf, "cubic-bezier")) {
/* 94 */                if (m4345p0(strValueOf, "path")) {
/* 110 */                   return pr1.m7547c(pg3.m7427f(strValueOf.substring(5, strValueOf.length() - 1)));
                        }
/* 121 */               C1951n4.m6859j("Invalid motion easing type: ".concat(strValueOf));
/* 19 */                return null;
                    }
/* 50 */            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
/* 56 */            if (strArrSplit.length == 4) {
/* 76 */                return pr1.m7546b(m4332a0(strArrSplit, 0), m4332a0(strArrSplit, 1), m4332a0(strArrSplit, 2), m4332a0(strArrSplit, 3));
                    }
/* 84 */            s80.m8429j(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
/* 19 */            return null;
                }

                /* JADX INFO: renamed from: z0 */
                public static void m4349z0(GameApp gameApp, HashMap map) {
/* 5 */             if (rs0.m8239b()) {
/* 20 */                ht0.f9230a.put("api", Long.valueOf(System.currentTimeMillis()));
/* 45 */                xe2.m9775m("Helpshift", "showConversation is called with config: " + map + " \n Is proactive? false", null);
/* 48 */                rs0 rs0Var = rs0.f16254y;
/* 58 */                rs0Var.f16271p.m8115t(new fu0(map, rs0Var, gameApp, 0));
                    }
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: A */
                public Object mo4350A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             kSerializer.getClass();
/* 7 */             return mo4375u(kSerializer);
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: B */
                public abstract byte mo4351B();

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: C */
                public abstract short mo4352C();

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: D */
                public float mo4353D() {
/* 1 */             m4358S();
/* 5 */             throw null;
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: E */
                public double mo4354E() {
/* 1 */             m4358S();
/* 5 */             throw null;
                }

                /* JADX INFO: renamed from: G0 */
                public abstract boolean mo621G0(int i, View view);

                /* JADX INFO: renamed from: M */
                public abstract int mo622M(int i, View view);

                /* JADX INFO: renamed from: N */
                public abstract int mo623N(int i, View view);

                /* JADX INFO: renamed from: P */
                public abstract Typeface mo4355P(Context context, sl0 sl0Var, Resources resources, int i);

                /* JADX INFO: renamed from: Q */
                public abstract Typeface mo4356Q(Context context, vl0[] vl0VarArr, int i);

                /* JADX INFO: renamed from: R */
                public Typeface mo4357R(Context context, Resources resources, int i, String str, int i2) {
/* 1 */             File fileM7608m0 = py0.m7608m0(context);
/* 6 */             if (fileM7608m0 == null) {
/* 5 */                 return null;
                    }
                    try {
/* 13 */                if (py0.m7590M(fileM7608m0, resources, i)) {
/* 23 */                    return Typeface.createFromFile(fileM7608m0.getPath());
                        }
/* 5 */                 return null;
                    } catch (RuntimeException unused) {
/* 5 */                 return null;
                    } finally {
/* 32 */                fileM7608m0.delete();
                    }
                }

                /* JADX INFO: renamed from: S */
                public void m4358S() {
/* 31 */            throw new ea2(j22.m5667a(getClass()) + " can't retrieve untyped values");
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: b */
                public void mo3296b(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: c */
                public InterfaceC1870ky mo3297c(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return this;
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: e */
                public Decoder mo4359e(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 8 */             return mo4378z(cx1Var.mo138i(i));
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: f */
                public boolean mo4360f() {
/* 1 */             m4358S();
/* 5 */             throw null;
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: g */
                public char mo4361g() {
/* 1 */             m4358S();
/* 5 */             throw null;
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: h */
                public int mo4362h(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             m4358S();
/* 8 */             throw null;
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: i */
                public long mo4363i(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return mo4373s();
                }

                /* JADX INFO: renamed from: i0 */
                public int mo624i0(View view) {
/* 1 */             return 0;
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: j */
                public double mo4364j(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 4 */             return mo4354E();
                }

                /* JADX INFO: renamed from: j0 */
                public int mo4365j0() {
/* 1 */             return 0;
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: k */
                public char mo4366k(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 4 */             return mo4361g();
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: l */
                public float mo4367l(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 4 */             return mo4353D();
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: n */
                public byte mo4368n(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 4 */             return mo4351B();
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: o */
                public abstract int mo4369o();

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: p */
                public short mo4370p(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 4 */             return mo4352C();
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: q */
                public int mo4371q(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return mo4369o();
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: r */
                public String mo4372r() {
/* 1 */             m4358S();
/* 5 */             throw null;
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: s */
                public abstract long mo4373s();

                /* JADX INFO: renamed from: s0 */
                public void mo625s0(int i, int i2) {
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: t */
                public boolean mo4374t(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return mo4360f();
                }

                /* JADX INFO: renamed from: t0 */
                public void mo626t0(int i) {
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: u */
                public Object mo4375u(KSerializer kSerializer) {
/* 1 */             kSerializer.getClass();
/* 4 */             return kSerializer.deserialize(this);
                }

                /* JADX INFO: renamed from: u0 */
                public void mo627u0(int i, View view) {
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: v */
                public String mo4376v(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return mo4372r();
                }

                /* JADX INFO: renamed from: v0 */
                public abstract void mo628v0(int i);

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: w */
                public boolean mo3298w() {
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: w0 */
                public abstract void mo629w0(View view, int i, int i2);

                /* JADX INFO: renamed from: x0 */
                public abstract void mo630x0(View view, float f, float f2);

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: y */
                public Object mo4377y(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             kSerializer.getClass();
/* 15 */            if (kSerializer.getDescriptor().mo132c() || mo3298w()) {
/* 26 */                return mo4375u(kSerializer);
                    }
/* 24 */            return null;
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: z */
                public Decoder mo4378z(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return this;
                }
            }
